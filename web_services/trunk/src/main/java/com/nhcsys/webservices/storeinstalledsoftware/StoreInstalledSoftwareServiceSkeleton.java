/**
 * StoreInstalledSoftwareServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.storeinstalledsoftware;


import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareRequestElementDocument;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareResponseElementDocument;

/**
 *  StoreInstalledSoftwareServiceSkeleton java skeleton for the axisService
 */
public class StoreInstalledSoftwareServiceSkeleton
    implements StoreInstalledSoftwareServiceSkeletonInterface {
    
	public StoreInstalledSoftwareResponseElementDocument StoreInstalledSoftware(StoreInstalledSoftwareRequestElementDocument storeInstalledSoftwareRequestElement) throws StoreInstalledSoftwareFailure {
    		
    		StoreInstalledSoftwareServiceSkeletonInterface responseHandler = null;
			try {
				responseHandler = 
					(StoreInstalledSoftwareServiceSkeletonInterface) Factory.getHandler();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
					
    		StoreInstalledSoftwareResponseElementDocument responseDoc = (StoreInstalledSoftwareResponseElementDocument) 
			    responseHandler.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
			return responseDoc;
	}
	
	public static final class Factory {
		private Factory() {
		} // No instance of this class allowed
		
		public static StoreInstalledSoftwareServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.STOREINSTALLEDSOFTWARE_SERVICE_HANDLERTYPE);
			String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
			return (StoreInstalledSoftwareServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
		}
	}

    }
