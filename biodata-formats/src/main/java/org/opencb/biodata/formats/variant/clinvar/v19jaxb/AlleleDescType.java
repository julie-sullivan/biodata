//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 06:05:35 PM CEST 
//


package org.opencb.biodata.formats.variant.clinvar.v19jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is to be used within co-occurrence set 
 * 
 * <p>Java class for AlleleDescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlleleDescType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RelativeOrientation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="cis"/>
 *               &lt;enumeration value="trans"/>
 *               &lt;enumeration value="unknown"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Zygosity" type="{}ZygosityType" minOccurs="0"/>
 *         &lt;element name="ClinicalSignificance" type="{}ClinicalSignificanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlleleDescType", propOrder = {
    "name",
    "relativeOrientation",
    "zygosity",
    "clinicalSignificance"
})
public class AlleleDescType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "RelativeOrientation")
    protected String relativeOrientation;
    @XmlElement(name = "Zygosity")
    protected ZygosityType zygosity;
    @XmlElement(name = "ClinicalSignificance")
    protected ClinicalSignificanceType clinicalSignificance;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relativeOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeOrientation() {
        return relativeOrientation;
    }

    /**
     * Sets the value of the relativeOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeOrientation(String value) {
        this.relativeOrientation = value;
    }

    /**
     * Gets the value of the zygosity property.
     * 
     * @return
     *     possible object is
     *     {@link ZygosityType }
     *     
     */
    public ZygosityType getZygosity() {
        return zygosity;
    }

    /**
     * Sets the value of the zygosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZygosityType }
     *     
     */
    public void setZygosity(ZygosityType value) {
        this.zygosity = value;
    }

    /**
     * Gets the value of the clinicalSignificance property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalSignificanceType }
     *     
     */
    public ClinicalSignificanceType getClinicalSignificance() {
        return clinicalSignificance;
    }

    /**
     * Sets the value of the clinicalSignificance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalSignificanceType }
     *     
     */
    public void setClinicalSignificance(ClinicalSignificanceType value) {
        this.clinicalSignificance = value;
    }

}
