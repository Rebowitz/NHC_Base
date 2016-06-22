/**
 * GetMemberNetworkInfoFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmembernetworkinfo;

public class GetMemberNetworkInfoFailure extends java.lang.Exception {
    private com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument faultMessage;

    public GetMemberNetworkInfoFailure() {
        super("GetMemberNetworkInfoFailure");
    }

    public GetMemberNetworkInfoFailure(java.lang.String s) {
        super(s);
    }

    public GetMemberNetworkInfoFailure(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument msg) {
        faultMessage = msg;
    }

    public com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument getFaultMessage() {
        return faultMessage;
    }
}
