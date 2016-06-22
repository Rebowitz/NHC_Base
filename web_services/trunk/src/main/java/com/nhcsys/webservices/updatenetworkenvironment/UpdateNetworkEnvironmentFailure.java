/**
 * UpdateNetworkEnvironmentFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.updatenetworkenvironment;

public class UpdateNetworkEnvironmentFailure extends java.lang.Exception {
    private com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.FaultTypeElementDocument faultMessage;

    public UpdateNetworkEnvironmentFailure() {
        super("UpdateNetworkEnvironmentFailure");
    }

    public UpdateNetworkEnvironmentFailure(java.lang.String s) {
        super(s);
    }

    public UpdateNetworkEnvironmentFailure(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.FaultTypeElementDocument msg) {
        faultMessage = msg;
    }

    public com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.FaultTypeElementDocument getFaultMessage() {
        return faultMessage;
    }
}
