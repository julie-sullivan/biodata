package org.opencb.biodata.models.clinical.interpretation;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class VariantClassificationTest {

    @Test
    public void clinicalSignificanceTest() {
        List<String> acmgs;
        VariantClassification.ClinicalSignificance clinicalSignificance;


        // PATHOGENIC_VARIANT

        acmgs = Arrays.asList("PVS1,PS1,PS2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PVS1,PM1,PM2,PM3".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PVS1,PM1,PP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PVS1,PP1,PP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PS2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PM1,PM2,PM3".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PM1,PM2,PP1,PP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PM1,PP1,PP2,PP3,PP4".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.PATHOGENIC_VARIANT);

        // LIKELY_PATHOGENIC_VARIANT

        acmgs = Arrays.asList("PVS1,PM2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PM1".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PS1,PM1,PM2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PM1,PM2,PM3".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PM1,PM2,PP1,PP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        acmgs = Arrays.asList("PM1,PP1,PP2,PP3,PP4".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LIKELY_PATHOGENIC_VARIANT);

        // BENIGN_VARIANT

        acmgs = Arrays.asList("BA1".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.BENIGN_VARIANT);

        acmgs = Arrays.asList("BS1,BS2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.BENIGN_VARIANT);

        // LINKELY_BENIGN_VARIANT

        acmgs = Arrays.asList("BS1,BP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LINKELY_BENIGN_VARIANT);

        acmgs = Arrays.asList("BP1,BP2".split(","));
        clinicalSignificance = VariantClassification.computeClinicalSignificance(acmgs);
        System.out.println(StringUtils.join(acmgs, ",") + " -> " + clinicalSignificance);
        assertEquals(clinicalSignificance, VariantClassification.ClinicalSignificance.LINKELY_BENIGN_VARIANT);
    }

}