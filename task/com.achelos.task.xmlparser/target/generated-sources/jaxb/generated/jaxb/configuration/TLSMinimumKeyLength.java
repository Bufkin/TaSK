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
 * <p>Java-Klasse für TLSMinimumKeyLength complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TLSMinimumKeyLength"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Metadata" type="{}Metadata"/&gt;
 *         &lt;element name="MinimumKeyLengths" type="{}MinimumKeyLengths"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLSMinimumKeyLength", propOrder = {
    "metadata",
    "minimumKeyLengths"
})
public class TLSMinimumKeyLength {

    @XmlElement(name = "Metadata", required = true)
    protected Metadata metadata;
    @XmlElement(name = "MinimumKeyLengths", required = true)
    protected MinimumKeyLengths minimumKeyLengths;
    @XmlAttribute(name = "id")
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
     * Ruft den Wert der minimumKeyLengths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MinimumKeyLengths }
     *     
     */
    public MinimumKeyLengths getMinimumKeyLengths() {
        return minimumKeyLengths;
    }

    /**
     * Legt den Wert der minimumKeyLengths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumKeyLengths }
     *     
     */
    public void setMinimumKeyLengths(MinimumKeyLengths value) {
        this.minimumKeyLengths = value;
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

}
