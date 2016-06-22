package com.nhcsys.webservices.login;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.WebServicesHelper;
import com.nhcsys.common.exception.NHCException;
import com.nhcsys.common.security.StringEncrypter.EncryptionException;
import com.nhcsys.dataaccess.dao.MachinesDao;
import com.nhcsys.dataaccess.dao.WsSessionsDao;
import com.nhcsys.dataaccess.dto.Machines;
import com.nhcsys.dataaccess.dto.MachinesPk;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.dto.WsSessionsPk;
import com.nhcsys.dataaccess.exceptions.MachinesDaoException;
import com.nhcsys.dataaccess.exceptions.WsSessionsDaoException;
import com.nhcsys.dataaccess.factory.MachinesDaoFactory;
import com.nhcsys.dataaccess.factory.WsSessionsDaoFactory;
import com.nhcsys.webservices.login.logintypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginResponseElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.login.logintypes.v1.LoginResponseElementDocument.LoginResponseElement;

/**
 * LoginServiceSkeletonBase java skeleton for the axisService
 */

// TODOs
// 1) Transation database.
//2) Primary Key issue.
//3) Verify the flow.
public abstract class LoginServiceBase implements LoginServiceSkeletonInterface {

	protected static final Logger logger = Logger
			.getLogger(LoginServiceBase.class);

	public final String CLASS = "LoginServiceBase: "; 

	WebServicesFaultTypesEnum LoginInputErrorENum = WebServicesFaultTypesEnum.INVALID_INPUT_LOGIN_SERVICE;
	WebServicesFaultTypesEnum LoginEncryptErrorENum = WebServicesFaultTypesEnum.ENCRYPT_ERROR_LOGIN_SERVICE;
	WebServicesFaultTypesEnum LoginDatabaseErrorENum = WebServicesFaultTypesEnum.DATABASE_ERROR_LOGIN_SERVICE;
	WebServicesFaultTypesEnum LoginNoMachineRecordsErrorENum = WebServicesFaultTypesEnum.LOGIN_SERVICE_MACHINE_RECORDS_ERROR;
	WebServicesFaultTypesEnum LoginServiceInvalidTokenErrorNum = WebServicesFaultTypesEnum.LOGIN_SERVICE_AUTHENTICATE_FAILED_REASON_INVALID_TOKEN;
	WebServicesFaultTypesEnum LoginServiceViveIDTokenErrorNum = WebServicesFaultTypesEnum.LOGIN_SERVICE_AUTHENTICATE_FAILED_REASON_VIVEID_TOKEN_DOES_NOT_MATCH;

