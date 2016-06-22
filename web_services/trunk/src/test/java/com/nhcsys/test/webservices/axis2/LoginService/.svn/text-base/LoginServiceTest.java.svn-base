/**
 * 
 */
package com.nhcsys.test.webservices.axis2.LoginService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.w3c.dom.Document;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.LoginService.LoginServiceStub.GetTokenElement;
import com.nhcsys.test.webservices.axis2.LoginService.LoginServiceStub.LoginCredentialsElement;
import com.nhcsys.test.webservices.axis2.LoginService.LoginServiceStub.LoginResponseElement;

/**
 * @author tim.rea
 *
 */
public class LoginServiceTest extends TestBase
{  
    /**
     * @param arg0
     * @param url
     */
    public LoginServiceTest(String arg0)
    {
        super(arg0); //, getConfig().getString(TestConstants.AGENT_SERVER_URL));
    }

    protected void setUp() throws Exception
    {
    //super.setUp();
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
    } 
  
    public void testGetTokenNastiClient() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber("NASTCPU");
			getTokenElement.setAppName( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp != null);
        	assertTrue(resp.getSessionID()!= null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
        	setToken(resp.getToken());
        	setViveID(resp.getViveID());
        	setSessionID(resp.getSessionID());
    	}  	catch (Exception e) {
    			log.debug("Exception caught : " + e.getMessage());
    		e.printStackTrace();
    	}
    	log.debug("*******GetToken is test ends here*************");
    }
    public void testGetTokenAppNameNull() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber(
					 getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_CPUNUMBER));
			getTokenElement.setAppName("");
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp == null);
        	assertTrue(resp.getSessionID()== null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
        	setToken(resp.getToken());
        	setViveID(resp.getViveID());
        	setSessionID(resp.getSessionID());
    	}  	catch (Exception e) {
    			log.debug("Exception caught : " + e.getMessage());
    		//e.printStackTrace();
    	}
    	log.debug("*******GetToken is test ends here*************");
    }
    public void testGetTokenCPUNumberNull() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber("");
			getTokenElement.setAppName( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp == null);
        	assertTrue(resp.getSessionID()== null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
    	}  	catch (Exception e) {
    		System.out.println("The error message: "+ e.getMessage());
    		System.out.println("The cause:"+e.getCause());
    		System.out.println("Localized message:"+e.getLocalizedMessage());
    			log.debug("Exception caught : " + e.getMessage());
    	}
    	log.debug("*******GetToken is test ends here*************");
    }
    public void testGetTokenPasswordNull() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword("");
			
			getTokenElement.setCpuSerialNumber(
					 getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_CPUNUMBER));
			getTokenElement.setAppName( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp == null);
        	assertTrue(resp.getSessionID()== null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
    	}  	catch (Exception e) {
    		System.out.println("The error message: "+ e.getMessage());
    		System.out.println("The cause:"+e.getCause());
    		System.out.println("Localized message:"+e.getLocalizedMessage());
    			log.debug("Exception caught : " + e.getMessage());
    	}
    	log.debug("*******GetToken is test ends here*************");
    } 
    
    public void testGetTokenUserIDNull() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( "");
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber(
					 getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_CPUNUMBER));
			getTokenElement.setAppName( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp == null);
        	assertTrue(resp.getSessionID()== null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
    	}  	catch (Exception e) {
    		System.out.println("The error message: "+ e.getMessage());
    		System.out.println("The cause:"+e.getCause());
    		System.out.println("Localized message:"+e.getLocalizedMessage());
    			log.debug("Exception caught : " + e.getMessage());
    	}
    	log.debug("*******GetToken is test ends here*************");
    }
  
  


    public void testGetToken() throws Exception
    {
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
		try {
    		log.debug("*******GetToken is being tested*************");
   			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber(
					 getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_CPUNUMBER));
			getTokenElement.setAppName( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			assertTrue(resp != null);
        	assertTrue(resp.getSessionID()!= null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
        	setToken(resp.getToken());
        	setViveID(resp.getViveID());
        	setSessionID(resp.getSessionID());
    	}  	catch (Exception e) {
    			log.debug("Exception caught : " + e.getMessage());
    		e.printStackTrace();
    	}
    	log.debug("*******GetToken is test ends here*************");
    }
    
         public void testLoginAuthenticate() throws Exception
    {   
    	
    	log.debug("*******testLoginAuthenticate is being tested*************");
    	if (getToken()==null) {
    		log.debug("**************As token is null, getToken() has to be called******");
    	    testGetToken();
        }
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
	
		LoginCredentialsElement loginCredentialsElement = new LoginCredentialsElement();
		loginCredentialsElement.setToken(getToken());
		loginCredentialsElement.setViveID(getViveID());
		loginCredentialsElement.setAppName(  getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
		 LoginResponseElement resp = stub.LoginAuthenticate(loginCredentialsElement);
		
		assertTrue(resp != null);
    	assertTrue(resp.getSessionID()!= null);
    	log.debug("The End Point Reference for LoginAuthenticate operation on Login Service: "+url);
    	log.debug("The Received Token from Login Service:"+resp.getToken());
    	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
    	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
    	setToken(resp.getToken());
    	setViveID(resp.getViveID());
    	setSessionID(resp.getSessionID());
    	log.debug("*******testLoginAuthenticate test ends here************");
    	
    }
    
    
//    public static Test suite()
//    { // TODO log.debug("suite() called");
//        // log.debug("suite() called : " + Thread.currentThread());
//        TestSuite suite = new TestSuite();
//
//        //suite.addTest(new LoginServiceTest("testUserIDAuthenticate"));
//
//        return suite;
//    }
//
//    public static void main(String args[])
//    { // TODO
//        log.debug("main() called");
//        log.debug("main() called");
//        TestRunner.run(suite());
//    }
    
    
}
