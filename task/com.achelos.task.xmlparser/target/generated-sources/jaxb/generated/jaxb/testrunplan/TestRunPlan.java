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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="TestRunPlanGenerationTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TestConfiguration"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DUTExecutable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DUTCallArguments" type="{}DUTCallArguments" minOccurs="0"/&gt;
 *                   &lt;element name="ApplicationSpecificData" type="{}AppSpecificData" minOccurs="0"/&gt;
 *                   &lt;element name="DUTCapabilities" type="{}DUTCapabilities" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MICSInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PathToFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TlsConfiguration"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TlsVersions"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TlsVersion" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedCipherSuites"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CipherSuite" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="tlsVersion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="SSLv2/v3"/&gt;
 *                                           &lt;enumeration value="TLSv1.0"/&gt;
 *                                           &lt;enumeration value="TLSv1.1"/&gt;
 *                                           &lt;enumeration value="TLSv1.2"/&gt;
 *                                           &lt;enumeration value="TLSv1.3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TlsSupportedGroups"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Group" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="tlsVersion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="SSLv2/v3"/&gt;
 *                                           &lt;enumeration value="TLSv1.0"/&gt;
 *                                           &lt;enumeration value="TLSv1.1"/&gt;
 *                                           &lt;enumeration value="TLSv1.2"/&gt;
 *                                           &lt;enumeration value="TLSv1.3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *                                     &lt;attribute name="tlsVersion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="SSLv2/v3"/&gt;
 *                                           &lt;enumeration value="TLSv1.0"/&gt;
 *                                           &lt;enumeration value="TLSv1.1"/&gt;
 *                                           &lt;enumeration value="TLSv1.2"/&gt;
 *                                           &lt;enumeration value="TLSv1.3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedSignatureAlgorithmsCertificate"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SignatureAlgorithm" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="tlsVersion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="SSLv2/v3"/&gt;
 *                                           &lt;enumeration value="TLSv1.0"/&gt;
 *                                           &lt;enumeration value="TLSv1.1"/&gt;
 *                                           &lt;enumeration value="TLSv1.2"/&gt;
 *                                           &lt;enumeration value="TLSv1.3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupportedExtensions"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="tlsVersion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="SSLv2/v3"/&gt;
 *                                           &lt;enumeration value="TLSv1.0"/&gt;
 *                                           &lt;enumeration value="TLSv1.1"/&gt;
 *                                           &lt;enumeration value="TLSv1.2"/&gt;
 *                                           &lt;enumeration value="TLSv1.3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="KeyLengths"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RSA" type="{}KeyLengthType"/&gt;
 *                             &lt;element name="DSA" type="{}KeyLengthType"/&gt;
 *                             &lt;element name="DHE" type="{}KeyLengthType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TlsWithPSK" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PSKValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *                             &lt;element name="PSKIdentityHintValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InformationOnTR03145Certification" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NameOfTheCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="BSICertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ValidityNotBefore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ValidityNotAfter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SubjectKeyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TlsSessionLifetime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ZeroRTTSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="TLSCertificates" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CertificateChain"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Certificate" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="type" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;enumeration value="RootCACertificate"/&gt;
 *                                                     &lt;enumeration value="IntermediateCertificate"/&gt;
 *                                                     &lt;enumeration value="EndEntityCertificate"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ServerDomains" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SubDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TestCases"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TestCase" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "testRunPlanGenerationTime",
    "testConfiguration",
    "micsInfo",
    "tlsConfiguration",
    "testCases"
})
@XmlRootElement(name = "TestRunPlan")
public class TestRunPlan {

    @XmlElement(name = "TestRunPlanGenerationTime", required = true)
    protected String testRunPlanGenerationTime;
    @XmlElement(name = "TestConfiguration", required = true)
    protected TestRunPlan.TestConfiguration testConfiguration;
    @XmlElement(name = "MICSInfo", required = true)
    protected TestRunPlan.MICSInfo micsInfo;
    @XmlElement(name = "TlsConfiguration", required = true)
    protected TestRunPlan.TlsConfiguration tlsConfiguration;
    @XmlElement(name = "TestCases", required = true)
    protected TestRunPlan.TestCases testCases;

