/*
 * <!--
 *   ~ Copyright 2015-2017 OpenCB
 *   ~
 *   ~ Licensed under the Apache License, Version 2.0 (the "License");
 *   ~ you may not use this file except in compliance with the License.
 *   ~ You may obtain a copy of the License at
 *   ~
 *   ~     http://www.apache.org/licenses/LICENSE-2.0
 *   ~
 *   ~ Unless required by applicable law or agreed to in writing, software
 *   ~ distributed under the License is distributed on an "AS IS" BASIS,
 *   ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   ~ See the License for the specific language governing permissions and
 *   ~ limitations under the License.
 *   -->
 *
 */

package org.opencb.biodata.tools.clinical;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.opencb.biodata.models.clinical.interpretation.*;
import org.opencb.biodata.models.clinical.interpretation.ClinicalProperty.ModeOfInheritance;
import org.opencb.biodata.models.clinical.interpretation.ClinicalProperty.Penetrance;
import org.opencb.biodata.models.clinical.interpretation.exceptions.InterpretationAnalysisException;
import org.opencb.biodata.models.commons.Disorder;
import org.opencb.biodata.models.commons.Phenotype;
import org.opencb.biodata.models.variant.Variant;
import org.opencb.biodata.models.variant.avro.ConsequenceType;
import org.opencb.biodata.models.variant.avro.SequenceOntologyTerm;

import java.util.*;
import java.util.stream.Collectors;

import static org.opencb.biodata.models.clinical.interpretation.ClinicalProperty.RoleInCancer;

public class TieringReportedVariantCreator extends ReportedVariantCreator {

    public static final Set<String> TIER_1_CONSEQUENCE_TYPES_SET = new HashSet<>(Arrays.asList("SO:0001893", "SO:0001574", "SO:0001575",
            "SO:0001587", "SO:0001589", "SO:0001578", "SO:0001582"));

    private static final Set<String> TIER_2_CONSEQUENCE_TYPES_SET = new HashSet<>(Arrays.asList("SO:0001889", "SO:0001821", "SO:0001822",
            "SO:0001583", "SO:0001630", "SO:0001626"));

    public TieringReportedVariantCreator(List<DiseasePanel> diseasePanels, Map<String, RoleInCancer> roleInCancer,
                                         Map<String, List<String>> actionableVariants, Disorder disorder, ModeOfInheritance modeOfInheritance,
                                         Penetrance penetrance) {
        super(diseasePanels, disorder, modeOfInheritance, penetrance, roleInCancer, actionableVariants);
    }

    @Override
    public List<ReportedVariant> create(List<Variant> variants) throws InterpretationAnalysisException {
        Map<String, List<ModeOfInheritance>> moiMap = new HashMap<>();
        for (Variant variant : variants) {
            moiMap.put(variant.getId(), modeOfInheritance != null ? Collections.singletonList(modeOfInheritance) : Collections.emptyList());
        }
        return create(variants, moiMap);
    }

