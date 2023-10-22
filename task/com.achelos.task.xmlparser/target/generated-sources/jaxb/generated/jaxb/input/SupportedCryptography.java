//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.input;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SupportedCryptography complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SupportedCryptography"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupportedTLSVersion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SupportedCipherSuites"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CipherSuite" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedKeyLengths"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MinimalKeyLength" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="MinimalSupportedKeyLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedEllipticCurves-DHGroups"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedSignatureAlgorithms"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SignatureAlgorithm" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="HashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedSignatureAlgorithmsForCertificates" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SignatureScheme" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedTLSExtensions"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "SupportedCryptography", propOrder = {
    "supportedTLSVersion"
})
public class SupportedCryptography {

    @XmlElement(name = "SupportedTLSVersion", required = true)
    protected List<SupportedCryptography.SupportedTLSVersion> supportedTLSVersion;

    /**
     * Gets the value of the supportedTLSVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedTLSVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedTLSVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedCryptography.SupportedTLSVersion }
     * 
     * 
     */
    public List<SupportedCryptography.SupportedTLSVersion> getSupportedTLSVersion() {
        if (supportedTLSVersion == null) {
            supportedTLSVersion = new ArrayList<SupportedCryptography.SupportedTLSVersion>();
        }
        return this.supportedTLSVersion;
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
     *         &lt;element name="SupportedCipherSuites"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CipherSuite" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedKeyLengths"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MinimalKeyLength" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="MinimalSupportedKeyLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedEllipticCurves-DHGroups"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedSignatureAlgorithms"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SignatureAlgorithm" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="HashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedSignatureAlgorithmsForCertificates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SignatureScheme" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedTLSExtensions"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "supportedCipherSuites",
        "supportedKeyLengths",
        "supportedEllipticCurvesDHGroups",
        "supportedSignatureAlgorithms",
        "supportedSignatureAlgorithmsForCertificates",
        "supportedTLSExtensions"
    })
    public static class SupportedTLSVersion {

        @XmlElement(name = "SupportedCipherSuites", required = true)
        protected SupportedCryptography.SupportedTLSVersion.SupportedCipherSuites supportedCipherSuites;
        @XmlElement(name = "SupportedKeyLengths", required = true)
        protected SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths supportedKeyLengths;
        @XmlElement(name = "SupportedEllipticCurves-DHGroups", required = true)
        protected SupportedCryptography.SupportedTLSVersion.SupportedEllipticCurvesDHGroups supportedEllipticCurvesDHGroups;
        @XmlElement(name = "SupportedSignatureAlgorithms", required = true)
        protected SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms supportedSignatureAlgorithms;
        @XmlElement(name = "SupportedSignatureAlgorithmsForCertificates")
        protected SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithmsForCertificates supportedSignatureAlgorithmsForCertificates;
        @XmlElement(name = "SupportedTLSExtensions", required = true)
        protected SupportedCryptography.SupportedTLSVersion.SupportedTLSExtensions supportedTLSExtensions;
        @XmlAttribute(name = "version", required = true)
        protected String version;

        /**
         * Ruft den Wert der supportedCipherSuites-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedCipherSuites }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedCipherSuites getSupportedCipherSuites() {
            return supportedCipherSuites;
        }

        /**
         * Legt den Wert der supportedCipherSuites-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedCipherSuites }
         *     
         */
        public void setSupportedCipherSuites(SupportedCryptography.SupportedTLSVersion.SupportedCipherSuites value) {
            this.supportedCipherSuites = value;
        }

        /**
         * Ruft den Wert der supportedKeyLengths-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths getSupportedKeyLengths() {
            return supportedKeyLengths;
        }

        /**
         * Legt den Wert der supportedKeyLengths-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths }
         *     
         */
        public void setSupportedKeyLengths(SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths value) {
            this.supportedKeyLengths = value;
        }

        /**
         * Ruft den Wert der supportedEllipticCurvesDHGroups-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedEllipticCurvesDHGroups }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedEllipticCurvesDHGroups getSupportedEllipticCurvesDHGroups() {
            return supportedEllipticCurvesDHGroups;
        }

        /**
         * Legt den Wert der supportedEllipticCurvesDHGroups-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedEllipticCurvesDHGroups }
         *     
         */
        public void setSupportedEllipticCurvesDHGroups(SupportedCryptography.SupportedTLSVersion.SupportedEllipticCurvesDHGroups value) {
            this.supportedEllipticCurvesDHGroups = value;
        }

        /**
         * Ruft den Wert der supportedSignatureAlgorithms-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms getSupportedSignatureAlgorithms() {
            return supportedSignatureAlgorithms;
        }

        /**
         * Legt den Wert der supportedSignatureAlgorithms-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms }
         *     
         */
        public void setSupportedSignatureAlgorithms(SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms value) {
            this.supportedSignatureAlgorithms = value;
        }

        /**
         * Ruft den Wert der supportedSignatureAlgorithmsForCertificates-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithmsForCertificates }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithmsForCertificates getSupportedSignatureAlgorithmsForCertificates() {
            return supportedSignatureAlgorithmsForCertificates;
        }

        /**
         * Legt den Wert der supportedSignatureAlgorithmsForCertificates-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithmsForCertificates }
         *     
         */
        public void setSupportedSignatureAlgorithmsForCertificates(SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithmsForCertificates value) {
            this.supportedSignatureAlgorithmsForCertificates = value;
        }

        /**
         * Ruft den Wert der supportedTLSExtensions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedTLSExtensions }
         *     
         */
        public SupportedCryptography.SupportedTLSVersion.SupportedTLSExtensions getSupportedTLSExtensions() {
            return supportedTLSExtensions;
        }

        /**
         * Legt den Wert der supportedTLSExtensions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedCryptography.SupportedTLSVersion.SupportedTLSExtensions }
         *     
         */
        public void setSupportedTLSExtensions(SupportedCryptography.SupportedTLSVersion.SupportedTLSExtensions value) {
            this.supportedTLSExtensions = value;
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
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CipherSuite" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "cipherSuite"
        })
        public static class SupportedCipherSuites {

            @XmlElement(name = "CipherSuite")
            protected List<String> cipherSuite;

            /**
             * Gets the value of the cipherSuite property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the cipherSuite property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCipherSuite().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCipherSuite() {
                if (cipherSuite == null) {
                    cipherSuite = new ArrayList<String>();
                }
                return this.cipherSuite;
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
         *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "group"
        })
        public static class SupportedEllipticCurvesDHGroups {

            @XmlElement(name = "Group")
            protected List<String> group;

            /**
             * Gets the value of the group property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the group property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getGroup() {
                if (group == null) {
                    group = new ArrayList<String>();
                }
                return this.group;
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
         *         &lt;element name="MinimalKeyLength" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="MinimalSupportedKeyLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "minimalKeyLength"
        })
        public static class SupportedKeyLengths {

            @XmlElement(name = "MinimalKeyLength")
            protected List<SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths.MinimalKeyLength> minimalKeyLength;

            /**
             * Gets the value of the minimalKeyLength property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the minimalKeyLength property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMinimalKeyLength().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths.MinimalKeyLength }
             * 
             * 
             */
            public List<SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths.MinimalKeyLength> getMinimalKeyLength() {
                if (minimalKeyLength == null) {
                    minimalKeyLength = new ArrayList<SupportedCryptography.SupportedTLSVersion.SupportedKeyLengths.MinimalKeyLength>();
                }
                return this.minimalKeyLength;
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
             *         &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="MinimalSupportedKeyLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
                "algorithm",
                "minimalSupportedKeyLength"
            })
            public static class MinimalKeyLength {

                @XmlElement(name = "Algorithm", required = true)
                protected String algorithm;
                @XmlElement(name = "MinimalSupportedKeyLength")
                protected int minimalSupportedKeyLength;

                /**
                 * Ruft den Wert der algorithm-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlgorithm() {
                    return algorithm;
                }

                /**
                 * Legt den Wert der algorithm-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlgorithm(String value) {
                    this.algorithm = value;
                }

                /**
                 * Ruft den Wert der minimalSupportedKeyLength-Eigenschaft ab.
                 * 
                 */
                public int getMinimalSupportedKeyLength() {
                    return minimalSupportedKeyLength;
                }

                /**
                 * Legt den Wert der minimalSupportedKeyLength-Eigenschaft fest.
                 * 
                 */
                public void setMinimalSupportedKeyLength(int value) {
                    this.minimalSupportedKeyLength = value;
                }

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
         *         &lt;element name="SignatureAlgorithm" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="HashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "signatureAlgorithm"
        })
        public static class SupportedSignatureAlgorithms {

            @XmlElement(name = "SignatureAlgorithm", required = true)
            protected List<SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms.SignatureAlgorithm> signatureAlgorithm;

            /**
             * Gets the value of the signatureAlgorithm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the signatureAlgorithm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSignatureAlgorithm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms.SignatureAlgorithm }
             * 
             * 
             */
            public List<SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms.SignatureAlgorithm> getSignatureAlgorithm() {
                if (signatureAlgorithm == null) {
                    signatureAlgorithm = new ArrayList<SupportedCryptography.SupportedTLSVersion.SupportedSignatureAlgorithms.SignatureAlgorithm>();
                }
                return this.signatureAlgorithm;
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
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="HashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "name",
                "hashName"
            })
            public static class SignatureAlgorithm {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "HashName")
                protected String hashName;

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Ruft den Wert der hashName-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHashName() {
                    return hashName;
                }

                /**
                 * Legt den Wert der hashName-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHashName(String value) {
                    this.hashName = value;
                }

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
         *         &lt;element name="SignatureScheme" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "signatureScheme"
        })
        public static class SupportedSignatureAlgorithmsForCertificates {

            @XmlElement(name = "SignatureScheme")
            protected List<String> signatureScheme;

            /**
             * Gets the value of the signatureScheme property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the signatureScheme property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSignatureScheme().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSignatureScheme() {
                if (signatureScheme == null) {
                    signatureScheme = new ArrayList<String>();
                }
                return this.signatureScheme;
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
         *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "extension"
        })
        public static class SupportedTLSExtensions {

            @XmlElement(name = "Extension")
            protected List<String> extension;

            /**
             * Gets the value of the extension property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the extension property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtension().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getExtension() {
                if (extension == null) {
                    extension = new ArrayList<String>();
                }
                return this.extension;
            }

        }

    }

}
