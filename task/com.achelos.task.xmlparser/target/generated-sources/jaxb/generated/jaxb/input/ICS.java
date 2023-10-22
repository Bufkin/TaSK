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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationUnderTest" type="{}ApplicationUnderTest"/&gt;
 *         &lt;element name="Profiles" type="{}ProfileList"/&gt;
 *         &lt;element name="SupportedCryptography" type="{}SupportedCryptography"/&gt;
 *         &lt;element name="InformationOnTR03145Certification" type="{}InformationOnTR03145Certification" minOccurs="0"/&gt;
 *         &lt;element name="TLSWithPSKCipherSuites" type="{}TLSWithPSKCipherSuites" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionTimeout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zero-RTTData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TLSCertificates" type="{}TLSCertificates" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationSpecificData" type="{}ApplicationSpecificData" minOccurs="0"/&gt;
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
    "title",
    "version",
    "description",
    "applicationUnderTest",
    "profiles",
    "supportedCryptography",
    "informationOnTR03145Certification",
    "tlsWithPSKCipherSuites",
    "connectionTimeout",
    "zeroRTTData",
    "tlsCertificates",
    "applicationSpecificData"
})
@XmlRootElement(name = "ICS")
public class ICS {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ApplicationUnderTest", required = true)
    protected ApplicationUnderTest applicationUnderTest;
    @XmlElement(name = "Profiles", required = true)
    protected ProfileList profiles;
    @XmlElement(name = "SupportedCryptography", required = true)
    protected SupportedCryptography supportedCryptography;
    @XmlElement(name = "InformationOnTR03145Certification")
    protected InformationOnTR03145Certification informationOnTR03145Certification;
    @XmlElement(name = "TLSWithPSKCipherSuites")
    protected TLSWithPSKCipherSuites tlsWithPSKCipherSuites;
    @XmlElement(name = "ConnectionTimeout", required = true)
    protected String connectionTimeout;
    @XmlElement(name = "Zero-RTTData")
    protected Boolean zeroRTTData;
    @XmlElement(name = "TLSCertificates")
    protected TLSCertificates tlsCertificates;
    @XmlElement(name = "ApplicationSpecificData")
    protected ApplicationSpecificData applicationSpecificData;

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
     * Ruft den Wert der applicationUnderTest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationUnderTest }
     *     
     */
    public ApplicationUnderTest getApplicationUnderTest() {
        return applicationUnderTest;
    }

    /**
     * Legt den Wert der applicationUnderTest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationUnderTest }
     *     
     */
    public void setApplicationUnderTest(ApplicationUnderTest value) {
        this.applicationUnderTest = value;
    }

    /**
     * Ruft den Wert der profiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileList }
     *     
     */
    public ProfileList getProfiles() {
        return profiles;
    }

    /**
     * Legt den Wert der profiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileList }
     *     
     */
    public void setProfiles(ProfileList value) {
        this.profiles = value;
    }

    /**
     * Ruft den Wert der supportedCryptography-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCryptography }
     *     
     */
    public SupportedCryptography getSupportedCryptography() {
        return supportedCryptography;
    }

    /**
     * Legt den Wert der supportedCryptography-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCryptography }
     *     
     */
    public void setSupportedCryptography(SupportedCryptography value) {
        this.supportedCryptography = value;
    }

    /**
     * Ruft den Wert der informationOnTR03145Certification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InformationOnTR03145Certification }
     *     
     */
    public InformationOnTR03145Certification getInformationOnTR03145Certification() {
        return informationOnTR03145Certification;
    }

    /**
     * Legt den Wert der informationOnTR03145Certification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationOnTR03145Certification }
     *     
     */
    public void setInformationOnTR03145Certification(InformationOnTR03145Certification value) {
        this.informationOnTR03145Certification = value;
    }

    /**
     * Ruft den Wert der tlsWithPSKCipherSuites-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSWithPSKCipherSuites }
     *     
     */
    public TLSWithPSKCipherSuites getTLSWithPSKCipherSuites() {
        return tlsWithPSKCipherSuites;
    }

    /**
     * Legt den Wert der tlsWithPSKCipherSuites-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSWithPSKCipherSuites }
     *     
     */
    public void setTLSWithPSKCipherSuites(TLSWithPSKCipherSuites value) {
        this.tlsWithPSKCipherSuites = value;
    }

    /**
     * Ruft den Wert der connectionTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Legt den Wert der connectionTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionTimeout(String value) {
        this.connectionTimeout = value;
    }

    /**
     * Ruft den Wert der zeroRTTData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroRTTData() {
        return zeroRTTData;
    }

    /**
     * Legt den Wert der zeroRTTData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroRTTData(Boolean value) {
        this.zeroRTTData = value;
    }

    /**
     * Ruft den Wert der tlsCertificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSCertificates }
     *     
     */
    public TLSCertificates getTLSCertificates() {
        return tlsCertificates;
    }

    /**
     * Legt den Wert der tlsCertificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSCertificates }
     *     
     */
    public void setTLSCertificates(TLSCertificates value) {
        this.tlsCertificates = value;
    }

    /**
     * Ruft den Wert der applicationSpecificData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSpecificData }
     *     
     */
    public ApplicationSpecificData getApplicationSpecificData() {
        return applicationSpecificData;
    }

    /**
     * Legt den Wert der applicationSpecificData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSpecificData }
     *     
     */
    public void setApplicationSpecificData(ApplicationSpecificData value) {
        this.applicationSpecificData = value;
    }

}
