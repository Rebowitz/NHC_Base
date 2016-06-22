/**
 * GetManifestServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmanifest;

import org.apache.log4j.Logger;
import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument;

/**
 *  GetManifestServiceSkeleton java skeleton for the axisService
 */
public class GetManifestServiceSkeleton
    implements GetManifestServiceSkeletonInterface {

    private static final Logger log = 
        Logger.getLogger(GetManifestServiceSkeleton.class);

	public GetManifestResponseElementDocument GetManifest(GetManifestInputElementDocument getManifestInputElement) throws GetManifestFailure {
		System.out.println("Entering: GetManifest()");
        log.debug("Entering: GetManifest()");
        GetManifestServiceSkeletonInterface responseHandler = null;
		try {
			responseHandler=
				(GetManifestServiceSkeletonInterface) Factory.getHandler();
		} catch (InstantiationException e) {
            log.error(e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
            log.error(e);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
            log.error(e);
			e.printStackTrace();
		}
    	return (GetManifestResponseElementDocument) responseHandler.GetManifest(getManifestInputElement);
    }
	
	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static GetManifestServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            log.debug("Entering: getHandler()");
            System.out.println("Entering: getHandler()");
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.GETMANIFEST_SERVICE_HANDLERTYPE);
            log.debug("handlerType = " + handlerType);
            System.out.println("handlerType = " + handlerType);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
            log.debug("handlerClassName = " + handlerClassName);
            System.out.println("handlerClassName = " + handlerClassName);
			return (GetManifestServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}
    
}


