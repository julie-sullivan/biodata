/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;

@SuppressWarnings("all")
/** * Variant AVDL Model
 *  @author Kalyan;
 *  @author Pawan;  models.variant.avro */
@org.apache.avro.specific.AvroGenerated
public interface VariantAnnotations {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"VariantAnnotations\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"doc\":\"* Variant AVDL Model\\n *  @author Kalyan;\\n *  @author Pawan;  models.variant.avro\",\"types\":[{\"type\":\"enum\",\"name\":\"Expression\",\"symbols\":[\"UP\",\"DOWN\"]},{\"type\":\"record\",\"name\":\"Xref\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"src\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":[\"null\",\"double\"]},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"ConsequenceTypeEntry\",\"fields\":[{\"name\":\"soName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"soAccession\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"ExpressionValue\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"factorValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"experimentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"expression\",\"type\":\"Expression\"},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"ConsequenceType\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblGeneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblTranscriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"strand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"biotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cDnaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"cdsPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaChange\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"codon\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"functionalDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"proteinSubstitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"soTerms\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ConsequenceTypeEntry\"}]},{\"name\":\"expressionValues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ExpressionValue\"}]}]},{\"type\":\"record\",\"name\":\"PopulationFrequency\",\"fields\":[{\"name\":\"study\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"pop\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"superPop\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"altAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"refHomGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"hetGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altHomGenotypeFreq\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"CaddScore\",\"fields\":[{\"name\":\"transcriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cScore\",\"type\":[\"null\",\"float\"]},{\"name\":\"rawScore\",\"type\":[\"null\",\"float\"]}]},{\"type\":\"record\",\"name\":\"VariantAnnotation\",\"fields\":[{\"name\":\"chromosome\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"start\",\"type\":[\"null\",\"int\"]},{\"name\":\"end\",\"type\":[\"null\",\"int\"]},{\"name\":\"reference\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"alternate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"xrefs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Xref\"}]},{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"consequenceTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ConsequenceType\"}]},{\"name\":\"conservation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"populationFrequencies\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"PopulationFrequency\"}]},{\"name\":\"geneDrugInteraction\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"}]},{\"name\":\"variantTraitAssociation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]},{\"name\":\"additionalAttributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Variant AVDL Model
 *  @author Kalyan;
 *  @author Pawan;  models.variant.avro */
  public interface Callback extends VariantAnnotations {
    public static final org.apache.avro.Protocol PROTOCOL = org.opencb.biodata.models.variant.avro.VariantAnnotations.PROTOCOL;
  }
}