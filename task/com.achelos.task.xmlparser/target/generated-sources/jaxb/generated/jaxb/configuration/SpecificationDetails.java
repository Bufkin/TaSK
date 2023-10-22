//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpecificationDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecificationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{}usetype" /&gt;
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationDetails", propOrder = {
    "description",
    "value",
    "reference",
    "useUntil"
})
public class SpecificationDetails {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "UseUntil")
    protected String useUntil;
    @XmlAttribute(name = "use")
    protected Usetype use;
    @XmlAttribute(name = "priority")
    protected BigInteger priority;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der reference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Legt den Wert der reference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Ruft den Wert der useUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseUntil() {
        return useUntil;
    }

    /**
     * Legt den Wert der useUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseUntil(String value) {
        this.useUntil = value;
    }

    /**
     * Ruft den Wert der use-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Usetype }
     *     
     */
    public Usetype getUse() {
        return use;
    }

    /**
     * Legt den Wert der use-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Usetype }
     *     
     */
    public void setUse(Usetype value) {
        this.use = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

}
