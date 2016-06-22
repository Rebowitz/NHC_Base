/**
 *
 */
package com.nhcsys.test.webservices.axis2.GetMessagesService;

import com.nhcsys.common.WebServicesFaultTypesEnum;
import com.nhcsys.dataaccess.dto.Messages;
import com.nhcsys.dataaccess.dto.MessagesPk;
import com.nhcsys.dataaccess.dao.MessagesDao;
import com.nhcsys.dataaccess.exceptions.MessagesDaoException;
import com.nhcsys.dataaccess.factory.MessagesDaoFactory;
import com.nhcsys.test.common.TestBase;
import com.nhcsys.test.common.TestConstants;
import com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.SupportMessagesRequestElement;
import com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.SupportMessagesResponseElement;
import com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.MessageListType;
import com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.MessageType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import com.nhcsys.webservices.getmessages.GetMessagesFailure;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.FaultTypeElementDocument.FaultTypeElement;



/**
 * @author tim.rea
 *
 */
public class GetMessagesServiceTest extends TestBase {
    /**
     * @param arg0
     * @param url
     */
	
	private static final String CLASS = GetMessagesServiceTest.class.getName();
	private Connection conn = null;

	public GetMessagesServiceTest(String arg0) {
        super(arg0); //, getConfig().getString(TestConstants.AGENT_SERVER_URL));
        try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection("jdbc:oracle:thin:@devdb2.nhcsys.local:1525:DEVDBA","nhcsys5","nhcsys5");
        } catch (Exception ex) {
        	log.error("Exception getting connection: ",ex);
        }
    }

    protected void setUp() throws Exception {
       // super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

	String methodName = CLASS+"::GetMessages() -- ";
//	log.error(methodName + " Starting...");
	
    //returns the messages from the database
    public void testGetMessages() {
        try {
	   		MessagesDao messagesDao = MessagesDaoFactory.create(conn);
	    	
	    	Messages msgDto = new Messages();
	    	

	    		//clean out the test database
	    		clearDatabase();    		
	    		msgDto = testPopulateDatabase(1,"Member");
	    	
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;    		
		    	}
		    	
	    		msgDto = testPopulateDatabase(2,"Member");
	    		
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;    		
		    	}   	
		    	
	    		msgDto = testPopulateDatabase(3,"Member");
	    		
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;    		
		    	}

	    		msgDto = testPopulateDatabase(4,"Member");
	    		
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;    		
		    	}
		    	
		    	msgDto = testPopulateDatabase(1,"All");
		    	
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;
		    	}	 
		    	
		    	msgDto = testPopulateDatabase(2,"All");
		    	
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;
		    	}

		    	msgDto = testPopulateDatabase(3,"All");
		    	
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;
		    	}        	

		    	msgDto = testPopulateDatabase(4,"All");
		    	
		    	try{
		    		messagesDao.insert(msgDto);
		    	}catch(MessagesDaoException msgEx){
		    		throw msgEx;
		    	} 
		    	
		    	
            Calendar cal = Calendar.getInstance();
            cal.setTime(new java.util.Date());

            
            String messageId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MESSAGEID);
            String sessionId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SESSIONID);
            String url = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_ENDPOINT);
            
            System.out.println("URL to query is: " + url);
            log.error("url = " + url);
            
            GetMessagesServiceStub stub = new GetMessagesServiceStub(url); 

            SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();           
            supportMessagesRequestElement = buildDataaccessObject(sessionId, messageId, cal);
            
            System.out.println("MessageID is " + supportMessagesRequestElement.getMessageID());
            System.out.println("SessionID is " + supportMessagesRequestElement.getSessionID());
            System.out.println("Retrieve After time is " + supportMessagesRequestElement.getRetrieveAfterTime());
            
           SupportMessagesResponseElement resp = stub.GetMessages(supportMessagesRequestElement);

           System.out.println("Assert test now");
            assertTrue(resp != null);
            System.out.println("Cleared Assert test");
            
            MessageListType messageList = resp.getMessageList();
            MessageType[] messages = messageList.getMessage();
            
            int size = messages.length;
            System.out.println("Messages sent back is: " + size);
            assertFalse(size != 4);
            
            for(int i=0; i < size; i++){
            	
            	String msg = messages[i].toString();
            	log.error(msg);
            	
            }
            
        } catch (Throwable t) {
            log.error("Exception caught : ", t);
            t.printStackTrace();
        }
    }
    
	public void testBadSessionID(){
		
	       try {
		    	
	            Calendar cal = Calendar.getInstance();
	            cal.setTime(new java.util.Date());

	            String url = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_ENDPOINT);
	            log.error("url = " + url);
	            
	            GetMessagesServiceStub stub = new GetMessagesServiceStub(url); 
	            
	            SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();
	            supportMessagesRequestElement.setRetrieveAfterTime(cal);
	            String sessionID = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SESSIONID);
	            
	            
	            supportMessagesRequestElement.setSessionID(sessionID + "-xx");
	            
	            String messageId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MESSAGEID);
	            supportMessagesRequestElement.setMessageID(Long.parseLong(messageId));

         	SupportMessagesResponseElement resp = new SupportMessagesResponseElement();           

         	try{
	            		resp = stub.GetMessages(supportMessagesRequestElement);
	        
         	}catch (Exception gmEx){
         		
 				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
 				log.error(methodName + "Caught an exception ",gmEx);
 				throw createException("Caught an exception"+ gmEx.getMessage(), 
 						  myEnum.getCode(),
 						  getErrorMessageDescription(myEnum,gmEx.getMessage()),
 						  "Caught An exception: " + gmEx.getMessage());
         	}
         	
	            assertTrue(resp != null);

	        } catch (Throwable t) {
	            log.error("Exception caught : ", t);
	            t.printStackTrace();
	        }		
		
	}

    
    public void testIgnoreExpiredMessages(){
  
    	
    	
    	//create our test messages in the db
    	try{
    	
		
		MessagesDao messagesDao = MessagesDaoFactory.create(conn);
		    	
    	Messages msgDto = new Messages();
    	

    		//clean out the test database
    		clearDatabase();    		
    		msgDto = testPopulateDatabase(1,"Member");
    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;    		
	    	}

	    	
    		msgDto = testPopulateDatabase(2,"Member");
    		
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;    		
	    	}   	
	    	
	    	msgDto = testPopulateDatabase(1,"All");
	    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;
	    	}

           Calendar cal = Calendar.getInstance();
            cal.setTime(new java.util.Date());
            
            String messageId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MESSAGEID);
            String sessionId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SESSIONID);
            String url = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_ENDPOINT);
            log.error("url = " + url);
            
            GetMessagesServiceStub stub = new GetMessagesServiceStub(url); 

            SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();           
            supportMessagesRequestElement = buildDataaccessObject(sessionId, messageId, cal);
            

            
        	SupportMessagesResponseElement resp = new SupportMessagesResponseElement();           

        	try{
            		resp = stub.GetMessages(supportMessagesRequestElement);
            		
        
        	}catch (Exception gmEx){

        		log.error("response returned is:");
        		log.error(resp.toString());
        		
        		
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
				log.error(methodName + "Caught an exception ",gmEx);
				throw createException("Caught an exception"+ gmEx.getMessage(), 
						  myEnum.getCode(),
						  getErrorMessageDescription(myEnum,gmEx.getMessage()),
						  "Caught An exception: " + gmEx.getMessage());
        	}
            
            assertTrue(resp != null);

            
            MessageListType messageList = resp.getMessageList();
            MessageType[] messages = messageList.getMessage();
            
            int size = messages.length;

 //           assertFalse(size != 0);
            
            for(int i=0; i < size; i++){
            	
            	String msg = messages[i].toString();
            	log.error(msg);
            	
            }
            
        } catch (Throwable t) {
            log.error("Exception caught : ", t);
            t.printStackTrace();
        }            
    }

    
    
    
    public void testGetModifiedMessages(){
    	MessagesDao messagesDao = MessagesDaoFactory.create(conn);
    	
    	Messages msgDto = new Messages();
    	
    	//create our test messages in the db
    	try{
    		//clean out the test database
    		clearDatabase();    		
    		msgDto = testPopulateDatabase(2,"Member");
    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;    		
	    	}
	    	
	    	msgDto = testPopulateDatabase(2,"All");
	    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;
	    	}

           Calendar cal = Calendar.getInstance();
            cal.setTime(new java.util.Date());
            
            String messageId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MESSAGEID);
            String sessionId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SESSIONID);
            String url = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_ENDPOINT);
            log.error("url = " + url);
            
            GetMessagesServiceStub stub = new GetMessagesServiceStub(url); 

            SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();           
            supportMessagesRequestElement = buildDataaccessObject(sessionId, messageId, cal);
            

            
        	SupportMessagesResponseElement resp = new SupportMessagesResponseElement();           

        	try{
            		resp = stub.GetMessages(supportMessagesRequestElement);
        
        	}catch (Exception gmEx){
        		
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
				log.error(methodName + "Caught an exception ",gmEx);
				throw createException("Caught an exception"+ gmEx.getMessage(), 
						  myEnum.getCode(),
						  getErrorMessageDescription(myEnum,gmEx.getMessage()),
						  "Caught An exception: " + gmEx.getMessage());
        	}
            
            assertTrue(resp != null);

            MessageListType messageList = resp.getMessageList();
            MessageType[] messages = messageList.getMessage();
            
            int size = messages.length;

            assertFalse(size != 2);
            
            for(int i=0; i < size; i++){
            	
            	String msg = messages[i].toString();
            	log.error(msg);
            	
            }
            
        } catch (Throwable t) {
            log.error("Exception caught : ", t);
            t.printStackTrace();
        }            
    }
    	
    public void testGetCurrentMessages(){
    	MessagesDao messagesDao = MessagesDaoFactory.create(conn);
    	
    	Messages msgDto = new Messages();
    	
    	//create our test messages in the db
    	try{
    		//clean out the test database
    		clearDatabase();    		
    		msgDto = testPopulateDatabase(3,"Member");
    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;    		
	    	}
	    	
	    	msgDto = testPopulateDatabase(3,"All");
	    	
	    	try{
	    		messagesDao.insert(msgDto);
	    	}catch(MessagesDaoException msgEx){
	    		throw msgEx;
	    	}

           Calendar cal = Calendar.getInstance();
            cal.setTime(new java.util.Date());
            
            String messageId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MESSAGEID);
            String sessionId = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SESSIONID);
            String url = getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_ENDPOINT);
            log.error("url = " + url);
            
            GetMessagesServiceStub stub = new GetMessagesServiceStub(url); 

            SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();           
            supportMessagesRequestElement = buildDataaccessObject(sessionId, messageId, cal);
            

            
        	SupportMessagesResponseElement resp = new SupportMessagesResponseElement();           

        	try{
            		resp = stub.GetMessages(supportMessagesRequestElement);
        
        	}catch (Exception gmEx){
        		
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
				log.error(methodName + "Caught an exception ",gmEx);
				throw createException("Caught an exception"+ gmEx.getMessage(), 
						  myEnum.getCode(),
						  getErrorMessageDescription(myEnum,gmEx.getMessage()),
						  "Caught An exception: " + gmEx.getMessage());
        	}
            
            assertTrue(resp != null);

            MessageListType messageList = resp.getMessageList();
            MessageType[] messages = messageList.getMessage();
            
            int size = messages.length;

            assertFalse(size != 2);
            
            for(int i=0; i < size; i++){
            	
            	String msg = messages[i].toString();
            	log.error(msg);
            	
            }
            
        } catch (Throwable t) {
            log.error("Exception caught : ", t);
            t.printStackTrace();
        }         	
    }


	
	
