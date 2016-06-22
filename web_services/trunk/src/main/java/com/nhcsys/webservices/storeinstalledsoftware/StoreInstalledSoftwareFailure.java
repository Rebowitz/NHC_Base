/**
 * StoreInstalledSoftwareFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.storeinstalledsoftware;

public class StoreInstalledSoftwareFailure extends java.lang.Exception {
    private com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.FaultTypeElementDocument faultMessage;

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
        com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.FaultTypeElementDocument msg) {
        faultMessage = msg;
    }

    public com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.FaultTypeElementDocument getFaultMessage() {
        return faultMessage;
    }
}
