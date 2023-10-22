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
 * <p>Java-Klasse für Profiles complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Profiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MandatoryProfiles" type="{}ProfileList"/&gt;
 *         &lt;element name="RecommendedProfiles" type="{}ProfileList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profiles", propOrder = {
    "mandatoryProfiles",
    "recommendedProfiles"
})
public class Profiles {

    @XmlElement(name = "MandatoryProfiles", required = true)
    protected ProfileList mandatoryProfiles;
    @XmlElement(name = "RecommendedProfiles")
    protected ProfileList recommendedProfiles;

    /**
     * Ruft den Wert der mandatoryProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileList }
     *     
     */
    public ProfileList getMandatoryProfiles() {
        return mandatoryProfiles;
    }

    /**
     * Legt den Wert der mandatoryProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileList }
     *     
     */
    public void setMandatoryProfiles(ProfileList value) {
        this.mandatoryProfiles = value;
    }

    /**
     * Ruft den Wert der recommendedProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileList }
     *     
     */
    public ProfileList getRecommendedProfiles() {
        return recommendedProfiles;
    }

    /**
     * Legt den Wert der recommendedProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileList }
     *     
     */
    public void setRecommendedProfiles(ProfileList value) {
        this.recommendedProfiles = value;
    }

}
