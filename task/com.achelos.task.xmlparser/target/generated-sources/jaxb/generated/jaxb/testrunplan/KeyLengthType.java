//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:05 AM CET 
//


package generated.jaxb.testrunplan;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für KeyLengthType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KeyLengthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyLength" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *                 &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="tlsVersion" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="SSLv2/v3"/&gt;
 *                       &lt;enumeration value="TLSv1.0"/&gt;
 *                       &lt;enumeration value="TLSv1.1"/&gt;
 *                       &lt;enumeration value="TLSv1.2"/&gt;
 *                       &lt;enumeration value="TLSv1.3"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "KeyLengthType", propOrder = {
    "keyLength"
})
public class KeyLengthType {

    @XmlElement(name = "KeyLength", required = true)
    protected List<KeyLengthType.KeyLength> keyLength;

    /**
     * Gets the value of the keyLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keyLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyLengthType.KeyLength }
     * 
     * 
     */
    public List<KeyLengthType.KeyLength> getKeyLength() {
        if (keyLength == null) {
            keyLength = new ArrayList<KeyLengthType.KeyLength>();
        }
        return this.keyLength;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
     *       &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="tlsVersion" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="SSLv2/v3"/&gt;
     *             &lt;enumeration value="TLSv1.0"/&gt;
     *             &lt;enumeration value="TLSv1.1"/&gt;
     *             &lt;enumeration value="TLSv1.2"/&gt;
     *             &lt;enumeration value="TLSv1.3"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
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
    public static class KeyLength {

        @XmlValue
        protected int value;
        @XmlAttribute(name = "supported", required = true)
        protected boolean supported;
        @XmlAttribute(name = "tlsVersion", required = true)
        protected String tlsVersion;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der supported-Eigenschaft ab.
         * 
         */
        public boolean isSupported() {
            return supported;
        }

        /**
         * Legt den Wert der supported-Eigenschaft fest.
         * 
         */
        public void setSupported(boolean value) {
            this.supported = value;
        }

        /**
         * Ruft den Wert der tlsVersion-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTlsVersion() {
            return tlsVersion;
        }

        /**
         * Legt den Wert der tlsVersion-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTlsVersion(String value) {
            this.tlsVersion = value;
        }

    }

}
