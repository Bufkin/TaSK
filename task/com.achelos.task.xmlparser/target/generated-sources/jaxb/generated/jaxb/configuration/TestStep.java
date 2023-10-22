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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TestStep complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TestStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Command"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TechnicalCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestDataReference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedResult" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "TestStep", namespace = "http://bsi.bund.de/TR03116", propOrder = {
    "command",
    "technicalCommand",
    "testDataReference",
    "description",
    "expectedResult"
})
public class TestStep {

    @XmlElement(name = "Command", namespace = "http://bsi.bund.de/TR03116", required = true)
    protected TestStep.Command command;
    @XmlElement(name = "TechnicalCommand", namespace = "http://bsi.bund.de/TR03116")
    protected String technicalCommand;
    @XmlElement(name = "TestDataReference", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> testDataReference;
    @XmlElement(name = "Description", namespace = "http://bsi.bund.de/TR03116")
    protected List<String> description;
    @XmlElement(name = "ExpectedResult", namespace = "http://bsi.bund.de/TR03116", required = true)
    protected List<TestStep.ExpectedResult> expectedResult;

    /**
     * Ruft den Wert der command-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestStep.Command }
     *     
     */
    public TestStep.Command getCommand() {
        return command;
    }

    /**
     * Legt den Wert der command-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestStep.Command }
     *     
     */
    public void setCommand(TestStep.Command value) {
        this.command = value;
    }

    /**
     * Ruft den Wert der technicalCommand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalCommand() {
        return technicalCommand;
    }

    /**
     * Legt den Wert der technicalCommand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalCommand(String value) {
        this.technicalCommand = value;
    }

    /**
     * Gets the value of the testDataReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the testDataReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestDataReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestDataReference() {
        if (testDataReference == null) {
            testDataReference = new ArrayList<String>();
        }
        return this.testDataReference;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the expectedResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestStep.ExpectedResult }
     * 
     * 
     */
    public List<TestStep.ExpectedResult> getExpectedResult() {
        if (expectedResult == null) {
            expectedResult = new ArrayList<TestStep.ExpectedResult>();
        }
        return this.expectedResult;
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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "text"
    })
    public static class Command {

        @XmlElement(name = "Text", namespace = "http://bsi.bund.de/TR03116", required = true)
        protected String text;

        /**
         * Ruft den Wert der text-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Legt den Wert der text-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "text"
    })
    public static class ExpectedResult {

        @XmlElement(name = "Text", namespace = "http://bsi.bund.de/TR03116", required = true)
        protected String text;

        /**
         * Ruft den Wert der text-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Legt den Wert der text-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
