/*
 * An XML document type.
 * Localname: GetMemberNetworkInfoElement
 * Namespace: http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1
 * Java type: com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1;


/**
 * A document containing one GetMemberNetworkInfoElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetMemberNetworkInfoElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInfoElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                           .resolveHandle("getmembernetworkinfoelement1954doctype");

    /**
     * Gets the "GetMemberNetworkInfoElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement getGetMemberNetworkInfoElement();

    /**
     * Sets the "GetMemberNetworkInfoElement" element
     */
    void setGetMemberNetworkInfoElement(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement getMemberNetworkInfoElement);

    /**
     * Appends and returns a new empty "GetMemberNetworkInfoElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement addNewGetMemberNetworkInfoElement();

    /**
     * An XML GetMemberNetworkInfoElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1).
     *
     * This is a complex type.
     */
    public interface GetMemberNetworkInfoElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInfoElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                               .resolveHandle("getmembernetworkinfoelementb5b0elemtype");

        /**
         * Gets the "WirelessNetworkInfo" element
         */
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.WirelessNetworkInfoType.Enum getWirelessNetworkInfo();

        /**
         * Gets (as xml) the "WirelessNetworkInfo" element
         */
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.WirelessNetworkInfoType xgetWirelessNetworkInfo();

        /**
         * Sets the "WirelessNetworkInfo" element
         */
        void setWirelessNetworkInfo(
            com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.WirelessNetworkInfoType.Enum wirelessNetworkInfo);

        /**
         * Sets (as xml) the "WirelessNetworkInfo" element
         */
        void xsetWirelessNetworkInfo(
            com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.WirelessNetworkInfoType wirelessNetworkInfo);

        /**
         * Gets the "SSID" element
         */
        java.lang.String getSSID();

        /**
         * Gets (as xml) the "SSID" element
         */
        org.apache.xmlbeans.XmlString xgetSSID();

        /**
         * Sets the "SSID" element
         */
        void setSSID(java.lang.String ssid);

        /**
         * Sets (as xml) the "SSID" element
         */
        void xsetSSID(org.apache.xmlbeans.XmlString ssid);

        /**
         * Gets the "Passphrase" element
         */
        java.lang.String getPassphrase();

        /**
         * Gets (as xml) the "Passphrase" element
         */
        org.apache.xmlbeans.XmlString xgetPassphrase();

        /**
         * Sets the "Passphrase" element
         */
        void setPassphrase(java.lang.String passphrase);

        /**
         * Sets (as xml) the "Passphrase" element
         */
        void xsetPassphrase(org.apache.xmlbeans.XmlString passphrase);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement newInstance() {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                              .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument.GetMemberNetworkInfoElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument newInstance() {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                              .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
