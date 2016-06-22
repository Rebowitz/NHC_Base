/*
 * An XML document type.
 * Localname: GetManifestInputElement
 * Namespace: http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1
 * Java type: com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmanifest.getmanifesttypes.v1;


/**
 * A document containing one GetManifestInputElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetManifestInputElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetManifestInputElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sCD2421A5F48D45B5E770D85AF194306E")
                                                                                                                           .resolveHandle("getmanifestinputelement0c67doctype");

    /**
     * Gets the "GetManifestInputElement" element
     */
    com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement getGetManifestInputElement();

    /**
     * Sets the "GetManifestInputElement" element
     */
    void setGetManifestInputElement(
        com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement getManifestInputElement);

    /**
     * Appends and returns a new empty "GetManifestInputElement" element
     */
    com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement addNewGetManifestInputElement();

    /**
     * An XML GetManifestInputElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1).
     *
     * This is a complex type.
     */
    public interface GetManifestInputElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetManifestInputElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sCD2421A5F48D45B5E770D85AF194306E")
                                                                                                                               .resolveHandle("getmanifestinputelement37caelemtype");

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
         * Gets the "Make" element
         */
        java.lang.String getMake();

        /**
         * Gets (as xml) the "Make" element
         */
        org.apache.xmlbeans.XmlString xgetMake();

        /**
         * Sets the "Make" element
         */
        void setMake(java.lang.String make);

        /**
         * Sets (as xml) the "Make" element
         */
        void xsetMake(org.apache.xmlbeans.XmlString make);

        /**
         * Gets the "Model" element
         */
        java.lang.String getModel();

        /**
         * Gets (as xml) the "Model" element
         */
        org.apache.xmlbeans.XmlString xgetModel();

        /**
         * Sets the "Model" element
         */
        void setModel(java.lang.String model);

        /**
         * Sets (as xml) the "Model" element
         */
        void xsetModel(org.apache.xmlbeans.XmlString model);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement newInstance() {
                return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                    .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument newInstance() {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                        .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
