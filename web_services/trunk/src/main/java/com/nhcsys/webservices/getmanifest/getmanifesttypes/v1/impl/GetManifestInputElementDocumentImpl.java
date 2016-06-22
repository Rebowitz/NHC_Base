/*
 * An XML document type.
 * Localname: GetManifestInputElement
 * Namespace: http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1
 * Java type: com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.impl;

/**
 * A document containing one GetManifestInputElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1) element.
 *
 * This is a complex type.
 */
public class GetManifestInputElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument {
    private static final javax.xml.namespace.QName GETMANIFESTINPUTELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
            "GetManifestInputElement");

    public GetManifestInputElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetManifestInputElement" element
     */
    public com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement getGetManifestInputElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) get_store()
                                                                                                                                          .find_element_user(GETMANIFESTINPUTELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetManifestInputElement" element
     */
    public void setGetManifestInputElement(
        com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement getManifestInputElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) get_store()
                                                                                                                                          .find_element_user(GETMANIFESTINPUTELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) get_store()
                                                                                                                                              .add_element_user(GETMANIFESTINPUTELEMENT$0);
            }

            target.set(getManifestInputElement);
        }
    }

    /**
     * Appends and returns a new empty "GetManifestInputElement" element
     */
    public com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement addNewGetManifestInputElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement) get_store()
                                                                                                                                          .add_element_user(GETMANIFESTINPUTELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetManifestInputElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1).
     *
     * This is a complex type.
     */
    public static class GetManifestInputElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestInputElementDocument.GetManifestInputElement {
        private static final javax.xml.namespace.QName SESSIONID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "SessionID");
        private static final javax.xml.namespace.QName MAKE$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "Make");
        private static final javax.xml.namespace.QName MODEL$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "Model");

        public GetManifestInputElementImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "SessionID" element
         */
        public java.lang.String getSessionID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "SessionID" element
         */
        public org.apache.xmlbeans.XmlString xgetSessionID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(SESSIONID$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "SessionID" element
         */
        public void setSessionID(java.lang.String sessionID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(SESSIONID$0);
                }

                target.setStringValue(sessionID);
            }
        }

        /**
         * Sets (as xml) the "SessionID" element
         */
        public void xsetSessionID(org.apache.xmlbeans.XmlString sessionID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(SESSIONID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(SESSIONID$0);
                }

                target.set(sessionID);
            }
        }

        /**
         * Gets the "Make" element
         */
        public java.lang.String getMake() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MAKE$2,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "Make" element
         */
        public org.apache.xmlbeans.XmlString xgetMake() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MAKE$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "Make" element
         */
        public void setMake(java.lang.String make) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MAKE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(MAKE$2);
                }

                target.setStringValue(make);
            }
        }

        /**
         * Sets (as xml) the "Make" element
         */
        public void xsetMake(org.apache.xmlbeans.XmlString make) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MAKE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(MAKE$2);
                }

                target.set(make);
            }
        }

        /**
         * Gets the "Model" element
         */
        public java.lang.String getModel() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MODEL$4,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "Model" element
         */
        public org.apache.xmlbeans.XmlString xgetModel() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MODEL$4,
                        0);

                return target;
            }
        }

        /**
         * Sets the "Model" element
         */
        public void setModel(java.lang.String model) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MODEL$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(MODEL$4);
                }

                target.setStringValue(model);
            }
        }

        /**
         * Sets (as xml) the "Model" element
         */
        public void xsetModel(org.apache.xmlbeans.XmlString model) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MODEL$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(MODEL$4);
                }

                target.set(model);
            }
        }
    }
}
