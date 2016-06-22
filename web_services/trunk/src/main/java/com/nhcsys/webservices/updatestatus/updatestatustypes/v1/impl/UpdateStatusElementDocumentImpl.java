/*
 * An XML document type.
 * Localname: UpdateStatusElement
 * Namespace: http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1
 * Java type: com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatestatus.updatestatustypes.v1.impl;

/**
 * A document containing one UpdateStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1) element.
 *
 * This is a complex type.
 */
public class UpdateStatusElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument {
    private static final javax.xml.namespace.QName UPDATESTATUSELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "UpdateStatusElement");

    public UpdateStatusElementDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "UpdateStatusElement" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement getUpdateStatusElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement) get_store()
                                                                                                                                    .find_element_user(UPDATESTATUSELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "UpdateStatusElement" element
     */
    public void setUpdateStatusElement(
        com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement updateStatusElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement) get_store()
                                                                                                                                    .find_element_user(UPDATESTATUSELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement) get_store()
                                                                                                                                        .add_element_user(UPDATESTATUSELEMENT$0);
            }

            target.set(updateStatusElement);
        }
    }

    /**
     * Appends and returns a new empty "UpdateStatusElement" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement addNewUpdateStatusElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement) get_store()
                                                                                                                                    .add_element_user(UPDATESTATUSELEMENT$0);

            return target;
        }
    }

    /**
     * An XML UpdateStatusElement(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1).
     *
     * This is a complex type.
     */
    public static class UpdateStatusElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument.UpdateStatusElement {
        private static final javax.xml.namespace.QName SESSIONID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
                "SessionID");
        private static final javax.xml.namespace.QName TASKLIST$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
                "TaskList");

        public UpdateStatusElementImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * Gets array of all "TaskList" elements
         */
        public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType[] getTaskListArray() {
            synchronized (monitor()) {
                check_orphaned();

                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKLIST$2, targetList);

                com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType[] result =
                    new com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType[targetList.size()];
                targetList.toArray(result);

                return result;
            }
        }

        /**
         * Gets ith "TaskList" element
         */
        public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType getTaskListArray(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType target =
                    null;
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType) get_store()
                                                                                                         .find_element_user(TASKLIST$2,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                return target;
            }
        }

        /**
         * Returns number of "TaskList" element
         */
        public int sizeOfTaskListArray() {
            synchronized (monitor()) {
                check_orphaned();

                return get_store().count_elements(TASKLIST$2);
            }
        }

        /**
         * Sets array of all "TaskList" element
         */
        public void setTaskListArray(
            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType[] taskListArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(taskListArray, TASKLIST$2);
            }
        }

        /**
         * Sets ith "TaskList" element
         */
        public void setTaskListArray(int i,
            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType taskList) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType target =
                    null;
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType) get_store()
                                                                                                         .find_element_user(TASKLIST$2,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                target.set(taskList);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "TaskList" element
         */
        public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType insertNewTaskList(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType target =
                    null;
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType) get_store()
                                                                                                         .insert_element_user(TASKLIST$2,
                        i);

                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "TaskList" element
         */
        public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType addNewTaskList() {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType target =
                    null;
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType) get_store()
                                                                                                         .add_element_user(TASKLIST$2);

                return target;
            }
        }

        /**
         * Removes the ith "TaskList" element
         */
        public void removeTaskList(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(TASKLIST$2, i);
            }
        }
    }
}
