//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:05 AM CET 
//


package generated.jaxb.xmlreport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="Metadata"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TesterInCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DateOfReportGeneration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExecutionMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="StartOfExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EndOfExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExecutionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DUTInformation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TestSuite" type="{}TestSuite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaSKFrameworkMessages"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LogMessage" type="{}LogMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InputParameters"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="2" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "metadata",
    "dutInformation",
    "testSuite",
    "taSKFrameworkMessages",
    "inputParameters"
})
@XmlRootElement(name = "TaSKReport")
public class TaSKReport {

    @XmlElement(name = "Metadata", required = true)
    protected TaSKReport.Metadata metadata;
    @XmlElement(name = "DUTInformation", required = true)
    protected TaSKReport.DUTInformation dutInformation;
    @XmlElement(name = "TestSuite")
    protected List<TestSuite> testSuite;
    @XmlElement(name = "TaSKFrameworkMessages", required = true)
    protected TaSKReport.TaSKFrameworkMessages taSKFrameworkMessages;
    @XmlElement(name = "InputParameters", required = true)
    protected TaSKReport.InputParameters inputParameters;

    /**
     * Ruft den Wert der metadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaSKReport.Metadata }
     *     
     */
    public TaSKReport.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Legt den Wert der metadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaSKReport.Metadata }
     *     
     */
    public void setMetadata(TaSKReport.Metadata value) {
        this.metadata = value;
    }

    /**
     * Ruft den Wert der dutInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaSKReport.DUTInformation }
     *     
     */
    public TaSKReport.DUTInformation getDUTInformation() {
        return dutInformation;
    }

    /**
     * Legt den Wert der dutInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaSKReport.DUTInformation }
     *     
     */
    public void setDUTInformation(TaSKReport.DUTInformation value) {
        this.dutInformation = value;
    }

    /**
     * Gets the value of the testSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the testSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSuite }
     * 
     * 
     */
    public List<TestSuite> getTestSuite() {
        if (testSuite == null) {
            testSuite = new ArrayList<TestSuite>();
        }
        return this.testSuite;
    }

    /**
     * Ruft den Wert der taSKFrameworkMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaSKReport.TaSKFrameworkMessages }
     *     
     */
    public TaSKReport.TaSKFrameworkMessages getTaSKFrameworkMessages() {
        return taSKFrameworkMessages;
    }

    /**
     * Legt den Wert der taSKFrameworkMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaSKReport.TaSKFrameworkMessages }
     *     
     */
    public void setTaSKFrameworkMessages(TaSKReport.TaSKFrameworkMessages value) {
        this.taSKFrameworkMessages = value;
    }

    /**
     * Ruft den Wert der inputParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaSKReport.InputParameters }
     *     
     */
    public TaSKReport.InputParameters getInputParameters() {
        return inputParameters;
    }

    /**
     * Legt den Wert der inputParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaSKReport.InputParameters }
     *     
     */
    public void setInputParameters(TaSKReport.InputParameters value) {
        this.inputParameters = value;
    }


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
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "applicationType",
        "version",
        "description",
        "file",
        "fingerprint"
    })
    public static class DUTInformation {

        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "ApplicationType")
        protected String applicationType;
        @XmlElement(name = "Version")
        protected String version;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "File")
        protected String file;
        @XmlElement(name = "Fingerprint")
        protected String fingerprint;

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
         * Ruft den Wert der file-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFile() {
            return file;
        }

        /**
         * Legt den Wert der file-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFile(String value) {
            this.file = value;
        }

        /**
         * Ruft den Wert der fingerprint-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFingerprint() {
            return fingerprint;
        }

        /**
         * Legt den Wert der fingerprint-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFingerprint(String value) {
            this.fingerprint = value;
        }

    }


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
     *         &lt;any processContents='lax' maxOccurs="2" minOccurs="0"/&gt;
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
        "any"
    })
    public static class InputParameters {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }


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
     *         &lt;element name="TesterInCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DateOfReportGeneration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExecutionMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="StartOfExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EndOfExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExecutionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "testerInCharge",
        "dateOfReportGeneration",
        "executionMachine",
        "startOfExecution",
        "endOfExecution",
        "executionType"
    })
    public static class Metadata {

        @XmlElement(name = "TesterInCharge")
        protected String testerInCharge;
        @XmlElement(name = "DateOfReportGeneration")
        protected String dateOfReportGeneration;
        @XmlElement(name = "ExecutionMachine")
        protected String executionMachine;
        @XmlElement(name = "StartOfExecution")
        protected String startOfExecution;
        @XmlElement(name = "EndOfExecution")
        protected String endOfExecution;
        @XmlElement(name = "ExecutionType")
        protected String executionType;

        /**
         * Ruft den Wert der testerInCharge-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTesterInCharge() {
            return testerInCharge;
        }

        /**
         * Legt den Wert der testerInCharge-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTesterInCharge(String value) {
            this.testerInCharge = value;
        }

        /**
         * Ruft den Wert der dateOfReportGeneration-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfReportGeneration() {
            return dateOfReportGeneration;
        }

        /**
         * Legt den Wert der dateOfReportGeneration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfReportGeneration(String value) {
            this.dateOfReportGeneration = value;
        }

        /**
         * Ruft den Wert der executionMachine-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutionMachine() {
            return executionMachine;
        }

        /**
         * Legt den Wert der executionMachine-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutionMachine(String value) {
            this.executionMachine = value;
        }

        /**
         * Ruft den Wert der startOfExecution-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartOfExecution() {
            return startOfExecution;
        }

        /**
         * Legt den Wert der startOfExecution-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartOfExecution(String value) {
            this.startOfExecution = value;
        }

        /**
         * Ruft den Wert der endOfExecution-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndOfExecution() {
            return endOfExecution;
        }

        /**
         * Legt den Wert der endOfExecution-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndOfExecution(String value) {
            this.endOfExecution = value;
        }

        /**
         * Ruft den Wert der executionType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutionType() {
            return executionType;
        }

        /**
         * Legt den Wert der executionType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutionType(String value) {
            this.executionType = value;
        }

    }


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
     *         &lt;element name="LogMessage" type="{}LogMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "logMessage"
    })
    public static class TaSKFrameworkMessages {

        @XmlElement(name = "LogMessage")
        protected List<LogMessage> logMessage;

        /**
         * Gets the value of the logMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the logMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LogMessage }
         * 
         * 
         */
        public List<LogMessage> getLogMessage() {
            if (logMessage == null) {
                logMessage = new ArrayList<LogMessage>();
            }
            return this.logMessage;
        }

    }

}
