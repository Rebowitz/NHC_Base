/**
 * GetMemberNetworkInfoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmembernetworkinfo;

import java.io.File;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getmembernetworkinfo.GetMemberNetworkInfoServiceSkeletonInterface;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument;
import com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement;

/**
 *  GetMemberNetworkInfoServiceSkeleton java skeleton for the axisService
 */
public class ResponseXMLHanderGetMemberNetworkInfo
    implements GetMemberNetworkInfoServiceSkeletonInterface {

	public GetMemberNetworkInfoElementDocument GetMemberNetworkInfo(GetMemberNetworkInputElementDocument getMemberNetworkInputElement) throws  GetMemberNetworkInfoFailure {
		 try {
				String strXMLFileName = WebServicesConfig.getConfiguration().getString(
						 Constants.GETMEMBERNETWORKINFO_GETMEMBERNETWORKINFO_RESPONSE_XMLFILE);
				String strXMLFileFolder = 
					     WebServicesConfig.getConfiguration().getString(
					    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);

				File xmlFile = new File(strXMLFileFolder + "/"
						+ strXMLFileName);
				/*if (true) {
					throw createException("Trying Member Info Exc","1001",
							  "First exception in Member Info",
							  "Exception in member Info");
				}*/
				return ((GetMemberNetworkInfoElementDocument) GetMemberNetworkInfoElementDocument.Factory.parse(xmlFile));
				
			} catch (Exception e) {
				throw new GetMemberNetworkInfoFailure("XML Exception happened", e);
			}
 }
	
	/**
	 * Create Exception with appropriate Values and return it
	 */
	private GetMemberNetworkInfoFailure createException(String cause, String code, 
														  String desc, String expDesc) {
		GetMemberNetworkInfoFailure sfExp = new GetMemberNetworkInfoFailure("Reason: "+ expDesc);
		GetMemberNetworkInfoFaultElementDocument elementDoc = GetMemberNetworkInfoFaultElementDocument.Factory.newInstance();
		GetMemberNetworkInfoFaultElement faultElement = elementDoc.addNewGetMemberNetworkInfoFaultElement();
		faultElement.setCause(cause);
		faultElement.setCode(code);
		faultElement.setDescription(desc);
		sfExp.setFaultMessage(elementDoc);
		return sfExp;
	}
}
