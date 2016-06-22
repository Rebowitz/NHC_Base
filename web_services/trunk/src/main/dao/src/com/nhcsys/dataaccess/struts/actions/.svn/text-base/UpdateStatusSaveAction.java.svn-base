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

public class UpdateStatusSaveAction extends NhcBaseAction
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
			UpdateStatusForm updateStatusForm = (UpdateStatusForm) form;
		
			// create the DAO class
			UpdateStatusDao dao = UpdateStatusDaoFactory.create();
		
			UpdateStatus dto = new UpdateStatus();
			dto.setUpdateStatusId( Long.parseLong( updateStatusForm.getUpdateStatusId() ));
			dto.setSessionId( updateStatusForm.getSessionId());
			dto.setMachineId( Long.parseLong( updateStatusForm.getMachineId() ));
			dto.setProductId( updateStatusForm.getProductId());
			dto.setDescription( updateStatusForm.getDescription());
			dto.setReport( updateStatusForm.getReport());
			dto.setStatus( updateStatusForm.getStatus());
		
			if (updateStatusForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (updateStatusForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (updateStatusForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
