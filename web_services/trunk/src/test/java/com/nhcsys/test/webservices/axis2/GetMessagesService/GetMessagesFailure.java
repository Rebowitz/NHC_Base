/**
 * GetMessagesFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.test.webservices.axis2.GetMessagesService;

public class GetMessagesFailure extends java.lang.Exception {
    private com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.FaultTypeElement faultMessage;

    public GetMessagesFailure() {
        super("GetMessagesFailure");
    }

    public GetMessagesFailure(java.lang.String s) {
        super(s);
    }

    public GetMessagesFailure(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.FaultTypeElement msg) {
        faultMessage = msg;
    }

    public com.nhcsys.test.webservices.axis2.GetMessagesService.GetMessagesServiceStub.FaultTypeElement getFaultMessage() {
        return faultMessage;
    }
}