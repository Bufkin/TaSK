package com.achelos.task.tr03116ts.testcases.b.b1.fr;

import java.util.List;

import com.achelos.task.abstracttestsuite.AbstractTestCase;
import com.achelos.task.commandlineexecution.applications.tlstesttool.TlsTestToolExecutor;
import com.achelos.task.commandlineexecution.applications.tlstesttool.configuration.TlsTestToolConfigurationHandshakeType;
import com.achelos.task.commandlineexecution.applications.tlstesttool.messagetextresources.TestToolResource;
import com.achelos.task.commandlineexecution.applications.tshark.TSharkExecutor;
import com.achelos.task.commons.enums.TlsCipherSuite;
import com.achelos.task.commons.enums.TlsTestToolTlsLibrary;
import com.achelos.task.commons.enums.TlsVersion;
import com.achelos.task.tr03116ts.testfragments.TFTLSClientHello;


/**
 * <p>
 * This tests verifies that it is possible to perform session resumption via Session ID for the sessions which are not
 * older than the maximum allowed amount of time.
 */
public class TLS_B1_FR_15 extends AbstractTestCase {

	private static final String TEST_CASE_ID = "TLS_B1_FR_15";
	private static final String TEST_CASE_DESCRIPTION = "Reconnect with Session ID";
	private static final String TEST_CASE_PURPOSE
			= "This tests verifies that it is possible to perform session resumption "
					+ "via Session ID for the sessions which are not older than the maximum "
					+ "allowed amount of time.";

	private TlsTestToolExecutor testTool = null;
	private TSharkExecutor tShark = null;
	private final TFTLSClientHello tfClientHello;


	public TLS_B1_FR_15() {
		setTestCaseId(TEST_CASE_ID);
		setTestCaseDescription(TEST_CASE_DESCRIPTION);
		setTestCasePurpose(TEST_CASE_PURPOSE);

		tfClientHello = new TFTLSClientHello(this);
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
	 * <li>The tester closes the connection to the DUT and stores the Session ID.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>TRUE
	 * </ul>
	 * <h2>TestStep 3</h2>
	 * <h3>Command</h3>
	 * <ol>
	 * <li>Less than the maximum allowed amount of time later, the tester reconnects to the DUT using the stored Session
	 * ID.
	 * </ol>
	 * <h3>Description</h3>
	 * <ol>
	 * <li>All other parameters match the ones used for the initial TLS ClientHello.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The DUT accepts session resumption.
	 * <li>Session resumption is performed
	 * <li>The TLS protocol is executed without errors and the channel is established.
	 * </ul>
	 */
	@Override
	protected final void executeUsecase() throws Exception {

		/** this test case uses OpenSSL library */

		logger.info("START: " + getTestCaseId());
		logger.info(getTestCaseDescription());

		/** highest supported TLS version */
		TlsVersion tlsVersion = configuration.getHighestSupportedTlsVersion();
		if (tlsVersion == null) {
			logger.error("No supported TLS versions found.");
			return;
		}
		logger.debug("TLS version: " + tlsVersion.getName());

		/** any supported algorithm cipher suite */
		TlsCipherSuite cipherSuite = configuration.getSingleSupportedCipherSuite(tlsVersion);
		if (cipherSuite == null) {
			logger.error("No supported cipher suite found.");
			return;
		}
		logger.debug("Supported Cipher suites:" + cipherSuite.getName());

		tfClientHello.executeSteps("1", "The TLS ClientHello offers the TLS version " + tlsVersion.getName()
				+ ", cipher suite " + cipherSuite.getName() + " .", null, testTool, tlsVersion, cipherSuite,
				TlsTestToolTlsLibrary.OpenSSL);

		testTool.start(1, 2);

		step(2, "Receive ServerHello from TOE with session_id $SessionID.\r\n"
				+ "Receive ServerHelloDone from TOE.\r\n"
				+ "If $SessionID is empty, stop the test case and log that the TLS server does not support"
				+ " session resumption via session IDs.", "");

		testTool.assertMessageLogged(TestToolResource.ServerHello_valid);
		String sessionID = testTool.getValue(TestToolResource.ServerHello_session_id);
		testTool.assertMessageLogged(TestToolResource.Handshake_successful);
		logger.info("ServerHello.session_id=" + sessionID);
		if (sessionID == null) {
			logger.error("Session Resumption via Session ID is not supported by the TLS server.");
			return;
		}

		/** extract session cache from log */
		List<String> sessionCache = testTool.getSessionCacheFromLog(0);
		if (sessionCache == null || sessionCache.size() == 0) {
			logger.error("sessionCache was not logged");
			return;
		}

		testTool.resetProperties();

		tfClientHello.executeSteps("3", "The TLS ClientHello offers the TLS version " + tlsVersion.getName()
				+ ", cipher suite " + cipherSuite.name() + " .", null, testTool, tlsVersion, cipherSuite,
				TlsTestToolTlsLibrary.OpenSSL);
		testTool.setSessionHandshakeType(TlsTestToolConfigurationHandshakeType.SessionResumptionWithSessionID);
		testTool.setSessionCache(sessionCache.get(0));

		testTool.start(2, 2);

		step(4, "Send ClientHello with session_id = $SessionID.",
				"Receive ServerHello from TOE with session_id == $SessionID.");

		testTool.assertMessageLogged(TestToolResource.ServerHello_valid);
		String receivedSessionID = testTool.getValue(TestToolResource.ServerHello_session_id);

		if (receivedSessionID.equalsIgnoreCase(sessionID)) {
			logger.info("Session Resumption was accepted.");
		} else {
			logger.error("Session Resumption was rejected.");
		}

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
