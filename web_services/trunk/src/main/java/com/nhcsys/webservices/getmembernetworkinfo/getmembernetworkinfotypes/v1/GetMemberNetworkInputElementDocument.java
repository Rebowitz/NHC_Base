/*
 * An XML document type.
 * Localname: GetMemberNetworkInputElement
 * Namespace: http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1
 * Java type: com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1;


/**
 * A document containing one GetMemberNetworkInputElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetMemberNetworkInputElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInputElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                           .resolveHandle("getmembernetworkinputelementbb06doctype");

    /**
     * Gets the "GetMemberNetworkInputElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement getGetMemberNetworkInputElement();

    /**
     * Sets the "GetMemberNetworkInputElement" element
     */
    void setGetMemberNetworkInputElement(
        com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement getMemberNetworkInputElement);

    /**
     * Appends and returns a new empty "GetMemberNetworkInputElement" element
     */
    com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement addNewGetMemberNetworkInputElement();

    /**
     * An XML GetMemberNetworkInputElement(@http://nhcsys.com/webservices/getmembernetworkinfo/getmembernetworkinfotypes/v1).
     *
     * This is a complex type.
     */
    public interface GetMemberNetworkInputElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMemberNetworkInputElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sE1CB4FBB81327F6D40C24E3022CAFD1D")
                                                                                                                               .resolveHandle("getmembernetworkinputelement935aelemtype");

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
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement newInstance() {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                                .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument.GetMemberNetworkInputElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument newInstance() {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                               .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmembernetworkinfo.getmembernetworkinfotypes.v1.GetMemberNetworkInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
