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
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="Precondition" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="TestStep" type="{http://bsi.bund.de/TR03116}TestStep" maxOccurs="unbounded"/&gt;
 *             &lt;element name="Postcondition" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="Metadata" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
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
    "purpose",
    "profile",
    "reference",
    "precondition",
    "testStep",
    "postcondition",
    "metadata",
    "comment"
})
@XmlRootElement(name = "TestCase", namespace = "http://bsi.bund.de/TR03116")
public class TestCase {

    @XmlElement(name = "Title", namespace = "http://bsi.bund.de/TR03116", required = true)
    protected String title;
    @XmlElement(name = "Version", namespace = "http://bsi.bund.de/TR03116")
    protected String version;
    @XmlElement(name = "Purpose", namespace = "http://bsi.bund.de/TR03116")
    protected String purpose;
    @XmlElement(name = "Profile", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> profile;
    @XmlElement(name = "Reference", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> reference;
    @XmlElement(name = "Precondition", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> precondition;
    @XmlElement(name = "TestStep", namespace = "http://bsi.bund.de/TR03116")
    protected List<TestStep> testStep;
    @XmlElement(name = "Postcondition", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> postcondition;
    @XmlElement(name = "Metadata", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> metadata;
    @XmlElement(name = "Comment", namespace = "http://bsi.bund.de/TR03116")
    protected String comment;
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
     * Ruft den Wert der purpose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Legt den Wert der purpose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProfile() {
        if (profile == null) {
            profile = new ArrayList<String>();
        }
        return this.profile;
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
     * Gets the value of the precondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the precondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrecondition() {
        if (precondition == null) {
            precondition = new ArrayList<String>();
        }
        return this.precondition;
    }

    /**
     * Gets the value of the testStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the testStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestStep }
     * 
     * 
     */
    public List<TestStep> getTestStep() {
        if (testStep == null) {
            testStep = new ArrayList<TestStep>();
        }
        return this.testStep;
    }

    /**
     * Gets the value of the postcondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the postcondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostcondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPostcondition() {
        if (postcondition == null) {
            postcondition = new ArrayList<String>();
        }
        return this.postcondition;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<String>();
        }
        return this.metadata;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
