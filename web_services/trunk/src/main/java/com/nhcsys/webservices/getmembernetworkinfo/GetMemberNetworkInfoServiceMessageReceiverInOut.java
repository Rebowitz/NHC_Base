/**
 * GetMemberNetworkInfoServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getmembernetworkinfo;


/**
 *  GetMemberNetworkInfoServiceMessageReceiverInOut message receiver
 */
public class GetMemberNetworkInfoServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutSyncMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            GetMemberNetworkInfoServiceSkeletonInterface skel = (GetMemberNetworkInfoServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(
                            op.getName().getLocalPart())) != null)) {
                if ("GetMemberNetworkInfo".equals(methodName)) {
                    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument getMemberNetworkInfoElement3 =
                        null;
                    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument wrappedParam =
                        (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) fromOM(msgContext.getEnvelope()
                                                                                                                                                         .getBody()
                                                                                                                                                         .getFirstElement(),
                            com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getMemberNetworkInfoElement3 = skel.GetMemberNetworkInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getMemberNetworkInfoElement3, false);
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (GetMemberNetworkInfoFailure e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "GetMemberNetworkInfoFaultElement");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        }
        catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                new org.apache.axis2.util.StreamWrapper(param.newXMLStreamReader()));
        org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();

        ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null);

        return documentElement;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                new org.apache.axis2.util.StreamWrapper(param.newXMLStreamReader()));
        org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();

        ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null);

        return documentElement;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.impl.builder.StAXOMBuilder builder = new org.apache.axiom.om.impl.builder.StAXOMBuilder(org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                new org.apache.axis2.util.StreamWrapper(param.newXMLStreamReader()));
        org.apache.axiom.om.OMElement documentElement = builder.getDocumentElement();

        ((org.apache.axiom.om.impl.OMNodeEx) documentElement).setParent(null);

        return documentElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param, java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
        try {
            if (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }

            if (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }

            if (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
