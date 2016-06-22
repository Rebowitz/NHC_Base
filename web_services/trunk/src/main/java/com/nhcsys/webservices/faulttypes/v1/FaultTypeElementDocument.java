/*
 * An XML document type.
 * Localname: FaultTypeElement
 * Namespace: http://nhcsys.com/webservices/faulttypes/v1
 * Java type: com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.faulttypes.v1;


/**
 * A document containing one FaultTypeElement(@http://nhcsys.com/webservices/faulttypes/v1) element.
 *
 * This is a complex type.
 */
public interface FaultTypeElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaultTypeElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s3155F39972B71E6268683813A57A12FE")
                                                                                                                           .resolveHandle("faulttypeelementc9e9doctype");

    /**
     * Gets the "FaultTypeElement" element
     */
    com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement getFaultTypeElement();

    /**
     * Sets the "FaultTypeElement" element
     */
    void setFaultTypeElement(
        com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement faultTypeElement);

    /**
     * Appends and returns a new empty "FaultTypeElement" element
     */
    com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement addNewFaultTypeElement();

    /**
     * An XML FaultTypeElement(@http://nhcsys.com/webservices/faulttypes/v1).
     *
     * This is a complex type.
     */
    public interface FaultTypeElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaultTypeElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.s3155F39972B71E6268683813A57A12FE")
                                                                                                                               .resolveHandle("faulttypeelement12cdelemtype");

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

            public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement newInstance() {
                return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument.FaultTypeElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument newInstance() {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                               .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.faulttypes.v1.FaultTypeElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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