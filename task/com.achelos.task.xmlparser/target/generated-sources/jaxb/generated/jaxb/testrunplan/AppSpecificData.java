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
 * <p>Java-Klasse für AppSpecificData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AppSpecificData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TestClientCertificate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CertificateFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CertificatePrivateKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "AppSpecificData", propOrder = {
    "testClientCertificate"
})
public class AppSpecificData {

    @XmlElement(name = "TestClientCertificate")
    protected AppSpecificData.TestClientCertificate testClientCertificate;

    /**
     * Ruft den Wert der testClientCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AppSpecificData.TestClientCertificate }
     *     
     */
    public AppSpecificData.TestClientCertificate getTestClientCertificate() {
        return testClientCertificate;
    }

    /**
     * Legt den Wert der testClientCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSpecificData.TestClientCertificate }
     *     
     */
    public void setTestClientCertificate(AppSpecificData.TestClientCertificate value) {
        this.testClientCertificate = value;
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
     *         &lt;element name="CertificateFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CertificatePrivateKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "certificateFile",
        "certificatePrivateKey"
    })
    public static class TestClientCertificate {

        @XmlElement(name = "CertificateFile", required = true)
        protected String certificateFile;
        @XmlElement(name = "CertificatePrivateKey", required = true)
        protected String certificatePrivateKey;

        /**
         * Ruft den Wert der certificateFile-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateFile() {
            return certificateFile;
        }

        /**
         * Legt den Wert der certificateFile-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateFile(String value) {
            this.certificateFile = value;
        }

        /**
         * Ruft den Wert der certificatePrivateKey-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificatePrivateKey() {
            return certificatePrivateKey;
        }

        /**
         * Legt den Wert der certificatePrivateKey-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificatePrivateKey(String value) {
            this.certificatePrivateKey = value;
        }

    }

}
