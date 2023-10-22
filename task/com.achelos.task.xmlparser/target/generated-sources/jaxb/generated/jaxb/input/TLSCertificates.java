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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für TLSCertificates complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TLSCertificates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateChain"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Certificate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="RootCACertificate"/&gt;
 *                                 &lt;enumeration value="IntermediateCertificate"/&gt;
 *                                 &lt;enumeration value="EndEntityCertificate"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServerDomains" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "TLSCertificates", propOrder = {
    "certificateChain",
    "serverDomains"
})
public class TLSCertificates {

    @XmlElement(name = "CertificateChain", required = true)
    protected TLSCertificates.CertificateChain certificateChain;
    @XmlElement(name = "ServerDomains")
    protected TLSCertificates.ServerDomains serverDomains;

    /**
     * Ruft den Wert der certificateChain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSCertificates.CertificateChain }
     *     
     */
    public TLSCertificates.CertificateChain getCertificateChain() {
        return certificateChain;
    }

    /**
     * Legt den Wert der certificateChain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSCertificates.CertificateChain }
     *     
     */
    public void setCertificateChain(TLSCertificates.CertificateChain value) {
        this.certificateChain = value;
    }

    /**
     * Ruft den Wert der serverDomains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TLSCertificates.ServerDomains }
     *     
     */
    public TLSCertificates.ServerDomains getServerDomains() {
        return serverDomains;
    }

    /**
     * Legt den Wert der serverDomains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TLSCertificates.ServerDomains }
     *     
     */
    public void setServerDomains(TLSCertificates.ServerDomains value) {
        this.serverDomains = value;
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
     *         &lt;element name="Certificate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="RootCACertificate"/&gt;
     *                       &lt;enumeration value="IntermediateCertificate"/&gt;
     *                       &lt;enumeration value="EndEntityCertificate"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
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
        "certificate"
    })
    public static class CertificateChain {

        @XmlElement(name = "Certificate", required = true)
        protected List<TLSCertificates.CertificateChain.Certificate> certificate;

        /**
         * Gets the value of the certificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the certificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLSCertificates.CertificateChain.Certificate }
         * 
         * 
         */
        public List<TLSCertificates.CertificateChain.Certificate> getCertificate() {
            if (certificate == null) {
                certificate = new ArrayList<TLSCertificates.CertificateChain.Certificate>();
            }
            return this.certificate;
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
         *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="RootCACertificate"/&gt;
         *             &lt;enumeration value="IntermediateCertificate"/&gt;
         *             &lt;enumeration value="EndEntityCertificate"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subject",
            "fingerprint"
        })
        public static class Certificate {

            @XmlElement(name = "Subject", required = true)
            protected String subject;
            @XmlElement(name = "Fingerprint", required = true, type = String.class)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] fingerprint;
            @XmlAttribute(name = "type", required = true)
            protected String type;

            /**
             * Ruft den Wert der subject-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Legt den Wert der subject-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Ruft den Wert der fingerprint-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getFingerprint() {
                return fingerprint;
            }

            /**
             * Legt den Wert der fingerprint-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFingerprint(byte[] value) {
                this.fingerprint = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
     *         &lt;element name="SubDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "subDomain"
    })
    public static class ServerDomains {

        @XmlElement(name = "SubDomain", required = true)
        protected List<String> subDomain;

        /**
         * Gets the value of the subDomain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the subDomain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubDomain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubDomain() {
            if (subDomain == null) {
                subDomain = new ArrayList<String>();
            }
            return this.subDomain;
        }

    }

}