private static SupportMessagesRequestElement buildDataaccessObject(String sessionId, String messageId, Calendar cal){
    SupportMessagesRequestElement supportMessagesRequestElement = new SupportMessagesRequestElement();
    supportMessagesRequestElement.setRetrieveAfterTime(cal);
    supportMessagesRequestElement.setSessionID(sessionId);
    supportMessagesRequestElement.setMessageID(Long.parseLong(messageId));
    
    return supportMessagesRequestElement;
}
	
	
	
	private void clearDatabase()throws Exception
	
	{
		log.error("entered clearDatabase method");
        
//		Date msgLastUpdated = new java.sql.Date(lastUpdateTime.getTime().getTime());
	
			MessagesDao messagesDao = MessagesDaoFactory.create(conn);
    	
		//PLACEHOLDER!! needs correct sql that uses lastUpdateTime and Member
    
	//	String privateSql = "Select * from messages where NOW() >= start_time";
        
			
		//this will return all active messages greater than the message id -- this includes messages that have
		// been modified but not yet sent	
 //     String getMessagesSql = 
//        	"Select * from messages";

		log.error("Select all from messages");
       	Messages[] testMessages = messagesDao.findAll();
       MessagesPk messagePk = new MessagesPk();
//       	Messages[] testMessages = messagesDao.findByDynamicSelect(privateSql.toString(), null);
       	
       	
		int sz = testMessages.length;
		for(int i = 0; i < sz ; i++)
		{
			Long messageId = testMessages[i].getMessageId();
			messagePk.setMessageId(messageId);
			messagesDao.delete(messagePk);
			System.out.println("Deleting messageId");
		}
	}
	
	
	
