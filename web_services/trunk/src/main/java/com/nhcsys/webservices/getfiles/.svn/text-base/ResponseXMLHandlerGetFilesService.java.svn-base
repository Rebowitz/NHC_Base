package com.nhcsys.webservices.getfiles;

import java.io.File;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesRequestElementDocument;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument;
 
public class ResponseXMLHandlerGetFilesService implements GetFilesServiceSkeletonInterface {
	
		public GetFilesResponseElementDocument GetFiles(GetFilesRequestElementDocument getFilesRequestElement) 
	    throws GetFilesFailure {
			try {
				
				String strXMLFileName = WebServicesConfig.getConfiguration().getString(
						 Constants.GETFILES_GETFILES_RESPONSE_XMLFILE);
				String strXMLFileFolder = 
					     WebServicesConfig.getConfiguration().getString(
					    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);
				

				File xmlFile = new File(strXMLFileFolder + "/"
						+ strXMLFileName);
				return ((GetFilesResponseElementDocument) GetFilesResponseElementDocument.Factory.parse(xmlFile));
				
			} catch (Exception e) {
				throw new GetFilesFailure("XML Exception happened", e);
			}
			}

}