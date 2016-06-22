package com.nhcsys.webservices.getmessages;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.jboss.logging.Logger;
import com.nhcsys.dataaccess.dao.MachinesDao;
import com.nhcsys.dataaccess.dao.MessagesDao;
import com.nhcsys.dataaccess.dao.WsSessionsDao;
import com.nhcsys.dataaccess.dto.Machines;
import com.nhcsys.dataaccess.dto.Messages;
import com.nhcsys.dataaccess.dto.WsSessions;
import com.nhcsys.dataaccess.factory.MachinesDaoFactory;
import com.nhcsys.dataaccess.factory.MessagesDaoFactory;
import com.nhcsys.dataaccess.factory.WsSessionsDaoFactory;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.FaultTypeElementDocument;
import com.nhcsys.webservices.getmessages.getmessagestypes.v1.FaultTypeElementDocument.FaultTypeElement;
import com.nhcsys.dataaccess.exceptions.WsSessionsDaoException;
import com.nhcsys.dataaccess.exceptions.MachinesDaoException;
import com.nhcsys.common.exception.SessionException;
import com.nhcsys.common.SessionHelper;
import com.nhcsys.common.WebServicesFaultTypesEnum;

public class GetMessagesHandler implements GetMessagesServiceSkeletonInterface {

	private static final Logger log = Logger.getLogger(GetMessagesHandler.class);

	private static final String CLASS = GetMessagesHandler.class.getName();

	public GetMessagesHandler() {
			super();
			// Auto-generated constructor stub
	}
	

	public SupportMessagesResponseElementDocument 
    	GetMessages(SupportMessagesRequestElementDocument supportMessagesRequestElement) 
        throws GetMessagesFailure {
		
		log.debug("XML request: " + supportMessagesRequestElement.toString());
	
		SupportMessagesResponseElementDocument responseElementDocument = 
            SupportMessagesResponseElementDocument.Factory.newInstance();
        SupportMessagesResponseElementDocument.SupportMessagesResponseElement responseElement =
        	responseElementDocument.addNewSupportMessagesResponseElement();
		
		String methodName = CLASS+"::GetMessages() -- ";
		log.debug(methodName + " Starting...");

	try{	

			//Let's make sure nothing is null
			if (supportMessagesRequestElement != null && 
					supportMessagesRequestElement.getSupportMessagesRequestElement() != null) {
			
				WsSessions wsSession = null;
				String sessionId = null;
				
				try {
					
					sessionId = supportMessagesRequestElement.getSupportMessagesRequestElement().getSessionID();
					//Let's validate the SessionId
					wsSession = SessionHelper.validateSession(sessionId);
					
					log.debug(methodName + "successfully retreived data for sessionId: " + sessionId);
				} catch (SessionException ex) {
					log.error(methodName + "Problems retreiving session information given Session id"+ sessionId, ex);
					
					throw createException(ex.getMessage(),
										  ex.getFaultCode(),
										  ex.getFaultDescription(),
										  ex.getFaultCause());
				
				} catch (Throwable t) {
					log.error(methodName + "Unknown Problems retreiving session information given Session id"+ sessionId, t);
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
					throw createException(t.getMessage(),
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  t.getMessage());
				}	
				
				log.debug("Session ID is " + sessionId);
		   
				Calendar retrieveAfterTime = supportMessagesRequestElement.getSupportMessagesRequestElement().getRetrieveAfterTime();
				Long lastMessageID = supportMessagesRequestElement.getSupportMessagesRequestElement().getMessageID();
				
				
					if(lastMessageID < 1){

					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.MESSAGEID_LESS_THAN_ONE;		
					throw createException("Message ID submitted was less than 1",
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  null);					
					}
				
				//we need to change this to a mysql datetime
				Date lastUpdateTime = retrieveAfterTime.getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
				String formattedLastUpdateTime = formatter.format(lastUpdateTime);
				
				WsSessionsDao wssessionsDao = WsSessionsDaoFactory.create(); 
				WsSessions[] wssessionInfo = null;
				
				try{
					wssessionInfo = wssessionsDao.findWhereSessionIdEquals(wsSession.getSessionId()); 
					
				}catch(WsSessionsDaoException wdaoEx){
					log.error(methodName + "Problems retreiving session information from DAO object for given Session id"+ sessionId, wdaoEx);
					
					throw wdaoEx;
			
				} catch (Exception ex) {
				
					log.error(methodName + "Database error retrieving wssessions record for sessionId "+ sessionId, ex);
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
					throw createException(ex.getMessage(),
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  ex.getMessage());	
				}	
				//the sessionId is a unique value so only one row is returned
				
				Long machineId = wssessionInfo[0].getMachineId();
						
				log.debug("Machine ID is " + machineId);
				MachinesDao machinesDao = MachinesDaoFactory.create();
				Machines[] machineInfo = null;
				
			try{
					
					machineInfo = machinesDao.findWhereMachineIdEquals(machineId);				
					
				}catch (MachinesDaoException mdaoEx){
					throw mdaoEx;
				}catch (Exception ex) {	
				  				log.error(methodName + "Database error retrieving wssessions record for sessionId "+ sessionId, ex);
					WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNABLE_TO_RETRIEVE_MACHINE_RECORD;
					throw createException(ex.getMessage(),
							  myEnum.getCode(),
							  myEnum.getDescription(),
							  ex.getMessage());	
				}
				
				
				//the machineID is a unique number so only one row is returned
		
				String viveId = machineInfo[0].getViveId();
				log.debug("Vive ID is " + viveId);		
				MessageListType msgList = responseElement.addNewMessageList();		
				
				getPrivateMessages(msgList,viveId, formattedLastUpdateTime,lastMessageID);
				getPublicMessages(msgList, formattedLastUpdateTime,lastMessageID);
				
				Calendar currServerTime = Calendar.getInstance();
				responseElement.setCurrentServerTime(currServerTime);	
			}
		} catch (GetMessagesFailure e) {
			throw e;
	
		}catch (Exception ex) {
	
				WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
				log.error(methodName + "Caught an exception ",ex);
				throw createException("Caught an exception"+ ex.getMessage(), 
						  myEnum.getCode(),
						  getErrorMessageDescription(myEnum,ex.getMessage()),
						  "Caught An exception: " + ex.getMessage());
		} finally {
				log.debug(methodName + " Ending...");
		}
	    	
	    	log.debug(responseElementDocument.toString());
	  
	
			return responseElementDocument;
	
		}
	
	
	public static void getPrivateMessages(MessageListType msgList, 
			String viveId, String formattedLastUpdateTime, Long lastMessageID)throws Exception
	
