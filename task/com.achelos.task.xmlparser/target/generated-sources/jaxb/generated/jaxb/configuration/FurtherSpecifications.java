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
 * <p>Java-Klasse für FurtherSpecifications complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FurtherSpecifications"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLSVersions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TLSVersion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="use" type="{}usetype" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="use" type="{}usetype" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TlsSessionLifetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TLS1.2_Parameter" type="{}TLS1.2_Parameter" minOccurs="0"/&gt;
 *         &lt;element name="TLS1.3_Parameter" type="{}TLS1.3_Parameter" minOccurs="0"/&gt;
 *         &lt;element name="TLSMinimumKeyLength" type="{}TLSMinimumKeyLength" minOccurs="0"/&gt;
 *         &lt;element name="TLSEllipticCurves" type="{}TLSEllipticCurves" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FurtherSpecifications", propOrder = {
    "tlsVersions",
    "tlsSessionLifetime",
    "tls12Parameter",
    "tls13Parameter",
    "tlsMinimumKeyLength",
    "tlsEllipticCurves"
})
public class FurtherSpecifications {

    @XmlElement(name = "TLSVersions")
    protected FurtherSpecifications.TLSVersions tlsVersions;
    @XmlElement(name = "TlsSessionLifetime")
    protected String tlsSessionLifetime;
    @XmlElement(name = "TLS1.2_Parameter")
    protected TLS12Parameter tls12Parameter;
    @XmlElement(name = "TLS1.3_Parameter")
    protected TLS13Parameter tls13Parameter;
    @XmlElement(name = "TLSMinimumKeyLength")
    protected TLSMinimumKeyLength tlsMinimumKeyLength;
    @XmlElement(name = "TLSEllipticCurves")
    protected TLSEllipticCurves tlsEllipticCurves;

    /**
     * Ruft den Wert der tlsVersions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FurtherSpecifications.TLSVersions }
     *     
     */
    public FurtherSpecifications.TLSVersions getTLSVersions() {
        return tlsVersions;
    }

    /**
     * Legt den Wert der tlsVersions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherSpecifications.TLSVersions }
     *     
     */
    public void setTLSVersions(FurtherSpecifications.TLSVersions value) {
        this.tlsVersions = value;
    }

    /**
     * Ruft den Wert der tlsSessionLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlsSessionLifetime() {
        return tlsSessionLifetime;
    }

    /**
     * Legt den Wert der tlsSessionLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsSessionLifetime(String value) {
        this.tlsSessionLifetime = value;
    }

    /**
     * Ruft den Wert der tls12Parameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS12Parameter }
     *     
     */
    public TLS12Parameter getTLS12Parameter() {
        return tls12Parameter;
    }

    /**
     * Legt den Wert der tls12Parameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS12Parameter }
     *     
     */
    public void setTLS12Parameter(TLS12Parameter value) {
        this.tls12Parameter = value;
    }

    /**
     * Ruft den Wert der tls13Parameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLS13Parameter }
     *     
     */
    public TLS13Parameter getTLS13Parameter() {
        return tls13Parameter;
    }

    /**
     * Legt den Wert der tls13Parameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLS13Parameter }
     *     
     */
    public void setTLS13Parameter(TLS13Parameter value) {
        this.tls13Parameter = value;
    }

    /**
     * Ruft den Wert der tlsMinimumKeyLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSMinimumKeyLength }
     *     
     */
    public TLSMinimumKeyLength getTLSMinimumKeyLength() {
        return tlsMinimumKeyLength;
    }

    /**
     * Legt den Wert der tlsMinimumKeyLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSMinimumKeyLength }
     *     
     */
    public void setTLSMinimumKeyLength(TLSMinimumKeyLength value) {
        this.tlsMinimumKeyLength = value;
    }

    /**
     * Ruft den Wert der tlsEllipticCurves-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSEllipticCurves }
     *     
     */
    public TLSEllipticCurves getTLSEllipticCurves() {
        return tlsEllipticCurves;
    }

    /**
     * Legt den Wert der tlsEllipticCurves-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSEllipticCurves }
     *     
     */
    public void setTLSEllipticCurves(TLSEllipticCurves value) {
        this.tlsEllipticCurves = value;
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
     *         &lt;element name="TLSVersion" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="use" type="{}usetype" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="use" type="{}usetype" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tlsVersion"
    })
    public static class TLSVersions {

        @XmlElement(name = "TLSVersion", required = true)
        protected List<FurtherSpecifications.TLSVersions.TLSVersion> tlsVersion;
        @XmlAttribute(name = "use")
        protected Usetype use;

        /**
         * Gets the value of the tlsVersion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the tlsVersion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTLSVersion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FurtherSpecifications.TLSVersions.TLSVersion }
         * 
         * 
         */
        public List<FurtherSpecifications.TLSVersions.TLSVersion> getTLSVersion() {
            if (tlsVersion == null) {
                tlsVersion = new ArrayList<FurtherSpecifications.TLSVersions.TLSVersion>();
            }
            return this.tlsVersion;
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
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="use" type="{}usetype" /&gt;
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
        public static class TLSVersion {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "use")
            protected Usetype use;

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

        }

    }

}
