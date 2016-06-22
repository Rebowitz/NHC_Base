package com.nhcsys.common;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class WebServicesFaultResourceBundle {

	   private static final ResourceBundle bundle = ResourceBundle.getBundle(
	      "webservicesfaultcodedescriptions");

	   private static final ResourceBundle getResourceBundle()
	   {
	      return bundle;
	   }
	   
  	  @SuppressWarnings("all")
	   public static final String getMessage(Long code, String...array)
	   {
	      String key = String.valueOf(code);
	      String msg = "";

	      try
	      {
	         msg = getResourceBundle().getString(key);

	         if (msg == null)
	         {
	            msg = "";
	         }
	         else
	         {
	        	 
	            msg = MessageFormat.format(msg, array);

	         }
	      }
	      catch (MissingResourceException e)
	      {
	         Logger.getLogger(WebServicesFaultResourceBundle.class.getName()).warn(
	        		 WebServicesFaultResourceBundle.class + ".getMessage::" +
	            "Setting msg to empty string", e);
	         msg = "";
	      }

	      return msg;
	   }



}
