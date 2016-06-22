/**
 * 
 */
package com.nhcsys.test.webservices.axis2.GetOrderInfoService;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.w3c.dom.Document;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetFilesService.GetFilesServiceStub.*;
import com.nhcsys.test.webservices.axis2.GetOrderInfoService.GetOrderInfoServiceStub.GetOrderInfoRequestElement;
import com.nhcsys.test.webservices.axis2.GetOrderInfoService.GetOrderInfoServiceStub.GetOrderInfoResponseElement;
import com.nhcsys.test.webservices.axis2.GetOrderInfoService.GetOrderInfoServiceStub.ProductListType;

/**
 * @author tim.rea
 *
 */
public class GetOrderInfoServiceTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public GetOrderInfoServiceTest(String arg0)
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
    
    public void testGetFilesinvalidSession()
    {
    	GetOrderInfoResponseElement resp=null;
    	try 
    	{ 
        	String url = getConfig().getString(TestConstants.TEST_GETORDERINFO_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	
                GetOrderInfoServiceStub stub = new GetOrderInfoServiceStub(url);
	        GetOrderInfoRequestElement getOrderInfoRequestElement = 
	        	new GetOrderInfoRequestElement();
	        getOrderInfoRequestElement.setSessionID(getSessionID()+"test");
	        stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(3*60*1000);
			resp = stub.GetOrderInfo(getOrderInfoRequestElement);
    	}
    	catch(Throwable t)
    	{   assertTrue(resp==null);
           // log.error("Exception caught : ", t);
    	}
    }
    
    public void testGetFilesforNoRecords()
    {
    	try 
    	{ 
        	String url = getConfig().getString(TestConstants.TEST_GETORDERINFO_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
        	
                GetOrderInfoServiceStub stub = new GetOrderInfoServiceStub(url);
	        GetOrderInfoRequestElement getOrderInfoRequestElement = 
	        	new GetOrderInfoRequestElement();
	        getOrderInfoRequestElement.setSessionID(getSessionID());
	        stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(3*60*1000);
			GetOrderInfoResponseElement resp = stub.GetOrderInfo(getOrderInfoRequestElement);
        	assertTrue(resp != null);
        	if (resp!=null) {
        		ProductListType[] plist = resp.getProductList();
        		if (plist!=null) {
        			for (int i=0; i<plist.length; i++) {
        				log.debug("*****************************************************");
        				log.debug("The product ID:"+plist[i].getProductID());
        				log.debug(("The product description:"+plist[i].getDescription()));
        				log.debug("The license key:"+plist[i].getLicenseKey());
        			}
        		}
        	}
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    	}
    }
}
    	


