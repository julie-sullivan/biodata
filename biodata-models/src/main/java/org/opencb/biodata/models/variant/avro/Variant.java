/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Variant extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Variant\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"ids\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"chromosome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"length\",\"type\":\"int\"},{\"name\":\"reference\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"alternate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"variantType\",\"type\":{\"type\":\"enum\",\"name\":\"VariantType\",\"symbols\":[\"SNP\",\"SNV\",\"MNP\",\"MNV\",\"INDEL\",\"SV\",\"CNV\",\"NO_VARIATION\",\"SYMBOLIC\",\"MIXED\"]}},{\"name\":\"sourceEntries\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"VariantSourceEntry\",\"fields\":[{\"name\":\"fileId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"studyId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"secondaryAlternates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"format\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"samplesData\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}},{\"name\":\"cohortStats\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"VariantStats\",\"fields\":[{\"name\":\"refAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"altAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAlleleCount\",\"type\":[\"null\",\"int\"]},{\"name\":\"altAlleleCount\",\"type\":[\"null\",\"int\"]},{\"name\":\"missingAlleles\",\"type\":[\"null\",\"int\"]},{\"name\":\"missingGenotypes\",\"type\":[\"null\",\"int\"]},{\"name\":\"refAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"maf\",\"type\":[\"null\",\"float\"]},{\"name\":\"mgf\",\"type\":[\"null\",\"float\"]},{\"name\":\"mafAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mgfGenotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"passedFilters\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"mendelianErrors\",\"type\":[\"null\",\"int\"]},{\"name\":\"casesPercentDominant\",\"type\":[\"null\",\"float\"]},{\"name\":\"controlsPercentDominant\",\"type\":[\"null\",\"float\"]},{\"name\":\"casesPercentRecessive\",\"type\":[\"null\",\"float\"]},{\"name\":\"controlsPercentRecessive\",\"type\":[\"null\",\"float\"]},{\"name\":\"quality\",\"type\":[\"null\",\"float\"]},{\"name\":\"numSamples\",\"type\":[\"null\",\"int\"]},{\"name\":\"variantType\",\"type\":\"VariantType\"},{\"name\":\"hw\",\"type\":{\"type\":\"record\",\"name\":\"VariantHardyWeinbergStats\",\"fields\":[{\"name\":\"chi2\",\"type\":[\"null\",\"float\"]},{\"name\":\"pValue\",\"type\":[\"null\",\"float\"]},{\"name\":\"n\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_AA_11\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_Aa_10\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_aa_00\",\"type\":[\"null\",\"int\"]},{\"name\":\"e_AA_11\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_Aa_10\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_aa_00\",\"type\":[\"null\",\"float\"]},{\"name\":\"p\",\"type\":[\"null\",\"float\"]},{\"name\":\"q\",\"type\":[\"null\",\"float\"]}]}}]},\"avro.java.string\":\"String\"}},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]},\"avro.java.string\":\"String\"}},{\"name\":\"annotation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VariantAnnotation\",\"fields\":[{\"name\":\"chromosome\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"start\",\"type\":[\"null\",\"int\"]},{\"name\":\"end\",\"type\":[\"null\",\"int\"]},{\"name\":\"reference\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"alternate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"xrefs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Xref\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"src\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"name\":\"consequenceTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConsequenceType\",\"fields\":[{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblGeneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"ensemblTranscriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"strand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"biotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cDnaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"cdsPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaPosition\",\"type\":[\"null\",\"int\"]},{\"name\":\"aaChange\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"codon\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"functionalDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"proteinSubstitutionScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"score\",\"type\":[\"null\",\"double\"]},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"soTerms\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConsequenceTypeEntry\",\"fields\":[{\"name\":\"soName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"soAccession\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}]},{\"name\":\"expressionValues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExpressionValue\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"factorValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"experimentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"expression\",\"type\":{\"type\":\"enum\",\"name\":\"Expression\",\"symbols\":[\"UP\",\"DOWN\"]}},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]}}]}]}}]},{\"name\":\"conservation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Score\"}]},{\"name\":\"populationFrequencies\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PopulationFrequency\",\"fields\":[{\"name\":\"study\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"pop\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"superPop\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"altAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"refAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altAlleleFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"refHomGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"hetGenotypeFreq\",\"type\":[\"null\",\"float\"]},{\"name\":\"altHomGenotypeFreq\",\"type\":[\"null\",\"float\"]}]}}]},{\"name\":\"geneDrugInteraction\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"}]},{\"name\":\"variantTraitAssociation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]},{\"name\":\"additionalAttributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]}]}]},{\"name\":\"hgvs\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.util.List<java.lang.String> ids;
   private java.lang.String chromosome;
   private int start;
   private int end;
   private int length;
   private java.lang.String reference;
   private java.lang.String alternate;
   private org.opencb.biodata.models.variant.avro.VariantType variantType;
   private java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> sourceEntries;
   private org.opencb.biodata.models.variant.avro.VariantAnnotation annotation;
   private java.util.Map<java.lang.String,java.util.List<java.lang.String>> hgvs;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Variant() {}

  /**
   * All-args constructor.
   */
  public Variant(java.util.List<java.lang.String> ids, java.lang.String chromosome, java.lang.Integer start, java.lang.Integer end, java.lang.Integer length, java.lang.String reference, java.lang.String alternate, org.opencb.biodata.models.variant.avro.VariantType variantType, java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> sourceEntries, org.opencb.biodata.models.variant.avro.VariantAnnotation annotation, java.util.Map<java.lang.String,java.util.List<java.lang.String>> hgvs) {
    this.ids = ids;
    this.chromosome = chromosome;
    this.start = start;
    this.end = end;
    this.length = length;
    this.reference = reference;
    this.alternate = alternate;
    this.variantType = variantType;
    this.sourceEntries = sourceEntries;
    this.annotation = annotation;
    this.hgvs = hgvs;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ids;
    case 1: return chromosome;
    case 2: return start;
    case 3: return end;
    case 4: return length;
    case 5: return reference;
    case 6: return alternate;
    case 7: return variantType;
    case 8: return sourceEntries;
    case 9: return annotation;
    case 10: return hgvs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ids = (java.util.List<java.lang.String>)value$; break;
    case 1: chromosome = (java.lang.String)value$; break;
    case 2: start = (java.lang.Integer)value$; break;
    case 3: end = (java.lang.Integer)value$; break;
    case 4: length = (java.lang.Integer)value$; break;
    case 5: reference = (java.lang.String)value$; break;
    case 6: alternate = (java.lang.String)value$; break;
    case 7: variantType = (org.opencb.biodata.models.variant.avro.VariantType)value$; break;
    case 8: sourceEntries = (java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry>)value$; break;
    case 9: annotation = (org.opencb.biodata.models.variant.avro.VariantAnnotation)value$; break;
    case 10: hgvs = (java.util.Map<java.lang.String,java.util.List<java.lang.String>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ids' field.
   */
  public java.util.List<java.lang.String> getIds() {
    return ids;
  }

  /**
   * Sets the value of the 'ids' field.
   * @param value the value to set.
   */
  public void setIds(java.util.List<java.lang.String> value) {
    this.ids = value;
  }

  /**
   * Gets the value of the 'chromosome' field.
   */
  public java.lang.String getChromosome() {
    return chromosome;
  }

  /**
   * Sets the value of the 'chromosome' field.
   * @param value the value to set.
   */
  public void setChromosome(java.lang.String value) {
    this.chromosome = value;
  }

  /**
   * Gets the value of the 'start' field.
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(java.lang.Integer value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(java.lang.Integer value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'length' field.
   */
  public java.lang.Integer getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * @param value the value to set.
   */
  public void setLength(java.lang.Integer value) {
    this.length = value;
  }

  /**
   * Gets the value of the 'reference' field.
   */
  public java.lang.String getReference() {
    return reference;
  }

  /**
   * Sets the value of the 'reference' field.
   * @param value the value to set.
   */
  public void setReference(java.lang.String value) {
    this.reference = value;
  }

  /**
   * Gets the value of the 'alternate' field.
   */
  public java.lang.String getAlternate() {
    return alternate;
  }

  /**
   * Sets the value of the 'alternate' field.
   * @param value the value to set.
   */
  public void setAlternate(java.lang.String value) {
    this.alternate = value;
  }

  /**
   * Gets the value of the 'variantType' field.
   */
  public org.opencb.biodata.models.variant.avro.VariantType getVariantType() {
    return variantType;
  }

  /**
   * Sets the value of the 'variantType' field.
   * @param value the value to set.
   */
  public void setVariantType(org.opencb.biodata.models.variant.avro.VariantType value) {
    this.variantType = value;
  }

  /**
   * Gets the value of the 'sourceEntries' field.
   */
  public java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> getSourceEntries() {
    return sourceEntries;
  }

  /**
   * Sets the value of the 'sourceEntries' field.
   * @param value the value to set.
   */
  public void setSourceEntries(java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> value) {
    this.sourceEntries = value;
  }

  /**
   * Gets the value of the 'annotation' field.
   */
  public org.opencb.biodata.models.variant.avro.VariantAnnotation getAnnotation() {
    return annotation;
  }

  /**
   * Sets the value of the 'annotation' field.
   * @param value the value to set.
   */
  public void setAnnotation(org.opencb.biodata.models.variant.avro.VariantAnnotation value) {
    this.annotation = value;
  }

  /**
   * Gets the value of the 'hgvs' field.
   */
  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getHgvs() {
    return hgvs;
  }

  /**
   * Sets the value of the 'hgvs' field.
   * @param value the value to set.
   */
  public void setHgvs(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
    this.hgvs = value;
  }

  /** Creates a new Variant RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.Variant.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.Variant.Builder();
  }
  
  /** Creates a new Variant RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.Variant.Builder newBuilder(org.opencb.biodata.models.variant.avro.Variant.Builder other) {
    return new org.opencb.biodata.models.variant.avro.Variant.Builder(other);
  }
  
  /** Creates a new Variant RecordBuilder by copying an existing Variant instance */
  public static org.opencb.biodata.models.variant.avro.Variant.Builder newBuilder(org.opencb.biodata.models.variant.avro.Variant other) {
    return new org.opencb.biodata.models.variant.avro.Variant.Builder(other);
  }
  
  /**
   * RecordBuilder for Variant instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Variant>
    implements org.apache.avro.data.RecordBuilder<Variant> {

    private java.util.List<java.lang.String> ids;
    private java.lang.String chromosome;
    private int start;
    private int end;
    private int length;
    private java.lang.String reference;
    private java.lang.String alternate;
    private org.opencb.biodata.models.variant.avro.VariantType variantType;
    private java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> sourceEntries;
    private org.opencb.biodata.models.variant.avro.VariantAnnotation annotation;
    private java.util.Map<java.lang.String,java.util.List<java.lang.String>> hgvs;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.Variant.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.Variant.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ids)) {
        this.ids = data().deepCopy(fields()[0].schema(), other.ids);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.chromosome)) {
        this.chromosome = data().deepCopy(fields()[1].schema(), other.chromosome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.length)) {
        this.length = data().deepCopy(fields()[4].schema(), other.length);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.reference)) {
        this.reference = data().deepCopy(fields()[5].schema(), other.reference);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.alternate)) {
        this.alternate = data().deepCopy(fields()[6].schema(), other.alternate);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.variantType)) {
        this.variantType = data().deepCopy(fields()[7].schema(), other.variantType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sourceEntries)) {
        this.sourceEntries = data().deepCopy(fields()[8].schema(), other.sourceEntries);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.annotation)) {
        this.annotation = data().deepCopy(fields()[9].schema(), other.annotation);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.hgvs)) {
        this.hgvs = data().deepCopy(fields()[10].schema(), other.hgvs);
        fieldSetFlags()[10] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Variant instance */
    private Builder(org.opencb.biodata.models.variant.avro.Variant other) {
            super(org.opencb.biodata.models.variant.avro.Variant.SCHEMA$);
      if (isValidValue(fields()[0], other.ids)) {
        this.ids = data().deepCopy(fields()[0].schema(), other.ids);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.chromosome)) {
        this.chromosome = data().deepCopy(fields()[1].schema(), other.chromosome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.length)) {
        this.length = data().deepCopy(fields()[4].schema(), other.length);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.reference)) {
        this.reference = data().deepCopy(fields()[5].schema(), other.reference);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.alternate)) {
        this.alternate = data().deepCopy(fields()[6].schema(), other.alternate);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.variantType)) {
        this.variantType = data().deepCopy(fields()[7].schema(), other.variantType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sourceEntries)) {
        this.sourceEntries = data().deepCopy(fields()[8].schema(), other.sourceEntries);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.annotation)) {
        this.annotation = data().deepCopy(fields()[9].schema(), other.annotation);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.hgvs)) {
        this.hgvs = data().deepCopy(fields()[10].schema(), other.hgvs);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'ids' field */
    public java.util.List<java.lang.String> getIds() {
      return ids;
    }
    
    /** Sets the value of the 'ids' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setIds(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.ids = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ids' field has been set */
    public boolean hasIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ids' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearIds() {
      ids = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'chromosome' field */
    public java.lang.String getChromosome() {
      return chromosome;
    }
    
    /** Sets the value of the 'chromosome' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setChromosome(java.lang.String value) {
      validate(fields()[1], value);
      this.chromosome = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'chromosome' field has been set */
    public boolean hasChromosome() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'chromosome' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearChromosome() {
      chromosome = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public java.lang.Integer getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setStart(int value) {
      validate(fields()[2], value);
      this.start = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'start' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearStart() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public java.lang.Integer getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setEnd(int value) {
      validate(fields()[3], value);
      this.end = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'end' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearEnd() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'length' field */
    public java.lang.Integer getLength() {
      return length;
    }
    
    /** Sets the value of the 'length' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setLength(int value) {
      validate(fields()[4], value);
      this.length = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'length' field has been set */
    public boolean hasLength() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'length' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearLength() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'reference' field */
    public java.lang.String getReference() {
      return reference;
    }
    
    /** Sets the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setReference(java.lang.String value) {
      validate(fields()[5], value);
      this.reference = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'reference' field has been set */
    public boolean hasReference() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'reference' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearReference() {
      reference = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'alternate' field */
    public java.lang.String getAlternate() {
      return alternate;
    }
    
    /** Sets the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setAlternate(java.lang.String value) {
      validate(fields()[6], value);
      this.alternate = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'alternate' field has been set */
    public boolean hasAlternate() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'alternate' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearAlternate() {
      alternate = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'variantType' field */
    public org.opencb.biodata.models.variant.avro.VariantType getVariantType() {
      return variantType;
    }
    
    /** Sets the value of the 'variantType' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setVariantType(org.opencb.biodata.models.variant.avro.VariantType value) {
      validate(fields()[7], value);
      this.variantType = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'variantType' field has been set */
    public boolean hasVariantType() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'variantType' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearVariantType() {
      variantType = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'sourceEntries' field */
    public java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> getSourceEntries() {
      return sourceEntries;
    }
    
    /** Sets the value of the 'sourceEntries' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setSourceEntries(java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry> value) {
      validate(fields()[8], value);
      this.sourceEntries = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'sourceEntries' field has been set */
    public boolean hasSourceEntries() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'sourceEntries' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearSourceEntries() {
      sourceEntries = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'annotation' field */
    public org.opencb.biodata.models.variant.avro.VariantAnnotation getAnnotation() {
      return annotation;
    }
    
    /** Sets the value of the 'annotation' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setAnnotation(org.opencb.biodata.models.variant.avro.VariantAnnotation value) {
      validate(fields()[9], value);
      this.annotation = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'annotation' field has been set */
    public boolean hasAnnotation() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'annotation' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearAnnotation() {
      annotation = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'hgvs' field */
    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getHgvs() {
      return hgvs;
    }
    
    /** Sets the value of the 'hgvs' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder setHgvs(java.util.Map<java.lang.String,java.util.List<java.lang.String>> value) {
      validate(fields()[10], value);
      this.hgvs = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'hgvs' field has been set */
    public boolean hasHgvs() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'hgvs' field */
    public org.opencb.biodata.models.variant.avro.Variant.Builder clearHgvs() {
      hgvs = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public Variant build() {
      try {
        Variant record = new Variant();
        record.ids = fieldSetFlags()[0] ? this.ids : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        record.chromosome = fieldSetFlags()[1] ? this.chromosome : (java.lang.String) defaultValue(fields()[1]);
        record.start = fieldSetFlags()[2] ? this.start : (java.lang.Integer) defaultValue(fields()[2]);
        record.end = fieldSetFlags()[3] ? this.end : (java.lang.Integer) defaultValue(fields()[3]);
        record.length = fieldSetFlags()[4] ? this.length : (java.lang.Integer) defaultValue(fields()[4]);
        record.reference = fieldSetFlags()[5] ? this.reference : (java.lang.String) defaultValue(fields()[5]);
        record.alternate = fieldSetFlags()[6] ? this.alternate : (java.lang.String) defaultValue(fields()[6]);
        record.variantType = fieldSetFlags()[7] ? this.variantType : (org.opencb.biodata.models.variant.avro.VariantType) defaultValue(fields()[7]);
        record.sourceEntries = fieldSetFlags()[8] ? this.sourceEntries : (java.util.Map<java.lang.String,org.opencb.biodata.models.variant.avro.VariantSourceEntry>) defaultValue(fields()[8]);
        record.annotation = fieldSetFlags()[9] ? this.annotation : (org.opencb.biodata.models.variant.avro.VariantAnnotation) defaultValue(fields()[9]);
        record.hgvs = fieldSetFlags()[10] ? this.hgvs : (java.util.Map<java.lang.String,java.util.List<java.lang.String>>) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
