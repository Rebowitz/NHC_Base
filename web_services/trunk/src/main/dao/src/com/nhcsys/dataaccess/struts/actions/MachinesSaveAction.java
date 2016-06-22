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

public class MachinesSaveAction extends NhcBaseAction
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
			MachinesForm machinesForm = (MachinesForm) form;
		
			// create the DAO class
			MachinesDao dao = MachinesDaoFactory.create();
		
			Machines dto = new Machines();
			dto.setMachineId( Long.parseLong( machinesForm.getMachineId() ));
			dto.setCustomerId( Long.parseLong( machinesForm.getCustomerId() ));
			dto.setViveId( machinesForm.getViveId());
			dto.setCpuSerialNo( machinesForm.getCpuSerialNo());
			dto.setKeyData( machinesForm.getKeyData());
			dto.setKeyTimestamp( Long.parseLong( machinesForm.getKeyTimestamp() ));
			dto.setStolenFlag( Integer.parseInt( machinesForm.getStolenFlag() ));
			dto.setTerminateFlag( Integer.parseInt( machinesForm.getTerminateFlag() ));
			dto.setRegisteredFlag( Integer.parseInt( machinesForm.getRegisteredFlag() ));
		
			if (machinesForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (machinesForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (machinesForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
