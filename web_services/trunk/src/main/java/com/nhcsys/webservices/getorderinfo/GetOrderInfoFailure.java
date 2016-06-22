/**
 * GetOrderInfoFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getorderinfo;

public class GetOrderInfoFailure extends java.lang.Exception {
    private com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.FaultTypeElementDocument faultMessage;

    public GetOrderInfoFailure() {
        super("GetOrderInfoFailure");
    }

    public GetOrderInfoFailure(java.lang.String s) {
        super(s);
    }

    public GetOrderInfoFailure(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.FaultTypeElementDocument msg) {
        faultMessage = msg;
    }

    public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.FaultTypeElementDocument getFaultMessage() {
        return faultMessage;
    }
}
