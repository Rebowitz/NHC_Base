package com.nhcsys.dataaccess.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.nhcsys.dataaccess.dto.*;

public class MessagesForm extends ActionForm
{
	private String messageId;

	private String type;

	private String startTime;

	private String endTime;

	private String modTime;

	private String title;

	private String contents;

	private String summary;

	private String priority;

	private String popupDuration;

	private String clickDestinationUrl;

	private String destination;

	private String groupName;

	private String viveId;

	private String crudMethod;

	/** 
	 * Sets the value of messageId
	 */
	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
	}

	/** 
	 * Gets the value of messageId
	 */
	public String getMessageId()
	{
		return messageId;
	}

	/** 
	 * Sets the value of type
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/** 
	 * Gets the value of type
	 */
	public String getType()
	{
		return type;
	}

	/** 
	 * Sets the value of startTime
	 */
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	/** 
	 * Gets the value of startTime
	 */
	public String getStartTime()
	{
		return startTime;
	}

	/** 
	 * Sets the value of endTime
	 */
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	/** 
	 * Gets the value of endTime
	 */
	public String getEndTime()
	{
		return endTime;
	}

	/** 
	 * Sets the value of modTime
	 */
	public void setModTime(String modTime)
	{
		this.modTime = modTime;
	}

	/** 
	 * Gets the value of modTime
	 */
	public String getModTime()
	{
		return modTime;
	}

	/** 
	 * Sets the value of title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/** 
	 * Gets the value of title
	 */
	public String getTitle()
	{
		return title;
	}

	/** 
	 * Sets the value of contents
	 */
	public void setContents(String contents)
	{
		this.contents = contents;
	}

	/** 
	 * Gets the value of contents
	 */
	public String getContents()
	{
		return contents;
	}

	/** 
	 * Sets the value of summary
	 */
	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	/** 
	 * Gets the value of summary
	 */
	public String getSummary()
	{
		return summary;
	}

	/** 
	 * Sets the value of priority
	 */
	public void setPriority(String priority)
	{
		this.priority = priority;
	}

	/** 
	 * Gets the value of priority
	 */
	public String getPriority()
	{
		return priority;
	}

	/** 
	 * Sets the value of popupDuration
	 */
	public void setPopupDuration(String popupDuration)
	{
		this.popupDuration = popupDuration;
	}

	/** 
	 * Gets the value of popupDuration
	 */
	public String getPopupDuration()
	{
		return popupDuration;
	}

	/** 
	 * Sets the value of clickDestinationUrl
	 */
	public void setClickDestinationUrl(String clickDestinationUrl)
	{
		this.clickDestinationUrl = clickDestinationUrl;
	}

	/** 
	 * Gets the value of clickDestinationUrl
	 */
	public String getClickDestinationUrl()
	{
		return clickDestinationUrl;
	}

	/** 
	 * Sets the value of destination
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	/** 
	 * Gets the value of destination
	 */
	public String getDestination()
	{
		return destination;
	}

	/** 
	 * Sets the value of groupName
	 */
	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}

	/** 
	 * Gets the value of groupName
	 */
	public String getGroupName()
	{
		return groupName;
	}

	/** 
	 * Sets the value of viveId
	 */
	public void setViveId(String viveId)
	{
		this.viveId = viveId;
	}

	/** 
	 * Gets the value of viveId
	 */
	public String getViveId()
	{
		return viveId;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		type = "";
		title = "";
		contents = "";
		summary = "";
		priority = "";
		clickDestinationUrl = "";
		destination = "";
		groupName = "";
		viveId = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse messageId
		try {
			long _parsed_messageId = Long.parseLong( messageId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse startTime
		try {
			java.util.Date _parsed_startTime = (startTime == null || startTime.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( startTime);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse endTime
		try {
			java.util.Date _parsed_endTime = (endTime == null || endTime.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( endTime);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse modTime
		try {
			java.util.Date _parsed_modTime = (modTime == null || modTime.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( modTime);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse popupDuration
		try {
			long _parsed_popupDuration = Long.parseLong( popupDuration );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
