/*
 * An XML document type.
 * Localname: GetOrderInfoRequestElement
 * Namespace: http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1
 * Java type: com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.impl;

/**
 * A document containing one GetOrderInfoRequestElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1) element.
 *
 * This is a complex type.
 */
public class GetOrderInfoRequestElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument {
    private static final javax.xml.namespace.QName GETORDERINFOREQUESTELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
            "GetOrderInfoRequestElement");

    public GetOrderInfoRequestElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetOrderInfoRequestElement" element
     */
    public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement getGetOrderInfoRequestElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) get_store()
                                                                                                                                                  .find_element_user(GETORDERINFOREQUESTELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetOrderInfoRequestElement" element
     */
    public void setGetOrderInfoRequestElement(
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement getOrderInfoRequestElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) get_store()
                                                                                                                                                  .find_element_user(GETORDERINFOREQUESTELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) get_store()
                                                                                                                                                      .add_element_user(GETORDERINFOREQUESTELEMENT$0);
            }

            target.set(getOrderInfoRequestElement);
        }
    }

    /**
     * Appends and returns a new empty "GetOrderInfoRequestElement" element
     */
    public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement addNewGetOrderInfoRequestElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) get_store()
                                                                                                                                                  .add_element_user(GETORDERINFOREQUESTELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetOrderInfoRequestElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1).
     *
     * This is a complex type.
     */
    public static class GetOrderInfoRequestElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement {
        private static final javax.xml.namespace.QName SESSIONID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
                "SessionID");

        public GetOrderInfoRequestElementImpl(
            org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "SessionID" element
         */
        public java.lang.String getSessionID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "SessionID" element
         */
        public org.apache.xmlbeans.XmlString xgetSessionID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(SESSIONID$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "SessionID" element
         */
        public void setSessionID(java.lang.String sessionID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(SESSIONID$0);
                }

                target.setStringValue(sessionID);
            }
        }

        /**
         * Sets (as xml) the "SessionID" element
         */
        public void xsetSessionID(org.apache.xmlbeans.XmlString sessionID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(SESSIONID$0);
                }

                target.set(sessionID);
            }
        }
    }
}
