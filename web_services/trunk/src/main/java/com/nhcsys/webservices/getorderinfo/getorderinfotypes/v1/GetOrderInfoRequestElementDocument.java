/*
 * An XML document type.
 * Localname: GetOrderInfoRequestElement
 * Namespace: http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1
 * Java type: com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1;


/**
 * A document containing one GetOrderInfoRequestElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetOrderInfoRequestElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetOrderInfoRequestElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s152B4BB524EFE1591A942E2CA4EB2709")
                                                                                                                           .resolveHandle("getorderinforequestelementfa89doctype");

    /**
     * Gets the "GetOrderInfoRequestElement" element
     */
    com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement getGetOrderInfoRequestElement();

    /**
     * Sets the "GetOrderInfoRequestElement" element
     */
    void setGetOrderInfoRequestElement(
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement getOrderInfoRequestElement);

    /**
     * Appends and returns a new empty "GetOrderInfoRequestElement" element
     */
    com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement addNewGetOrderInfoRequestElement();

    /**
     * An XML GetOrderInfoRequestElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1).
     *
     * This is a complex type.
     */
    public interface GetOrderInfoRequestElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetOrderInfoRequestElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.s152B4BB524EFE1591A942E2CA4EB2709")
                                                                                                                               .resolveHandle("getorderinforequestelement2cbaelemtype");

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

            public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement newInstance() {
                return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                            .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument.GetOrderInfoRequestElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument newInstance() {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                             .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoRequestElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
