/*
 * XML Type:  StoreInstalledSoftwareListType
 * Namespace: http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1
 * Java type: com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1;


/**
 * An XML StoreInstalledSoftwareListType(@http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1).
 *
 * This is a complex type.
 */
public interface StoreInstalledSoftwareListType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StoreInstalledSoftwareListType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s82513D034AD0ADD0F7C35BD73B355E96")
                                                                                                                           .resolveHandle("storeinstalledsoftwarelisttype107etype");

    /**
     * Gets array of all "StoreInstalledSoftwareElement" elements
     */
    com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType[] getStoreInstalledSoftwareElementArray();

    /**
     * Gets ith "StoreInstalledSoftwareElement" element
     */
    com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType getStoreInstalledSoftwareElementArray(
        int i);

    /**
     * Returns number of "StoreInstalledSoftwareElement" element
     */
    int sizeOfStoreInstalledSoftwareElementArray();

    /**
     * Sets array of all "StoreInstalledSoftwareElement" element
     */
    void setStoreInstalledSoftwareElementArray(
        com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType[] storeInstalledSoftwareElementArray);

    /**
     * Sets ith "StoreInstalledSoftwareElement" element
     */
    void setStoreInstalledSoftwareElementArray(int i,
        com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType storeInstalledSoftwareElement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StoreInstalledSoftwareElement" element
     */
    com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType insertNewStoreInstalledSoftwareElement(
        int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StoreInstalledSoftwareElement" element
     */
    com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType addNewStoreInstalledSoftwareElement();

    /**
     * Removes the ith "StoreInstalledSoftwareElement" element
     */
    void removeStoreInstalledSoftwareElement(int i);

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType newInstance() {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                             .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
