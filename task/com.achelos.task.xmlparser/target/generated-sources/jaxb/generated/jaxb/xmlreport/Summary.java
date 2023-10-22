//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:05 AM CET 
//


package generated.jaxb.xmlreport;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Summary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Summary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalNoOfTestcases" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoOfExecTestcases" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoOfPassedTestcases" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoOfFailedTestcases" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoOfTestcasesWithWarnings" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary", propOrder = {
    "totalNoOfTestcases",
    "noOfExecTestcases",
    "noOfPassedTestcases",
    "noOfFailedTestcases",
    "noOfTestcasesWithWarnings",
    "startTime",
    "endTime"
})
public class Summary {

    @XmlElement(name = "TotalNoOfTestcases", required = true)
    protected String totalNoOfTestcases;
    @XmlElement(name = "NoOfExecTestcases", required = true)
    protected String noOfExecTestcases;
    @XmlElement(name = "NoOfPassedTestcases", required = true)
    protected String noOfPassedTestcases;
    @XmlElement(name = "NoOfFailedTestcases", required = true)
    protected String noOfFailedTestcases;
    @XmlElement(name = "NoOfTestcasesWithWarnings", required = true)
    protected String noOfTestcasesWithWarnings;
    @XmlElement(name = "StartTime", required = true)
    protected String startTime;
    @XmlElement(name = "EndTime", required = true)
    protected String endTime;

    /**
     * Ruft den Wert der totalNoOfTestcases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNoOfTestcases() {
        return totalNoOfTestcases;
    }

    /**
     * Legt den Wert der totalNoOfTestcases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNoOfTestcases(String value) {
        this.totalNoOfTestcases = value;
    }

    /**
     * Ruft den Wert der noOfExecTestcases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfExecTestcases() {
        return noOfExecTestcases;
    }

    /**
     * Legt den Wert der noOfExecTestcases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfExecTestcases(String value) {
        this.noOfExecTestcases = value;
    }

    /**
     * Ruft den Wert der noOfPassedTestcases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPassedTestcases() {
        return noOfPassedTestcases;
    }

    /**
     * Legt den Wert der noOfPassedTestcases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPassedTestcases(String value) {
        this.noOfPassedTestcases = value;
    }

    /**
     * Ruft den Wert der noOfFailedTestcases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfFailedTestcases() {
        return noOfFailedTestcases;
    }

    /**
     * Legt den Wert der noOfFailedTestcases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfFailedTestcases(String value) {
        this.noOfFailedTestcases = value;
    }

    /**
     * Ruft den Wert der noOfTestcasesWithWarnings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfTestcasesWithWarnings() {
        return noOfTestcasesWithWarnings;
    }

    /**
     * Legt den Wert der noOfTestcasesWithWarnings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfTestcasesWithWarnings(String value) {
        this.noOfTestcasesWithWarnings = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
