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

import java.io.File;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument;
import com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument;

public class ResponseXMLGetOrderInfoHandler
    implements GetOrderInfoServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * @param getOrderInfoRequestElement0
     */
    public GetOrderInfoResponseElementDocument GetOrderInfo(
        GetOrderInfoRequestElementDocument getOrderInfoRequestElement0)
        throws GetOrderInfoFailure {
    	
try {
	        	    	
    		String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.GETORDERINFO_GETORDERINFO_RESPONSE_XMLFILE);
    		
    	
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
			
			File xmlFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
		
			GetOrderInfoResponseElementDocument p =  ((GetOrderInfoResponseElementDocument) GetOrderInfoResponseElementDocument.Factory.parse(xmlFile));
		
			return p;
			
		} catch (Exception e) {
			throw new GetOrderInfoFailure("XML Exception happened", e);
		}
    }
}