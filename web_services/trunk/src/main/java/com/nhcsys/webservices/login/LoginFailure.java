/**
 * LoginFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.login;

public class LoginFailure extends java.lang.Exception {
    private com.nhcsys.webservices.login.logintypes.v1.FaultTypeElementDocument faultMessage;

    public LoginFailure() {
        super("LoginFailure");
    }

    public LoginFailure(java.lang.String s) {
        super(s);
    }

    public LoginFailure(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.webservices.login.logintypes.v1.FaultTypeElementDocument msg) {
        faultMessage = msg;
    }

    public com.nhcsys.webservices.login.logintypes.v1.FaultTypeElementDocument getFaultMessage() {
        return faultMessage;
    }
}
