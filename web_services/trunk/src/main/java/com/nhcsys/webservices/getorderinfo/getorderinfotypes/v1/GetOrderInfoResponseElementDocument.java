/*
 * An XML document type.
 * Localname: GetOrderInfoResponseElement
 * Namespace: http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1
 * Java type: com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1;


/**
 * A document containing one GetOrderInfoResponseElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1) element.
 *
 * This is a complex type.
 */
public interface GetOrderInfoResponseElementDocument extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetOrderInfoResponseElementDocument.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s152B4BB524EFE1591A942E2CA4EB2709")
                                                                                                                           .resolveHandle("getorderinforesponseelement81b9doctype");

    /**
     * Gets the "GetOrderInfoResponseElement" element
     */
    com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement getGetOrderInfoResponseElement();

    /**
     * Sets the "GetOrderInfoResponseElement" element
     */
    void setGetOrderInfoResponseElement(
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement getOrderInfoResponseElement);

    /**
     * Appends and returns a new empty "GetOrderInfoResponseElement" element
     */
    com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement addNewGetOrderInfoResponseElement();

    /**
     * An XML GetOrderInfoResponseElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1).
     *
     * This is a complex type.
     */
    public interface GetOrderInfoResponseElement extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetOrderInfoResponseElement.class.getClassLoader(),
                "schemaorg_apache_xmlbeans.system.s152B4BB524EFE1591A942E2CA4EB2709")
                                                                                                                               .resolveHandle("getorderinforesponseelement0e7aelemtype");

        /**
         * Gets array of all "ProductList" elements
         */
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[] getProductListArray();

        /**
         * Gets ith "ProductList" element
         */
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType getProductListArray(
            int i);

        /**
         * Returns number of "ProductList" element
         */
        int sizeOfProductListArray();

        /**
         * Sets array of all "ProductList" element
         */
        void setProductListArray(
            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[] productListArray);

        /**
         * Sets ith "ProductList" element
         */
        void setProductListArray(int i,
            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType productList);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProductList" element
         */
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType insertNewProductList(
            int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "ProductList" element
         */
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType addNewProductList();

        /**
         * Removes the ith "ProductList" element
         */
        void removeProductList(int i);

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement newInstance() {
                return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                                              .newInstance(type,
                    null);
            }

            public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement newInstance(
                org.apache.xmlbeans.XmlOptions options) {
                return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument newInstance() {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                              .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
