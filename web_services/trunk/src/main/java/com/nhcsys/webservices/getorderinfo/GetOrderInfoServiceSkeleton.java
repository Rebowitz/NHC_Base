/**
 * GetOrderInfoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getorderinfo;

/**
 *  GetOrderInfoServiceSkeleton java skeleton for the axisService
 */
import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument;

public class GetOrderInfoServiceSkeleton
    implements GetOrderInfoServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * @param getOrderInfoRequestElement0
     */
    public GetOrderInfoResponseElementDocument GetOrderInfo(
        GetOrderInfoRequestElementDocument getOrderInfoRequestElement0)
        throws GetOrderInfoFailure {
    	    	GetOrderInfoServiceSkeletonInterface responseHandler = null;
				try {
					responseHandler = (GetOrderInfoServiceSkeletonInterface) Factory.getHandler();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
    	return (GetOrderInfoResponseElementDocument) responseHandler.GetOrderInfo(getOrderInfoRequestElement0);

    }
    public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static GetOrderInfoServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.GETORDERINFO_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (GetOrderInfoServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}
    
    
    
}
