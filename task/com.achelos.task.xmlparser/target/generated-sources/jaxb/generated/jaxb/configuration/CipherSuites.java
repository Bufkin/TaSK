//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CipherSuites complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CipherSuites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CipherSuite" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="use" type="{}usetype" /&gt;
 *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="full-list" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CipherSuites", propOrder = {
    "cipherSuite"
})
public class CipherSuites {

    @XmlElement(name = "CipherSuite", required = true)
    protected List<SpecificationDetails> cipherSuite;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "use")
    protected Usetype use;
    @XmlAttribute(name = "reference")
    protected String reference;
    @XmlAttribute(name = "full-list")
    protected Boolean fullList;

    /**
     * Gets the value of the cipherSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cipherSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCipherSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationDetails }
     * 
     * 
     */
    public List<SpecificationDetails> getCipherSuite() {
        if (cipherSuite == null) {
            cipherSuite = new ArrayList<SpecificationDetails>();
        }
        return this.cipherSuite;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Ruft den Wert der fullList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFullList() {
        if (fullList == null) {
            return false;
        } else {
            return fullList;
        }
    }

    /**
     * Legt den Wert der fullList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullList(Boolean value) {
        this.fullList = value;
    }

}
