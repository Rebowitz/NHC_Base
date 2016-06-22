package com.nhcsys.common.exception;

public class CheckSumException extends NHCException {
	
	public CheckSumException(String strExceptionMessage) {
		super(strExceptionMessage);
	}
	public CheckSumException(){
		super();
	}
	public CheckSumException(String strExceptionMessage, Throwable t) {
		super(strExceptionMessage, t);
	}
	
}