    public List<ReportedVariant> create(List<Variant> variants, Map<String, List<ModeOfInheritance>> variantMoIMap)
            throws InterpretationAnalysisException {
        // Panels are mandatory in Tiering analysis
        if (CollectionUtils.isEmpty(diseasePanels)) {
            throw new InterpretationAnalysisException("Missing gene panels for Tiering analysis");
        }
        Map<String, List<DiseasePanel.GenePanel>> geneToPanelMap = getGeneToPanelMap(diseasePanels);

        if (MapUtils.isEmpty(geneToPanelMap)) {
            throw new InterpretationAnalysisException("Tiering analysis: no genes found in gene panels: "
                    + StringUtils.join(diseasePanels.stream().map(DiseasePanel::getId).collect(Collectors.toList()), ","));
        }

        // Create the list of reported variants, with a reported event for each 1) transcript, 2) panel and 3) consequence type (SO name)
        // Tiers classification:
        //     - Tier 1: gene panel + mode of inheritance + TIER_1_CONSEQUENCE_TYPES
        //     - Tier 2: gene panel + mode of inheritance + TIER_2_CONSEQUENCE_TYPES
        //     - Tier 3: gene panel + mode of inheritance + other consequence types
        //               gene panel + mode of inheritance
        List<ReportedVariant> reportedVariants = new ArrayList<>();
        for (Variant variant : variants) {
            List<ReportedEvent> reportedEvents = new ArrayList<>();

            if (variant.getAnnotation() != null && CollectionUtils.isNotEmpty(variant.getAnnotation().getConsequenceTypes())) {

                // 1) create the reported event for each transcript
                for (ConsequenceType ct : variant.getAnnotation().getConsequenceTypes()) {

                    if (geneToPanelMap.containsKey(ct.getEnsemblGeneId())) {

                        // 2) create the reported event for each panel
                        List<DiseasePanel.GenePanel> genePanels = geneToPanelMap.get(ct.getEnsemblGeneId());
                        for (DiseasePanel.GenePanel genePanel : genePanels) {

                            // In addition to the panel, the mode of inheritance must match too!
                            if (StringUtils.isNotEmpty(genePanel.getModeOfInheritance())) {
                                List<ModeOfInheritance> modeOfInheritances = variantMoIMap.get(variant.getId());
                                for (ModeOfInheritance moi : modeOfInheritances) {
                                    if (getMoiFromGenePanel(genePanel.getModeOfInheritance()) == moi) {
                                        GenomicFeature genomicFeature = new GenomicFeature(ct.getEnsemblGeneId(),
                                                ct.getEnsemblTranscriptId(), ct.getGeneName(), null, null);

                                        if (CollectionUtils.isNotEmpty(ct.getSequenceOntologyTerms())) {

                                            // 3) create the reported event for consequence type (SO term)
                                            for (SequenceOntologyTerm soTerm : ct.getSequenceOntologyTerms()) {

                                                if (StringUtils.isNotEmpty(soTerm.getAccession())) {
                                                    if (TIER_1_CONSEQUENCE_TYPES_SET.contains(soTerm.getAccession())) {
                                                        // Tier 1
                                                        reportedEvents.add(createReportedEvent(disorder, Collections.singletonList(soTerm),
                                                                genomicFeature, genePanel.getId(), moi, penetrance, TIER_1, variant));
                                                    } else if (TIER_2_CONSEQUENCE_TYPES_SET.contains(soTerm.getAccession())) {
                                                        // Tier 2
                                                        reportedEvents.add(createReportedEvent(disorder, Collections.singletonList(soTerm),
                                                                genomicFeature, genePanel.getId(), moi, penetrance, TIER_2, variant));
                                                    } else {
                                                        // Tier 3
                                                        reportedEvents.add(createReportedEvent(disorder, Collections.singletonList(soTerm),
                                                                genomicFeature, genePanel.getId(), moi, penetrance, TIER_3, variant));
                                                    }
                                                } else {
                                                    // Tier 3
                                                    reportedEvents.add(createReportedEvent(disorder, Collections.singletonList(soTerm),
                                                            genomicFeature, genePanel.getId(), moi, penetrance, TIER_3, variant));
                                                }
                                            }
                                        } else {
                                            // Tier 3
                                            reportedEvents.add(createReportedEvent(disorder, null, genomicFeature, genePanel.getId(),
                                                    moi, penetrance, TIER_3, variant));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // If we have reported events, then we have to create the reported variant
            if (CollectionUtils.isNotEmpty(reportedEvents)) {
                ReportedVariant reportedVariant = new ReportedVariant(variant.getImpl(), 0, new ArrayList<>(),
                        Collections.emptyList(), Collections.emptyMap());
                reportedVariant.setReportedEvents(reportedEvents);

                // Add variant to the list
                reportedVariants.add(reportedVariant);
            }
        }

        return reportedVariants;
    }

    private ClinicalProperty.ModeOfInheritance getMoiFromGenePanel(String inputMoi) {
        if (StringUtils.isEmpty(inputMoi)) {
            return ModeOfInheritance.UNKNOWN;
        }

        String moi = inputMoi.toUpperCase();

        if (moi.startsWith("BIALLELIC")) {
            return ModeOfInheritance.BIALLELIC;
        }
        if (moi.startsWith("MONOALLELIC")) {
            if (moi.contains("NOT")) {
                return ModeOfInheritance.MONOALLELIC_NOT_IMPRINTED;
            } else if (moi.contains("MATERNALLY")) {
                return ModeOfInheritance.MONOALLELIC_MATERNALLY_IMPRINTED;
            } else if (moi.contains("PATERNALLY")) {
                return ModeOfInheritance.MONOALLELIC_PATERNALLY_IMPRINTED;
            } else {
                return ModeOfInheritance.MONOALLELIC;
            }
        }
        if (moi.startsWith("BOTH")) {
            if (moi.contains("SEVERE")) {
                return ModeOfInheritance.MONOALLELIC_AND_MORE_SEVERE_BIALLELIC;
            } else if (moi.contains("")) {
                return ModeOfInheritance.MONOALLELIC_AND_BIALLELIC;
            }
        }
        if (moi.startsWith("MITOCHONDRIAL")) {
            return ModeOfInheritance.MITOCHRONDRIAL;
        }
        if (moi.startsWith("X-LINKED")) {
            if (moi.contains("BIALLELIC")) {
                return ModeOfInheritance.XLINKED_BIALLELIC;
            } else {
                return ModeOfInheritance.XLINKED_MONOALLELIC;
            }
        }
        return ModeOfInheritance.UNKNOWN;
    }
}
