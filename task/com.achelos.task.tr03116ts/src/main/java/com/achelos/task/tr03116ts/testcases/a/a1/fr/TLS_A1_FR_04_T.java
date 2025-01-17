package com.achelos.task.tr03116ts.testcases.a.a1.fr;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.achelos.task.abstracttestsuite.AbstractTestCase;
import com.achelos.task.commandlineexecution.applications.dut.DUTExecutor;
import com.achelos.task.commandlineexecution.applications.tlstesttool.TlsTestToolExecutor;
import com.achelos.task.commandlineexecution.applications.tlstesttool.messagetextresources.TestToolResource;
import com.achelos.task.commandlineexecution.applications.tshark.TSharkExecutor;
import com.achelos.task.commandlineexecution.genericcommandlineexecution.IterationCounter;
import com.achelos.task.commons.enums.TlsCipherSuite;
import com.achelos.task.commons.enums.TlsTestToolTlsLibrary;
import com.achelos.task.commons.enums.TlsVersion;
import com.achelos.task.configuration.TlsTestToolCertificateTypes;
import com.achelos.task.tr03116ts.testfragments.TFDUTClientNewConnection;
import com.achelos.task.tr03116ts.testfragments.TFLocalServerClose;
import com.achelos.task.tr03116ts.testfragments.TFServerCertificate;
import com.achelos.task.tr03116ts.testfragments.TFTLSHighestVersionSupportCheck;
import com.achelos.task.tr03116ts.testfragments.TFTLSServerHello;


/**
 * Testcase TLS_A1_FR_04_T - Correct PSK
 * 
 * <p>
 * This test verifies the behaviour of the DUT if the server uses a correct PSK. The test is carried out for the TLS
 * version [TLS_VERSION] and the PSK cipher suite [CIPHERSUITE].
 * <p>
 * The test MUST be repeated for all TLS versions [TLS_VERSION] and PSK cipher suites [CIPHERSUITE] listed in the ICS of
 * the DUT.
 *
 */
public class TLS_A1_FR_04_T extends AbstractTestCase {

	private static final String TEST_CASE_ID = "TLS_A1_FR_04_T";
	private static final String TEST_CASE_DESCRIPTION = "Correct PSK";
	private static final String TEST_CASE_PURPOSE
			= "This test verifies the behaviour of the DUT if the server uses a correct PSK. "
					+ "The test is carried out for the TLS version [TLS_VERSION] "
					+ "and the PSK cipher suite [CIPHERSUITE].";

	private TlsTestToolExecutor testTool = null;
	private TSharkExecutor tShark = null;
	private DUTExecutor dutExecutor = null;
	private final TFTLSServerHello tftlsServerHello;
	private final TFServerCertificate tfserverCertificate;
	private final TFLocalServerClose tfLocalServerClose;
	private final TFDUTClientNewConnection tFDutClientNewConnection;
	private final TFTLSHighestVersionSupportCheck fFTLSHighestVersionSupportCheck;


	public TLS_A1_FR_04_T() {
		setTestCaseId(TEST_CASE_ID);
		setTestCaseDescription(TEST_CASE_DESCRIPTION);
		setTestCasePurpose(TEST_CASE_PURPOSE);

		tftlsServerHello = new TFTLSServerHello(this);
		tfserverCertificate = new TFServerCertificate(this);
		tfLocalServerClose = new TFLocalServerClose(this);
		tFDutClientNewConnection = new TFDUTClientNewConnection(this);
		fFTLSHighestVersionSupportCheck = new TFTLSHighestVersionSupportCheck(this);
	}

	@Override
	protected final void prepareEnvironment() throws Exception {
		testTool = new TlsTestToolExecutor(getTestCaseId(), logger);
		tShark = new TSharkExecutor(getTestCaseId(), logger);
		tShark.start();
		dutExecutor = new DUTExecutor(getTestCaseId(), logger, configuration.getDutCallCommandGenerator());
	}

	/**
	 * <h2>Precondition</h2>
	 * <ul>
	 * <li>The test TLS server is waiting for incoming TLS connections on [URL].
	 * </ul>
	 */
	@Override
	protected final void preProcessing() throws Exception {}

