/*
 * An XML document type.
 * Localname: ProcessCompletedStatusElement
 * Namespace: http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1
 * Java type: com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatestatus.updatestatustypes.v1;


/**
 * A document containing one ProcessCompletedStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1) element.
 *
 * This is a complex type.
 */
public interface ProcessCompletedStatusElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessCompletedStatusElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sD31E19F1B75A0B807DEC7868DC7D4161")
                                                                                                                           .resolveHandle("processcompletedstatuselement4d52doctype");

    /**
     * Gets the "ProcessCompletedStatusElement" element
     */
    com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement getProcessCompletedStatusElement();

    /**
     * Sets the "ProcessCompletedStatusElement" element
     */
    void setProcessCompletedStatusElement(
        com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement processCompletedStatusElement);

    /**
     * Appends and returns a new empty "ProcessCompletedStatusElement" element
     */
    com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement addNewProcessCompletedStatusElement();

    /**
     * An XML ProcessCompletedStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1).
     *
     * This is a complex type.
     */
    public interface ProcessCompletedStatusElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessCompletedStatusElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.sD31E19F1B75A0B807DEC7868DC7D4161")
                                                                                                                               .resolveHandle("processcompletedstatuselement9f0celemtype");

        /**
         * Gets the "processcompleted" element
         */
        boolean getProcesscompleted();

        /**
         * Gets (as xml) the "processcompleted" element
         */
        org.apache.xmlbeans.XmlBoolean xgetProcesscompleted();

        /**
         * Sets the "processcompleted" element
         */
        void setProcesscompleted(boolean processcompleted);

        /**
         * Sets (as xml) the "processcompleted" element
         */
        void xsetProcesscompleted(
            org.apache.xmlbeans.XmlBoolean processcompleted);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement newInstance() {
                return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                                  .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument newInstance() {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
