/**
 * 
 */
package com.nhcsys.test.common;


import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import junit.framework.TestCase;
import org.apache.commons.configuration.Configuration;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import com.nhcsys.test.webservices.axis2.LoginService.LoginServiceStub;
import com.nhcsys.test.webservices.axis2.LoginService.LoginServiceStub.*;

/**
 * @author robert.andrews
 */
public class TestBase extends TestCase
{
    protected static final Logger log = Logger.getLogger(TestBase.class);

    private String userID;
    
    private String password;
    
    private String cpuSerialNumber;
    
    private String token;
    
    private String viveID;
    
    private String sessionID;
    
    private static WebServicesTestConfig config;

    static 
    {
    	config = new WebServicesTestConfig();
    }
    
    public TestBase(String arg0, String url)
    {
        super(arg0);
       
        log.debug("TestBase(arg0, url) called");
        log.debug("arg0 : " + arg0);
        log.debug("url  : " + url);
    }   
    
    protected void setUp() throws Exception{ 
    	String url = getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_ENDPOINT);
    	LoginServiceStub stub = new LoginServiceStub(url);
		LoginResponseElement resp =null;
    	
    	try {
    		log.debug("***********Step1: Authorizing the Client");
    		if (token ==null) {
    			log.debug("Client verified Token and Token is null. Hence GetToken is being called..");
			GetTokenElement getTokenElement= new GetTokenElement();
			getTokenElement.setUserID( getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERID));
			getTokenElement.setPassword(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_USERPASSWORD));
			getTokenElement.setCpuSerialNumber(
					 getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_CPUNUMBER));
			getTokenElement.setAppName(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.GetToken(getTokenElement);
			
			assertTrue(resp != null);
        	assertTrue(resp.getSessionID()!= null);
        	log.debug("The End Point Reference for GetToken operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
        	setToken(resp.getToken());
        	setViveID(resp.getViveID());
        	System.out.println("The sessionID:"+resp.getSessionID());
        	setSessionID(resp.getSessionID());
        	System.out.println("The sessionid after setting:"+getSessionID());
    		} /*
    		LoginCredentialsElement loginCredentialsElement= new LoginCredentialsElement();
    		loginCredentialsElement.setToken(getToken());
    		loginCredentialsElement.setViveID(getViveID());
    		loginCredentialsElement.setAppName(getConfig().getString(TestConstants.TEST_LOGIN_SERVICE_APPNAME));
			resp = stub.LoginAuthenticate(loginCredentialsElement);
			
			assertTrue(resp != null);
        	assertTrue(resp.getSessionID()!= null);
        	log.debug("The End Point Reference for LoginAuthenticate operation on Login Service: "+url);
        	log.debug("The Received Token from Login Service:"+resp.getToken());
        	log.debug("The Received SessionID from Login Service:"+resp.getSessionID());
        	log.debug("The Received ViveID from Login Service:"+resp.getViveID());
        	setToken(resp.getToken());
        	setViveID(resp.getViveID());
        	setSessionID(resp.getSessionID());*/
    	}  	catch (Exception e) {
    			log.debug("Exception caught : " + e.getMessage());
    		e.printStackTrace();
    	}
    }
    
    public TestBase(String arg0)
    {
        super(arg0);
       
        log.debug("TestBase(arg0, url) called");
        log.debug("arg0 : " + arg0);
        //log.debug("url  : " + url);
    }    
    
    
  
    /**
     * @return Returns the cpuSerialNumber.
     * @uml.property name="cpuSerialNumber"
     */
    protected String getCpuSerialNumber()
    {
        return cpuSerialNumber;
    }

    /**
     * @param cpuSerialNo
     *            The cpuSerialNumber to set.
     * @uml.property name="cpuSerialNumber"
     */
    protected void setCpuSerialNumber(String cpuSerialNo)
    {
        this.cpuSerialNumber = cpuSerialNo;
    }

    /**
     * @return Returns the sessionID.
     * @uml.property name="sessionID"
     */
    protected String getSessionID()
    {
        return sessionID;
    }

    /**
     * @param sessionID
     *            The sessionID to set.
     * @uml.property name="sessionID"
     */
    protected void setSessionID(String sessID)
    {
        this.sessionID = sessID;
    }
    
    protected void setToken(String Token) {
    	this.token=Token;
    }
    
    public String getToken() {
         return this.token;
    }
     
    
   /**
     * @return Returns the config.
     * @uml.property name="config"
     */
     
    public Configuration getConfig()
    {
        return config.getConfiguration();
    }

public String getViveID() {
	return viveID;
}

public void setViveID(String viveID) {
	this.viveID = viveID;
}

}
