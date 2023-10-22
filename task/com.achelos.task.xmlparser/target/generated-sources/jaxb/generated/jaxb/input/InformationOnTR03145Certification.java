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
 * <p>Java-Klasse für InformationOnTR03145Certification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InformationOnTR03145Certification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameOfTheCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BSICertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ValidityNotBefore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ValidityNotAfter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubjectKeyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationOnTR03145Certification", propOrder = {
    "nameOfTheCA",
    "bsiCertificateNumber",
    "subject",
    "validityNotBefore",
    "validityNotAfter",
    "subjectKeyIdentifier"
})
public class InformationOnTR03145Certification {

    @XmlElement(name = "NameOfTheCA", required = true)
    protected String nameOfTheCA;
    @XmlElement(name = "BSICertificateNumber", required = true)
    protected String bsiCertificateNumber;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "ValidityNotBefore", required = true)
    protected String validityNotBefore;
    @XmlElement(name = "ValidityNotAfter", required = true)
    protected String validityNotAfter;
    @XmlElement(name = "SubjectKeyIdentifier", required = true)
    protected String subjectKeyIdentifier;

    /**
     * Ruft den Wert der nameOfTheCA-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfTheCA() {
        return nameOfTheCA;
    }

    /**
     * Legt den Wert der nameOfTheCA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfTheCA(String value) {
        this.nameOfTheCA = value;
    }

    /**
     * Ruft den Wert der bsiCertificateNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSICertificateNumber() {
        return bsiCertificateNumber;
    }

    /**
     * Legt den Wert der bsiCertificateNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSICertificateNumber(String value) {
        this.bsiCertificateNumber = value;
    }

    /**
     * Ruft den Wert der subject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Legt den Wert der subject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Ruft den Wert der validityNotBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityNotBefore() {
        return validityNotBefore;
    }

    /**
     * Legt den Wert der validityNotBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityNotBefore(String value) {
        this.validityNotBefore = value;
    }

    /**
     * Ruft den Wert der validityNotAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityNotAfter() {
        return validityNotAfter;
    }

    /**
     * Legt den Wert der validityNotAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityNotAfter(String value) {
        this.validityNotAfter = value;
    }

    /**
     * Ruft den Wert der subjectKeyIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKeyIdentifier() {
        return subjectKeyIdentifier;
    }

    /**
     * Legt den Wert der subjectKeyIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKeyIdentifier(String value) {
        this.subjectKeyIdentifier = value;
    }

}