    /**
     * Ruft den Wert der testRunPlanGenerationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRunPlanGenerationTime() {
        return testRunPlanGenerationTime;
    }

    /**
     * Legt den Wert der testRunPlanGenerationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRunPlanGenerationTime(String value) {
        this.testRunPlanGenerationTime = value;
    }

    /**
     * Ruft den Wert der testConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestRunPlan.TestConfiguration }
     *     
     */
    public TestRunPlan.TestConfiguration getTestConfiguration() {
        return testConfiguration;
    }

    /**
     * Legt den Wert der testConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRunPlan.TestConfiguration }
     *     
     */
    public void setTestConfiguration(TestRunPlan.TestConfiguration value) {
        this.testConfiguration = value;
    }

    /**
     * Ruft den Wert der micsInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestRunPlan.MICSInfo }
     *     
     */
    public TestRunPlan.MICSInfo getMICSInfo() {
        return micsInfo;
    }

    /**
     * Legt den Wert der micsInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRunPlan.MICSInfo }
     *     
     */
    public void setMICSInfo(TestRunPlan.MICSInfo value) {
        this.micsInfo = value;
    }

    /**
     * Ruft den Wert der tlsConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestRunPlan.TlsConfiguration }
     *     
     */
    public TestRunPlan.TlsConfiguration getTlsConfiguration() {
        return tlsConfiguration;
    }

    /**
     * Legt den Wert der tlsConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRunPlan.TlsConfiguration }
     *     
     */
    public void setTlsConfiguration(TestRunPlan.TlsConfiguration value) {
        this.tlsConfiguration = value;
    }

    /**
     * Ruft den Wert der testCases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestRunPlan.TestCases }
     *     
     */
    public TestRunPlan.TestCases getTestCases() {
        return testCases;
    }

