package com.nhcsys.webservices.updatestatus;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
 
import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;

import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument;

public class ResponseXMLHandlerUpdateStatusService implements UpdateStatusServiceSkeletonInterface {
	

	public ProcessCompletedStatusElementDocument UpdateStatus(UpdateStatusElementDocument updateStatusElement) throws UpdateStatusFailure{
		try {
	    	
    		String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.UPDATESTATUS_UPDATESTATUS_RESPONSE_XMLFILE);
    	
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
		

			File xmlFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
		
			ProcessCompletedStatusElementDocument p =  ((ProcessCompletedStatusElementDocument) ProcessCompletedStatusElementDocument.Factory.parse(xmlFile));
		
			return p;
			
		} catch (Exception e) {
			throw new UpdateStatusFailure("XML Exception happened", e);
		}
    }
}