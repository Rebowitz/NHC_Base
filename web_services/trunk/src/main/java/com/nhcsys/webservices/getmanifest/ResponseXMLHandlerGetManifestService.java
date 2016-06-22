package com.nhcsys.webservices.getmanifest;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
 
import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument;
 
public class ResponseXMLHandlerGetManifestService implements GetManifestServiceSkeletonInterface {
	 
	public GetManifestResponseElementDocument GetManifest(GetManifestInputElementDocument getManifestInputElement) throws  GetManifestFailure {
		try {
			String strXMLFileName = WebServicesConfig.getConfiguration().getString(
					 Constants.GETMANIFEST_GETMANIFEST_RESPONSE_XMLFILE);
			String strXMLFileFolder = 
				     WebServicesConfig.getConfiguration().getString(
				    		 Constants.WEBSERVICES_RESPONSEXML_FOLDER);

			File xmlFile = new File(strXMLFileFolder + "/"
					+ strXMLFileName);
			return ((GetManifestResponseElementDocument) GetManifestResponseElementDocument.Factory.parse(xmlFile));
			
		} catch (Exception e) {
			throw new GetManifestFailure("XML Exception happened", e);
		}
		}
}
