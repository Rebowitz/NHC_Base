/*
 * An XML document type.
 * Localname: FaultTypeElement
 * Namespace: http://nhcsys.com/webservices/getfiles/getfilestypes/v1
 * Java type: com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getfiles.getfilestypes.v1.impl;

/**
 * A document containing one FaultTypeElement(@http://nhcsys.com/webservices/getfiles/getfilestypes/v1) element.
 *
 * This is a complex type.
 */
public class FaultTypeElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument {
    private static final javax.xml.namespace.QName FAULTTYPEELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
            "FaultTypeElement");

    public FaultTypeElementDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "FaultTypeElement" element
     */
    public com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement getFaultTypeElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement) get_store()
                                                                                                                      .find_element_user(FAULTTYPEELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "FaultTypeElement" element
     */
    public void setFaultTypeElement(
        com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement faultTypeElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement) get_store()
                                                                                                                      .find_element_user(FAULTTYPEELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement) get_store()
                                                                                                                          .add_element_user(FAULTTYPEELEMENT$0);
            }

            target.set(faultTypeElement);
        }
    }

    /**
     * Appends and returns a new empty "FaultTypeElement" element
     */
    public com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement addNewFaultTypeElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement) get_store()
                                                                                                                      .add_element_user(FAULTTYPEELEMENT$0);

            return target;
        }
    }

    /**
     * An XML FaultTypeElement(@http://nhcsys.com/webservices/getfiles/getfilestypes/v1).
     *
     * This is a complex type.
     */
    public static class FaultTypeElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getfiles.getfilestypes.v1.FaultTypeElementDocument.FaultTypeElement {
        private static final javax.xml.namespace.QName DESCRIPTION$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
                "description");
        private static final javax.xml.namespace.QName CODE$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
                "code");
        private static final javax.xml.namespace.QName CAUSE$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
                "cause");

        public FaultTypeElementImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(DESCRIPTION$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(DESCRIPTION$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(DESCRIPTION$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(DESCRIPTION$0);
                }

                target.setStringValue(description);
            }
        }

        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(DESCRIPTION$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(DESCRIPTION$0);
                }

                target.set(description);
            }
        }

        /**
         * Gets the "code" element
         */
        public long getCode() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CODE$2,
                        0);

                if (target == null) {
                    return 0L;
                }

                return target.getLongValue();
            }
        }

        /**
         * Gets (as xml) the "code" element
         */
        public org.apache.xmlbeans.XmlLong xgetCode() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong) get_store()
                                                           .find_element_user(CODE$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "code" element
         */
        public void setCode(long code) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CODE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(CODE$2);
                }

                target.setLongValue(code);
            }
        }

        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlLong code) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong) get_store()
                                                           .find_element_user(CODE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlLong) get_store()
                                                               .add_element_user(CODE$2);
                }

                target.set(code);
            }
        }

        /**
         * Gets the "cause" element
         */
        public java.lang.String getCause() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CAUSE$4,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "cause" element
         */
        public org.apache.xmlbeans.XmlString xgetCause() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(CAUSE$4,
                        0);

                return target;
            }
        }

        /**
         * Sets the "cause" element
         */
        public void setCause(java.lang.String cause) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CAUSE$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(CAUSE$4);
                }

                target.setStringValue(cause);
            }
        }

        /**
         * Sets (as xml) the "cause" element
         */
        public void xsetCause(org.apache.xmlbeans.XmlString cause) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(CAUSE$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(CAUSE$4);
                }

                target.set(cause);
            }
        }
    }
}
