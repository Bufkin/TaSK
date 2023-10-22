//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ICSSections complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ICSSections"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MandatoryICSSections" type="{}SectionList"/&gt;
 *         &lt;element name="OptionalICSSections" type="{}SectionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICSSections", propOrder = {
    "mandatoryICSSections",
    "optionalICSSections"
})
public class ICSSections {

    @XmlElement(name = "MandatoryICSSections", required = true)
    protected SectionList mandatoryICSSections;
    @XmlElement(name = "OptionalICSSections")
    protected SectionList optionalICSSections;

    /**
     * Ruft den Wert der mandatoryICSSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SectionList }
     *     
     */
    public SectionList getMandatoryICSSections() {
        return mandatoryICSSections;
    }

    /**
     * Legt den Wert der mandatoryICSSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionList }
     *     
     */
    public void setMandatoryICSSections(SectionList value) {
        this.mandatoryICSSections = value;
    }

    /**
     * Ruft den Wert der optionalICSSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SectionList }
     *     
     */
    public SectionList getOptionalICSSections() {
        return optionalICSSections;
    }

    /**
     * Legt den Wert der optionalICSSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionList }
     *     
     */
    public void setOptionalICSSections(SectionList value) {
        this.optionalICSSections = value;
    }

}