    /**
     * Legt den Wert der testCases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRunPlan.TestCases }
     *     
     */
    public void setTestCases(TestRunPlan.TestCases value) {
        this.testCases = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PathToFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "description",
        "pathToFile"
    })
    public static class MICSInfo {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "PathToFile", required = true)
        protected String pathToFile;

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
         * Ruft den Wert der description-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Ruft den Wert der pathToFile-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPathToFile() {
            return pathToFile;
        }

        /**
         * Legt den Wert der pathToFile-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPathToFile(String value) {
            this.pathToFile = value;
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
     *         &lt;element name="TestCase" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "testCase"
    })
    public static class TestCases {

        @XmlElement(name = "TestCase")
        protected List<String> testCase;

        /**
         * Gets the value of the testCase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the testCase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestCase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTestCase() {
            if (testCase == null) {
                testCase = new ArrayList<String>();
            }
            return this.testCase;
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
     *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DUTExecutable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DUTCallArguments" type="{}DUTCallArguments" minOccurs="0"/&gt;
     *         &lt;element name="ApplicationSpecificData" type="{}AppSpecificData" minOccurs="0"/&gt;
     *         &lt;element name="DUTCapabilities" type="{}DUTCapabilities" minOccurs="0"/&gt;
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
        "applicationType",
        "url",
        "port",
        "dutExecutable",
        "dutCallArguments",
        "applicationSpecificData",
        "dutCapabilities"
    })
    public static class TestConfiguration {

        @XmlElement(name = "ApplicationType")
        protected String applicationType;
        @XmlElement(name = "URL")
        protected String url;
        @XmlElement(name = "Port")
        protected String port;
        @XmlElement(name = "DUTExecutable")
        protected String dutExecutable;
        @XmlElement(name = "DUTCallArguments")
        protected DUTCallArguments dutCallArguments;
        @XmlElement(name = "ApplicationSpecificData")
        protected AppSpecificData applicationSpecificData;
        @XmlElement(name = "DUTCapabilities")
        protected DUTCapabilities dutCapabilities;

        /**
         * Ruft den Wert der applicationType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationType() {
            return applicationType;
        }

        /**
         * Legt den Wert der applicationType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationType(String value) {
            this.applicationType = value;
        }

        /**
         * Ruft den Wert der url-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Legt den Wert der url-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Ruft den Wert der port-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPort() {
            return port;
        }

        /**
         * Legt den Wert der port-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPort(String value) {
            this.port = value;
        }

        /**
         * Ruft den Wert der dutExecutable-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDUTExecutable() {
            return dutExecutable;
        }

        /**
         * Legt den Wert der dutExecutable-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDUTExecutable(String value) {
            this.dutExecutable = value;
        }

        /**
         * Ruft den Wert der dutCallArguments-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DUTCallArguments }
         *     
         */
        public DUTCallArguments getDUTCallArguments() {
            return dutCallArguments;
        }

        /**
         * Legt den Wert der dutCallArguments-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DUTCallArguments }
         *     
         */
        public void setDUTCallArguments(DUTCallArguments value) {
            this.dutCallArguments = value;
        }

        /**
         * Ruft den Wert der applicationSpecificData-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AppSpecificData }
         *     
         */
        public AppSpecificData getApplicationSpecificData() {
            return applicationSpecificData;
        }

        /**
         * Legt den Wert der applicationSpecificData-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AppSpecificData }
         *     
         */
        public void setApplicationSpecificData(AppSpecificData value) {
            this.applicationSpecificData = value;
        }

        /**
         * Ruft den Wert der dutCapabilities-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DUTCapabilities }
         *     
         */
        public DUTCapabilities getDUTCapabilities() {
            return dutCapabilities;
        }

        /**
         * Legt den Wert der dutCapabilities-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DUTCapabilities }
         *     
         */
        public void setDUTCapabilities(DUTCapabilities value) {
            this.dutCapabilities = value;
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
     *         &lt;element name="TlsVersions"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TlsVersion" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupportedCipherSuites"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CipherSuite" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="tlsVersion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="SSLv2/v3"/&gt;
     *                                 &lt;enumeration value="TLSv1.0"/&gt;
     *                                 &lt;enumeration value="TLSv1.1"/&gt;
     *                                 &lt;enumeration value="TLSv1.2"/&gt;
     *                                 &lt;enumeration value="TLSv1.3"/&gt;
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
     *         &lt;element name="TlsSupportedGroups"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Group" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="tlsVersion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="SSLv2/v3"/&gt;
     *                                 &lt;enumeration value="TLSv1.0"/&gt;
     *                                 &lt;enumeration value="TLSv1.1"/&gt;
     *                                 &lt;enumeration value="TLSv1.2"/&gt;
     *                                 &lt;enumeration value="TLSv1.3"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
     *                           &lt;attribute name="tlsVersion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="SSLv2/v3"/&gt;
     *                                 &lt;enumeration value="TLSv1.0"/&gt;
     *                                 &lt;enumeration value="TLSv1.1"/&gt;
     *                                 &lt;enumeration value="TLSv1.2"/&gt;
     *                                 &lt;enumeration value="TLSv1.3"/&gt;
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
     *         &lt;element name="SupportedSignatureAlgorithmsCertificate"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SignatureAlgorithm" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="tlsVersion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="SSLv2/v3"/&gt;
     *                                 &lt;enumeration value="TLSv1.0"/&gt;
     *                                 &lt;enumeration value="TLSv1.1"/&gt;
     *                                 &lt;enumeration value="TLSv1.2"/&gt;
     *                                 &lt;enumeration value="TLSv1.3"/&gt;
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
     *         &lt;element name="SupportedExtensions"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="tlsVersion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="SSLv2/v3"/&gt;
     *                                 &lt;enumeration value="TLSv1.0"/&gt;
     *                                 &lt;enumeration value="TLSv1.1"/&gt;
     *                                 &lt;enumeration value="TLSv1.2"/&gt;
     *                                 &lt;enumeration value="TLSv1.3"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="KeyLengths"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RSA" type="{}KeyLengthType"/&gt;
     *                   &lt;element name="DSA" type="{}KeyLengthType"/&gt;
     *                   &lt;element name="DHE" type="{}KeyLengthType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TlsWithPSK" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PSKValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
     *                   &lt;element name="PSKIdentityHintValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InformationOnTR03145Certification" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NameOfTheCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="BSICertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ValidityNotBefore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ValidityNotAfter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SubjectKeyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TlsSessionLifetime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ZeroRTTSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="TLSCertificates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CertificateChain"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Certificate" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Fingerprint" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="type" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="RootCACertificate"/&gt;
     *                                           &lt;enumeration value="IntermediateCertificate"/&gt;
     *                                           &lt;enumeration value="EndEntityCertificate"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ServerDomains" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SubDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "supportedCipherSuites",
        "tlsSupportedGroups",
        "supportedSignatureAlgorithms",
        "supportedSignatureAlgorithmsCertificate",
        "supportedExtensions",
        "keyLengths",
        "tlsWithPSK",
        "informationOnTR03145Certification",
        "tlsSessionLifetime",
        "zeroRTTSupport",
        "tlsCertificates"
    })
    public static class TlsConfiguration {

        @XmlElement(name = "TlsVersions", required = true)
        protected TestRunPlan.TlsConfiguration.TlsVersions tlsVersions;
        @XmlElement(name = "SupportedCipherSuites", required = true)
        protected TestRunPlan.TlsConfiguration.SupportedCipherSuites supportedCipherSuites;
        @XmlElement(name = "TlsSupportedGroups", required = true)
        protected TestRunPlan.TlsConfiguration.TlsSupportedGroups tlsSupportedGroups;
        @XmlElement(name = "SupportedSignatureAlgorithms", required = true)
        protected TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms supportedSignatureAlgorithms;
        @XmlElement(name = "SupportedSignatureAlgorithmsCertificate", required = true)
        protected TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate supportedSignatureAlgorithmsCertificate;
        @XmlElement(name = "SupportedExtensions", required = true)
        protected TestRunPlan.TlsConfiguration.SupportedExtensions supportedExtensions;
        @XmlElement(name = "KeyLengths", required = true)
        protected TestRunPlan.TlsConfiguration.KeyLengths keyLengths;
        @XmlElement(name = "TlsWithPSK")
        protected TestRunPlan.TlsConfiguration.TlsWithPSK tlsWithPSK;
        @XmlElement(name = "InformationOnTR03145Certification")
        protected TestRunPlan.TlsConfiguration.InformationOnTR03145Certification informationOnTR03145Certification;
        @XmlElement(name = "TlsSessionLifetime", required = true)
        protected String tlsSessionLifetime;
        @XmlElement(name = "ZeroRTTSupport")
        protected Boolean zeroRTTSupport;
        @XmlElement(name = "TLSCertificates")
        protected TestRunPlan.TlsConfiguration.TLSCertificates tlsCertificates;

        /**
         * Ruft den Wert der tlsVersions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.TlsVersions }
         *     
         */
        public TestRunPlan.TlsConfiguration.TlsVersions getTlsVersions() {
            return tlsVersions;
        }

        /**
         * Legt den Wert der tlsVersions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.TlsVersions }
         *     
         */
        public void setTlsVersions(TestRunPlan.TlsConfiguration.TlsVersions value) {
            this.tlsVersions = value;
        }

        /**
         * Ruft den Wert der supportedCipherSuites-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedCipherSuites }
         *     
         */
        public TestRunPlan.TlsConfiguration.SupportedCipherSuites getSupportedCipherSuites() {
            return supportedCipherSuites;
        }

        /**
         * Legt den Wert der supportedCipherSuites-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedCipherSuites }
         *     
         */
        public void setSupportedCipherSuites(TestRunPlan.TlsConfiguration.SupportedCipherSuites value) {
            this.supportedCipherSuites = value;
        }

        /**
         * Ruft den Wert der tlsSupportedGroups-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.TlsSupportedGroups }
         *     
         */
        public TestRunPlan.TlsConfiguration.TlsSupportedGroups getTlsSupportedGroups() {
            return tlsSupportedGroups;
        }

        /**
         * Legt den Wert der tlsSupportedGroups-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.TlsSupportedGroups }
         *     
         */
        public void setTlsSupportedGroups(TestRunPlan.TlsConfiguration.TlsSupportedGroups value) {
            this.tlsSupportedGroups = value;
        }

        /**
         * Ruft den Wert der supportedSignatureAlgorithms-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms }
         *     
         */
        public TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms getSupportedSignatureAlgorithms() {
            return supportedSignatureAlgorithms;
        }

        /**
         * Legt den Wert der supportedSignatureAlgorithms-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms }
         *     
         */
        public void setSupportedSignatureAlgorithms(TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms value) {
            this.supportedSignatureAlgorithms = value;
        }

        /**
         * Ruft den Wert der supportedSignatureAlgorithmsCertificate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate }
         *     
         */
        public TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate getSupportedSignatureAlgorithmsCertificate() {
            return supportedSignatureAlgorithmsCertificate;
        }

        /**
         * Legt den Wert der supportedSignatureAlgorithmsCertificate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate }
         *     
         */
        public void setSupportedSignatureAlgorithmsCertificate(TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate value) {
            this.supportedSignatureAlgorithmsCertificate = value;
        }

        /**
         * Ruft den Wert der supportedExtensions-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedExtensions }
         *     
         */
        public TestRunPlan.TlsConfiguration.SupportedExtensions getSupportedExtensions() {
            return supportedExtensions;
        }

        /**
         * Legt den Wert der supportedExtensions-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.SupportedExtensions }
         *     
         */
        public void setSupportedExtensions(TestRunPlan.TlsConfiguration.SupportedExtensions value) {
            this.supportedExtensions = value;
        }

        /**
         * Ruft den Wert der keyLengths-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.KeyLengths }
         *     
         */
        public TestRunPlan.TlsConfiguration.KeyLengths getKeyLengths() {
            return keyLengths;
        }

        /**
         * Legt den Wert der keyLengths-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.KeyLengths }
         *     
         */
        public void setKeyLengths(TestRunPlan.TlsConfiguration.KeyLengths value) {
            this.keyLengths = value;
        }

        /**
         * Ruft den Wert der tlsWithPSK-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.TlsWithPSK }
         *     
         */
        public TestRunPlan.TlsConfiguration.TlsWithPSK getTlsWithPSK() {
            return tlsWithPSK;
        }

        /**
         * Legt den Wert der tlsWithPSK-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.TlsWithPSK }
         *     
         */
        public void setTlsWithPSK(TestRunPlan.TlsConfiguration.TlsWithPSK value) {
            this.tlsWithPSK = value;
        }

        /**
         * Ruft den Wert der informationOnTR03145Certification-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.InformationOnTR03145Certification }
         *     
         */
        public TestRunPlan.TlsConfiguration.InformationOnTR03145Certification getInformationOnTR03145Certification() {
            return informationOnTR03145Certification;
        }

        /**
         * Legt den Wert der informationOnTR03145Certification-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.InformationOnTR03145Certification }
         *     
         */
        public void setInformationOnTR03145Certification(TestRunPlan.TlsConfiguration.InformationOnTR03145Certification value) {
            this.informationOnTR03145Certification = value;
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
         * Ruft den Wert der zeroRTTSupport-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZeroRTTSupport() {
            return zeroRTTSupport;
        }

        /**
         * Legt den Wert der zeroRTTSupport-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZeroRTTSupport(Boolean value) {
            this.zeroRTTSupport = value;
        }

        /**
         * Ruft den Wert der tlsCertificates-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestRunPlan.TlsConfiguration.TLSCertificates }
         *     
         */
        public TestRunPlan.TlsConfiguration.TLSCertificates getTLSCertificates() {
            return tlsCertificates;
        }

        /**
         * Legt den Wert der tlsCertificates-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestRunPlan.TlsConfiguration.TLSCertificates }
         *     
         */
        public void setTLSCertificates(TestRunPlan.TlsConfiguration.TLSCertificates value) {
            this.tlsCertificates = value;
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
         *         &lt;element name="NameOfTheCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BSICertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ValidityNotBefore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ValidityNotAfter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SubjectKeyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "nameOfTheCA",
            "bsiCertificateNumber",
            "subject",
            "validityNotBefore",
            "validityNotAfter",
            "subjectKeyIdentifier"
        })
        public static class InformationOnTR03145Certification {

            @XmlElement(name = "NameOfTheCA", required = true)
            protected String nameOfTheCA;
            @XmlElement(name = "BSICertificateNumber", required = true)
            protected String bsiCertificateNumber;
            @XmlElement(name = "Subject", required = true)
            protected String subject;
            @XmlElement(name = "ValidityNotBefore", required = true)
            protected String validityNotBefore;
            @XmlElement(name = "ValidityNotAfter", required = true)
            protected String validityNotAfter;
            @XmlElement(name = "SubjectKeyIdentifier", required = true)
            protected String subjectKeyIdentifier;

            /**
             * Ruft den Wert der nameOfTheCA-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameOfTheCA() {
                return nameOfTheCA;
            }

            /**
             * Legt den Wert der nameOfTheCA-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameOfTheCA(String value) {
                this.nameOfTheCA = value;
            }

            /**
             * Ruft den Wert der bsiCertificateNumber-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBSICertificateNumber() {
                return bsiCertificateNumber;
            }

            /**
             * Legt den Wert der bsiCertificateNumber-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBSICertificateNumber(String value) {
                this.bsiCertificateNumber = value;
            }

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
             * Ruft den Wert der validityNotBefore-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidityNotBefore() {
                return validityNotBefore;
            }

            /**
             * Legt den Wert der validityNotBefore-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidityNotBefore(String value) {
                this.validityNotBefore = value;
            }

            /**
             * Ruft den Wert der validityNotAfter-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidityNotAfter() {
                return validityNotAfter;
            }

            /**
             * Legt den Wert der validityNotAfter-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidityNotAfter(String value) {
                this.validityNotAfter = value;
            }

            /**
             * Ruft den Wert der subjectKeyIdentifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubjectKeyIdentifier() {
                return subjectKeyIdentifier;
            }

            /**
             * Legt den Wert der subjectKeyIdentifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubjectKeyIdentifier(String value) {
                this.subjectKeyIdentifier = value;
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
         *         &lt;element name="RSA" type="{}KeyLengthType"/&gt;
         *         &lt;element name="DSA" type="{}KeyLengthType"/&gt;
         *         &lt;element name="DHE" type="{}KeyLengthType"/&gt;
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
            "rsa",
            "dsa",
            "dhe"
        })
        public static class KeyLengths {

            @XmlElement(name = "RSA", required = true)
            protected KeyLengthType rsa;
            @XmlElement(name = "DSA", required = true)
            protected KeyLengthType dsa;
            @XmlElement(name = "DHE", required = true)
            protected KeyLengthType dhe;

            /**
             * Ruft den Wert der rsa-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link KeyLengthType }
             *     
             */
            public KeyLengthType getRSA() {
                return rsa;
            }

            /**
             * Legt den Wert der rsa-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link KeyLengthType }
             *     
             */
            public void setRSA(KeyLengthType value) {
                this.rsa = value;
            }

            /**
             * Ruft den Wert der dsa-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link KeyLengthType }
             *     
             */
            public KeyLengthType getDSA() {
                return dsa;
            }

            /**
             * Legt den Wert der dsa-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link KeyLengthType }
             *     
             */
            public void setDSA(KeyLengthType value) {
                this.dsa = value;
            }

            /**
             * Ruft den Wert der dhe-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link KeyLengthType }
             *     
             */
            public KeyLengthType getDHE() {
                return dhe;
            }

            /**
             * Legt den Wert der dhe-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link KeyLengthType }
             *     
             */
            public void setDHE(KeyLengthType value) {
                this.dhe = value;
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
         *         &lt;element name="CipherSuite" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
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
            "cipherSuite"
        })
        public static class SupportedCipherSuites {

            @XmlElement(name = "CipherSuite", required = true)
            protected List<TestRunPlan.TlsConfiguration.SupportedCipherSuites.CipherSuite> cipherSuite;

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
             * {@link TestRunPlan.TlsConfiguration.SupportedCipherSuites.CipherSuite }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.SupportedCipherSuites.CipherSuite> getCipherSuite() {
                if (cipherSuite == null) {
                    cipherSuite = new ArrayList<TestRunPlan.TlsConfiguration.SupportedCipherSuites.CipherSuite>();
                }
                return this.cipherSuite;
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
             *       &lt;/sequence&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class CipherSuite {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "tlsVersion", required = true)
                protected String tlsVersion;

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
         *         &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
        @XmlType(name = "", propOrder = {
            "extension"
        })
        public static class SupportedExtensions {

            @XmlElement(name = "Extension")
            protected List<TestRunPlan.TlsConfiguration.SupportedExtensions.Extension> extension;

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
             * {@link TestRunPlan.TlsConfiguration.SupportedExtensions.Extension }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.SupportedExtensions.Extension> getExtension() {
                if (extension == null) {
                    extension = new ArrayList<TestRunPlan.TlsConfiguration.SupportedExtensions.Extension>();
                }
                return this.extension;
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
            public static class Extension {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "tlsVersion", required = true)
                protected String tlsVersion;

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
            protected List<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms.SignatureAlgorithm> signatureAlgorithm;

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
             * {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms.SignatureAlgorithm }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms.SignatureAlgorithm> getSignatureAlgorithm() {
                if (signatureAlgorithm == null) {
                    signatureAlgorithm = new ArrayList<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithms.SignatureAlgorithm>();
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
                @XmlAttribute(name = "tlsVersion", required = true)
                protected String tlsVersion;

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
         *         &lt;element name="SignatureAlgorithm" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
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
        public static class SupportedSignatureAlgorithmsCertificate {

            @XmlElement(name = "SignatureAlgorithm")
            protected List<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate.SignatureAlgorithm> signatureAlgorithm;

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
             * {@link TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate.SignatureAlgorithm }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate.SignatureAlgorithm> getSignatureAlgorithm() {
                if (signatureAlgorithm == null) {
                    signatureAlgorithm = new ArrayList<TestRunPlan.TlsConfiguration.SupportedSignatureAlgorithmsCertificate.SignatureAlgorithm>();
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
             *       &lt;/sequence&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class SignatureAlgorithm {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "tlsVersion", required = true)
                protected String tlsVersion;

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
        @XmlType(name = "", propOrder = {
            "certificateChain",
            "serverDomains"
        })
        public static class TLSCertificates {

            @XmlElement(name = "CertificateChain", required = true)
            protected TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain certificateChain;
            @XmlElement(name = "ServerDomains")
            protected TestRunPlan.TlsConfiguration.TLSCertificates.ServerDomains serverDomains;

            /**
             * Ruft den Wert der certificateChain-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain }
             *     
             */
            public TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain getCertificateChain() {
                return certificateChain;
            }

            /**
             * Legt den Wert der certificateChain-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain }
             *     
             */
            public void setCertificateChain(TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain value) {
                this.certificateChain = value;
            }

            /**
             * Ruft den Wert der serverDomains-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link TestRunPlan.TlsConfiguration.TLSCertificates.ServerDomains }
             *     
             */
            public TestRunPlan.TlsConfiguration.TLSCertificates.ServerDomains getServerDomains() {
                return serverDomains;
            }

            /**
             * Legt den Wert der serverDomains-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link TestRunPlan.TlsConfiguration.TLSCertificates.ServerDomains }
             *     
             */
            public void setServerDomains(TestRunPlan.TlsConfiguration.TLSCertificates.ServerDomains value) {
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
                protected List<TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain.Certificate> certificate;

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
                 * {@link TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain.Certificate }
                 * 
                 * 
                 */
                public List<TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain.Certificate> getCertificate() {
                    if (certificate == null) {
                        certificate = new ArrayList<TestRunPlan.TlsConfiguration.TLSCertificates.CertificateChain.Certificate>();
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
         *         &lt;element name="Group" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
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
         *                 &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
            "group"
        })
        public static class TlsSupportedGroups {

            @XmlElement(name = "Group")
            protected List<TestRunPlan.TlsConfiguration.TlsSupportedGroups.Group> group;

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
             * {@link TestRunPlan.TlsConfiguration.TlsSupportedGroups.Group }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.TlsSupportedGroups.Group> getGroup() {
                if (group == null) {
                    group = new ArrayList<TestRunPlan.TlsConfiguration.TlsSupportedGroups.Group>();
                }
                return this.group;
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
             *       &lt;/sequence&gt;
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
             *       &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class Group {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "tlsVersion", required = true)
                protected String tlsVersion;
                @XmlAttribute(name = "supported", required = true)
                protected boolean supported;

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
         *         &lt;element name="TlsVersion" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
            "tlsVersion"
        })
        public static class TlsVersions {

            @XmlElement(name = "TlsVersion", required = true)
            protected List<TestRunPlan.TlsConfiguration.TlsVersions.TlsVersion> tlsVersion;

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
             * {@link TestRunPlan.TlsConfiguration.TlsVersions.TlsVersion }
             * 
             * 
             */
            public List<TestRunPlan.TlsConfiguration.TlsVersions.TlsVersion> getTlsVersion() {
                if (tlsVersion == null) {
                    tlsVersion = new ArrayList<TestRunPlan.TlsConfiguration.TlsVersions.TlsVersion>();
                }
                return this.tlsVersion;
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
             *       &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
            public static class TlsVersion {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "supported", required = true)
                protected boolean supported;

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
         *         &lt;element name="PSKValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
         *         &lt;element name="PSKIdentityHintValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "pskValue",
            "pskIdentityHintValue"
        })
        public static class TlsWithPSK {

            @XmlElement(name = "PSKValue", required = true, type = String.class)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] pskValue;
            @XmlElement(name = "PSKIdentityHintValue")
            protected String pskIdentityHintValue;

            /**
             * Ruft den Wert der pskValue-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getPSKValue() {
                return pskValue;
            }

            /**
             * Legt den Wert der pskValue-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPSKValue(byte[] value) {
                this.pskValue = value;
            }

            /**
             * Ruft den Wert der pskIdentityHintValue-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPSKIdentityHintValue() {
                return pskIdentityHintValue;
            }

            /**
             * Legt den Wert der pskIdentityHintValue-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPSKIdentityHintValue(String value) {
                this.pskIdentityHintValue = value;
            }

        }

    }

}
