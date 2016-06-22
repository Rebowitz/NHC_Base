/**
 * StoreInstalledSoftwareServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.storeinstalledsoftware; 


import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareRequestElementDocument;
import com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareResponseElementDocument;

/**
 *  StoreInstalledSoftwareServiceSkeleton java skeleton for the axisService
 */
public class ResponseXMLStoreInstalledSoftwareService
    implements StoreInstalledSoftwareServiceSkeletonInterface {
    /** 
     * Auto generated method signature
     * @param storeInstalledSoftwareRequestType0
     */
  
    public StoreInstalledSoftwareResponseElementDocument StoreInstalledSoftware(StoreInstalledSoftwareRequestElementDocument storeInstalledSoftwareRequestElement) throws StoreInstalledSoftwareFailure {
		
	try {
    		
    		String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.STOREINSTALLEDSOFTWARE_STOREINSTALLEDSOFTWARE_RESPONSE_XMLFILE);
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
			
			File loginServiceInterfaceXMLFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
			
			return StoreInstalledSoftwareResponseElementDocument.Factory
					.parse(loginServiceInterfaceXMLFile);
			
		} catch (XmlException e) {
			throw new StoreInstalledSoftwareFailure("XML Exception happened", e);
		} catch (IOException ex) {

			throw new StoreInstalledSoftwareFailure("XML Exception happened");
		} catch (Exception e) {
			throw new StoreInstalledSoftwareFailure("XML Exception happened", e);
		}
	}
}
 