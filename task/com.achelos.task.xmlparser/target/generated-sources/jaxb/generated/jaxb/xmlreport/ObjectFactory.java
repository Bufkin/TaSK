//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:05 AM CET 
//


package generated.jaxb.xmlreport;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.jaxb.xmlreport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.jaxb.xmlreport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaSKReport }
     * 
     */
    public TaSKReport createTaSKReport() {
        return new TaSKReport();
    }

    /**
     * Create an instance of {@link TestCase }
     * 
     */
    public TestCase createTestCase() {
        return new TestCase();
    }

    /**
     * Create an instance of {@link TestSuite }
     * 
     */
    public TestSuite createTestSuite() {
        return new TestSuite();
    }

    /**
     * Create an instance of {@link TaSKReport.Metadata }
     * 
     */
    public TaSKReport.Metadata createTaSKReportMetadata() {
        return new TaSKReport.Metadata();
    }

    /**
     * Create an instance of {@link TaSKReport.DUTInformation }
     * 
     */
    public TaSKReport.DUTInformation createTaSKReportDUTInformation() {
        return new TaSKReport.DUTInformation();
    }

    /**
     * Create an instance of {@link TaSKReport.TaSKFrameworkMessages }
     * 
     */
    public TaSKReport.TaSKFrameworkMessages createTaSKReportTaSKFrameworkMessages() {
        return new TaSKReport.TaSKFrameworkMessages();
    }

    /**
     * Create an instance of {@link TaSKReport.InputParameters }
     * 
     */
    public TaSKReport.InputParameters createTaSKReportInputParameters() {
        return new TaSKReport.InputParameters();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link LogMessage }
     * 
     */
    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    /**
     * Create an instance of {@link TestCase.LogMessages }
     * 
     */
    public TestCase.LogMessages createTestCaseLogMessages() {
        return new TestCase.LogMessages();
    }

    /**
     * Create an instance of {@link TestSuite.TestSuiteMessages }
     * 
     */
    public TestSuite.TestSuiteMessages createTestSuiteTestSuiteMessages() {
        return new TestSuite.TestSuiteMessages();
    }

    /**
     * Create an instance of {@link TestSuite.TestCases }
     * 
     */
    public TestSuite.TestCases createTestSuiteTestCases() {
        return new TestSuite.TestCases();
    }

}
