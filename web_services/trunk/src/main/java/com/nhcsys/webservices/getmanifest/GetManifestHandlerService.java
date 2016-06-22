package com.nhcsys.webservices.getmanifest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import com.nhcsys.common.CheckSumUtil;
import com.nhcsys.common.Constants;
import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.common.exception.CheckSumException;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument;
import com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.FaultTypeElementDocument.FaultTypeElement;

public class GetManifestHandlerService implements
        GetManifestServiceSkeletonInterface
{
    private static final Logger log = 
        Logger.getLogger(GetManifestHandlerService.class);
    private static final String CLASS = GetManifestHandlerService.class.getName();

    public GetManifestResponseElementDocument GetManifest(
            GetManifestInputElementDocument getManifestInputElement)
            throws GetManifestFailure
    {
        log.debug("Entering GetManifest()");
        System.out.println("Entering GetManifest()");
		String methodName = CLASS+"::GetManifest() -- ";
		
        GetManifestResponseElementDocument responseDoc = null;
        
        try
        {
            log.debug("Input XML: " + getManifestInputElement.toString());
            String sessID = getManifestInputElement.getGetManifestInputElement().getSessionID();
            
			try {
				//Let's validate the SessionId
				 SessionHelper.validateSession(sessID);
				log.debug(methodName + "successfully validated sessionId: " + sessID);
			} catch (SessionException ex) {
				log.error(methodName + "Problems validating session id"+ sessID, ex);
				
				throw createException(ex.getMessage(),
									  ex.getFaultCode(),
									  ex.getFaultDescription(),
									  ex.getFaultCause());
			} catch (Throwable t) {
				log.error(methodName + "Problems validating session id"+ sessID, t);
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
				throw createException(t.getMessage(),
						  myEnum.getCode(),
						  myEnum.getDescription(),
						  t.getMessage());
			}
            
            String make = getManifestInputElement.getGetManifestInputElement().getMake();
            String model = getManifestInputElement.getGetManifestInputElement().getModel();
            log.debug("Make : " + make);
            log.debug("Model : " + model);
            
            responseDoc =
                GetManifestResponseElementDocument.Factory.newInstance();
            GetManifestResponseElementDocument.GetManifestResponseElement respElem =
                responseDoc.addNewGetManifestResponseElement();

            String manifestPath = getManifestFilePath();
            FileInputStream fis = null;
            File file = null;
            try {
            	fis = new FileInputStream(manifestPath);
            	file = new File(manifestPath);
            } catch (FileNotFoundException ex) {
            	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_FILE_NAME;
            	throw createException(ex.getMessage(),
									  myEnum.getCode(),
									  myEnum.getDescription(manifestPath),
									  ex.getMessage());
            }
            
            int size = 0;
            byte[] fileBytes = null;
            byte[] encodedBytes =null;
            String checkSum = null;
            
            try {
	            size = fis.available();
	            fileBytes = new byte[size];
	            fis.read(fileBytes);
	            
	            checkSum = CheckSumUtil.computeMD5(fileBytes);
	            encodedBytes = Base64.encodeBase64(fileBytes);
            } catch (IOException ioEx) {
            	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
            	throw createException(ioEx.getMessage(),
						  myEnum.getCode(),
						  myEnum.getDescription(),
						  ioEx.getMessage());
            } catch (CheckSumException cEx) {
            	throw createException(cEx.getMessage(),
						  cEx.getFaultCode(),
						  cEx.getFaultDescription(),
						  cEx.getFaultCause());
            }
            
            respElem.setManifestResponse(encodedBytes);
            respElem.setMD5Hash(checkSum);
            respElem.setFileName(file.getName());
            respElem.setFileSize(new Integer(size).toString());
        
            log.debug("Returning response: " + responseDoc.toString());
            System.out.println("Returning response: " + responseDoc.toString());
            
        } catch (GetManifestFailure mf) {
        	throw mf;
        }
        catch(Throwable t)
        {
        	log.error("Caught Exception: ",t);
        	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
            throw createException(t.getMessage(),
					  myEnum.getCode(),
					  myEnum.getDescription(t.getMessage()),
					  t.getMessage());
        }
        
        return responseDoc;
    }
    
    private String getManifestFilePath()
    {
        return WebServicesConfig.getConfiguration().getString(Constants.GETMANIFEST_MANIFEST_FILEPATH);
    }
    
	/**
	 * Create Exception with appropriate Values and return it
	 */
	private GetManifestFailure createException(String exceptionMessage, Long faultCode, 
														  String faultDesc, String faultCause) {
		
		GetManifestFailure sfExp = new GetManifestFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		sfExp.setFaultMessage(elementDoc);
		log.error("Logging the Exception: " , sfExp);
		return sfExp;
	}
}