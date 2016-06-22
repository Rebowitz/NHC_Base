package com.nhcsys.common.exception;

public class NHCException extends Exception {

	private Long faultCode;
	private String faultDesc;
	private String faultCause;
	public Long getFaultCode() {
		return faultCode;
	}

	public NHCException(String strExceptionMessage) {
		super(strExceptionMessage);
	}
	public NHCException(){
		super();
	}
	public NHCException(String strExceptionMessage, Throwable t) {
		super(strExceptionMessage, t);
	}
	
	public void setFaultCode(Long faultCode) {
		this.faultCode = faultCode;
	}
	public String getFaultDescription() {
		return faultDesc;
	}
	public void setFaultDescription(String faultDesc) {
		this.faultDesc = faultDesc;
	}
	public String getFaultCause() {
		return faultCause;
	}
	public void setFaultCause(String faultCause) {
		this.faultCause = faultCause;
	}
}
