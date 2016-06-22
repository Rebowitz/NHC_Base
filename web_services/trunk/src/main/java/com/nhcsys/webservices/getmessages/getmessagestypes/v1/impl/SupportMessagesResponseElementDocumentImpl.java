/*
 * An XML document type.
 * Localname: SupportMessagesResponseElement
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1.impl;

/**
 * A document containing one SupportMessagesResponseElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1) element.
 *
 * This is a complex type.
 */
public class SupportMessagesResponseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument {
    private static final javax.xml.namespace.QName SUPPORTMESSAGESRESPONSEELEMENT$0 =
        new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
            "SupportMessagesResponseElement");

    public SupportMessagesResponseElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "SupportMessagesResponseElement" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement getSupportMessagesResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) get_store()
                                                                                                                                                        .find_element_user(SUPPORTMESSAGESRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "SupportMessagesResponseElement" element
     */
    public void setSupportMessagesResponseElement(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement supportMessagesResponseElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) get_store()
                                                                                                                                                        .find_element_user(SUPPORTMESSAGESRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) get_store()
                                                                                                                                                            .add_element_user(SUPPORTMESSAGESRESPONSEELEMENT$0);
            }

            target.set(supportMessagesResponseElement);
        }
    }

    /**
     * Appends and returns a new empty "SupportMessagesResponseElement" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement addNewSupportMessagesResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) get_store()
                                                                                                                                                        .add_element_user(SUPPORTMESSAGESRESPONSEELEMENT$0);

            return target;
        }
    }

    /**
     * An XML SupportMessagesResponseElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
     *
     * This is a complex type.
     */
    public static class SupportMessagesResponseElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement {
        private static final javax.xml.namespace.QName CURRENTSERVERTIME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
                "CurrentServerTime");
        private static final javax.xml.namespace.QName MESSAGELIST$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
                "MessageList");

        public SupportMessagesResponseElementImpl(
            org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "CurrentServerTime" element
         */
        public java.util.Calendar getCurrentServerTime() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CURRENTSERVERTIME$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getCalendarValue();
            }
        }

        /**
         * Gets (as xml) the "CurrentServerTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCurrentServerTime() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                               .find_element_user(CURRENTSERVERTIME$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "CurrentServerTime" element
         */
        public void setCurrentServerTime(java.util.Calendar currentServerTime) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CURRENTSERVERTIME$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(CURRENTSERVERTIME$0);
                }

                target.setCalendarValue(currentServerTime);
            }
        }

        /**
         * Sets (as xml) the "CurrentServerTime" element
         */
        public void xsetCurrentServerTime(
            org.apache.xmlbeans.XmlDateTime currentServerTime) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                               .find_element_user(CURRENTSERVERTIME$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlDateTime) get_store()
                                                                   .add_element_user(CURRENTSERVERTIME$0);
                }

                target.set(currentServerTime);
            }
        }

        /**
         * Gets the "MessageList" element
         */
        public com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType getMessageList() {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType target =
                    null;
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) get_store()
                                                                                                      .find_element_user(MESSAGELIST$2,
                        0);

                if (target == null) {
                    return null;
                }

                return target;
            }
        }

        /**
         * Sets the "MessageList" element
         */
        public void setMessageList(
            com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType messageList) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType target =
                    null;
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) get_store()
                                                                                                      .find_element_user(MESSAGELIST$2,
                        0);

                if (target == null) {
                    target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) get_store()
                                                                                                          .add_element_user(MESSAGELIST$2);
                }

                target.set(messageList);
            }
        }

        /**
         * Appends and returns a new empty "MessageList" element
         */
        public com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType addNewMessageList() {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType target =
                    null;
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) get_store()
                                                                                                      .add_element_user(MESSAGELIST$2);

                return target;
            }
        }
    }
}
