/**
 * 
 */
package com.nhcsys.test.webservices.axis2.UpdateStatusService;

import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.ProcessCompletedStatusElement;
import com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.TaskExecutationStatusType;
import com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.UpdateStatusElement;
import com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.UpdateStatusType;


/**
 * @author tim.rea
 *
 */
public class UpdateStatusTest extends TestBase
{

    /**
     * @param arg0
     * @param url
     */
    public UpdateStatusTest(String arg0)
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


    public void testUpdateStatusWithKaseyaProductId()
    {
    	
    	try
    	{ 
            String url = getConfig().getString(TestConstants.TEST_UPDATESTATUS_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateStatusServiceStub stub = new UpdateStatusServiceStub(url);
            UpdateStatusElement updateStatusElement = new UpdateStatusElement();
            updateStatusElement.setSessionID(getSessionID());
            UpdateStatusType[] param = new UpdateStatusType[2];
            param[0] = new UpdateStatusType();
            param[0].setDescription("Description");
            param[0].setProductID("Kas");
            param[0].setReport("Report1");
            TaskExecutationStatusType statustype=TaskExecutationStatusType.Success;
            param[0].setStatus(statustype);
            param[1] = new UpdateStatusType();
			param[1].setStatus(statustype);
			param[1] = new UpdateStatusType();
            param[1].setDescription("Description");
            param[1].setProductID("Test2");
            param[1].setReport("Report2");
            statustype=TaskExecutationStatusType.Fail;
			param[1].setStatus(statustype);
			updateStatusElement.setTaskList(param);
            
			ProcessCompletedStatusElement resp = stub.UpdateStatus(updateStatusElement);

        	assertTrue(resp != null);
        	//assertTrue(resp.getProcesscompleted() != true);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		//t.printStackTrace();
    	}
    	
    }
    
    /**
     * test null element
     *
     */
    /*public void testUpdateStatusWithNullElement()
    {
    	
    	try
    	{ 
            String url = getConfig().getString(TestConstants.TEST_UPDATESTATUS_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateStatusServiceStub stub = new UpdateStatusServiceStub(url);
			ProcessCompletedStatusElement resp = stub.UpdateStatus(null);

        	assertTrue(resp != null);
        	//assertTrue(resp.getProcesscompleted() != true);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		//t.printStackTrace();
    	}
    	
    }
    *//**
     * Null productId
     *
     *//*
    public void testUpdateStatusWithNullProductId()
    {
    	
    	try
    	{ 
            String url = getConfig().getString(TestConstants.TEST_UPDATESTATUS_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateStatusServiceStub stub = new UpdateStatusServiceStub(url);
            UpdateStatusElement updateStatusElement = new UpdateStatusElement();
            updateStatusElement.setSessionID(getSessionID());
            UpdateStatusType[] param = new UpdateStatusType[1];
            param[0] = new UpdateStatusType();
            param[0].setDescription("Description");
            param[0].setProductID(null);
            param[0].setReport("Report1");
            TaskExecutationStatusType statustype=TaskExecutationStatusType.Success;
			param[0].setStatus(statustype);
			updateStatusElement.setTaskList(param);
            
			ProcessCompletedStatusElement resp = stub.UpdateStatus(updateStatusElement);

        	assertTrue(resp != null);
        	//assertTrue(resp.getProcesscompleted() != true);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		//t.printStackTrace();
    	}
    	
    }
    
    *//**
     * Null productId
     *
     *//*
    public void testUpdateStatusWithEmptyProductId()
    {
    	
    	try
    	{ 
            String url = getConfig().getString(TestConstants.TEST_UPDATESTATUS_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateStatusServiceStub stub = new UpdateStatusServiceStub(url);
            UpdateStatusElement updateStatusElement = new UpdateStatusElement();
            updateStatusElement.setSessionID(getSessionID());
            UpdateStatusType[] param = new UpdateStatusType[1];
            param[0] = new UpdateStatusType();
            param[0].setDescription("Description");
            param[0].setProductID("    ");
            param[0].setReport("Report1");
            TaskExecutationStatusType statustype=TaskExecutationStatusType.Success;
			param[0].setStatus(statustype);
			updateStatusElement.setTaskList(param);
            
			ProcessCompletedStatusElement resp = stub.UpdateStatus(updateStatusElement);

        	assertTrue(resp != null);
        	//assertTrue(resp.getProcesscompleted() != true);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		//t.printStackTrace();
    	}
    	
    }*/
    
    /**
     * Null productId
     *
     */
    public void testUpdateStatusWithMultipleProducts()
    {
    	
    	try
    	{ 
            String url = getConfig().getString(TestConstants.TEST_UPDATESTATUS_SERVICE_ENDPOINT);
        	log.debug("url = " + url);
            UpdateStatusServiceStub stub = new UpdateStatusServiceStub(url);
            UpdateStatusElement updateStatusElement = new UpdateStatusElement();
            updateStatusElement.setSessionID(getSessionID());
            UpdateStatusType[] param = new UpdateStatusType[3];
            param[0] = new UpdateStatusType();
            param[0].setDescription("Description 4");
            param[0].setProductID("Product 4");
            param[0].setReport("Report 4");
            TaskExecutationStatusType statustype=TaskExecutationStatusType.Success;
			param[0].setStatus(statustype);
			updateStatusElement.setTaskList(param);
			param[1] = new UpdateStatusType();
            param[1].setDescription("Description 2");
            param[1].setProductID("Product 2");
            param[1].setReport("Report 2");
            statustype=TaskExecutationStatusType.Fail;
			param[1].setStatus(statustype);
			updateStatusElement.setTaskList(param);
			param[2] = new UpdateStatusType();
            param[2].setDescription("Description 3");
            param[2].setProductID("Product 3");
            param[2].setReport("Report 3");
            statustype=TaskExecutationStatusType.Unknown;
			param[2].setStatus(statustype);
			updateStatusElement.setTaskList(param);
            
			ProcessCompletedStatusElement resp = stub.UpdateStatus(updateStatusElement);

        	assertTrue(resp != null);
        	//assertTrue(resp.getProcesscompleted() != true);
    	}
    	catch(Throwable t)
    	{
            log.error("Exception caught : ", t);
    		//t.printStackTrace();
    	}
    	
    }
    
//    public static Test suite()
//    { // TODO System.out.println("suite() called");
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
//        System.out.println("main() called");
//        log.debug("main() called");
//        TestRunner.run(suite());
//    }
    
    
}
