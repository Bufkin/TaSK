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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für TLS1.3_Parameter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TLS1.3_Parameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Metadata" type="{}Metadata" minOccurs="0"/&gt;
 *         &lt;element name="HandshakeModes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HandshakeMode" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="use" type="{}usetype" /&gt;
 *                           &lt;attribute name="support" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSK-Modes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PSK-Mode" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="SignatureAlgorithmsHandshake" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SignatureScheme" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SignatureAlgorithmsCertificate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SignatureScheme" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "TLS1.3_Parameter", propOrder = {
    "metadata",
    "handshakeModes",
    "pskModes",
    "cipherSuites",
    "supportedGroups",
    "signatureAlgorithmsHandshake",
    "signatureAlgorithmsCertificate"
})
public class TLS13Parameter {

    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    @XmlElement(name = "HandshakeModes")
    protected TLS13Parameter.HandshakeModes handshakeModes;
    @XmlElement(name = "PSK-Modes")
    protected TLS13Parameter.PSKModes pskModes;
    @XmlElement(name = "CipherSuites")
    protected List<CipherSuites> cipherSuites;
    @XmlElement(name = "Supported_Groups")
    protected TLS13Parameter.SupportedGroups supportedGroups;
    @XmlElement(name = "SignatureAlgorithmsHandshake")
    protected TLS13Parameter.SignatureAlgorithmsHandshake signatureAlgorithmsHandshake;
    @XmlElement(name = "SignatureAlgorithmsCertificate")
    protected TLS13Parameter.SignatureAlgorithmsCertificate signatureAlgorithmsCertificate;
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
     * Ruft den Wert der handshakeModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS13Parameter.HandshakeModes }
     *     
     */
    public TLS13Parameter.HandshakeModes getHandshakeModes() {
        return handshakeModes;
    }

    /**
     * Legt den Wert der handshakeModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter.HandshakeModes }
     *     
     */
    public void setHandshakeModes(TLS13Parameter.HandshakeModes value) {
        this.handshakeModes = value;
    }

    /**
     * Ruft den Wert der pskModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS13Parameter.PSKModes }
     *     
     */
    public TLS13Parameter.PSKModes getPSKModes() {
        return pskModes;
    }

    /**
     * Legt den Wert der pskModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter.PSKModes }
     *     
     */
    public void setPSKModes(TLS13Parameter.PSKModes value) {
        this.pskModes = value;
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
     *     {@link TLS13Parameter.SupportedGroups }
     *     
     */
    public TLS13Parameter.SupportedGroups getSupportedGroups() {
        return supportedGroups;
    }

    /**
     * Legt den Wert der supportedGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter.SupportedGroups }
     *     
     */
    public void setSupportedGroups(TLS13Parameter.SupportedGroups value) {
        this.supportedGroups = value;
    }

    /**
     * Ruft den Wert der signatureAlgorithmsHandshake-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS13Parameter.SignatureAlgorithmsHandshake }
     *     
     */
    public TLS13Parameter.SignatureAlgorithmsHandshake getSignatureAlgorithmsHandshake() {
        return signatureAlgorithmsHandshake;
    }

    /**
     * Legt den Wert der signatureAlgorithmsHandshake-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter.SignatureAlgorithmsHandshake }
     *     
     */
    public void setSignatureAlgorithmsHandshake(TLS13Parameter.SignatureAlgorithmsHandshake value) {
        this.signatureAlgorithmsHandshake = value;
    }

    /**
     * Ruft den Wert der signatureAlgorithmsCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS13Parameter.SignatureAlgorithmsCertificate }
     *     
     */
    public TLS13Parameter.SignatureAlgorithmsCertificate getSignatureAlgorithmsCertificate() {
        return signatureAlgorithmsCertificate;
    }

    /**
     * Legt den Wert der signatureAlgorithmsCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter.SignatureAlgorithmsCertificate }
     *     
     */
    public void setSignatureAlgorithmsCertificate(TLS13Parameter.SignatureAlgorithmsCertificate value) {
        this.signatureAlgorithmsCertificate = value;
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
     *         &lt;element name="HandshakeMode" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="use" type="{}usetype" /&gt;
     *                 &lt;attribute name="support" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "handshakeMode"
    })
    public static class HandshakeModes {

        @XmlElement(name = "HandshakeMode", required = true)
        protected List<TLS13Parameter.HandshakeModes.HandshakeMode> handshakeMode;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

        /**
         * Gets the value of the handshakeMode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the handshakeMode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHandshakeMode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLS13Parameter.HandshakeModes.HandshakeMode }
         * 
         * 
         */
        public List<TLS13Parameter.HandshakeModes.HandshakeMode> getHandshakeMode() {
            if (handshakeMode == null) {
                handshakeMode = new ArrayList<TLS13Parameter.HandshakeModes.HandshakeMode>();
            }
            return this.handshakeMode;
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="use" type="{}usetype" /&gt;
         *       &lt;attribute name="support" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class HandshakeMode {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "use")
            protected Usetype use;
            @XmlAttribute(name = "support")
            protected String support;

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
             * Ruft den Wert der support-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupport() {
                return support;
            }

            /**
             * Legt den Wert der support-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupport(String value) {
                this.support = value;
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
     *         &lt;element name="PSK-Mode" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
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
        "pskMode"
    })
    public static class PSKModes {

        @XmlElement(name = "PSK-Mode", required = true)
        protected List<SpecificationDetails> pskMode;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

        /**
         * Gets the value of the pskMode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the pskMode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPSKMode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecificationDetails }
         * 
         * 
         */
        public List<SpecificationDetails> getPSKMode() {
            if (pskMode == null) {
                pskMode = new ArrayList<SpecificationDetails>();
            }
            return this.pskMode;
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
     *         &lt;element name="SignatureScheme" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
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
        "signatureScheme"
    })
    public static class SignatureAlgorithmsCertificate {

        @XmlElement(name = "SignatureScheme", required = true)
        protected List<SpecificationDetails> signatureScheme;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

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
         * {@link SpecificationDetails }
         * 
         * 
         */
        public List<SpecificationDetails> getSignatureScheme() {
            if (signatureScheme == null) {
                signatureScheme = new ArrayList<SpecificationDetails>();
            }
            return this.signatureScheme;
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
     *         &lt;element name="SignatureScheme" type="{}SpecificationDetails" maxOccurs="unbounded"/&gt;
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
        "signatureScheme"
    })
    public static class SignatureAlgorithmsHandshake {

        @XmlElement(name = "SignatureScheme", required = true)
        protected List<SpecificationDetails> signatureScheme;
        @XmlAttribute(name = "use")
        protected Usetype use;
        @XmlAttribute(name = "reference")
        protected String reference;

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
         * {@link SpecificationDetails }
         * 
         * 
         */
        public List<SpecificationDetails> getSignatureScheme() {
            if (signatureScheme == null) {
                signatureScheme = new ArrayList<SpecificationDetails>();
            }
            return this.signatureScheme;
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
