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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TlsVersions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TlsVersion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NamedCurves"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NamedCurve" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA_DSA_DHE_KeyLengths"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RSA_DSA_DHE_KeyLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/&gt;
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
    "tlsVersions",
    "namedCurves",
    "rsadsadheKeyLengths"
})
@XmlRootElement(name = "TlsConfigurationData")
public class TlsConfigurationData {

    @XmlElement(name = "TlsVersions", required = true)
    protected TlsConfigurationData.TlsVersions tlsVersions;
    @XmlElement(name = "NamedCurves", required = true)
    protected TlsConfigurationData.NamedCurves namedCurves;
    @XmlElement(name = "RSA_DSA_DHE_KeyLengths", required = true)
    protected TlsConfigurationData.RSADSADHEKeyLengths rsadsadheKeyLengths;

    /**
     * Ruft den Wert der tlsVersions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TlsConfigurationData.TlsVersions }
     *     
     */
    public TlsConfigurationData.TlsVersions getTlsVersions() {
        return tlsVersions;
    }

    /**
     * Legt den Wert der tlsVersions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TlsConfigurationData.TlsVersions }
     *     
     */
    public void setTlsVersions(TlsConfigurationData.TlsVersions value) {
        this.tlsVersions = value;
    }

    /**
     * Ruft den Wert der namedCurves-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TlsConfigurationData.NamedCurves }
     *     
     */
    public TlsConfigurationData.NamedCurves getNamedCurves() {
        return namedCurves;
    }

    /**
     * Legt den Wert der namedCurves-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TlsConfigurationData.NamedCurves }
     *     
     */
    public void setNamedCurves(TlsConfigurationData.NamedCurves value) {
        this.namedCurves = value;
    }

    /**
     * Ruft den Wert der rsadsadheKeyLengths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TlsConfigurationData.RSADSADHEKeyLengths }
     *     
     */
    public TlsConfigurationData.RSADSADHEKeyLengths getRSADSADHEKeyLengths() {
        return rsadsadheKeyLengths;
    }

    /**
     * Legt den Wert der rsadsadheKeyLengths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TlsConfigurationData.RSADSADHEKeyLengths }
     *     
     */
    public void setRSADSADHEKeyLengths(TlsConfigurationData.RSADSADHEKeyLengths value) {
        this.rsadsadheKeyLengths = value;
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
     *         &lt;element name="NamedCurve" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "namedCurve"
    })
    public static class NamedCurves {

        @XmlElement(name = "NamedCurve", required = true)
        protected List<String> namedCurve;

        /**
         * Gets the value of the namedCurve property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the namedCurve property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNamedCurve().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNamedCurve() {
            if (namedCurve == null) {
                namedCurve = new ArrayList<String>();
            }
            return this.namedCurve;
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
     *         &lt;element name="RSA_DSA_DHE_KeyLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/&gt;
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
        "rsadsadheKeyLength"
    })
    public static class RSADSADHEKeyLengths {

        @XmlElement(name = "RSA_DSA_DHE_KeyLength", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected List<BigInteger> rsadsadheKeyLength;

        /**
         * Gets the value of the rsadsadheKeyLength property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the rsadsadheKeyLength property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRSADSADHEKeyLength().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getRSADSADHEKeyLength() {
            if (rsadsadheKeyLength == null) {
                rsadsadheKeyLength = new ArrayList<BigInteger>();
            }
            return this.rsadsadheKeyLength;
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
     *         &lt;element name="TlsVersion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "tlsVersion"
    })
    public static class TlsVersions {

        @XmlElement(name = "TlsVersion", required = true)
        protected List<String> tlsVersion;

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
         *    getTlsVersion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTlsVersion() {
            if (tlsVersion == null) {
                tlsVersion = new ArrayList<String>();
            }
            return this.tlsVersion;
        }

    }

}
