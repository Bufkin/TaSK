//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.input;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApplicationUnderTest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApplicationUnderTest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RespectiveTechnicalGuideline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="DUTExecutable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DUTCallArguments" type="{}DutCallArguments"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationUnderTest", propOrder = {
    "applicationType",
    "respectiveTechnicalGuideline",
    "url",
    "port",
    "dutExecutable",
    "dutCallArguments"
})
public class ApplicationUnderTest {

    @XmlElement(name = "ApplicationType", required = true)
    protected String applicationType;
    @XmlElement(name = "RespectiveTechnicalGuideline")
    protected String respectiveTechnicalGuideline;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "DUTExecutable")
    protected String dutExecutable;
    @XmlElement(name = "DUTCallArguments")
    protected DutCallArguments dutCallArguments;

    /**
     * Ruft den Wert der applicationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Legt den Wert der applicationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * Ruft den Wert der respectiveTechnicalGuideline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespectiveTechnicalGuideline() {
        return respectiveTechnicalGuideline;
    }

    /**
     * Legt den Wert der respectiveTechnicalGuideline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespectiveTechnicalGuideline(String value) {
        this.respectiveTechnicalGuideline = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der port-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Legt den Wert der port-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Ruft den Wert der dutExecutable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUTExecutable() {
        return dutExecutable;
    }

    /**
     * Legt den Wert der dutExecutable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUTExecutable(String value) {
        this.dutExecutable = value;
    }

    /**
     * Ruft den Wert der dutCallArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutCallArguments }
     *     
     */
    public DutCallArguments getDUTCallArguments() {
        return dutCallArguments;
    }

    /**
     * Legt den Wert der dutCallArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutCallArguments }
     *     
     */
    public void setDUTCallArguments(DutCallArguments value) {
        this.dutCallArguments = value;
    }

}
