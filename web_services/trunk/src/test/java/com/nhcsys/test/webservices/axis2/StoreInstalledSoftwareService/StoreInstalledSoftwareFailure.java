/**
 * StoreInstalledSoftwareFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService;

public class StoreInstalledSoftwareFailure extends java.lang.Exception {
    private com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.FaultTypeElement faultMessage;

    public StoreInstalledSoftwareFailure() {
        super("StoreInstalledSoftwareFailure");
    }

    public StoreInstalledSoftwareFailure(java.lang.String s) {
        super(s);
    }

    public StoreInstalledSoftwareFailure(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.FaultTypeElement msg) {
        faultMessage = msg;
    }

    public com.nhcsys.test.webservices.axis2.StoreInstalledSoftwareService.StoreInstalledSoftwareServiceStub.FaultTypeElement getFaultMessage() {
        return faultMessage;
    }
}
