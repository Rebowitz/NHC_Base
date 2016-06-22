package com.nhcsys.webservices.getmessages;


import java.io.File;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getmessages.GetMessagesServiceSkeleton.Factory;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument;

public class ResponseXMLHandlerGetMessages implements GetMessagesServiceSkeletonInterface {
	
		public SupportMessagesResponseElementDocument GetMessages(SupportMessagesRequestElementDocument supportMessagesRequestElement) throws GetMessagesFailure {
			 try {
					String strXMLFileName = WebServicesConfig.getConfiguration().getString(
							 Constants.GETMESSAGES_GETMESSAGES_RESPONSE_XMLFILE);
					String strXMLFileFolder = 
						     WebServicesConfig.getConfiguration().getString(
						    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);

					File xmlFile = new File(strXMLFileFolder + "/"
							+ strXMLFileName);
					return ((SupportMessagesResponseElementDocument) SupportMessagesResponseElementDocument.Factory.parse(xmlFile));
					
				} catch (Exception e) {
					throw new GetMessagesFailure("XML Exception happened", e);
				}
		}
}