	public LoginResponseElementDocument GetToken(
			GetTokenElementDocument getTokenElement) throws LoginFailure {
		String method = "GetToken: ";
		int customerID = 0;
		String viveID = null;
		String sessionID = null;
		String encryptionKey = null;
		String encryptedToken = null;

		boolean isMachineExist = false;

		MachinesDao machineDao = null;
		Machines[] machinesForGivenCustomerID = null;
		Machines machineObjectToBeInserted = null;
		Machines machineObjectToBeUpdated = null;

		long time = Calendar.getInstance().getTimeInMillis();
		int maxCharsAllowedinCPUNumber = WebServicesConfig
				.getConfiguration()
				.getInt(
						Constants.MAX_CHRACTERS_ALLOWED_IN_CPUNUMBER_LOGIN_SERVICE);
		int noOfCharsinCPUNumber = 0;

		/*
		 * Step1) Input params are retrieved from token object.
		 */
		String userID = getTokenElement.getGetTokenElement().getUserID();
		String userPassword = getTokenElement.getGetTokenElement()
				.getPassword();
		String CPUNumber = getTokenElement.getGetTokenElement()
				.getCpuSerialNumber();
		String appName = getTokenElement.getGetTokenElement().getAppName();

		/*
		 * Step2) Input params are validated.
		 */
		if (userID == null || userID.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ "userID cannot be null or empty");
			throw createException("userID cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("userID"), null);
		}
		userID = userID.trim();

		if (userPassword == null || userPassword.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ "userPassword cannot be null or empty");
			throw createException("userPassword cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("userPassword"), null);
		}
		userPassword = userPassword.trim();

		if (CPUNumber == null || CPUNumber.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ "CPUNumber cannot be null or empty");
			throw createException("CPUNumber cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("CPUNumber"), null);
		} 
		CPUNumber = CPUNumber.trim();
		noOfCharsinCPUNumber = CPUNumber.length();
		
		if (noOfCharsinCPUNumber > maxCharsAllowedinCPUNumber) {
					CPUNumber = CPUNumber.substring(noOfCharsinCPUNumber
					- maxCharsAllowedinCPUNumber);
		} 
		logger.debug("cpu length after removing characters in beginning:"+CPUNumber.length());
		if (appName == null || appName.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ "appName cannot be null or empty");
			throw createException("appName cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("appName"), null);
		} 
		appName = appName.trim();
		/*
		 * Step 2) Validated, if the client is Nasti client The Nasti client
		 * will have "NASTCPU" string as the CPU Number.
		 */
		boolean isNastiUserID = (CPUNumber
				.indexOf(WebServicesConfig.getConfiguration().getString(
						Constants.NASTI_CPUNUMBER_STRING)) != -1);

		
		WsSessions wsSession = new WsSessions();

		/*
		 * Step 3) For clients, viveID is created if it is first-time invocation
		 * on GetToken operation. --EncryptedToken and viveID are sent back to
		 * regular clients. --If Nast client, encrypted key and machine table
		 * entry not needed. --SessionID is created and sent back to all clients
		 * including Nasti.
		 */
		/* Client is authenticated by using userID and password */
		try {
			customerID = handleAuthenticate(userID, userPassword);
		} catch (NHCException e1) {
			logger
			.error(CLASS
					+ method
					+ " time:"
					+ time
					+ "Database Error while retrieving CustomerRecords for the userID: "
					+ userID + ", " + e1.getMessage());
	e1.printStackTrace();
	throw createException(e1.getMessage(), e1.getFaultCode(), e1.getFaultDescription(), e1.getFaultCause());
		}
		if (!isNastiUserID) {
			encryptionKey = WebServicesHelper.getNewEncryptionKey();

			
			machineDao = MachinesDaoFactory.create();

			/* Machine records are retrieved for the given customerID */
			try {
				machinesForGivenCustomerID = machineDao
						.findWhereCustomerIdEquals(customerID);
			} catch (MachinesDaoException e1) {
				logger
						.error(CLASS
								+ method
								+ " time:"
								+ time
								+ "Database Error while retrieving Machine Records for the Customer :"
								+ customerID + ", " + e1.getMessage());
				e1.printStackTrace();
				throw createException(
						"Database Error while retrieving Machine Records for the Customer :"
								+ customerID, LoginDatabaseErrorENum.getCode(),
						LoginDatabaseErrorENum.getDescription(), e1
								.getMessage());
			}
			MachinesPk machinePK = null;

			/*
			 * Verfied if the CPU Number and viveID exists for the customer
			 * already.
			 */
			if (machinesForGivenCustomerID != null
					&& machinesForGivenCustomerID.length > 0) {
				for (int i = 0; i < machinesForGivenCustomerID.length; i++) {
					if (machinesForGivenCustomerID[i].getCpuSerialNo().trim()
							.equals(CPUNumber)) {
						isMachineExist = true;
						viveID = machinesForGivenCustomerID[i].getViveId();
						machineObjectToBeUpdated = machinesForGivenCustomerID[i];
						machinePK = new MachinesPk(
								machinesForGivenCustomerID[i].getMachineId());
					}
				}
			}
			/*
			 * If the GetToken is first time invocation, from the client, new
			 * viveID is created.
			 */
			if (!isMachineExist) {
				viveID = WebServicesHelper.getViveID(customerID, CPUNumber);
			}

			/* New encrypted token is created */
			try {
				encryptedToken = WebServicesHelper.getEncryptedToken(
						encryptionKey, WebServicesHelper.getTokenToBeEncrypted(
								viveID, userID, userPassword, time));
			} catch (EncryptionException e1) {
				logger
						.error(CLASS
								+ method
								+ " time:"
								+ time
								+ "Encrypt Error while creating encrypt token - viveID: "
								+ viveID + " userID: " + userID
								+ " userPassword: " + userPassword + " time"
								+ time + ", " + e1.getMessage()
								+ "encryption key:"+encryptionKey
								);
				e1.printStackTrace();
				throw createException(
						"Encrypt Error while creating encrypted Token",
						LoginEncryptErrorENum.getCode(), LoginEncryptErrorENum
								.getDescription(), e1.getMessage());
			}

			/*
			 * Machine records fields are set: customerID, CPUNumber,
			 * encryptedKey, viveID, timestamp.
			 */
			if (!isMachineExist) {
				machineObjectToBeInserted = new Machines();
				machineObjectToBeInserted.setCustomerId(customerID);
				machineObjectToBeInserted.setCpuSerialNo(CPUNumber);
				machineObjectToBeInserted.setViveId(viveID);
				machineObjectToBeInserted.setKeyData(encryptionKey);
				machineObjectToBeInserted.setKeyTimestamp(time);
			} else {
				machineObjectToBeUpdated.setKeyData(encryptionKey);
				machineObjectToBeUpdated.setKeyTimestamp(time);
			}
			/*
			 * Machine record is inserted if not exist. updated otherwise.
			 */
			try {
				if (!isMachineExist) {
					machineDao.insert(machineObjectToBeInserted);
					machinePK= new  MachinesPk (machineDao.findWhereViveIdEquals(machineObjectToBeInserted.getViveId())[0].getMachineId());
				} else {
						removeSessions(machineObjectToBeUpdated.getMachineId(),
								appName);
					
					machineDao.update(machinePK, machineObjectToBeUpdated);
				}
			} catch (MachinesDaoException e) {
				logger
						.error(CLASS
								+ method
								+ " time:"
								+ time
								+ "Database Error while inserting or updating Machine table for viveID: "
								+ viveID + ", " + e.getMessage());
				e.printStackTrace();
				throw createException(
						"Database Error while inserting or updating Machine table for viveID: "
								+ viveID, LoginDatabaseErrorENum.getCode(),
						LoginDatabaseErrorENum.getDescription(), e.getMessage());
			} catch (WsSessionsDaoException e) {
				logger
				.error(CLASS
						+ method
						+ " time:"
						+ time
						+ " Database Error while removing old Sessions for machineID: "
						+ machineObjectToBeUpdated.getMachineId()+" appName:"+appName + ", " + e.getMessage());
				e.printStackTrace();
				throw createException(
				" Database Error while removing old Sessions for machineID: "
				+ machineObjectToBeUpdated.getMachineId()+" appName:"+appName, LoginDatabaseErrorENum
						.getCode(),
				LoginDatabaseErrorENum.getDescription(), e.getMessage());
			}

			wsSession.setMachineId(machinePK.getMachineId());
		} else {
			/*
			 * For Nasti clients, the machineID in the session table has to be
			 * 0(Zero)
			 */
			wsSession.setMachineId(WebServicesConfig.getConfiguration().getInt(
					Constants.WEBSERVICES_CLIENT_NASTI_MACHINEID));
		}

		/* Step 4) Session is created */
		logger.debug("Nasti Client: ? :"+ isNastiUserID + " customerID:"+ customerID);
		sessionID = WebServicesHelper.getNewSessionID(customerID);
		wsSession.setSessionId(sessionID);
		wsSession.setAppName(appName);
		wsSession.setTimeStamp(new Date(time));
		try {
			WsSessionsDaoFactory.create().insert(wsSession);
		} catch (WsSessionsDaoException e) {
			logger
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ "Database Error while inserting SessionID for the MachineID:"
							+ wsSession.getMachineId() + ", " + e.getMessage());
			e.printStackTrace();
			throw createException(
					"Database Error while inserting SessionID for the MachineID:"
							+ wsSession.getMachineId(), LoginDatabaseErrorENum
							.getCode(),
					LoginDatabaseErrorENum.getDescription(), e.getMessage());
		}

