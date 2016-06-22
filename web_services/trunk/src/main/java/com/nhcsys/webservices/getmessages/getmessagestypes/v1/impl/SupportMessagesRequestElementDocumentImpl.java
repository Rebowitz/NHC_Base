/*
 * An XML document type.
 * Localname: SupportMessagesRequestElement
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1.impl;

/**
 * A document containing one SupportMessagesRequestElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1) element.
 *
 * This is a complex type.
 */
public class SupportMessagesRequestElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument {
    private static final javax.xml.namespace.QName SUPPORTMESSAGESREQUESTELEMENT$0 =
        new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
            "SupportMessagesRequestElement");

    public SupportMessagesRequestElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "SupportMessagesRequestElement" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement getSupportMessagesRequestElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) get_store()
                                                                                                                                                      .find_element_user(SUPPORTMESSAGESREQUESTELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "SupportMessagesRequestElement" element
     */
    public void setSupportMessagesRequestElement(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement supportMessagesRequestElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) get_store()
                                                                                                                                                      .find_element_user(SUPPORTMESSAGESREQUESTELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) get_store()
                                                                                                                                                          .add_element_user(SUPPORTMESSAGESREQUESTELEMENT$0);
            }

            target.set(supportMessagesRequestElement);
        }
    }

    /**
     * Appends and returns a new empty "SupportMessagesRequestElement" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement addNewSupportMessagesRequestElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) get_store()
                                                                                                                                                      .add_element_user(SUPPORTMESSAGESREQUESTELEMENT$0);

            return target;
        }
    }

    /**
     * An XML SupportMessagesRequestElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
     *
     * This is a complex type.
     */
    public static class SupportMessagesRequestElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement {
        private static final javax.xml.namespace.QName SESSIONID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
                "SessionID");
        private static final javax.xml.namespace.QName MESSAGEID$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
                "MessageID");
        private static final javax.xml.namespace.QName RETRIEVEAFTERTIME$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
                "RetrieveAfterTime");

        public SupportMessagesRequestElementImpl(
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

        /**
         * Gets the "MessageID" element
         */
        public long getMessageID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MESSAGEID$2,
                        0);

                if (target == null) {
                    return 0L;
                }

                return target.getLongValue();
            }
        }

        /**
         * Gets (as xml) the "MessageID" element
         */
        public org.apache.xmlbeans.XmlLong xgetMessageID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong) get_store()
                                                           .find_element_user(MESSAGEID$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "MessageID" element
         */
        public void setMessageID(long messageID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MESSAGEID$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(MESSAGEID$2);
                }

                target.setLongValue(messageID);
            }
        }

        /**
         * Sets (as xml) the "MessageID" element
         */
        public void xsetMessageID(org.apache.xmlbeans.XmlLong messageID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong) get_store()
                                                           .find_element_user(MESSAGEID$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlLong) get_store()
                                                               .add_element_user(MESSAGEID$2);
                }

                target.set(messageID);
            }
        }

        /**
         * Gets the "RetrieveAfterTime" element
         */
        public java.util.Calendar getRetrieveAfterTime() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(RETRIEVEAFTERTIME$4,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getCalendarValue();
            }
        }

        /**
         * Gets (as xml) the "RetrieveAfterTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetRetrieveAfterTime() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                               .find_element_user(RETRIEVEAFTERTIME$4,
                        0);

                return target;
            }
        }

        /**
         * Sets the "RetrieveAfterTime" element
         */
        public void setRetrieveAfterTime(java.util.Calendar retrieveAfterTime) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(RETRIEVEAFTERTIME$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(RETRIEVEAFTERTIME$4);
                }

                target.setCalendarValue(retrieveAfterTime);
            }
        }

        /**
         * Sets (as xml) the "RetrieveAfterTime" element
         */
        public void xsetRetrieveAfterTime(
            org.apache.xmlbeans.XmlDateTime retrieveAfterTime) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                               .find_element_user(RETRIEVEAFTERTIME$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                                   .add_element_user(RETRIEVEAFTERTIME$4);
                }

                target.set(retrieveAfterTime);
            }
        }
    }
}
