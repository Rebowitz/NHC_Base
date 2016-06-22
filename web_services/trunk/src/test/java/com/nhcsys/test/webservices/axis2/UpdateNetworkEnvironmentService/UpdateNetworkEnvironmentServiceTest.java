/**
 * 
 */
package com.nhcsys.test.webservices.axis2.UpdateNetworkEnvironmentService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.w3c.dom.Document;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.FileResponseType;
import com.nhcsys.test.webservices.axis2.UpdateNetworkEnvironmentService.UpdateNetworkEnvironmentServiceStub.UpdateNetworkEnvironmentMessageType;
import com.nhcsys.test.webservices.axis2.UpdateNetworkEnvironmentService.UpdateNetworkEnvironmentServiceStub.UpdateNetworkEnvironmentRequestElement;
import com.nhcsys.test.webservices.axis2.UpdateNetworkEnvironmentService.UpdateNetworkEnvironmentServiceStub.UpdateNetworkEnvironmentResponseElement;
import com.nhcsys.test.webservices.axis2.UpdateNetworkEnvironmentService.UpdateNetworkEnvironmentServiceStub.WirelessNetworkInfoType;
/**
 * @author tim.rea
 *
 */
public class UpdateNetworkEnvironmentServiceTest extends TestBase
{ 

    /**
     * @param arg0
     * @param url
     */
    public UpdateNetworkEnvironmentServiceTest(String arg0)
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


    public void testGetFiles()
    {
    	try 
    	{
          	String url = getConfig().getString(TestConstants.TEST_UPDATENETWORKENVIRONMENT_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateNetworkEnvironmentServiceStub stub = new UpdateNetworkEnvironmentServiceStub(url);
            UpdateNetworkEnvironmentRequestElement updateNetworkEnvironmentRequestElement = new UpdateNetworkEnvironmentRequestElement();
            
            updateNetworkEnvironmentRequestElement.setSessionID(getSessionID());
            UpdateNetworkEnvironmentMessageType param = new UpdateNetworkEnvironmentMessageType();
            param.setEnvironmentDescriptionXml("MyXML");
            param.setPassphrase("phassphrase");
            param.setSSID("SSID");
            WirelessNetworkInfoType wirlessNetworkInfotype = new WirelessNetworkInfoType("nhcsys.com", false);
			param.setWirelessNetworkInfo(wirlessNetworkInfotype);
			updateNetworkEnvironmentRequestElement.setUpdateNetworkEnvironmentMessage(param);
            
			UpdateNetworkEnvironmentResponseElement resp = stub.UpdateNetworkEnvironment(updateNetworkEnvironmentRequestElement);
        	assertTrue(resp != null);
    	}
    	catch(Throwable t) {
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
}
