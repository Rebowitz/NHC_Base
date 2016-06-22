/*
 * XML Type:  SNMPQType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1;


/**
 * An XML SNMPQType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is a complex type.
 */
public interface SNMPQType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SNMPQType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s9DCD30C8DB2E5E9A0C1B748FD52E35F7")
                                                                                                                           .resolveHandle("snmpqtype9ea1type");

    /**
     * Gets the "Name" element
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Gets the "Tree" element
     */
    java.lang.String getTree();

    /**
     * Gets (as xml) the "Tree" element
     */
    org.apache.xmlbeans.XmlString xgetTree();

    /**
     * Sets the "Tree" element
     */
    void setTree(java.lang.String tree);

    /**
     * Sets (as xml) the "Tree" element
     */
    void xsetTree(org.apache.xmlbeans.XmlString tree);

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType newInstance() {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                            .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
