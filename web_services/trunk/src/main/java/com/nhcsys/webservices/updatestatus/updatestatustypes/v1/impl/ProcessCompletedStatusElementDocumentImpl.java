/*
 * An XML document type.
 * Localname: ProcessCompletedStatusElement
 * Namespace: http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1
 * Java type: com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatestatus.updatestatustypes.v1.impl;

/**
 * A document containing one ProcessCompletedStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1) element.
 *
 * This is a complex type.
 */
public class ProcessCompletedStatusElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument {
    private static final javax.xml.namespace.QName PROCESSCOMPLETEDSTATUSELEMENT$0 =
        new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "ProcessCompletedStatusElement");

    public ProcessCompletedStatusElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "ProcessCompletedStatusElement" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement getProcessCompletedStatusElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) get_store()
                                                                                                                                                        .find_element_user(PROCESSCOMPLETEDSTATUSELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "ProcessCompletedStatusElement" element
     */
    public void setProcessCompletedStatusElement(
        com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement processCompletedStatusElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) get_store()
                                                                                                                                                        .find_element_user(PROCESSCOMPLETEDSTATUSELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) get_store()
                                                                                                                                                            .add_element_user(PROCESSCOMPLETEDSTATUSELEMENT$0);
            }

            target.set(processCompletedStatusElement);
        }
    }

    /**
     * Appends and returns a new empty "ProcessCompletedStatusElement" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement addNewProcessCompletedStatusElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement) get_store()
                                                                                                                                                        .add_element_user(PROCESSCOMPLETEDSTATUSELEMENT$0);

            return target;
        }
    }

    /**
     * An XML ProcessCompletedStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1).
     *
     * This is a complex type.
     */
    public static class ProcessCompletedStatusElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument.ProcessCompletedStatusElement {
        private static final javax.xml.namespace.QName PROCESSCOMPLETED$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
                "processcompleted");

        public ProcessCompletedStatusElementImpl(
            org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "processcompleted" element
         */
        public boolean getProcesscompleted() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(PROCESSCOMPLETED$0,
                        0);

                if (target == null) {
                    return false;
                }

                return target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "processcompleted" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetProcesscompleted() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean) get_store()
                                                              .find_element_user(PROCESSCOMPLETED$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "processcompleted" element
         */
        public void setProcesscompleted(boolean processcompleted) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(PROCESSCOMPLETED$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(PROCESSCOMPLETED$0);
                }

                target.setBooleanValue(processcompleted);
            }
        }

        /**
         * Sets (as xml) the "processcompleted" element
         */
        public void xsetProcesscompleted(
            org.apache.xmlbeans.XmlBoolean processcompleted) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean) get_store()
                                                              .find_element_user(PROCESSCOMPLETED$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean) get_store()
                                                                  .add_element_user(PROCESSCOMPLETED$0);
                }

                target.set(processcompleted);
            }
        }
    }
}
