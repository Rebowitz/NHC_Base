/*
 * An XML document type.
 * Localname: SupportMessagesResponseElement
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1;


/**
 * A document containing one SupportMessagesResponseElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1) element.
 *
 * This is a complex type.
 */
public interface SupportMessagesResponseElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportMessagesResponseElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                           .resolveHandle("supportmessagesresponseelement571cdoctype");

    /**
     * Gets the "SupportMessagesResponseElement" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement getSupportMessagesResponseElement();

    /**
     * Sets the "SupportMessagesResponseElement" element
     */
    void setSupportMessagesResponseElement(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement supportMessagesResponseElement);

    /**
     * Appends and returns a new empty "SupportMessagesResponseElement" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement addNewSupportMessagesResponseElement();

    /**
     * An XML SupportMessagesResponseElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
     *
     * This is a complex type.
     */
    public interface SupportMessagesResponseElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportMessagesResponseElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                               .resolveHandle("supportmessagesresponseelementf120elemtype");

        /**
         * Gets the "CurrentServerTime" element
         */
        java.util.Calendar getCurrentServerTime();

        /**
         * Gets (as xml) the "CurrentServerTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCurrentServerTime();

        /**
         * Sets the "CurrentServerTime" element
         */
        void setCurrentServerTime(java.util.Calendar currentServerTime);

        /**
         * Sets (as xml) the "CurrentServerTime" element
         */
        void xsetCurrentServerTime(
            org.apache.xmlbeans.XmlDateTime currentServerTime);

        /**
         * Gets the "MessageList" element
         */
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType getMessageList();

        /**
         * Sets the "MessageList" element
         */
        void setMessageList(
            com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType messageList);

        /**
         * Appends and returns a new empty "MessageList" element
         */
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType addNewMessageList();

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement newInstance() {
                return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                  .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument.SupportMessagesResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                  .newInstance(type,
                    options);
            }
        }
    }

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument newInstance() {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                               .parse(xis,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                               .newValidatingXMLInputStream(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                               .newValidatingXMLInputStream(xis,
                type, options);
        }
    }
}
