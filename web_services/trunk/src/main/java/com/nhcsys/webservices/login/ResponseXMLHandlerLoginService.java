/**
 * LoginServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.login;

import java.io.File;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.UUID;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.common.security.StringEncrypter;
import com.nhcsys.common.security.StringEncrypter.EncryptionException;
import com.nhcsys.webservices.getorderinfo.GetOrderInfoFailure;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginResponseElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginResponseElementDocument.LoginResponseElement;

/**
 *  LoginServiceSkeleton java skeleton for the axisService
 */
public class ResponseXMLHandlerLoginService implements LoginServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * @param getTokenTypeElement1 
     */

	public LoginResponseElementDocument GetToken(GetTokenElementDocument getTokenElement) throws LoginFailure {
		try {
	    	
    		String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.LOGIN_GETTOKEN_RESPONSE_XMLFILE);
    		
    	
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
			
			File xmlFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
		
			LoginResponseElementDocument p =  ((LoginResponseElementDocument) LoginResponseElementDocument.Factory.parse(xmlFile));
		
			return p;
			
		} catch (Exception e) {
			throw new LoginFailure("XML Exception happened", e);
		}
    }
    /**
     * Auto generated method signature
     * @param loginCredentialsTypeElement3
     */
	public LoginResponseElementDocument LoginAuthenticate(LoginCredentialsElementDocument loginCredentialsElement) throws LoginFailure {
		
try {
	    	
    		String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.LOGIN_LOGINAUTHENTICATE_RESPONSE_XMLFILE);
    		
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
			
			File xmlFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
		
			LoginResponseElementDocument p =  ((LoginResponseElementDocument) LoginResponseElementDocument.Factory.parse(xmlFile));
		
			return p;
			
		} catch (Exception e) {
			throw new LoginFailure("XML Exception happened", e);
		}
    }
}
        	
    		