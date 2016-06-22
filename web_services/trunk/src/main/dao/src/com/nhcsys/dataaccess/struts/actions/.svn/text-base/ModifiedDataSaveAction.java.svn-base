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

public class ModifiedDataSaveAction extends NhcBaseAction
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
			ModifiedDataForm modifiedDataForm = (ModifiedDataForm) form;
		
			// create the DAO class
			ModifiedDataDao dao = ModifiedDataDaoFactory.create();
		
			ModifiedData dto = new ModifiedData();
			dto.setModifiedDataId( Long.parseLong( modifiedDataForm.getModifiedDataId() ));
			dto.setCustomerId( Long.parseLong( modifiedDataForm.getCustomerId() ));
			dto.setModifiedTime( (modifiedDataForm.getModifiedTime() == null || modifiedDataForm.getModifiedTime().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( modifiedDataForm.getModifiedTime()));
		
			if (modifiedDataForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (modifiedDataForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (modifiedDataForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
