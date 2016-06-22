package com.nhcsys.common;

import java.util.StringTokenizer;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

import com.nhcsys.common.security.StringEncrypter;
import com.nhcsys.common.security.StringEncrypter.EncryptionException;

public class WebServicesHelper {

	public static String getNewEncryptionKey() {
		return UUID.randomUUID().toString();
	} 

	public static String getEncryptedToken(String aencryptionKey, String ainput) throws EncryptionException {
			return (new StringEncrypter(WebServicesConfig.getConfiguration().getString(
					Constants.ENSCRYPTION_SCHEME), aencryptionKey)).encrypt(ainput);
	}
	
	public static String getDecryptedToken(String aencryptionKey, String ainput) throws EncryptionException {
		return (new StringEncrypter(WebServicesConfig.getConfiguration().getString(
				Constants.ENSCRYPTION_SCHEME), aencryptionKey)).decrypt(ainput);
}

	public static String getNewSessionID(long customerID) {
		String strCustomerID=customerID+Constants.EMPTY_STRING;
		String encodedCustomerIDtoBeadded = new String( Base64.encodeBase64(strCustomerID.getBytes()));
		String strSession =encodedCustomerIDtoBeadded + "_" 
		+UUID.randomUUID().toString();
		return strSession; 
	} 
	
	public static Long getCustomerIDFromSession(String asession) {
		StringTokenizer st = new StringTokenizer(asession, "_");
		String encodedCustomerID = st.nextToken();
		String decodedCustomerID = new String(Base64.decodeBase64(encodedCustomerID.getBytes()));
		return new Long(decodedCustomerID);
	}  
	
	public static String getTokenToBeEncrypted(String viveID, String userID, String userPassword, long time) {
		return viveID+"_"+userID+"_"+userPassword+"_"+time;
	}

	public static String getViveID(int customerID, String number) {
		return customerID+"_"+number;
	}

	public static String validateInput(String input) {
		if (input==null || input.trim().length()==0)
			return Constants.EMPTY_STRING;
		return input.trim();
	}
	
	public static long getMachineIDForNastClient() {
		return WebServicesConfig.getConfiguration().getInt(
				Constants.WEBSERVICES_CLIENT_NASTI_MACHINEID);
	}
}
