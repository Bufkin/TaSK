package com.achelos.task.tr03116ts.testcases.b.b1.fr;

import java.util.Arrays;
import java.util.Collections;

import com.achelos.task.abstracttestsuite.AbstractTestCase;
import com.achelos.task.commandlineexecution.applications.tlstesttool.TlsTestToolExecutor;
import com.achelos.task.commandlineexecution.applications.tlstesttool.messagetextresources.TestToolResource;
import com.achelos.task.commandlineexecution.applications.tshark.TSharkExecutor;
import com.achelos.task.commons.enums.TlsAlertLevel;
import com.achelos.task.commons.enums.TlsCipherSuite;
import com.achelos.task.commons.enums.TlsVersion;
import com.achelos.task.tr03116ts.testfragments.TFAlertMessageCheck;
import com.achelos.task.tr03116ts.testfragments.TFTCPIPCloseConnection;
import com.achelos.task.tr03116ts.testfragments.TFTCPIPNewConnection;
import com.achelos.task.tr03116ts.testfragments.TFTLSClientHello;


/**
 * <p>
 * This test verifies the correct behaviour of the DUT in case the client tries to renegotiate the parameters.
 */
public class TLS_B1_FR_09 extends AbstractTestCase {

	private static final String TEST_CASE_ID = "TLS_B1_FR_09";
	private static final String TEST_CASE_DESCRIPTION = "Session renegotiation";
	private static final String TEST_CASE_PURPOSE
			= "This test verifies the correct behaviour of the DUT in case the client tries to renegotiate the parameters.";

	private TlsTestToolExecutor testTool = null;
	private TSharkExecutor tShark = null;
	private final TFTCPIPNewConnection tFTCPIPNewConnection;
	private final TFTCPIPCloseConnection tFTCPIPCloseConnection;
	private final TFTLSClientHello tfClientHello;
	private final TFAlertMessageCheck tfAlertMessageCheck;

	public TLS_B1_FR_09() {
		setTestCaseId(TEST_CASE_ID);
		setTestCaseDescription(TEST_CASE_DESCRIPTION);
		setTestCasePurpose(TEST_CASE_PURPOSE);

		tFTCPIPNewConnection = new TFTCPIPNewConnection(this);
		tFTCPIPCloseConnection = new TFTCPIPCloseConnection(this);
		tfClientHello = new TFTLSClientHello(this);
		tfAlertMessageCheck = new TFAlertMessageCheck(this);
	}


	@Override
	protected final void prepareEnvironment() throws Exception {
		testTool = new TlsTestToolExecutor(getTestCaseId(), logger);
		tShark = new TSharkExecutor(getTestCaseId(), logger);
		tShark.start();
	}


	/**
	 * <h2>Precondition</h2>
	 * <ul>
	 * <li>DUT services are online without any known disturbances.
	 * <li>The DUT is accepting TLS connections.
	 * </ul>
	 */
	@Override
	protected final void preProcessing() throws Exception {}


	/**
	 * <h2>TestStep 1</h2>
	 * <h3>Command</h3>
	 * <ol>
	 * <li>The tester connects to the DUT.
	 * </ol>
	 * <h3>Description</h3>
	 * <ol>
	 * <li>The TLS ClientHello offers the highest TLS version supported according to the ICS.
	 * <li>The TLS ClientHello offers a cipher suite that is supported according to the ICS.
	 * <li>In case the cipher suite is based on ECC, the TLS ClientHello offers valid elliptic curves in the appropriate
	 * extension according to the ICS.
	 * <li>The presence of the signature_algorithms extension depends on the used TLS version. In case it is sent, all
	 * algorithms that are supported according to the ICS are listed.
	 * <li>The TLS ClientHello does not contain further extensions which are not required to conduct the TLS handshake.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The DUT accepts the TLS connection.
	 * <li>The TLS protocol is executed without errors and the channel is established.
	 * </ul>
	 * <h2>TestStep 2</h2>
	 * <h3>Command</h3>
	 * <ol>
	 * <li>The TLS client sends a HelloRequest message to initiate a renegotiation process.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The DUT either ignores the request or answers with a ""no_renegotiation"" alert or another suitable alert
	 * description.
	 * </ul>
	 */
	@Override
	protected final void executeUsecase() throws Exception {

		logger.info("START: " + getTestCaseId());
		logger.info(getTestCaseDescription());

		/** highest supported TLS version */
		TlsVersion tlsVersion = configuration.getHighestSupportedTlsVersion();
		if (tlsVersion == null) {
			logger.error("No supported TLS versions found.");
			return;
		}
		logger.debug("TLS version: " + tlsVersion.name());

		/** any supported algorithm cipher suite */
		TlsCipherSuite cipherSuite = configuration.getSingleSupportedCipherSuite(tlsVersion);
		if (cipherSuite == null) {
			logger.error("No supported cipher suite found.");
			return;
		}
		logger.debug("Supported Cipher suite:" + cipherSuite);

		tfClientHello.executeSteps("1", "The TLS ClientHello offers the TLS version " + tlsVersion.getName()
				+ ", cipher suite " + cipherSuite.name() + " .", null, testTool, tlsVersion, cipherSuite);
		testTool.manipulateRenegotiate();
		testTool.start();

		tFTCPIPNewConnection.executeSteps("2", "", Collections.emptyList(),
				testTool);

		testTool.assertMessageLogged(TestToolResource.Handshake_successful);

		tfAlertMessageCheck.executeSteps("3",
				"The DUT rejects the ClientHello with a \"no_renegotiation\" alert or "
						+ "	another suitable error description",
				Arrays.asList("level=warning/fatal", "description=no_renegotiation"), testTool);

		tFTCPIPCloseConnection.executeSteps("4", "", Collections.emptyList(),
				testTool);
	}


	@Override
	protected void postProcessing() throws Exception {

	}


	@Override
	protected final void cleanAndExit() {
		testTool.cleanAndExit();
		tShark.cleanAndExit();
	}

}