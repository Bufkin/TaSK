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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationSpecificInspectionInstructions" type="{}AppSpecInspInst" minOccurs="0"/&gt;
 *         &lt;element name="Profiles" type="{}Profiles"/&gt;
 *         &lt;element name="ICSSections" type="{}ICSSections"/&gt;
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
@XmlType(name = "", propOrder = {
    "title",
    "version",
    "description",
    "reference",
    "applicationSpecificInspectionInstructions",
    "profiles",
    "icsSections"
})
@XmlRootElement(name = "ApplicationMapping")
public class ApplicationMapping {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Reference")
    protected List<String> reference;
    @XmlElement(name = "ApplicationSpecificInspectionInstructions")
    protected AppSpecInspInst applicationSpecificInspectionInstructions;
    @XmlElement(name = "Profiles", required = true)
    protected Profiles profiles;
    @XmlElement(name = "ICSSections", required = true)
    protected ICSSections icsSections;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

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
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReference() {
        if (reference == null) {
            reference = new ArrayList<String>();
        }
        return this.reference;
    }

    /**
     * Ruft den Wert der applicationSpecificInspectionInstructions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AppSpecInspInst }
     *     
     */
    public AppSpecInspInst getApplicationSpecificInspectionInstructions() {
        return applicationSpecificInspectionInstructions;
    }

    /**
     * Legt den Wert der applicationSpecificInspectionInstructions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSpecInspInst }
     *     
     */
    public void setApplicationSpecificInspectionInstructions(AppSpecInspInst value) {
        this.applicationSpecificInspectionInstructions = value;
    }

    /**
     * Ruft den Wert der profiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Profiles }
     *     
     */
    public Profiles getProfiles() {
        return profiles;
    }

    /**
     * Legt den Wert der profiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Profiles }
     *     
     */
    public void setProfiles(Profiles value) {
        this.profiles = value;
    }

    /**
     * Ruft den Wert der icsSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ICSSections }
     *     
     */
    public ICSSections getICSSections() {
        return icsSections;
    }

    /**
     * Legt den Wert der icsSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ICSSections }
     *     
     */
    public void setICSSections(ICSSections value) {
        this.icsSections = value;
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
