/*
 * XML Type:  MessageListType
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1;


/**
 * An XML MessageListType(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
 *
 * This is a complex type.
 */
public interface MessageListType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageListType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                           .resolveHandle("messagelisttype9c39type");

    /**
     * Gets array of all "Message" elements
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType[] getMessageArray();

    /**
     * Gets ith "Message" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType getMessageArray(
        int i);

    /**
     * Returns number of "Message" element
     */
    int sizeOfMessageArray();

    /**
     * Sets array of all "Message" element
     */
    void setMessageArray(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType[] messageArray);

    /**
     * Sets ith "Message" element
     */
    void setMessageArray(int i,
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType message);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Message" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType insertNewMessage(
        int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Message" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType addNewMessage();

    /**
     * Removes the ith "Message" element
     */
    void removeMessage(int i);

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType newInstance() {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                        .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
