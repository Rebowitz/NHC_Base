/*
 * An XML document type.
 * Localname: SupportMessagesRequestElement
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1;


/**
 * A document containing one SupportMessagesRequestElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1) element.
 *
 * This is a complex type.
 */
public interface SupportMessagesRequestElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportMessagesRequestElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                           .resolveHandle("supportmessagesrequestelement8092doctype");

    /**
     * Gets the "SupportMessagesRequestElement" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement getSupportMessagesRequestElement();

    /**
     * Sets the "SupportMessagesRequestElement" element
     */
    void setSupportMessagesRequestElement(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement supportMessagesRequestElement);

    /**
     * Appends and returns a new empty "SupportMessagesRequestElement" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement addNewSupportMessagesRequestElement();

    /**
     * An XML SupportMessagesRequestElement(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
     *
     * This is a complex type.
     */
    public interface SupportMessagesRequestElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportMessagesRequestElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                               .resolveHandle("supportmessagesrequestelement8866elemtype");

        /**
         * Gets the "SessionID" element
         */
        java.lang.String getSessionID();

        /**
         * Gets (as xml) the "SessionID" element
         */
        org.apache.xmlbeans.XmlString xgetSessionID();

        /**
         * Sets the "SessionID" element
         */
        void setSessionID(java.lang.String sessionID);

        /**
         * Sets (as xml) the "SessionID" element
         */
        void xsetSessionID(org.apache.xmlbeans.XmlString sessionID);

        /**
         * Gets the "MessageID" element
         */
        long getMessageID();

        /**
         * Gets (as xml) the "MessageID" element
         */
        org.apache.xmlbeans.XmlLong xgetMessageID();

        /**
         * Sets the "MessageID" element
         */
        void setMessageID(long messageID);

        /**
         * Sets (as xml) the "MessageID" element
         */
        void xsetMessageID(org.apache.xmlbeans.XmlLong messageID);

        /**
         * Gets the "RetrieveAfterTime" element
         */
        java.util.Calendar getRetrieveAfterTime();

        /**
         * Gets (as xml) the "RetrieveAfterTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetRetrieveAfterTime();

        /**
         * Sets the "RetrieveAfterTime" element
         */
        void setRetrieveAfterTime(java.util.Calendar retrieveAfterTime);

        /**
         * Sets (as xml) the "RetrieveAfterTime" element
         */
        void xsetRetrieveAfterTime(
            org.apache.xmlbeans.XmlDateTime retrieveAfterTime);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement newInstance() {
                return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument.SupportMessagesRequestElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument newInstance() {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessagesRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
