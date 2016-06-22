/**
 * UpdateStatusFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.test.webservices.axis2.UpdateStatusService;

public class UpdateStatusFailure extends java.lang.Exception {
    private com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.FaultTypeElement faultMessage;

    public UpdateStatusFailure() {
        super("UpdateStatusFailure");
    }

    public UpdateStatusFailure(java.lang.String s) {
        super(s);
    }

    public UpdateStatusFailure(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.FaultTypeElement msg) {
        faultMessage = msg;
    }

    public com.nhcsys.test.webservices.axis2.UpdateStatusService.UpdateStatusServiceStub.FaultTypeElement getFaultMessage() {
        return faultMessage;
    }
}
