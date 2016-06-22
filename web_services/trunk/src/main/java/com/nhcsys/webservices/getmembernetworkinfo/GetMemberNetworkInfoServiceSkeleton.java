/**
 * GetMemberNetworkInfoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmembernetworkinfo;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument;

/**
 *  GetMemberNetworkInfoServiceSkeleton java skeleton for the axisService
 */
public class GetMemberNetworkInfoServiceSkeleton
    implements GetMemberNetworkInfoServiceSkeletonInterface {
    
	public GetMemberNetworkInfoElementDocument GetMemberNetworkInfo(GetMemberNetworkInputElementDocument getMemberNetworkInputElement) throws GetMemberNetworkInfoFailure {
		GetMemberNetworkInfoServiceSkeletonInterface responseHandler = null;
		try {
			responseHandler = (GetMemberNetworkInfoServiceSkeletonInterface) Factory.getHandler();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	return (GetMemberNetworkInfoElementDocument) responseHandler.GetMemberNetworkInfo(getMemberNetworkInputElement);
       
	}
	
	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static GetMemberNetworkInfoServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.GETMEMBERNETWORKINFO_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (GetMemberNetworkInfoServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}
    
    
    
    
}
