/**
 * 
 */
package com.nhcsys.test.webservices.axis2.GetFilesService;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import org.apache.commons.codec.binary.Base64;

import com.nhcsys.common.CheckSumUtil;
import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.FileDescriptorListType;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.FileDescriptorType;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.FileResponseType;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.GetFilesRequestElement;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.GetFilesResponseElement;
/**
 * @author tim.rea
 *
 */
public class GetFilesServiceTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public GetFilesServiceTest(String arg0)
    {
        super(arg0); 
    }

    protected void setUp() throws Exception
    {
        super.setUp();
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
    }


    public void testGetFiles()
    {
    	try 
    	{
            String outputDir = getConfig().getString(TestConstants.TEST_GETFILES_GETFILES_OUTPUT_DIR);
            assertTrue(outputDir != null);
            
            FileDescriptorListType fdList = new FileDescriptorListType();
            FileDescriptorType fd = new FileDescriptorType();
            fd.setName("KcsSetup.exe");
            //fd.setName("LicenseAgreement.rtf");
            fd.setVersion("Future-1.0");
            fdList.addFileDescriptor(fd);
            fd = new FileDescriptorType();
            fd.setName("   test.pptx");
            fd.setVersion("Version 1.0");
            fdList.addFileDescriptor(fd);

            GetFilesRequestElement getFilesRequestElement = new GetFilesRequestElement();
            //getFilesRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
            getFilesRequestElement.setSessionID(getSessionID());
            getFilesRequestElement.setFileDescriptorList(fdList);

        	String url = getConfig().getString(TestConstants.TEST_GETFILES_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            
            GetFilesServiceStub stub = new GetFilesServiceStub(url);      
            
            GetFilesResponseElement resp = stub.GetFiles(getFilesRequestElement);
        	assertTrue(resp != null);
            log.debug("XML Resp : " + resp.toString());
            
            FileResponseType[] files = resp.getFileResponse();
            assertTrue(files != null);
            assertTrue(files.length > 0);
            
            int numFiles = files.length;
            for (int i = 0; i < numFiles; i++)
            {
                FileResponseType file = files[i];
                log.debug("Got file : " + i);
                
                String fileName = file.getFileName();
                String fileSizeStr = file.getFileSize();
                long fileSize = Long.parseLong(fileSizeStr);
                String md5 = file.getMD5Hash();
                log.debug("fileName : " + fileName);
                log.debug("fileSize : " + fileSize);
                log.debug("md5 : " + md5);
                assertTrue(fileName != null);
                assertTrue(fileSize != 0);
                assertTrue(md5 != null);
                
                ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
                file.getFileBinary().writeTo(bos);
                byte[] rawBytes = bos.toByteArray();
                assertTrue(rawBytes != null);
                assertTrue(rawBytes.length > 0);
                
                byte[] decodedBytes = Base64.decodeBase64(rawBytes);
                assertTrue(decodedBytes != null);
                assertTrue(decodedBytes.length > 0);
                
                String actualMd5 = CheckSumUtil.computeMD5(decodedBytes);
                assertTrue(actualMd5 != null);
                assertTrue(actualMd5.length() > 0);
                log.debug("actualMd5 : " + actualMd5);
                
                assertTrue(actualMd5.equals(md5));
                assertTrue(fileSize == decodedBytes.length);
                
                String outputFileName = outputDir + fileName;
                FileOutputStream fos = new FileOutputStream(outputFileName);
                fos.write(decodedBytes);
                
            }
            
    	}
        catch (GetFilesFailure ex)
        {
            log.error("GetFilesFailure Exception caught : ", ex);
            ex.printStackTrace();            
        }
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    public void testNullElementGetFiles()
    {
    	try 
    	{
            String outputDir = getConfig().getString(TestConstants.TEST_GETFILES_GETFILES_OUTPUT_DIR);
            assertTrue(outputDir != null);
            
            FileDescriptorListType fdList = new FileDescriptorListType();
            FileDescriptorType fd = new FileDescriptorType();
            fd.setName("KcsSetup.exe");
            fd.setVersion("Future-1.0");
            fdList.addFileDescriptor(fd);

            GetFilesRequestElement getFilesRequestElement = new GetFilesRequestElement();
            getFilesRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
            getFilesRequestElement.setFileDescriptorList(null);

        	String url = getConfig().getString(TestConstants.TEST_GETFILES_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            
            GetFilesServiceStub stub = new GetFilesServiceStub(url);      
            
            GetFilesResponseElement resp = stub.GetFiles(getFilesRequestElement);
        	assertTrue(resp != null);
            
            FileResponseType[] files = resp.getFileResponse();
            assertTrue(files != null);
            assertTrue(files.length > 0);
            
            int numFiles = files.length;
            for (int i = 0; i < numFiles; i++)
            {
                FileResponseType file = files[i];
                log.debug("Got file : " + i);
                
                String fileName = file.getFileName();
                String fileSizeStr = file.getFileSize();
                long fileSize = Long.parseLong(fileSizeStr);
                String md5 = file.getMD5Hash();
                log.debug("fileName : " + fileName);
                log.debug("fileSize : " + fileSize);
                log.debug("md5 : " + md5);
                assertTrue(fileName != null);
                assertTrue(fileSize != 0);
                assertTrue(md5 != null);
                
                ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
                file.getFileBinary().writeTo(bos);
                byte[] rawBytes = bos.toByteArray();
                assertTrue(rawBytes != null);
                assertTrue(rawBytes.length > 0);
                
                byte[] decodedBytes = Base64.decodeBase64(rawBytes);
                assertTrue(decodedBytes != null);
                assertTrue(decodedBytes.length > 0);
                
                String actualMd5 = CheckSumUtil.computeMD5(decodedBytes);
                assertTrue(actualMd5 != null);
                assertTrue(actualMd5.length() > 0);
                log.debug("actualMd5 : " + actualMd5);
                
                assertTrue(actualMd5.equals(md5));
                assertTrue(fileSize == decodedBytes.length);
                
                String outputFileName = outputDir + fileName;
                FileOutputStream fos = new FileOutputStream(outputFileName);
                fos.write(decodedBytes);
                
            }
            
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    public void testGetFilesWithWrongSessionId()
    {
    	try 
    	{
            String outputDir = getConfig().getString(TestConstants.TEST_GETFILES_GETFILES_OUTPUT_DIR);
            assertTrue(outputDir != null);
            
            FileDescriptorListType fdList = new FileDescriptorListType();
            FileDescriptorType fd = new FileDescriptorType();
            fd.setName("KcsSetup.exe");
            fd.setVersion("Future-1.0");
            fdList.addFileDescriptor(fd);

            GetFilesRequestElement getFilesRequestElement = new GetFilesRequestElement();
            getFilesRequestElement.setSessionID("no-session");
            getFilesRequestElement.setFileDescriptorList(fdList);

        	String url = getConfig().getString(TestConstants.TEST_GETFILES_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            
            GetFilesServiceStub stub = new GetFilesServiceStub(url);      
            
            GetFilesResponseElement resp = stub.GetFiles(getFilesRequestElement);
        	assertTrue(resp != null);
            
            FileResponseType[] files = resp.getFileResponse();
            assertTrue(files != null);
            assertTrue(files.length > 0);
            
            int numFiles = files.length;
            for (int i = 0; i < numFiles; i++)
            {
                FileResponseType file = files[i];
                log.debug("Got file : " + i);
                
                String fileName = file.getFileName();
                String fileSizeStr = file.getFileSize();
                long fileSize = Long.parseLong(fileSizeStr);
                String md5 = file.getMD5Hash();
                log.debug("fileName : " + fileName);
                log.debug("fileSize : " + fileSize);
                log.debug("md5 : " + md5);
                assertTrue(fileName != null);
                assertTrue(fileSize != 0);
                assertTrue(md5 != null);
                
                ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
                file.getFileBinary().writeTo(bos);
                byte[] rawBytes = bos.toByteArray();
                assertTrue(rawBytes != null);
                assertTrue(rawBytes.length > 0);
                
                byte[] decodedBytes = Base64.decodeBase64(rawBytes);
                assertTrue(decodedBytes != null);
                assertTrue(decodedBytes.length > 0);
                
                String actualMd5 = CheckSumUtil.computeMD5(decodedBytes);
                assertTrue(actualMd5 != null);
                assertTrue(actualMd5.length() > 0);
                log.debug("actualMd5 : " + actualMd5);
                
                assertTrue(actualMd5.equals(md5));
                assertTrue(fileSize == decodedBytes.length);
                
                String outputFileName = outputDir + fileName;
                FileOutputStream fos = new FileOutputStream(outputFileName);
                fos.write(decodedBytes);
                
            }
            
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
}
