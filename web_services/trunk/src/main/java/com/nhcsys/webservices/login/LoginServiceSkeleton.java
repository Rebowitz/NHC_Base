/**
 * LoginServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.login;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument;
import com.nhcsys.webservices.login.logintypes.v1.LoginResponseElementDocument;
 
/**
 *  LoginServiceSkeleton java skeleton for the axisService
 */
public class LoginServiceSkeleton implements LoginServiceSkeletonInterface {
	
	public LoginResponseElementDocument GetToken(GetTokenElementDocument getTokenElement) throws LoginFailure {
    
    		LoginServiceSkeletonInterface responseHandler = null;
			try {
				responseHandler = (LoginServiceSkeletonInterface) Factory
						.getHandler();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
    		LoginResponseElementDocument p = 
    			(LoginResponseElementDocument) responseHandler.GetToken(getTokenElement);
    		
			return p;
	}


	public LoginResponseElementDocument LoginAuthenticate(
LoginCredentialsElementDocument loginCredentialsElement) throws LoginFailure {
 		
		LoginServiceSkeletonInterface responseHandler = null;
		try {
			responseHandler = (LoginServiceSkeletonInterface) Factory
					.getHandler();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		LoginResponseElementDocument p = 
			(LoginResponseElementDocument) 
			    responseHandler.LoginAuthenticate(loginCredentialsElement);
		return p;


}

	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static LoginServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.LOGIN_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (LoginServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}

}