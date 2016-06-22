/**
 * GetMessagesServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmessages;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;

import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument;

/**
 *  GetMessagesServiceSkeleton java skeleton for the axisService
 */
public class GetMessagesServiceSkeleton
    implements GetMessagesServiceSkeletonInterface {

	public SupportMessagesResponseElementDocument GetMessages(SupportMessagesRequestElementDocument supportMessagesRequestElement) throws GetMessagesFailure {
		GetMessagesServiceSkeletonInterface responseHandler = null;
		try {
			responseHandler = (GetMessagesServiceSkeletonInterface) Factory.getHandler();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	return (SupportMessagesResponseElementDocument) responseHandler.GetMessages(supportMessagesRequestElement);
	}
	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static GetMessagesServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.GETMESSAGES_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (GetMessagesServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}
}
