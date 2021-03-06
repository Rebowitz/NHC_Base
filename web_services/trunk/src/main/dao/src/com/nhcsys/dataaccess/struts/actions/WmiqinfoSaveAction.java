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

public class WmiqinfoSaveAction extends NhcBaseAction
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
			WmiqinfoForm wmiqinfoForm = (WmiqinfoForm) form;
		
			// create the DAO class
			WmiqinfoDao dao = WmiqinfoDaoFactory.create();
		
			Wmiqinfo dto = new Wmiqinfo();
			dto.setWmiqinfoId( Long.parseLong( wmiqinfoForm.getWmiqinfoId() ));
			dto.setNetworkinfoId( Long.parseLong( wmiqinfoForm.getNetworkinfoId() ));
			dto.setName( wmiqinfoForm.getName());
			dto.setQuery( wmiqinfoForm.getQuery());
			dto.setResult( wmiqinfoForm.getResult());
		
			if (wmiqinfoForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (wmiqinfoForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (wmiqinfoForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
