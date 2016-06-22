/**
 * UpdateNetworkEnvironmentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.updatenetworkenvironment;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentRequestElementDocument;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentResponseElementDocument;


/**
 *  UpdateNetworkEnvironmentServiceSkeleton java skeleton for the axisService
 */
public class UpdateNetworkEnvironmentServiceSkeleton
    implements UpdateNetworkEnvironmentServiceSkeletonInterface {

	public UpdateNetworkEnvironmentResponseElementDocument UpdateNetworkEnvironment(UpdateNetworkEnvironmentRequestElementDocument updateNetworkEnvironmentRequestElement) throws  UpdateNetworkEnvironmentFailure {
		
    	UpdateNetworkEnvironmentServiceSkeletonInterface responseHandler = null;
		try {
			responseHandler = (UpdateNetworkEnvironmentServiceSkeletonInterface) Factory.getHandler();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    	return (UpdateNetworkEnvironmentResponseElementDocument) responseHandler.UpdateNetworkEnvironment(updateNetworkEnvironmentRequestElement);
    
	}
	
	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static UpdateNetworkEnvironmentServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.UPDATENETWORKENVIRONMENT_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (UpdateNetworkEnvironmentServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}
    
    
}