		/* Transaction ends here */
		logger.debug("WsSession Record is created-wsSessionID:"
				+ wsSession.getWsSessionId());

		return getResponseDocument(sessionID, viveID, encryptedToken);
	}

	public abstract int handleAuthenticate(String userID, String userPassword)
			throws NHCException;

	public LoginResponseElementDocument getResponseDocument(String asessionID,
			String aviveID, String aencryptedToken) {
		LoginResponseElementDocument responseObject = LoginResponseElementDocument.Factory
				.newInstance();
		LoginResponseElement loginResponseElement = LoginResponseElement.Factory
				.newInstance();
		loginResponseElement.setSessionID(asessionID);
		loginResponseElement.setToken(aencryptedToken);
		loginResponseElement.setViveID(aviveID);
		responseObject.setLoginResponseElement(loginResponseElement);
		return responseObject;
	}

	public LoginResponseElementDocument LoginAuthenticate(
			LoginCredentialsElementDocument loginCredentialsElement)
			throws LoginFailure {

		String method = "LoginAuthenticate: ";

		String viveIDFromClient = null;
		String appNameFromClient = null;
		String tokenFromClient = null;

		String encryptKeyFromDatabase = null;
		long timeFromDatabase = 0L;

		String viveIDFromToken = null;
		String userIDFromToken = null;
		String userPasswordFromToken = null;
		long timeFromToken = 0L;

		String decryptedClientToken = null;
		String newEncryptedToken = null;
		String sessionID = null;

		long time = Calendar.getInstance().getTimeInMillis();

		viveIDFromClient = loginCredentialsElement.getLoginCredentialsElement()
				.getViveID();
		tokenFromClient = loginCredentialsElement.getLoginCredentialsElement()
				.getToken();
		appNameFromClient = loginCredentialsElement
				.getLoginCredentialsElement().getAppName();

		if (viveIDFromClient == null || viveIDFromClient.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ ", viveID cannot be null or empty");
			throw createException("viveID cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("viveID"), null);
		}

		viveIDFromClient = viveIDFromClient.trim();

		if (tokenFromClient == null || tokenFromClient.trim().length() == 0) {
			logger.error(CLASS + method + " time:" + time
					+ ", tokenFromClient cannot be null or empty");
			throw createException("Token cannot be null or empty",
					LoginInputErrorENum.getCode(), LoginInputErrorENum
							.getDescription("Token"), null);
		}
		tokenFromClient = tokenFromClient.trim();

		logger.debug(CLASS + method + " time:" + time + "Inputs viveID:"
				+ viveIDFromClient + ", Token:<START>" + tokenFromClient
				+ "<END>");

		MachinesDao machineDAO = MachinesDaoFactory.create();

		Machines[] machines = null;
		try {
			machines = machineDAO.findWhereViveIdEquals(viveIDFromClient);
		} catch (MachinesDaoException e) {
			logger
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ " Database Error while retrieving Machine Records for ViveID: "
							+ viveIDFromClient + ", " + e.getMessage());
			e.printStackTrace();
			throw createException(
					"Database Error while retrieving Machine Records for ViveID: "
							+ viveIDFromClient, LoginDatabaseErrorENum
							.getCode(),
					LoginDatabaseErrorENum.getDescription(), e.getMessage());
		}

		if (machines == null || machines.length != 1) {
			logger
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ " No Machine Records found or More than one Machine Records found for viveID: "
							+ viveIDFromClient);
			throw createException(
					"No Machine Records found or More than one Machine Records found for viveID: "
							+ viveIDFromClient, LoginNoMachineRecordsErrorENum
							.getCode(), LoginNoMachineRecordsErrorENum
							.getDescription(viveIDFromClient), null);
		}

		encryptKeyFromDatabase = machines[0].getKeyData().trim();
		timeFromDatabase = machines[0].getKeyTimestamp();

		logger.debug(CLASS + method + " time:" + time
				+ "The Machine Records found for viveID: " + viveIDFromClient
				+ " Key:" + encryptKeyFromDatabase);

		try {
			decryptedClientToken = WebServicesHelper.getDecryptedToken(
					encryptKeyFromDatabase, tokenFromClient);
		} catch (EncryptionException e2) {
			logger.error(CLASS + method + " time:" + time
					+ " Decrypt Error while Decrypting the client token : "
					+ tokenFromClient + " Decrypt Key: "
					+ encryptKeyFromDatabase + ", " + e2.getMessage());
			e2.printStackTrace();
			throw createException(
					"Decrypt Error while Decrypting the client token : "
							+ tokenFromClient + ", ",
					LoginServiceInvalidTokenErrorNum.getCode(),
					LoginServiceInvalidTokenErrorNum
							.getDescription(viveIDFromClient), e2.getMessage());
		}
		StringTokenizer st = new StringTokenizer(decryptedClientToken, "_");

		viveIDFromToken = st.nextToken().trim() + "_" + st.nextToken();

		userIDFromToken = st.nextToken().trim();

		userPasswordFromToken = st.nextToken().trim();

		timeFromToken = Long.parseLong(st.nextToken().trim());

		/* Authentication is being done here */
		if (!(viveIDFromClient.equals(viveIDFromToken))
				|| !(timeFromToken == timeFromDatabase)) {
			logger.error(CLASS + method + " time:" + time
					+ " viveID and time does not match with the token values:"
					+ "viveIDFromClient:" + viveIDFromClient
					+ " viveIDFromToken:" + viveIDFromToken + " timeFromToken:"
					+ timeFromToken + " timeFromDatabase:" + timeFromDatabase);

			throw createException(
					"viveID and time does not match with the token values",
					LoginServiceInvalidTokenErrorNum.getCode(),
					LoginServiceInvalidTokenErrorNum
							.getDescription(viveIDFromClient), null);
		}
		/*
		 * viveID matches with the viveID in the Token. time matches with the
		 * token created time from the database. New Token and SessionID is
		 * created and sent back to client.
		 */ 
		String newEncryptKey = WebServicesHelper.getNewEncryptionKey();

		/* New SessionID and Token is created */
		sessionID = WebServicesHelper.getNewSessionID( machines[0].getCustomerId());

		try {
			newEncryptedToken = WebServicesHelper.getEncryptedToken(
					newEncryptKey, WebServicesHelper.getTokenToBeEncrypted(
							viveIDFromClient, userIDFromToken,
							userPasswordFromToken, time));
		} catch (EncryptionException e1) { 
			logger
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ " Encrypt Error while creating new encrypted token - viveID: "
							+ viveIDFromClient + " Encrypt Key: "
							+ newEncryptKey + ", " + e1.getMessage());
			e1.printStackTrace();
			throw createException(
					"Encrypt Error while creating new encrypted token - viveID: "
							+ viveIDFromClient + " Encrypt Key: "
							+ newEncryptKey + ", ", LoginEncryptErrorENum
							.getCode(), LoginEncryptErrorENum.getDescription(),
					e1.getMessage());
		}
		WsSessionsDao wsSessionsDAO = WsSessionsDaoFactory.create();
		WsSessions session = new WsSessions();

		session.setAppName(appNameFromClient);
		session.setSessionId(sessionID);
		session.setMachineId(machines[0].getMachineId());
		session.setTimeStamp(new Date(time));
		machines[0].setKeyData(newEncryptKey);
		machines[0].setKeyTimestamp(time);
		MachinesPk machinePk = new MachinesPk(machines[0].getMachineId());

		try {
			removeSessions(machines[0].getMachineId(), appNameFromClient);
		} catch (WsSessionsDaoException e2) {
			logger
			.error(CLASS
					+ method
					+ " time:"
					+ time
					+ " Database Error while removing old Sessions for machineID: "
					+ machines[0].getMachineId()+" appName:"+appNameFromClient + ", " + e2.getMessage());
			e2.printStackTrace();
			throw createException(
			" Database Error while removing old Sessions for machineID: "
			+ machines[0].getMachineId()+" appName:"+appNameFromClient, LoginDatabaseErrorENum
					.getCode(),
			LoginDatabaseErrorENum.getDescription(), e2.getMessage());
		}

		/* Session is created */
		try {
			wsSessionsDAO.insert(session); 
		} catch (WsSessionsDaoException e) {
			logger
					.error(CLASS
							+ method
							+ " time:"
							+ time
							+ "Database Error while inserting SessionID for the MachineID:"
							+ session.getMachineId() + ", " + e.getMessage());
			e.printStackTrace();
			throw createException(
					"Database Error while inserting SessionID for the MachineID:"
							+ session.getMachineId(), LoginDatabaseErrorENum
							.getCode(),
					LoginDatabaseErrorENum.getDescription(), e.getMessage());
		}

		/* Machine is updated */
		try {
			machineDAO.update(machinePk, machines[0]);
		} catch (MachinesDaoException e1) {
			logger.error(CLASS + method + " time:" + time
					+ "Database Error while updating MachineTable for viveID:"
					+ viveIDFromClient + e1.getMessage());
			e1.printStackTrace();
			throw createException(
					"Database Error while updating MachineTable for viveID:"
							+ viveIDFromClient, LoginDatabaseErrorENum
							.getCode(),
					LoginDatabaseErrorENum.getDescription(), e1.getMessage());
		}
		return getResponseDocument(sessionID, viveIDFromClient,
				newEncryptedToken);
	}

	/*
	 * TODO - This method does SELECT and DELETE. This can be replaced later
	 * with dynamic DELETE.
	 */
	public void removeSessions(long machineID, String appName) throws WsSessionsDaoException {
		WsSessionsDao dao = WsSessionsDaoFactory.create();
		String SQLToGetSessionsByAppNameAndMachineID = "SELECT ws_session_id, app_name, session_id, machine_id, time_stamp FROM ws_sessions WHERE machine_id = ? and app_name = ? ";

		WsSessions[] sessions = null;

		/* Check if wsSession exist already */
		try {
			sessions = dao.findByDynamicSelect(
					SQLToGetSessionsByAppNameAndMachineID, new Object[] {
							new Long(machineID), appName });
		} catch (WsSessionsDaoException e) {
			throw e; 
		}

		if (sessions == null || sessions.length == 0)
			return;

		for (int i = 0; i < sessions.length; i++) {
			try {
				dao.delete(new WsSessionsPk(sessions[i].getWsSessionId()));
			} catch (WsSessionsDaoException e) {
				throw e;
			}
		}
		return;
	}

	private LoginFailure createException(String exceptionMessage,
			Long faultCode, String faultDesc, String faultCause) {
		
		LoginFailure lfExp = new LoginFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory
				.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		lfExp.setFaultMessage(elementDoc);
		logger.error("Loggin the Exception: ", lfExp);
		return lfExp;
	}

}