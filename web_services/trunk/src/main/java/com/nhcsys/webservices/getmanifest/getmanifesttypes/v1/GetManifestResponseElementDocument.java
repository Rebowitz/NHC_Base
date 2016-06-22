/*
 * An XML document type.
 * Localname: GetManifestResponseElement
 * Namespace: http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1
 * Java type: com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmanifest.getmanifesttypes.v1;


/**
 * A document containing one GetManifestResponseElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetManifestResponseElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetManifestResponseElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sCD2421A5F48D45B5E770D85AF194306E")
                                                                                                                           .resolveHandle("getmanifestresponseelement69b8doctype");

    /**
     * Gets the "GetManifestResponseElement" element
     */
    com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement getGetManifestResponseElement();

    /**
     * Sets the "GetManifestResponseElement" element
     */
    void setGetManifestResponseElement(
        com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement getManifestResponseElement);

    /**
     * Appends and returns a new empty "GetManifestResponseElement" element
     */
    com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement addNewGetManifestResponseElement();

    /**
     * An XML GetManifestResponseElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1).
     *
     * This is a complex type.
     */
    public interface GetManifestResponseElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetManifestResponseElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sCD2421A5F48D45B5E770D85AF194306E")
                                                                                                                               .resolveHandle("getmanifestresponseelement1aa6elemtype");

        /**
         * Gets the "FileName" element
         */
        java.lang.String getFileName();

        /**
         * Gets (as xml) the "FileName" element
         */
        org.apache.xmlbeans.XmlString xgetFileName();

        /**
         * Sets the "FileName" element
         */
        void setFileName(java.lang.String fileName);

        /**
         * Sets (as xml) the "FileName" element
         */
        void xsetFileName(org.apache.xmlbeans.XmlString fileName);

        /**
         * Gets the "FileSize" element
         */
        java.lang.String getFileSize();

        /**
         * Gets (as xml) the "FileSize" element
         */
        org.apache.xmlbeans.XmlString xgetFileSize();

        /**
         * Sets the "FileSize" element
         */
        void setFileSize(java.lang.String fileSize);

        /**
         * Sets (as xml) the "FileSize" element
         */
        void xsetFileSize(org.apache.xmlbeans.XmlString fileSize);

        /**
         * Gets the "MD5Hash" element
         */
        java.lang.String getMD5Hash();

        /**
         * Gets (as xml) the "MD5Hash" element
         */
        org.apache.xmlbeans.XmlString xgetMD5Hash();

        /**
         * Sets the "MD5Hash" element
         */
        void setMD5Hash(java.lang.String md5Hash);

        /**
         * Sets (as xml) the "MD5Hash" element
         */
        void xsetMD5Hash(org.apache.xmlbeans.XmlString md5Hash);

        /**
         * Gets the "ManifestResponse" element
         */
        byte[] getManifestResponse();

        /**
         * Gets (as xml) the "ManifestResponse" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetManifestResponse();

        /**
         * Sets the "ManifestResponse" element
         */
        void setManifestResponse(byte[] manifestResponse);

        /**
         * Sets (as xml) the "ManifestResponse" element
         */
        void xsetManifestResponse(
            org.apache.xmlbeans.XmlBase64Binary manifestResponse);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement newInstance() {
                return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                          .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument newInstance() {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                           .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
