/**
 * 
 */
package com.nhcsys.test.webservices.axis2.GetMemberNetworkInfoService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.w3c.dom.Document;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetMemberNetworkInfoService.GetMemberNetworkInfoServiceStub.GetMemberNetworkInfoElement;
import com.nhcsys.test.webservices.axis2.GetMemberNetworkInfoService.GetMemberNetworkInfoServiceStub.GetMemberNetworkInputElement;
import com.nhcsys.test.webservices.axis2.GetMemberNetworkInfoService.GetMemberNetworkInfoServiceStub.WirelessNetworkInfoType;

/**
 * @author tim.rea
 *
 */
public class GetMemberNetworkInfoServiceTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public GetMemberNetworkInfoServiceTest(String arg0)
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
    		String url = getConfig().getString(TestConstants.TEST_GETMEMBERNETWORKINFO_SERVICE_ENDPOINT);
            GetMemberNetworkInputElement getMemberNetworkInputElement = new GetMemberNetworkInputElement();    		
    		getMemberNetworkInputElement.setSessionID(getSessionID());
        	log.debug("url = " + url); 
            GetMemberNetworkInfoServiceStub stub = new GetMemberNetworkInfoServiceStub(url);
			GetMemberNetworkInfoElement resp = stub.GetMemberNetworkInfo(getMemberNetworkInputElement);
            assertTrue(resp != null);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		t.printStackTrace();
    	}
    	
    }
    
}
