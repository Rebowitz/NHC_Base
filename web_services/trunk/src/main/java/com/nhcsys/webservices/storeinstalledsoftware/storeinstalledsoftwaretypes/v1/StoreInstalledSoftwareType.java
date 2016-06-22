/*
 * XML Type:  StoreInstalledSoftwareType
 * Namespace: http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1
 * Java type: com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1;


/**
 * An XML StoreInstalledSoftwareType(@http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1).
 *
 * This is a complex type.
 */
public interface StoreInstalledSoftwareType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StoreInstalledSoftwareType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s82513D034AD0ADD0F7C35BD73B355E96")
                                                                                                                           .resolveHandle("storeinstalledsoftwaretype7240type");

    /**
     * Gets the "ProductKey" element
     */
    java.lang.String getProductKey();

    /**
     * Gets (as xml) the "ProductKey" element
     */
    org.apache.xmlbeans.XmlString xgetProductKey();

    /**
     * Sets the "ProductKey" element
     */
    void setProductKey(java.lang.String productKey);

    /**
     * Sets (as xml) the "ProductKey" element
     */
    void xsetProductKey(org.apache.xmlbeans.XmlString productKey);

    /**
     * Gets the "ProductName" element
     */
    java.lang.String getProductName();

    /**
     * Gets (as xml) the "ProductName" element
     */
    org.apache.xmlbeans.XmlString xgetProductName();

    /**
     * Sets the "ProductName" element
     */
    void setProductName(java.lang.String productName);

    /**
     * Sets (as xml) the "ProductName" element
     */
    void xsetProductName(org.apache.xmlbeans.XmlString productName);

    /**
     * Gets the "CompanyName" element
     */
    java.lang.String getCompanyName();

    /**
     * Gets (as xml) the "CompanyName" element
     */
    org.apache.xmlbeans.XmlString xgetCompanyName();

    /**
     * Sets the "CompanyName" element
     */
    void setCompanyName(java.lang.String companyName);

    /**
     * Sets (as xml) the "CompanyName" element
     */
    void xsetCompanyName(org.apache.xmlbeans.XmlString companyName);

    /**
     * Gets the "ProductVersion" element
     */
    java.lang.String getProductVersion();

    /**
     * Gets (as xml) the "ProductVersion" element
     */
    org.apache.xmlbeans.XmlString xgetProductVersion();

    /**
     * Sets the "ProductVersion" element
     */
    void setProductVersion(java.lang.String productVersion);

    /**
     * Sets (as xml) the "ProductVersion" element
     */
    void xsetProductVersion(org.apache.xmlbeans.XmlString productVersion);

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType newInstance() {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                         .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
