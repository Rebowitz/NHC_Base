package com.nhcsys.dataaccess.struts.actions; import com.nhcsys.dataaccess.nhc.struts.actions.NhcBaseAction;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.factory.*;
import com.nhcsys.dataaccess.struts.forms.*;

public class MessagesSaveAction extends NhcBaseAction
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward handle(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try {
			// cast the form to the appropriate type
			MessagesForm messagesForm = (MessagesForm) form;
		
			// create the DAO class
			MessagesDao dao = MessagesDaoFactory.create();
		
			Messages dto = new Messages();
			dto.setMessageId( Long.parseLong( messagesForm.getMessageId() ));
			dto.setType( messagesForm.getType());
			dto.setStartTime( (messagesForm.getStartTime() == null || messagesForm.getStartTime().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( messagesForm.getStartTime()));
			dto.setEndTime( (messagesForm.getEndTime() == null || messagesForm.getEndTime().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( messagesForm.getEndTime()));
			dto.setModTime( (messagesForm.getModTime() == null || messagesForm.getModTime().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( messagesForm.getModTime()));
			dto.setTitle( messagesForm.getTitle());
			dto.setContents( messagesForm.getContents());
			dto.setSummary( messagesForm.getSummary());
			dto.setPriority( messagesForm.getPriority());
			dto.setPopupDuration( Long.parseLong( messagesForm.getPopupDuration() ));
			dto.setClickDestinationUrl( messagesForm.getClickDestinationUrl());
			dto.setDestination( messagesForm.getDestination());
			dto.setGroupName( messagesForm.getGroupName());
			dto.setViveId( messagesForm.getViveId());
		
			if (messagesForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (messagesForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (messagesForm.getCrudMethod().equalsIgnoreCase("delete")) {
				dao.delete( dto.createPk() );
			}
		
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