	/**
	 * <h2>TestStep 1</h2>
	 * <h3>Command</h3>
	 * <ol>
	 * <li>The tester causes the DUT to connect to the TLS server on [URL].
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The TLS server receives a ClientHello handshake message from the DUT.
	 * <li>The TLS ClientHello offers the highest TLS version stated in the ICS.
	 * <li>The TLS ClientHello offers all cipher suites stated in the ICS for this TLS version in specified order.
	 * <li>The TLS ClientHello offers only the extensions stated in the ICS that match the TLS version.
	 * </ul>
	 * <h2>TestStep 2</h2>
	 * <h3>Command</h3>
	 * <ol>
	 * <li>The TLS server answers the DUT with the valid combination of [TLS_VERSION] and [CIPHERSUITE].
	 * </ol>
	 * <h3>Description</h3>
	 * <ol>
	 * <li>The TLS server supplies the certificate chain [CERT_DEFAULT].
	 * <li>No TLS extensions are supplied by the server which are not required to conduct the TLS handshake.
	 * <li>Depending on the ICS, the TLS server may send a valid psk_identity_hint.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The DUT sends a valid psk_identity according to the ICS.
	 * <li>The TLS protocol is executed without errors and the channel is established.
	 * </ul>
	 */
	@Override
	protected final void executeUsecase() throws Exception {

		logger.info("START: " + getTestCaseId());
		logger.info(getTestCaseDescription());

		// all supported tls version
		List<TlsVersion> tlsVersions = configuration.getSupportedTLSVersions();
		if (null == tlsVersions || tlsVersions.isEmpty()) {
			logger.error("No supported TLS Versions found.");
			return;
		}
		logger.debug("Supported TLS versions:");
		for (TlsVersion tlsVersion : tlsVersions) {
			logger.debug(tlsVersion.name());
		}
		
		int iterationCount = 1;
		int numberOfiterations = 0;
		
		HashMap<TlsVersion, List<TlsCipherSuite>> map = new HashMap<>();
		for (TlsVersion tlsVersion : tlsVersions) {
			List<TlsCipherSuite> pskCipherSuites
					= configuration.getSupportedPSKCipherSuites(tlsVersion);
			if (null == pskCipherSuites || pskCipherSuites.isEmpty()) {
				logger.error("No supported PSK Cipher suites found for the TLS version: " + tlsVersion + ".");
			} else {
				map.put(tlsVersion, pskCipherSuites);
				numberOfiterations += pskCipherSuites.size();
			}
		}

		for (Map.Entry<TlsVersion, List<TlsCipherSuite>> entry : map.entrySet()) {
			
			TlsVersion tlsVersion = entry.getKey();
			List<TlsCipherSuite> pskCipherSuites = entry.getValue();

			logger.debug("Supported PSK Cipher suites for the TLS version: " + tlsVersion + ".");
			for (TlsCipherSuite cipherSuite : pskCipherSuites) {
				logger.debug(cipherSuite.name());
			}

			for (TlsCipherSuite cipherSuite : pskCipherSuites) {
				logger.info("Start iteration " + iterationCount + " of " + numberOfiterations
						+ ".");
				step(1, "Setting TLS version: " + tlsVersion.getName() + " and PSK Cipher suite: "
						+ cipherSuite.getName(), null);
				
				tfserverCertificate.executeSteps("2", "The TLS server supplies the certificate chain [CERT_DEFAULT].",
						Arrays.asList(), testTool, tlsVersion, cipherSuite, TlsTestToolCertificateTypes.CERT_DEFAULT);
				
				tftlsServerHello.executeSteps("3", "Server started and waits for new client connection",
						Arrays.asList(), testTool, tlsVersion, TlsTestToolTlsLibrary.OpenSSL, cipherSuite);

				tFDutClientNewConnection.executeSteps("4",
						"The TLS server receives a ClientHello handshake message from the DUT.",
						Arrays.asList(), testTool,
						new IterationCounter(iterationCount++, numberOfiterations), dutExecutor);

				fFTLSHighestVersionSupportCheck.executeSteps("5",
						"The TLS ClientHello offers the highest TLS version stated in the ICS.", null,
						testTool);

				step(6, "Check if the TLS ClientHello offers all cipher suites stated in the ICS for "
						+ tlsVersion.getName()
						+ " in specified order.",
						"The TLS ClientHello offers all cipher suites stated in the ICS for this TLS version in"
								+ " specified order.");
				List<TlsCipherSuite> clientHelloCipherSuites = TlsCipherSuite
						.parseCipherSuiteStringList(testTool.getValue(TestToolResource.ClientHello_cipher_suites));

				/* edge case: TLS_EMPTY_RENEGOTIATION_INFO_SCSV should not be checked */
				clientHelloCipherSuites.remove(TlsCipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV);

				boolean cipherSuitesOrderMatch = pskCipherSuites.equals(clientHelloCipherSuites);

				if (cipherSuitesOrderMatch) {
					logger.info(
							"The TLS ClientHello offers cipher suites stated in the ICS for the "
									+ "TLS version \"" + tlsVersion.getName()
									+ "\" in specified order."
									+ " Expected cipher suites order: " + pskCipherSuites.toString()
									+ " Actual cipher suites order: " + clientHelloCipherSuites.toString());
				} else {
					logger.error(
							"The TLS ClientHello does not offer cipher suites stated in the ICS for the "
									+ "TLS version \"" + tlsVersion.getName()
									+ "\" in specified order."
									+ " Expected cipher suites order: " + pskCipherSuites.toString()
									+ " Actual cipher suites order: " + clientHelloCipherSuites.toString());
				}

				step(7, "Check if the TLS ClientHello offers only the extensions stated in the ICS that match "
						+ "the TLS version.",
						"TLS ClientHello offers only the extensions stated in the ICS that match "
								+ "the TLS version.");
				testTool.checkSupportedExtensions(tlsVersion);

				step(8, "Check if the TLS protocol is executed without errors and the channel is established.",
						"The TLS protocol is executed without errors and the channel is established.");
				testTool.assertMessageLogged(TestToolResource.Handshake_successful);

				tfLocalServerClose.executeSteps("9", "Server closed successfully", Arrays.asList(),
						testTool);

				dutExecutor.resetProperties();
				testTool.resetProperties();
			}
		}
	}

	@Override
	protected void postProcessing() throws Exception {

	}

	@Override
	protected final void cleanAndExit() {
		testTool.cleanAndExit();
		tShark.cleanAndExit();
		dutExecutor.cleanAndExit();
	}
}
