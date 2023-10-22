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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="parameters"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="hexstring" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "parameters"
})
@XmlRootElement(name = "configuration")
public class Configuration {

    @XmlElement(required = true)
    protected Configuration.Parameters parameters;

    /**
     * Ruft den Wert der parameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Configuration.Parameters }
     *     
     */
    public Configuration.Parameters getParameters() {
        return parameters;
    }

    /**
     * Legt den Wert der parameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration.Parameters }
     *     
     */
    public void setParameters(Configuration.Parameters value) {
        this.parameters = value;
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
     *         &lt;element name="parameter" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="hexstring" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "parameter"
    })
    public static class Parameters {

        protected List<Configuration.Parameters.Parameter> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Configuration.Parameters.Parameter }
         * 
         * 
         */
        public List<Configuration.Parameters.Parameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Configuration.Parameters.Parameter>();
            }
            return this.parameter;
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
         *       &lt;choice&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="hexstring" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *         &lt;/sequence&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "_int",
            "_boolean",
            "hexstring",
            "file",
            "string"
        })
        public static class Parameter {

            @XmlElement(name = "int", type = Integer.class)
            protected List<Integer> _int;
            @XmlElement(name = "boolean", type = Boolean.class)
            protected List<Boolean> _boolean;
            @XmlElement(type = String.class)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected List<byte[]> hexstring;
            protected List<String> file;
            protected List<String> string;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Gets the value of the int property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the int property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getInt() {
                if (_int == null) {
                    _int = new ArrayList<Integer>();
                }
                return this._int;
            }

            /**
             * Gets the value of the boolean property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the boolean property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBoolean().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            public List<Boolean> getBoolean() {
                if (_boolean == null) {
                    _boolean = new ArrayList<Boolean>();
                }
                return this._boolean;
            }

            /**
             * Gets the value of the hexstring property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the hexstring property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHexstring().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<byte[]> getHexstring() {
                if (hexstring == null) {
                    hexstring = new ArrayList<byte[]>();
                }
                return this.hexstring;
            }

            /**
             * Gets the value of the file property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the file property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFile() {
                if (file == null) {
                    file = new ArrayList<String>();
                }
                return this.file;
            }

            /**
             * Gets the value of the string property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the string property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getString().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getString() {
                if (string == null) {
                    string = new ArrayList<String>();
                }
                return this.string;
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

        }

    }

}
