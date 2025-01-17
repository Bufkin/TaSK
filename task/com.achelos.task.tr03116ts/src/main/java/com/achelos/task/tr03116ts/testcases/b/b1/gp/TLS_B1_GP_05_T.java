package com.achelos.task.tr03116ts.testcases.b.b1.gp;

import java.util.Arrays;
import java.util.List;

import com.achelos.task.abstracttestsuite.AbstractTestCase;
import com.achelos.task.commandlineexecution.applications.tlstesttool.TlsTestToolExecutor;
import com.achelos.task.commandlineexecution.applications.tshark.TSharkExecutor;
import com.achelos.task.commons.enums.TlsAlertLevel;
import com.achelos.task.commons.enums.TlsCipherSuite;
import com.achelos.task.commons.enums.TlsVersion;
import com.achelos.task.tr03116ts.testfragments.TFAlertMessageCheck;
import com.achelos.task.tr03116ts.testfragments.TFTCPIPCloseConnection;
import com.achelos.task.tr03116ts.testfragments.TFTCPIPNewConnection;
import com.achelos.task.tr03116ts.testfragments.TFTLSClientHello;


/**
 * Test case TLS_B1_GP_05_T - Reject unsupported TLS version.
 * <p>
 * This test verifies that no downgrade to a TLS version that is not supported according to the ICS is possible.
 * <p>
 * The test MUST be repeated for each TLS version unsupported by the DUT according to the ICS (cf. Table 20).
 */
public class TLS_B1_GP_05_T extends AbstractTestCase {

	private static final String TEST_CASE_ID = "TLS_B1_GP_05_T";
	private static final String TEST_CASE_DESCRIPTION = "Reject unsupported TLS version";
	private static final String TEST_CASE_PURPOSE = "This test verifies that no downgrade to a TLS version that "
			+ "is not supported according to the ICS is possible.";

	private TlsTestToolExecutor testTool = null;
	private TSharkExecutor tShark = null;
	private final TFTCPIPNewConnection tFTCPIPNewConnection;
	private final TFAlertMessageCheck tfAlertMessageCheck;
	private final TFTCPIPCloseConnection tFTCPIPCloseConnection;
	private final TFTLSClientHello tfClientHello;

	public TLS_B1_GP_05_T() {
		setTestCaseId(TEST_CASE_ID);
		setTestCaseDescription(TEST_CASE_DESCRIPTION);
		setTestCasePurpose(TEST_CASE_PURPOSE);

		tFTCPIPNewConnection = new TFTCPIPNewConnection(this);
		tfAlertMessageCheck = new TFAlertMessageCheck(this);
		tFTCPIPCloseConnection = new TFTCPIPCloseConnection(this);
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
	 * <li>The tester chooses a SSL/TLS version that is not supported according to the ICS.
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
	 * <li>The TLS ClientHello offers a TLS version that is not supported according to the ICS.
	 * <li>The TLS ClientHello offers a cipher suite that is supported according to the ICS.
	 * <li>In case the chosen cipher suite is based on ECC, the TLS ClientHello offers valid elliptic curves in the
	 * appropriate extension according to the ICS.
	 * <li>The presence of the signature_algorithms extension depends on the used TLS version. In case it is sent, all
	 * algorithms that are supported according to the ICS are listed.
	 * <li>The TLS ClientHello does not contain further extensions which are not required to conduct the TLS handshake.
	 * </ol>
	 * <h3>ExpectedResult</h3>
	 * <ul>
	 * <li>The DUT rejects the ClientHello with a ""protocol_version"" alert or another suitable error description.
	 * <li>No TLS connection is established.
	 * </ul>
	 */
	@Override
	protected final void executeUsecase() throws Exception {

		logger.info("START: " + getTestCaseId());
		logger.info(getTestCaseDescription());

		// all unsupported tls version
		List<TlsVersion> tlsVersions = configuration.getNotSupportedTLSVersions();
		if (null == tlsVersions || tlsVersions.isEmpty()) {
			logger.error("No unsupported TLS versions found.");
			return;
		}
		logger.debug("Supported TLS versions:");
		for (TlsVersion tlsVersion : tlsVersions) {
			logger.debug(tlsVersion.getName());
		}

		/** any supported algorithm cipher suite */
		TlsCipherSuite cipherSuite
				= configuration.getSingleSupportedCipherSuite(TlsVersion.TLS_V1_2);
		if (cipherSuite == null) {
			logger.error("No supported cipher suite found.");
			return;
		}
		logger.debug("Supported Cipher suites:" + cipherSuite.getName());

		step(1, "The tester connects to the DUT.", "");

		// repeat test for each un supported TLS version
		int iterationCount = 1;
		for (TlsVersion tlsVersion : tlsVersions) {

			tfClientHello.executeSteps("2", "The TLS ClientHello offers the TLS version " + tlsVersion.getName()
					+ ", cipher suite " + cipherSuite.getName() + " .", null, testTool, tlsVersion, cipherSuite);
			testTool.start(iterationCount, tlsVersions.size());
			iterationCount++;

			tFTCPIPNewConnection.executeSteps("3", "", Arrays.asList(), testTool);

			tfAlertMessageCheck.executeSteps("4",
					"The DUT rejects the ClientHello with a \"protocol_version\" alert or "
							+ "	another suitable error description",
					Arrays.asList("level=warning/fatal", "description=protocol_version"), testTool);

			tFTCPIPCloseConnection.executeSteps("5", "", Arrays.asList(), testTool);

			testTool.resetProperties();
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
