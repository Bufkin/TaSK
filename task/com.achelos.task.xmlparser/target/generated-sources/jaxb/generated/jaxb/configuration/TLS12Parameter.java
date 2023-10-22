//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für TLS1.2_Parameter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TLS1.2_Parameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Metadata" type="{}Metadata" minOccurs="0"/&gt;
 *         &lt;element name="CipherSuites" type="{}CipherSuites" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Supported_Groups" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DHGroup" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SignatureAlgorithms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SignatureAlgorithm" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SignatureAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SignatureAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DigestAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DigestAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UseUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="use" type="{}usetype" /&gt;
 *                           &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MiscellaneousTLSFeatures" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TLSFeature" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="use" type="{}usetype" /&gt;
 *                           &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLS1.2_Parameter", propOrder = {
    "metadata",
    "cipherSuites",
    "supportedGroups",
    "signatureAlgorithms",
    "miscellaneousTLSFeatures"
})
public class TLS12Parameter {

    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    @XmlElement(name = "CipherSuites")
    protected List<CipherSuites> cipherSuites;
    @XmlElement(name = "Supported_Groups")
    protected TLS12Parameter.SupportedGroups supportedGroups;
    @XmlElement(name = "SignatureAlgorithms")
    protected TLS12Parameter.SignatureAlgorithms signatureAlgorithms;
    @XmlElement(name = "MiscellaneousTLSFeatures")
    protected TLS12Parameter.MiscellaneousTLSFeatures miscellaneousTLSFeatures;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Ruft den Wert der metadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Legt den Wert der metadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the cipherSuites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cipherSuites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCipherSuites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CipherSuites }
     * 
     * 
     */
    public List<CipherSuites> getCipherSuites() {
        if (cipherSuites == null) {
            cipherSuites = new ArrayList<CipherSuites>();
        }
        return this.cipherSuites;
    }

    /**
     * Ruft den Wert der supportedGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS12Parameter.SupportedGroups }
     *     
     */
    public TLS12Parameter.SupportedGroups getSupportedGroups() {
        return supportedGroups;
    }

    /**
     * Legt den Wert der supportedGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS12Parameter.SupportedGroups }
     *     
     */
    public void setSupportedGroups(TLS12Parameter.SupportedGroups value) {
        this.supportedGroups = value;
    }

    /**
     * Ruft den Wert der signatureAlgorithms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS12Parameter.SignatureAlgorithms }
     *     
     */
    public TLS12Parameter.SignatureAlgorithms getSignatureAlgorithms() {
        return signatureAlgorithms;
    }

    /**
     * Legt den Wert der signatureAlgorithms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS12Parameter.SignatureAlgorithms }
     *     
     */
    public void setSignatureAlgorithms(TLS12Parameter.SignatureAlgorithms value) {
        this.signatureAlgorithms = value;
    }

    /**
     * Ruft den Wert der miscellaneousTLSFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS12Parameter.MiscellaneousTLSFeatures }
     *     
     */
    public TLS12Parameter.MiscellaneousTLSFeatures getMiscellaneousTLSFeatures() {
        return miscellaneousTLSFeatures;
    }

    /**
     * Legt den Wert der miscellaneousTLSFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS12Parameter.MiscellaneousTLSFeatures }
     *     
     */
    public void setMiscellaneousTLSFeatures(TLS12Parameter.MiscellaneousTLSFeatures value) {
        this.miscellaneousTLSFeatures = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="TLSFeature" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="use" type="{}usetype" /&gt;
     *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "tlsFeature"
    })
    public static class MiscellaneousTLSFeatures {

        @XmlElement(name = "TLSFeature")
        protected List<TLS12Parameter.MiscellaneousTLSFeatures.TLSFeature> tlsFeature;

        /**
         * Gets the value of the tlsFeature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the tlsFeature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTLSFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLS12Parameter.MiscellaneousTLSFeatures.TLSFeature }
         * 
         * 
         */
        public List<TLS12Parameter.MiscellaneousTLSFeatures.TLSFeature> getTLSFeature() {
            if (tlsFeature == null) {
                tlsFeature = new ArrayList<TLS12Parameter.MiscellaneousTLSFeatures.TLSFeature>();
            }
            return this.tlsFeature;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="use" type="{}usetype" /&gt;
         *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TLSFeature {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "use")
            protected Usetype use;
            @XmlAttribute(name = "reference")
            protected String reference;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der use-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Usetype }
             *     
             */
            public Usetype getUse() {
                return use;
            }

            /**
             * Legt den Wert der use-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Usetype }
             *     
             */
            public void setUse(Usetype value) {
                this.use = value;
            }

            /**
             * Ruft den Wert der reference-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Legt den Wert der reference-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
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
     *                   &lt;element name="SignatureAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SignatureAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DigestAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DigestAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UseUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="use" type="{}usetype" /&gt;
     *                 &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="use" type="{}usetype" /&gt;
     *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class SignatureAlgorithms {

        @XmlElement(name = "SignatureAlgorithm", required = true)
        protected List<TLS12Parameter.SignatureAlgorithms.SignatureAlgorithm> signatureAlgorithm;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

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
         * {@link TLS12Parameter.SignatureAlgorithms.SignatureAlgorithm }
         * 
         * 
         */
        public List<TLS12Parameter.SignatureAlgorithms.SignatureAlgorithm> getSignatureAlgorithm() {
            if (signatureAlgorithm == null) {
                signatureAlgorithm = new ArrayList<TLS12Parameter.SignatureAlgorithms.SignatureAlgorithm>();
            }
            return this.signatureAlgorithm;
        }

        /**
         * Ruft den Wert der use-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Usetype }
         *     
         */
        public Usetype getUse() {
            return use;
        }

        /**
         * Legt den Wert der use-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Usetype }
         *     
         */
        public void setUse(Usetype value) {
            this.use = value;
        }

        /**
         * Ruft den Wert der reference-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * Legt den Wert der reference-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
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
         *         &lt;element name="SignatureAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SignatureAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DigestAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DigestAlgorithmValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UseUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="use" type="{}usetype" /&gt;
         *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "signatureAlgorithmName",
            "signatureAlgorithmValue",
            "digestAlgorithmName",
            "digestAlgorithmValue",
            "reference",
            "useUntil"
        })
        public static class SignatureAlgorithm {

            @XmlElement(name = "SignatureAlgorithmName", required = true)
            protected String signatureAlgorithmName;
            @XmlElement(name = "SignatureAlgorithmValue", required = true)
            protected String signatureAlgorithmValue;
            @XmlElement(name = "DigestAlgorithmName", required = true)
            protected String digestAlgorithmName;
            @XmlElement(name = "DigestAlgorithmValue", required = true)
            protected String digestAlgorithmValue;
            @XmlElement(name = "Reference")
            protected String reference;
            @XmlElement(name = "UseUntil")
            protected String useUntil;
            @XmlAttribute(name = "use")
            protected Usetype use;
            @XmlAttribute(name = "priority")
            protected BigInteger priority;

            /**
             * Ruft den Wert der signatureAlgorithmName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignatureAlgorithmName() {
                return signatureAlgorithmName;
            }

            /**
             * Legt den Wert der signatureAlgorithmName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignatureAlgorithmName(String value) {
                this.signatureAlgorithmName = value;
            }

            /**
             * Ruft den Wert der signatureAlgorithmValue-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignatureAlgorithmValue() {
                return signatureAlgorithmValue;
            }

            /**
             * Legt den Wert der signatureAlgorithmValue-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignatureAlgorithmValue(String value) {
                this.signatureAlgorithmValue = value;
            }

            /**
             * Ruft den Wert der digestAlgorithmName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDigestAlgorithmName() {
                return digestAlgorithmName;
            }

            /**
             * Legt den Wert der digestAlgorithmName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDigestAlgorithmName(String value) {
                this.digestAlgorithmName = value;
            }

            /**
             * Ruft den Wert der digestAlgorithmValue-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDigestAlgorithmValue() {
                return digestAlgorithmValue;
            }

            /**
             * Legt den Wert der digestAlgorithmValue-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDigestAlgorithmValue(String value) {
                this.digestAlgorithmValue = value;
            }

            /**
             * Ruft den Wert der reference-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Legt den Wert der reference-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * Ruft den Wert der useUntil-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUseUntil() {
                return useUntil;
            }

            /**
             * Legt den Wert der useUntil-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUseUntil(String value) {
                this.useUntil = value;
            }

            /**
             * Ruft den Wert der use-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Usetype }
             *     
             */
            public Usetype getUse() {
                return use;
            }

            /**
             * Legt den Wert der use-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Usetype }
             *     
             */
            public void setUse(Usetype value) {
                this.use = value;
            }

            /**
             * Ruft den Wert der priority-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPriority() {
                return priority;
            }

            /**
             * Legt den Wert der priority-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPriority(BigInteger value) {
                this.priority = value;
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
     *         &lt;element name="DHGroup" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="use" type="{}usetype" /&gt;
     *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dhGroup"
    })
    public static class SupportedGroups {

        @XmlElement(name = "DHGroup", required = true)
        protected List<SpecificationDetails> dhGroup;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

        /**
         * Gets the value of the dhGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the dhGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDHGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecificationDetails }
         * 
         * 
         */
        public List<SpecificationDetails> getDHGroup() {
            if (dhGroup == null) {
                dhGroup = new ArrayList<SpecificationDetails>();
            }
            return this.dhGroup;
        }

        /**
         * Ruft den Wert der use-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Usetype }
         *     
         */
        public Usetype getUse() {
            return use;
        }

        /**
         * Legt den Wert der use-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Usetype }
         *     
         */
        public void setUse(Usetype value) {
            this.use = value;
        }

        /**
         * Ruft den Wert der reference-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * Legt den Wert der reference-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
        }

    }

}
