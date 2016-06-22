/**
 * 
 */
package com.nhcsys.test.webservices.axis2.GetManifestService;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import org.apache.commons.codec.binary.Base64;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetManifestService.GetManifestServiceStub.GetManifestInputElement;
import com.nhcsys.test.webservices.axis2.GetManifestService.GetManifestServiceStub.GetManifestResponseElement;
/**
 * @author tim.rea
 *
 */
public class GetManifestServiceTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public GetManifestServiceTest(String arg0)
    {
        super(arg0); //, getConfig().getString(TestConstants.AGENT_SERVER_URL));
    }

    protected void setUp() throws Exception
    {
        super.setUp();
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
    }


    public void testGetManifest()
    {
    	try 
    	{
            log.debug("Entering testGetManifest()");
            
        	GetManifestInputElement getManifestInputElement = new GetManifestInputElement();

        	getManifestInputElement.setSessionID(getSessionID());
        	//getManifestInputElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
        	getManifestInputElement.setMake("myMake");
        	getManifestInputElement.setModel("mymodel");
        	String url = getConfig().getString(
        			TestConstants.TEST_GETMANIFEST_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	GetManifestServiceStub stub = new GetManifestServiceStub(url);
        	GetManifestResponseElement resp = stub.GetManifest(getManifestInputElement);
        	assertTrue(resp != null);
            
            log.debug("Response : " + resp.toString());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
            resp.getManifestResponse().writeTo(bos);
            byte[] rawBytes = bos.toByteArray();
            byte[] decodedBytes = Base64.decodeBase64(rawBytes);
            
            String outputFileName = getConfig().getString(TestConstants.TEST_GETMANIFEST_GETMANIFEST_OUTPUT_DIR) + "Manifest.xml";
            FileOutputStream fos = new FileOutputStream(outputFileName);
            fos.write(decodedBytes);
            log.debug("File Name: "+ resp.getFileName());
            log.debug("File Size: "+ resp.getFileSize());
            log.debug("Base64   : "+ resp.getMD5Hash());
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    /**
     * Test invalid Session
     *
     */
    public void testGetManifestWithInvalidSession()
    {
    	try 
    	{
            log.debug("Entering testGetManifest()");
            
        	GetManifestInputElement getManifestInputElement = new GetManifestInputElement();

        	getManifestInputElement.setSessionID(getSessionID());
        	//getManifestInputElement.setSessionID("no-session");
        	getManifestInputElement.setMake("myMake");
        	getManifestInputElement.setModel("mymodel");
        	String url = getConfig().getString(
        			TestConstants.TEST_GETMANIFEST_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	GetManifestServiceStub stub = new GetManifestServiceStub(url);
        	GetManifestResponseElement resp = stub.GetManifest(getManifestInputElement);
        	assertTrue(resp != null);
            
            log.debug("Response : " + resp.toString());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
            resp.getManifestResponse().writeTo(bos);
            byte[] rawBytes = bos.toByteArray();
            byte[] decodedBytes = Base64.decodeBase64(rawBytes);
            
            String outputFileName = getConfig().getString(TestConstants.TEST_GETMANIFEST_GETMANIFEST_OUTPUT_DIR) + "Manifest.xml";
            FileOutputStream fos = new FileOutputStream(outputFileName);
            fos.write(decodedBytes);
            log.debug("File Name: "+ resp.getFileName());
            log.debug("File Size: "+ resp.getFileSize());
            log.debug("Base64   : "+ resp.getMD5Hash());
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    /**
     * Test Null Make 
     *
     */
    public void testGetManifestWithNullMake()
    {
    	try 
    	{
            log.debug("Entering testGetManifest()");
            
        	GetManifestInputElement getManifestInputElement = new GetManifestInputElement();

        	
        	getManifestInputElement.setMake(null);
        	getManifestInputElement.setSessionID(getSessionID());
        	getManifestInputElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
        	getManifestInputElement.setModel("mymodel");
        	String url = getConfig().getString(
        			TestConstants.TEST_GETMANIFEST_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	GetManifestServiceStub stub = new GetManifestServiceStub(url);
        	GetManifestResponseElement resp = stub.GetManifest(getManifestInputElement);
        	assertTrue(resp != null);
            
            log.debug("Response : " + resp.toString());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
            resp.getManifestResponse().writeTo(bos);
            byte[] rawBytes = bos.toByteArray();
            byte[] decodedBytes = Base64.decodeBase64(rawBytes);
            
            String outputFileName = getConfig().getString(TestConstants.TEST_GETMANIFEST_GETMANIFEST_OUTPUT_DIR) + "Manifest.xml";
            FileOutputStream fos = new FileOutputStream(outputFileName);
            fos.write(decodedBytes);
            log.debug("File Name: "+ resp.getFileName());
            log.debug("File Size: "+ resp.getFileSize());
            log.debug("Base64   : "+ resp.getMD5Hash());
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    /**
     * Test Null Make 
     *
     */
    public void testGetManifestWithNullModel()
    {
    	try 
    	{
            log.debug("Entering testGetManifest()");
            
        	GetManifestInputElement getManifestInputElement = new GetManifestInputElement();

        	
        	getManifestInputElement.setMake("mymake");
        	getManifestInputElement.setModel(null);
        	getManifestInputElement.setSessionID(getSessionID());
        	getManifestInputElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
        	String url = getConfig().getString(
        			TestConstants.TEST_GETMANIFEST_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	GetManifestServiceStub stub = new GetManifestServiceStub(url);
        	GetManifestResponseElement resp = stub.GetManifest(getManifestInputElement);
        	assertTrue(resp != null);
            
            log.debug("Response : " + resp.toString());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();                      
            resp.getManifestResponse().writeTo(bos);
            byte[] rawBytes = bos.toByteArray();
            byte[] decodedBytes = Base64.decodeBase64(rawBytes);
            
            String outputFileName = getConfig().getString(TestConstants.TEST_GETMANIFEST_GETMANIFEST_OUTPUT_DIR) + "Manifest.xml";
            FileOutputStream fos = new FileOutputStream(outputFileName);
            fos.write(decodedBytes);
            log.debug("File Name: "+ resp.getFileName());
            log.debug("File Size: "+ resp.getFileSize());
            log.debug("Base64   : "+ resp.getMD5Hash());
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
}
