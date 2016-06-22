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

public class WsSessionsSaveAction extends NhcBaseAction
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
			WsSessionsForm wsSessionsForm = (WsSessionsForm) form;
		
			// create the DAO class
			WsSessionsDao dao = WsSessionsDaoFactory.create();
		
			WsSessions dto = new WsSessions();
			dto.setWsSessionId( Long.parseLong( wsSessionsForm.getWsSessionId() ));
			dto.setAppName( wsSessionsForm.getAppName());
			dto.setSessionId( wsSessionsForm.getSessionId());
			dto.setMachineId( Long.parseLong( wsSessionsForm.getMachineId() ));
			dto.setTimeStamp( (wsSessionsForm.getTimeStamp() == null || wsSessionsForm.getTimeStamp().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( wsSessionsForm.getTimeStamp()));
		
			if (wsSessionsForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (wsSessionsForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (wsSessionsForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
