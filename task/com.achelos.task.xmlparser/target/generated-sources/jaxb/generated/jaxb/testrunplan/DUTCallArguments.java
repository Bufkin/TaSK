//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:05 AM CET 
//


package generated.jaxb.testrunplan;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DUTCallArguments complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DUTCallArguments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartConnectionArguments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResumeConnectionArguments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EIDClientPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DUTCallArguments", propOrder = {
    "startConnectionArguments",
    "resumeConnectionArguments",
    "eidClientPort"
})
public class DUTCallArguments {

    @XmlElement(name = "StartConnectionArguments", required = true)
    protected String startConnectionArguments;
    @XmlElement(name = "ResumeConnectionArguments")
    protected String resumeConnectionArguments;
    @XmlElement(name = "EIDClientPort")
    protected Integer eidClientPort;

    /**
     * Ruft den Wert der startConnectionArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartConnectionArguments() {
        return startConnectionArguments;
    }

    /**
     * Legt den Wert der startConnectionArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartConnectionArguments(String value) {
        this.startConnectionArguments = value;
    }

    /**
     * Ruft den Wert der resumeConnectionArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumeConnectionArguments() {
        return resumeConnectionArguments;
    }

    /**
     * Legt den Wert der resumeConnectionArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumeConnectionArguments(String value) {
        this.resumeConnectionArguments = value;
    }

    /**
     * Ruft den Wert der eidClientPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEIDClientPort() {
        return eidClientPort;
    }

    /**
     * Legt den Wert der eidClientPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEIDClientPort(Integer value) {
        this.eidClientPort = value;
    }

}
