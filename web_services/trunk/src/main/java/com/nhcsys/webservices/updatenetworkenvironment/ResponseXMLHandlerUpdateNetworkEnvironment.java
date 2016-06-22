/**
 * UpdateNetworkEnvironmentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.updatenetworkenvironment;

import java.io.File;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;

import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentRequestElementDocument;
import com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.UpdateNetworkEnvironmentResponseElementDocument;

/**
 *  UpdateNetworkEnvironmentServiceSkeleton java skeleton for the axisService
 */
public class ResponseXMLHandlerUpdateNetworkEnvironment
    implements UpdateNetworkEnvironmentServiceSkeletonInterface {
   
	public UpdateNetworkEnvironmentResponseElementDocument UpdateNetworkEnvironment(UpdateNetworkEnvironmentRequestElementDocument updateNetworkEnvironmentRequestElement) 
throws UpdateNetworkEnvironmentFailure {
		 try {
				String strXMLFileName = WebServicesConfig.getConfiguration().getString(
						 Constants.UPDATENETWORKENVIRONMENT_UPDATENETWORKENVIRONMENT);
				String strXMLFileFolder = 
					     WebServicesConfig.getConfiguration().getString(
					    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);

				File xmlFile = new File(strXMLFileFolder + "/"
						+ strXMLFileName);
				return (UpdateNetworkEnvironmentResponseElementDocument) 
				((UpdateNetworkEnvironmentResponseElementDocument) UpdateNetworkEnvironmentResponseElementDocument.Factory.parse(xmlFile));
				
			} catch (Exception e) {
				throw new UpdateNetworkEnvironmentFailure("XML Exception happened", e);
			}
		    }
}
