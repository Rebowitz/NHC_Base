package com.nhcsys.common.exception;

public class WebServicesException extends Exception {
	
	public WebServicesException(String strExceptionMessage) {
		super(strExceptionMessage);
	}
	
	public WebServicesException(String strExceptionMessage, Throwable t) {
		super(strExceptionMessage, t);
	}
 
}
