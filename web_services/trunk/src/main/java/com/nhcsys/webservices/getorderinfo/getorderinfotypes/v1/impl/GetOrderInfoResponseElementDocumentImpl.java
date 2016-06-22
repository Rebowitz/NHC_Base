/*
 * An XML document type.
 * Localname: GetOrderInfoResponseElement
 * Namespace: http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1
 * Java type: com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.impl;

/**
 * A document containing one GetOrderInfoResponseElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1) element.
 *
 * This is a complex type.
 */
public class GetOrderInfoResponseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument {
    private static final javax.xml.namespace.QName GETORDERINFORESPONSEELEMENT$0 =
        new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
            "GetOrderInfoResponseElement");

    public GetOrderInfoResponseElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetOrderInfoResponseElement" element
     */
    public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement getGetOrderInfoResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) get_store()
                                                                                                                                                    .find_element_user(GETORDERINFORESPONSEELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetOrderInfoResponseElement" element
     */
    public void setGetOrderInfoResponseElement(
        com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement getOrderInfoResponseElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) get_store()
                                                                                                                                                    .find_element_user(GETORDERINFORESPONSEELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) get_store()
                                                                                                                                                        .add_element_user(GETORDERINFORESPONSEELEMENT$0);
            }

            target.set(getOrderInfoResponseElement);
        }
    }

    /**
     * Appends and returns a new empty "GetOrderInfoResponseElement" element
     */
    public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement addNewGetOrderInfoResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement target =
                null;
            target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement) get_store()
                                                                                                                                                    .add_element_user(GETORDERINFORESPONSEELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetOrderInfoResponseElement(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1).
     *
     * This is a complex type.
     */
    public static class GetOrderInfoResponseElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.GetOrderInfoResponseElementDocument.GetOrderInfoResponseElement {
        private static final javax.xml.namespace.QName PRODUCTLIST$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
                "ProductList");

        public GetOrderInfoResponseElementImpl(
            org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets array of all "ProductList" elements
         */
        public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[] getProductListArray() {
            synchronized (monitor()) {
                check_orphaned();

                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRODUCTLIST$0, targetList);

                com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[] result =
                    new com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[targetList.size()];
                targetList.toArray(result);

                return result;
            }
        }

        /**
         * Gets ith "ProductList" element
         */
        public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType getProductListArray(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType target =
                    null;
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType) get_store()
                                                                                                        .find_element_user(PRODUCTLIST$0,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                return target;
            }
        }

        /**
         * Returns number of "ProductList" element
         */
        public int sizeOfProductListArray() {
            synchronized (monitor()) {
                check_orphaned();

                return get_store().count_elements(PRODUCTLIST$0);
            }
        }

        /**
         * Sets array of all "ProductList" element
         */
        public void setProductListArray(
            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType[] productListArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(productListArray, PRODUCTLIST$0);
            }
        }

        /**
         * Sets ith "ProductList" element
         */
        public void setProductListArray(int i,
            com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType productList) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType target =
                    null;
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType) get_store()
                                                                                                        .find_element_user(PRODUCTLIST$0,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                target.set(productList);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProductList" element
         */
        public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType insertNewProductList(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType target =
                    null;
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType) get_store()
                                                                                                        .insert_element_user(PRODUCTLIST$0,
                        i);

                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "ProductList" element
         */
        public com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType addNewProductList() {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType target =
                    null;
                target = (com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType) get_store()
                                                                                                        .add_element_user(PRODUCTLIST$0);

                return target;
            }
        }

        /**
         * Removes the ith "ProductList" element
         */
        public void removeProductList(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PRODUCTLIST$0, i);
            }
        }
    }
}
