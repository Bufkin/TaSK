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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TestSuite complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TestSuite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TestSuiteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Summary" type="{}Summary"/&gt;
 *         &lt;element name="TestSuiteMessages"&gt;
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
 *         &lt;element name="TestCases"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TestCase" type="{}TestCase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestSuite", propOrder = {
    "testSuiteIdentifier",
    "summary",
    "testSuiteMessages",
    "testCases"
})
public class TestSuite {

    @XmlElement(name = "TestSuiteIdentifier", required = true)
    protected String testSuiteIdentifier;
    @XmlElement(name = "Summary", required = true)
    protected Summary summary;
    @XmlElement(name = "TestSuiteMessages", required = true)
    protected TestSuite.TestSuiteMessages testSuiteMessages;
    @XmlElement(name = "TestCases", required = true)
    protected TestSuite.TestCases testCases;

    /**
     * Ruft den Wert der testSuiteIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestSuiteIdentifier() {
        return testSuiteIdentifier;
    }

    /**
     * Legt den Wert der testSuiteIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestSuiteIdentifier(String value) {
        this.testSuiteIdentifier = value;
    }

    /**
     * Ruft den Wert der summary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Legt den Wert der summary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Ruft den Wert der testSuiteMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestSuite.TestSuiteMessages }
     *     
     */
    public TestSuite.TestSuiteMessages getTestSuiteMessages() {
        return testSuiteMessages;
    }

    /**
     * Legt den Wert der testSuiteMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSuite.TestSuiteMessages }
     *     
     */
    public void setTestSuiteMessages(TestSuite.TestSuiteMessages value) {
        this.testSuiteMessages = value;
    }

    /**
     * Ruft den Wert der testCases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestSuite.TestCases }
     *     
     */
    public TestSuite.TestCases getTestCases() {
        return testCases;
    }

    /**
     * Legt den Wert der testCases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSuite.TestCases }
     *     
     */
    public void setTestCases(TestSuite.TestCases value) {
        this.testCases = value;
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
     *         &lt;element name="TestCase" type="{}TestCase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "testCase"
    })
    public static class TestCases {

        @XmlElement(name = "TestCase")
        protected List<TestCase> testCase;

        /**
         * Gets the value of the testCase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the testCase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestCase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TestCase }
         * 
         * 
         */
        public List<TestCase> getTestCase() {
            if (testCase == null) {
                testCase = new ArrayList<TestCase>();
            }
            return this.testCase;
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
    public static class TestSuiteMessages {

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
