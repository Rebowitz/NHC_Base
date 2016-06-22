/*
 * An XML document type.
 * Localname: LoginCredentialsElement
 * Namespace: http://nhcsys.com/webservices/login/logintypes/v1
 * Java type: com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.login.logintypes.v1;


/**
 * A document containing one LoginCredentialsElement(@http://nhcsys.com/webservices/login/logintypes/v1) element.
 *
 * This is a complex type.
 */
public interface LoginCredentialsElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoginCredentialsElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s0CFB8C267453C49EC9374A6BDD0FB01C")
                                                                                                                           .resolveHandle("logincredentialselement5d41doctype");

    /**
     * Gets the "LoginCredentialsElement" element
     */
    com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement getLoginCredentialsElement();

    /**
     * Sets the "LoginCredentialsElement" element
     */
    void setLoginCredentialsElement(
        com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement loginCredentialsElement);

    /**
     * Appends and returns a new empty "LoginCredentialsElement" element
     */
    com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement addNewLoginCredentialsElement();

    /**
     * An XML LoginCredentialsElement(@http://nhcsys.com/webservices/login/logintypes/v1).
     *
     * This is a complex type.
     */
    public interface LoginCredentialsElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoginCredentialsElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.s0CFB8C267453C49EC9374A6BDD0FB01C")
                                                                                                                               .resolveHandle("logincredentialselement15b6elemtype");

        /**
         * Gets the "Token" element
         */
        java.lang.String getToken();

        /**
         * Gets (as xml) the "Token" element
         */
        org.apache.xmlbeans.XmlString xgetToken();

        /**
         * Sets the "Token" element
         */
        void setToken(java.lang.String token);

        /**
         * Sets (as xml) the "Token" element
         */
        void xsetToken(org.apache.xmlbeans.XmlString token);

        /**
         * Gets the "ViveID" element
         */
        java.lang.String getViveID();

        /**
         * Gets (as xml) the "ViveID" element
         */
        org.apache.xmlbeans.XmlString xgetViveID();

        /**
         * Sets the "ViveID" element
         */
        void setViveID(java.lang.String viveID);

        /**
         * Sets (as xml) the "ViveID" element
         */
        void xsetViveID(org.apache.xmlbeans.XmlString viveID);

        /**
         * Gets the "AppName" element
         */
        java.lang.String getAppName();

        /**
         * Gets (as xml) the "AppName" element
         */
        org.apache.xmlbeans.XmlString xgetAppName();

        /**
         * Sets the "AppName" element
         */
        void setAppName(java.lang.String appName);

        /**
         * Sets (as xml) the "AppName" element
         */
        void xsetAppName(org.apache.xmlbeans.XmlString appName);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement newInstance() {
                return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                        .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument newInstance() {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                            .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
