package com.nhcsys.dataaccess.nhc.utils;

/**
 * This class is in charge of checking
 * if the user is logged in, authorized to perform action...
 * @author mouad.zouitni
 * @version 1.0
 * @since Nov. 19th 2007
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.nhcsys.dataaccess.nhc.beans.NhcUserBean;

public class NhcUserManager {
	
	private static String USER_OBJECT = "UserObj";
	private static final Logger log = Logger.getLogger(NhcUserManager.class);
	private static final String CLASS = "NhcUserManager::";
	
	/**
	 * Retrieves the user object from the session
	 * @param request
	 * @return UserBean
	 */
	public static NhcUserBean getUser(HttpServletRequest request) {
		String method = CLASS+"getUser()-->";
		log.debug(method+"Starting...");
		NhcUserBean user = null;
		HttpSession session = request.getSession(false);
		if (session != null) {
			
			user = (NhcUserBean) session.getAttribute(USER_OBJECT);
			
		}
		log.debug(method+"Ending...");
		return user;
	}
	
	/**
	 * Retrieves the user object from the session
	 * @param request
	 * @return UserBean
	 */
	public static NhcUserBean storeUserInSession(HttpServletRequest request, NhcUserBean user) {
		String method = CLASS+"getUser()-->";
		log.debug(method+"Starting...");

		HttpSession session = request.getSession();
		session.setAttribute(USER_OBJECT,user);
		
		log.debug(method+"Ending...");
		return user;
	}
	/**
	 * checks if the user is Logged in
	 * @param request
	 * @param response
	 * @return boolean
	 */
	public static boolean isUserLoggedIn (HttpServletRequest request,HttpServletResponse response)  {
		String method = CLASS+"isUserLoggedIn()-->";
		log.debug(method+"Starting...");
		HttpSession session = request.getSession(false);
		if (session == null) {
			return false;
		}
		NhcUserBean user = (NhcUserBean)session.getAttribute(USER_OBJECT);
		if (user == null) {
			return false;
		}
		log.debug(method+"Ending...");
		return true;
	}
	/**
	 * returns true if authorized otherwise false
	 * @param className
	 * @param log
	 * @return
	 */
	public static boolean isAuthorized (NhcUserBean user, String className, Logger log){
		String method = CLASS+"isAuthorized()-->";
		log.debug(method+"Starting...");
		boolean isValid = false;
		String roles [] = null;
		
		try { 
				roles = NhcACLConfig.getInstance().getRoles(className);
				log.debug(method+"The Roles: "+ roles);
			} 
		catch (Exception ex) {
			log.error("Exception: "+ex);
			
		}
		String userRoles [] = user.getRoles();
		if (userRoles == null) return false;
		
		if (roles != null) {
			for (String role:roles) {
				for (String userRole:userRoles) {
					if (role.equalsIgnoreCase(userRole)) {
						isValid = true;
						break;
					}
				}
				if (isValid) { break; }
			}//end for loop
		}
		
		log.debug(method+"Ending...");
		return isValid;
	}
}
