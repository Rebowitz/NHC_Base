package com.nhcsys.webservices.getfiles;

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
import com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.FileDescriptorListType;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.FileDescriptorType;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesRequestElementDocument;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement;

public class GetFilesHandlerService implements
        GetFilesServiceSkeletonInterface
{

    private static final Logger log = Logger
                                            .getLogger(GetFilesHandlerService.class);
    private static final String CLASS = GetFilesHandlerService.class.getName();

    public GetFilesResponseElementDocument GetFiles(
            GetFilesRequestElementDocument getFilesRequestElement)
            throws GetFilesFailure
    {
                log.debug("Entering GetFiles()");
                System.out.println("Entering GetFiles()");
                String methodName = CLASS+"::GetFiles() -- ";
                
                GetFilesResponseElementDocument responseDoc = null;
                
                try
                {
                    log.debug("Input XML: " + getFilesRequestElement.toString());
                    
                    String sessID = getFilesRequestElement.getGetFilesRequestElement().getSessionID();
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
                    
                    FileDescriptorListType fileDescList = getFilesRequestElement.getGetFilesRequestElement().getFileDescriptorList();
                    FileDescriptorType[] fileDescriptors = fileDescList.getFileDescriptorArray();
                    int numFileDesc = fileDescriptors.length;
                    
                    responseDoc =
                        GetFilesResponseElementDocument.Factory.newInstance();
                    GetFilesResponseElementDocument.GetFilesResponseElement respElem =
                        responseDoc.addNewGetFilesResponseElement();
                    
                    String filesPath = this.getFilesPath();
                    
                    for (int i = 0; i < numFileDesc; i++)
                    {
                        FileDescriptorType fileDesc = fileDescriptors[i];
                        String fileName = fileDesc.getName();
                        FileInputStream fis = null;

                        try {
                        	fis = new FileInputStream(filesPath + "/" + fileName.trim());
                        } catch (FileNotFoundException fnEx) {
                        	log.error("Caught FileNotFoundException",fnEx);
                            WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_FILE_NAME;
                        	throw createException(fnEx.getMessage(),
            									  myEnum.getCode(),
            									  myEnum.getDescription(fileName),
            									  fnEx.getMessage());                        	
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
                        
                        FileResponseType fileResp = respElem.addNewFileResponse();
                        fileResp.setFileBinary(encodedBytes);
                        fileResp.setFileName(fileName.trim());
                        fileResp.setFileSize(Integer.toString(size));
                        fileResp.setMD5Hash(checkSum);
                        
                    }//end of for loop
                                    
                    //log.debug("Returning response: " + responseDoc.toString());
                   // System.out.println("Returning response: " + responseDoc.toString());
                }
                catch (GetFilesFailure failure) {
                	throw failure;
                }
                catch(Throwable t)
                {
                    log.error("Caught Throwable", t);
		        	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
		            throw createException(t.getMessage(),
										  myEnum.getCode(),
										  myEnum.getDescription(t.getMessage()),
										  t.getMessage());
                }
                
                return responseDoc;
    }    

    private String getFilesPath()
    {
            return WebServicesConfig.getConfiguration().getString(Constants.GETFILES_FILES_DIR);
    }
	/**
	 * Create Exception with appropriate Values and return it
	 */
	private GetFilesFailure createException(String exceptionMessage, Long faultCode, 
														  String faultDesc, String faultCause) {
		
		GetFilesFailure sfExp = new GetFilesFailure(exceptionMessage);
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