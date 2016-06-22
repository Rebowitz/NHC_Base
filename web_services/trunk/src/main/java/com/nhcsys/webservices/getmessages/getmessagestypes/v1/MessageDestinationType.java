/*
 * XML Type:  MessageDestinationType
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1;


/**
 * An XML MessageDestinationType(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
 *
 * This is a complex type.
 */
public interface MessageDestinationType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageDestinationType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                           .resolveHandle("messagedestinationtype73edtype");

    /**
     * Gets the "Destination" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum getDestination();

    /**
     * Gets (as xml) the "Destination" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType xgetDestination();

    /**
     * Sets the "Destination" element
     */
    void setDestination(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum destination);

    /**
     * Sets (as xml) the "Destination" element
     */
    void xsetDestination(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType destination);

    /**
     * Gets the "GroupName" element
     */
    java.lang.String getGroupName();

    /**
     * Gets (as xml) the "GroupName" element
     */
    org.apache.xmlbeans.XmlString xgetGroupName();

    /**
     * Tests for nil "GroupName" element
     */
    boolean isNilGroupName();

    /**
     * Sets the "GroupName" element
     */
    void setGroupName(java.lang.String groupName);

    /**
     * Sets (as xml) the "GroupName" element
     */
    void xsetGroupName(org.apache.xmlbeans.XmlString groupName);

    /**
     * Nils the "GroupName" element
     */
    void setNilGroupName();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType newInstance() {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                               .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
