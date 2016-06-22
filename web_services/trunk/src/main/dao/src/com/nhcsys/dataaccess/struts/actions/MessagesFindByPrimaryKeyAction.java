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

public class MessagesFindByPrimaryKeyAction extends NhcBaseAction
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
			// parse parameters
			long _messageId = Long.parseLong( request.getParameter("messageId") );
		
			// create the DAO class
			MessagesDao dao = MessagesDaoFactory.create();
		
			// execute the finder
			Messages dto = dao.findByPrimaryKey(_messageId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			MessagesForm messagesForm = new MessagesForm();
			messagesForm.setCrudMethod( request.getParameter("crudMethod") );
			messagesForm.setMessageId(String.valueOf( dto.getMessageId() ));
			messagesForm.setType(dto.getType());
			messagesForm.setStartTime(dto.getStartTime() == null ? null : DateFormat.getDateTimeInstance().format( dto.getStartTime()));
			messagesForm.setEndTime(dto.getEndTime() == null ? null : DateFormat.getDateTimeInstance().format( dto.getEndTime()));
			messagesForm.setModTime(dto.getModTime() == null ? null : DateFormat.getDateTimeInstance().format( dto.getModTime()));
			messagesForm.setTitle(dto.getTitle());
			messagesForm.setContents(dto.getContents());
			messagesForm.setSummary(dto.getSummary());
			messagesForm.setPriority(dto.getPriority());
			messagesForm.setPopupDuration(String.valueOf( dto.getPopupDuration() ));
			messagesForm.setClickDestinationUrl(dto.getClickDestinationUrl());
			messagesForm.setDestination(dto.getDestination());
			messagesForm.setGroupName(dto.getGroupName());
			messagesForm.setViveId(dto.getViveId());
			// store the results
			request.getSession().setAttribute( "Messages", messagesForm );
		
			return mapping.findForward( crudMethod );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