/*Routine that creates the messages based on the tests and then stuffs them in the nhc_db database
 * 
 */	
	
	private Messages testPopulateDatabase(int testIndicator, String destPrivateAll){
		
		String titleContentSummary;
		Calendar getTime = Calendar.getInstance();
		Calendar startTime = Calendar.getInstance();
		Calendar endTime = Calendar.getInstance();
		Calendar modTime = Calendar.getInstance();
		Long milliSecAdjust;
		Long currentMilliSecs;
		Long dateconstant;
			
		
		currentMilliSecs = getTime.getTimeInMillis();
		
		Messages messagesDto = new Messages();
		
		messagesDto.setType("News");
		messagesDto.setPriority("Normal");
		messagesDto.setPopupDuration(0);
		messagesDto.setClickDestinationUrl("www.vivecomputingrocks.com");
		messagesDto.setDestination(destPrivateAll);
		messagesDto.setGroupName("none");
		messagesDto.setViveId("301933_38473dfsd");		
				
		if(testIndicator == 1){ //expired messages
			titleContentSummary = "Expired Message";
			messagesDto.setTitle(titleContentSummary);
			messagesDto.setContents(titleContentSummary);
			messagesDto.setSummary(titleContentSummary);
					
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_EXPIRED_START_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			startTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_EXPIRED_END_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			endTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_EXPIRED_MOD_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			modTime.setTimeInMillis(milliSecAdjust);			
				
			messagesDto.setStartTime(startTime.getTime());
			messagesDto.setEndTime(endTime.getTime());
			messagesDto.setModTime(modTime.getTime());
			
		}else if(testIndicator == 2){ //get modified messages

			titleContentSummary = "Get Modified Message";
			messagesDto.setTitle(titleContentSummary);
			messagesDto.setContents(titleContentSummary);
			messagesDto.setSummary(titleContentSummary);
		
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MODIFIED_START_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			startTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MODIFIED_END_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			endTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_MODIFIED_MOD_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			modTime.setTimeInMillis(milliSecAdjust);			
				
			messagesDto.setStartTime(startTime.getTime());
			messagesDto.setEndTime(endTime.getTime());
			messagesDto.setModTime(modTime.getTime());			
			
		}else if(testIndicator == 3){//Get Current Messages
			
			titleContentSummary = "Get Current Message";
			messagesDto.setTitle(titleContentSummary);
			messagesDto.setContents(titleContentSummary);
			messagesDto.setSummary(titleContentSummary);
		
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_CURRENT_START_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			startTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_CURRENT_END_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			endTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_CURRENT_MOD_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			
			modTime.setTimeInMillis(milliSecAdjust);			
				
			messagesDto.setStartTime(startTime.getTime());
			messagesDto.setEndTime(endTime.getTime());
			messagesDto.setModTime(modTime.getTime());			
			
		}else if(testIndicator == 4){//Set Expired Message
			
			titleContentSummary = "Set Expired Message";
			messagesDto.setTitle(titleContentSummary);
			messagesDto.setContents(titleContentSummary);
			messagesDto.setSummary(titleContentSummary);
		
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SETEXPIRED_START_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			startTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SETEXPIRED_END_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			endTime.setTimeInMillis(milliSecAdjust);
			
			dateconstant = Long.parseLong(getConfig().getString(TestConstants.TEST_GETMESSAGE_SERVICE_SETEXPIRED_MOD_TIME));
			//go back or forward in time
			milliSecAdjust = currentMilliSecs + (dateconstant * 86400000);
			
			modTime.setTimeInMillis(milliSecAdjust);			
				
			messagesDto.setStartTime(startTime.getTime());
			messagesDto.setEndTime(endTime.getTime());
			messagesDto.setModTime(modTime.getTime());	
		}else{
			log.error("Invalid test indicator, no test");
		}
		
		
		return messagesDto;
		
	}

	/**
	 * Create Exception with appropriate Values and return it
	 */
	private GetMessagesFailure createException(String exceptionMessage, Long faultCode, 
														  String faultDesc, String faultCause) {
		
		GetMessagesFailure gmExp = new GetMessagesFailure(exceptionMessage);
		FaultTypeElementDocument elementDoc = FaultTypeElementDocument.Factory.newInstance();
		FaultTypeElement faultElement = elementDoc.addNewFaultTypeElement();
		faultElement.setCause(faultCause);
		faultElement.setCode(faultCode);
		faultElement.setDescription(faultDesc);
		gmExp.setFaultMessage(elementDoc);
//		log.error("Loggin the Exception: " , gmExp);
		return gmExp;
	}
	/**
	 * Get Error Message
	 */
	private String getErrorMessageDescription(WebServicesFaultTypesEnum enumType, String...args) {
		String methodName = CLASS + "::getErrorMessageDescription --";
		String msg = null;
		try {
			msg = enumType.getDescription(args);
		} catch (Exception exc) {
			msg = "";
			log.error(methodName + "Could not get the Description" + exc.getMessage(),exc);
		}
		return msg;
	}
}	



