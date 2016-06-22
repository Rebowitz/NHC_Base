package com.nhcsys.dataaccess.nhc.struts.actions;


import org.apache.log4j.Logger;
import org.apache.struts.*;
import org.apache.struts.action.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.text.*;

import com.nhcsys.dataaccess.dao.*;
import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.factory.*;
import com.nhcsys.dataaccess.nhc.beans.NhcUserBean;
import com.nhcsys.dataaccess.nhc.utils.NhcACLConfig;
import com.nhcsys.dataaccess.nhc.utils.NhcUserManager;
import com.nhcsys.dataaccess.struts.forms.*;

public abstract class NhcBaseAction extends Action {

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
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
		{
			try {
				Logger log = Logger.getLogger(this.getClass());
				log.info("Checking if User is Logged In");
				boolean isLoggedIn = NhcUserManager.isUserLoggedIn(request, response);
				log.info("Is User Logged in; "+ isLoggedIn);
				if (isLoggedIn == false) {
					//Need to forward to the login page
					return mapping.findForward( "loginpage" );
				}
				String className = this.getClass().getSimpleName();
				if (className != null) {
					className = className.toLowerCase();
				}
				NhcUserBean user = NhcUserManager.getUser(request);
				boolean isAuthorized = NhcUserManager.isAuthorized(user, className, log);
				log.info(user.getUserId()+ ": Is Authorized User value = "+isAuthorized);
				if (!isAuthorized) {
					throw new Exception("Invalid Access");
				}
				String method = className + "::execute--> ";
				log.debug(method+" Inside the Execute Method");
				log.debug(method+" Calling the handle method");
				ActionForward actionF = handle(mapping, form, request, response);
				log.debug(method+" Finished and returning to the handle method");
				return actionF;
			} catch (Exception e) {
				ActionErrors _errors = new ActionErrors();
				_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("invalid.access", e.getMessage() ) );
				saveErrors( request, _errors );
				return mapping.findForward( "failure" );
			}
		}
		
		abstract public ActionForward handle(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception;
		

}