	{
		log.debug("entered getPrivateMessages method");
        
//		Date msgLastUpdated = new java.sql.Date(lastUpdateTime.getTime().getTime());
		

			MessagesDao messagesDao = MessagesDaoFactory.create();
    	
		//PLACEHOLDER!! needs correct sql that uses lastUpdateTime and Member
    
	//	String privateSql = "Select * from messages where sysdate >= start_time";
        
			
		//this will return all active messages greater than the message id -- this includes messages that have
		// been modified but not yet sent	
      String privateSql = 
        	"Select * from messages where sysdate >= start_time and sysdate <= end_time and destination = 'Member' and vive_id = '" + viveId + 
        		"' and message_id > " + lastMessageID ;

      
      //this will return all messages that have already been sent but have been modified since the last time
      //the PC client checked in.  This will include all messages that have been terminated by moving the end date
      //before the start date
      String privateSql2 = 
      	"Select * from messages where sysdate >= start_time and destination = 'Member' and vive_id = '" + viveId + 
      		"' and message_id <= " + lastMessageID + " and ((end_time <= start_time) or (mod_time >= '" + formattedLastUpdateTime + "'))";     
      
       
		//log.debug(formattedLastUpdateTime);
		log.debug("Private SQL" + privateSql);
      	//Messages[] privateMessages = messagesDao.findAll();
       
       	Messages[] privateMessages = messagesDao.findByDynamicSelect(privateSql.toString(), null);
		addMessages(msgList,privateMessages);      	
        privateMessages = messagesDao.findByDynamicSelect(privateSql2.toString(),null);       
		addMessages(msgList,privateMessages);
	}
	
	public static void getPublicMessages(MessageListType msgList, 
			String formattedLastUpdateTime, Long lastMessageID)throws Exception
		{
			log.debug("entered getPublicMessages method");	
		

	        MessagesDao messagesDao = MessagesDaoFactory.create();
 
      
        String publicSql = 
        	"Select * from messages where sysdate >= start_time and sysdate <= end_time and destination = 'All' and message_id > " + lastMessageID ;
        
        String publicSql2 = 
          	"Select * from messages where sysdate >= start_time and destination = 'All' and message_id <= " + lastMessageID + " and ((end_time <= start_time) or (mod_time >= '" + formattedLastUpdateTime + "'))";           
        
        
        log.debug("Public SQL: " + publicSql);
        
       	Messages[] publicMessages = messagesDao.findByDynamicSelect(publicSql.toString(),null);
		addMessages(msgList,publicMessages);
		publicMessages = messagesDao.findByDynamicSelect(publicSql2.toString(),null);
		addMessages(msgList,publicMessages);		
	}
	
	protected static void addMessages(MessageListType msgList, Messages[] messages) throws Exception
	{
			log.debug("entered addMessages method");
			
			int sz = messages.length;
			
			for(int i = 0; i < sz ; i++)
			{
				MessageType msg = msgList.addNewMessage();
				msg.setMessageID(messages[i].getMessageId());
	    	        
				msg.setType(com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessageType.Enum.forString(messages[i].getType()));
				
				Calendar startTime = Calendar.getInstance();
				Calendar endTime = Calendar.getInstance();
				startTime.setTime(messages[i].getStartTime());
				endTime.setTime(messages[i].getEndTime());
				
				msg.setStartTime(startTime);
				msg.setEndTime(endTime);
				
				
				msg.setTitle(messages[i].getTitle());
				msg.setContent(messages[i].getContents());
				msg.setSummary(messages[i].getSummary());

				
				
				msg.setPriority(com.nhcsys.webservices.getmessages.getmessagestypes.v1.PriorityType.Enum.forString(messages[i].getPriority()));
				
				
				int popupDur = (int)messages[i].getPopupDuration();
				msg.setPopupDuration(popupDur);				
			//	msg.setPopupDuration(messages[i].getPopupDuration());
				msg.setClickURL(messages[i].getClickDestinationUrl());
				
				MessageDestinationType destType = MessageDestinationType.Factory.newInstance();
				destType.setDestination(com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum.forString(messages[i].getDestination()));
				String grpName = messages[i].getGroupName();
				
							
				if (grpName == null || grpName.length() == 0)
					grpName = "None"; // TODO : create const
				
				log.debug("Group name:" + grpName);
					
				destType.setGroupName(grpName);
				
				msg.setTo(destType);
			}
		
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
		log.error("Loggin the Exception: " , gmExp);
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