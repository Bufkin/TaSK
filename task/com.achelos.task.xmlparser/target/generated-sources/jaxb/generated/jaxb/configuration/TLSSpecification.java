//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TLSSpecification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TLSSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Metadata" type="{}Metadata"/&gt;
 *         &lt;element name="BaseSpecification" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TLSSpecification" type="{}TLSSpecification"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FurtherSpecifications" type="{}FurtherSpecifications" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLSSpecification", propOrder = {
    "metadata",
    "baseSpecification",
    "furtherSpecifications"
})
public class TLSSpecification {

    @XmlElement(name = "Metadata", required = true)
    protected Metadata metadata;
    @XmlElement(name = "BaseSpecification")
    protected TLSSpecification.BaseSpecification baseSpecification;
    @XmlElement(name = "FurtherSpecifications")
    protected FurtherSpecifications furtherSpecifications;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft den Wert der metadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Legt den Wert der metadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Ruft den Wert der baseSpecification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSSpecification.BaseSpecification }
     *     
     */
    public TLSSpecification.BaseSpecification getBaseSpecification() {
        return baseSpecification;
    }

    /**
     * Legt den Wert der baseSpecification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSSpecification.BaseSpecification }
     *     
     */
    public void setBaseSpecification(TLSSpecification.BaseSpecification value) {
        this.baseSpecification = value;
    }

    /**
     * Ruft den Wert der furtherSpecifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FurtherSpecifications }
     *     
     */
    public FurtherSpecifications getFurtherSpecifications() {
        return furtherSpecifications;
    }

    /**
     * Legt den Wert der furtherSpecifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherSpecifications }
     *     
     */
    public void setFurtherSpecifications(FurtherSpecifications value) {
        this.furtherSpecifications = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TLSSpecification" type="{}TLSSpecification"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tlsSpecification"
    })
    public static class BaseSpecification {

        @XmlElement(name = "TLSSpecification", required = true)
        protected TLSSpecification tlsSpecification;

        /**
         * Ruft den Wert der tlsSpecification-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TLSSpecification }
         *     
         */
        public TLSSpecification getTLSSpecification() {
            return tlsSpecification;
        }

        /**
         * Legt den Wert der tlsSpecification-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TLSSpecification }
         *     
         */
        public void setTLSSpecification(TLSSpecification value) {
            this.tlsSpecification = value;
        }

    }

}
