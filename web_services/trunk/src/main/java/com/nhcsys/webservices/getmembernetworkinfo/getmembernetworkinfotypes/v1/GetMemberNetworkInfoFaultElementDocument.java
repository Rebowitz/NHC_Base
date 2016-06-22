/*
 * An XML document type.
 * Localname: GetMemberNetworkInfoFaultElement
 * Namespace: http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1
 * Java type: com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1;


/**
 * A document containing one GetMemberNetworkInfoFaultElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetMemberNetworkInfoFaultElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInfoFaultElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                           .resolveHandle("getmembernetworkinfofaultelement99fcdoctype");

    /**
     * Gets the "GetMemberNetworkInfoFaultElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement getGetMemberNetworkInfoFaultElement();

    /**
     * Sets the "GetMemberNetworkInfoFaultElement" element
     */
    void setGetMemberNetworkInfoFaultElement(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement getMemberNetworkInfoFaultElement);

    /**
     * Appends and returns a new empty "GetMemberNetworkInfoFaultElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement addNewGetMemberNetworkInfoFaultElement();

    /**
     * An XML GetMemberNetworkInfoFaultElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1).
     *
     * This is a complex type.
     */
    public interface GetMemberNetworkInfoFaultElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInfoFaultElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                               .resolveHandle("getmembernetworkinfofaultelementcd1aelemtype");

        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();

        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();

        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);

        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);

        /**
         * Gets the "code" element
         */
        java.lang.String getCode();

        /**
         * Gets (as xml) the "code" element
         */
        org.apache.xmlbeans.XmlString xgetCode();

        /**
         * Sets the "code" element
         */
        void setCode(java.lang.String code);

        /**
         * Sets (as xml) the "code" element
         */
        void xsetCode(org.apache.xmlbeans.XmlString code);

        /**
         * Gets the "cause" element
         */
        java.lang.String getCause();

        /**
         * Gets (as xml) the "cause" element
         */
        org.apache.xmlbeans.XmlString xgetCause();

        /**
         * Sets the "cause" element
         */
        void setCause(java.lang.String cause);

        /**
         * Sets (as xml) the "cause" element
         */
        void xsetCause(org.apache.xmlbeans.XmlString cause);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement newInstance() {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                                        .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument.GetMemberNetworkInfoFaultElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument newInstance() {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                   .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInfoFaultElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
