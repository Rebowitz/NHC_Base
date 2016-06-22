/**
 * 
 */
package com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.StoreInstalledSoftwareListType;
import com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.StoreInstalledSoftwareRequestElement;
import com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.StoreInstalledSoftwareResponseElement;
import com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.StoreInstalledSoftwareType;

/*
 * @author tim.rea
 *
 */
public class StoreInstalledSoftwareServiceTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public StoreInstalledSoftwareServiceTest(String arg0)
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

    public void testBadProductKeyData()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID(getSessionID());
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("Hewlett-Packard Company");
			installedSoftwareType[0].setProductKey("3FFB3B34-D639-4384-9AE9-DDE58430D86F");
			installedSoftwareType[0].setProductName("HP Backup &amp; Recovery Manager Installert");
			installedSoftwareType[0].setProductVersion("4.0.14");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
/*    public void testGoodData()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("Beautiful Flower company");
			installedSoftwareType[0].setProductKey("ViveProductKey");
			installedSoftwareType[0].setProductName("Vive Product");
			installedSoftwareType[0].setProductVersion("Vive001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * This method tests the scenario where the SIS Element is null
     *
     *//*
    public void testNullSISElement()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = null;
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * This method tests the scenario of empty List
     *
     *//*
    public void testSISEmptyList()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * This method tests the scenario of Wrong Session Id
     *
    *//* 
    public void testSISWrongSessionId()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a-nosession");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("Company 1");
			installedSoftwareType[0].setProductKey("ViveProductKey 1");
			installedSoftwareType[0].setProductName("Vive Product 1");
			installedSoftwareType[0].setProductVersion("Vive 001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * This method tests the scenario of more then one software
     *//*
     
    public void testSISMoreThanOneSoftware()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[3];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("Company 2");
			installedSoftwareType[0].setProductKey("ViveProductKey 2");
			installedSoftwareType[0].setProductName("Vive Product 2");
			installedSoftwareType[0].setProductVersion("Vive002");
			installedSoftwareType[1]= new StoreInstalledSoftwareType();
			installedSoftwareType[1].setCompanyName("Company 3");
			installedSoftwareType[1].setProductKey("ViveProductKey 3");
			installedSoftwareType[1].setProductName("Vive Product 3");
			installedSoftwareType[1].setProductVersion("Vive003");
			installedSoftwareType[2]= new StoreInstalledSoftwareType();
			installedSoftwareType[2].setCompanyName("Company 4");
			installedSoftwareType[2].setProductKey("ViveProductKey 4");
			installedSoftwareType[2].setProductName("Vive Product 4");
			installedSoftwareType[2].setProductVersion("Vive004");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Empty session Id validation
     *
     *//*
    public void testSISEmptySessionId()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID(" ");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[3];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("Beautiful Flower company");
			installedSoftwareType[0].setProductKey("ViveProductKey");
			installedSoftwareType[0].setProductName("Vive Product");
			installedSoftwareType[0].setProductVersion("Vive005");
			installedSoftwareType[1]= new StoreInstalledSoftwareType();
			installedSoftwareType[1].setCompanyName("Beautiful Flower company");
			installedSoftwareType[1].setProductKey("ViveProductKey");
			installedSoftwareType[1].setProductName("Vive Product");
			installedSoftwareType[1].setProductVersion("Vive005");
			installedSoftwareType[2]= new StoreInstalledSoftwareType();
			installedSoftwareType[2].setCompanyName("Beautiful Flower company");
			installedSoftwareType[2].setProductKey("ViveProductKey");
			installedSoftwareType[2].setProductName("Vive Product");
			installedSoftwareType[2].setProductVersion("Vive005");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Null Company Name
     *//*
    public void testSISNullCompanyName()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName(null);
			installedSoftwareType[0].setProductKey("ViveProductKey");
			installedSoftwareType[0].setProductName("Vive Product");
			installedSoftwareType[0].setProductVersion("Vive001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Null Product Name
     *//*
    public void testSISNullProductName()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("null product name");
			installedSoftwareType[0].setProductKey("ViveProductKey");
			installedSoftwareType[0].setProductName(null);
			installedSoftwareType[0].setProductVersion("Vive001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Null Product Key 
     *//*
    public void testSISNullProductKey()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("null product key");
			installedSoftwareType[0].setProductKey(null);
			installedSoftwareType[0].setProductName("Vive Product");
			installedSoftwareType[0].setProductVersion("Vive001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * Null Company Name
     *//*
    public void testSISNullProductVersion()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("null product version");
			installedSoftwareType[0].setProductKey("ViveProductKey");
			installedSoftwareType[0].setProductName("Vive Product");
			installedSoftwareType[0].setProductVersion("Vive001");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * Empty Company Name
     */
    public void testSISEmptyCompanyName()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName(" ");
			installedSoftwareType[0].setProductKey("ViveProductKey 7");
			installedSoftwareType[0].setProductName("Vive Product 7");
			installedSoftwareType[0].setProductVersion("Vive001 7");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    /**
     * Empty Product Name
     *//*
    public void testSISEmptyProductName()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("empty product Name");
			installedSoftwareType[0].setProductKey("ViveProductKey 7");
			installedSoftwareType[0].setProductName("   ");
			installedSoftwareType[0].setProductVersion("Vive001 7");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Empty Product Key
     *//*
    public void testSISEmptyProductKey()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("empty product Key");
			installedSoftwareType[0].setProductKey("   ");
			installedSoftwareType[0].setProductName("Product Name 8");
			installedSoftwareType[0].setProductVersion("Vive001 8");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    *//**
     * Empty Product Name
     *//*
    public void testSISEmptyProductVersion()
    {
    	try 
    	{
        	String url = getConfig().getString(TestConstants.TEST_STOREINSTALLEDSOFTWARE_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	StoreInstalledSoftwareServiceStub stub = new StoreInstalledSoftwareServiceStub(url);
			StoreInstalledSoftwareRequestElement storeInstalledSoftwareRequestElement = new StoreInstalledSoftwareRequestElement();
			storeInstalledSoftwareRequestElement.setSessionID("7e6d4dcf-3da7-47f1-b38f-3e749bd2524a");
			StoreInstalledSoftwareListType param = new StoreInstalledSoftwareListType();
			StoreInstalledSoftwareType[] installedSoftwareType = new StoreInstalledSoftwareType[1];
			installedSoftwareType[0]= new StoreInstalledSoftwareType();
			installedSoftwareType[0].setCompanyName("empty product version");
			installedSoftwareType[0].setProductKey("ViveProductKey 9");
			installedSoftwareType[0].setProductName("Product name   9");
			installedSoftwareType[0].setProductVersion("     ");
			param.setStoreInstalledSoftwareElement(installedSoftwareType);
			storeInstalledSoftwareRequestElement.setStoreInstalledSoftwareListElement(param);
			
			
			StoreInstalledSoftwareResponseElement resp = stub.StoreInstalledSoftware(storeInstalledSoftwareRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }*/
}
	