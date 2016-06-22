/*
 * An XML document type.
 * Localname: GetFilesResponseElement
 * Namespace: http://nhcsys.com/webservices/getfiles/getfilestypes/v1
 * Java type: com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getfiles.getfilestypes.v1.impl;

/**
 * A document containing one GetFilesResponseElement(@http://nhcsys.com/webservices/getfiles/getfilestypes/v1) element.
 *
 * This is a complex type.
 */
public class GetFilesResponseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument {
    private static final javax.xml.namespace.QName GETFILESRESPONSEELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
            "GetFilesResponseElement");

    public GetFilesResponseElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetFilesResponseElement" element
     */
    public com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement getGetFilesResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement) get_store()
                                                                                                                                    .find_element_user(GETFILESRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetFilesResponseElement" element
     */
    public void setGetFilesResponseElement(
        com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement getFilesResponseElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement) get_store()
                                                                                                                                    .find_element_user(GETFILESRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement) get_store()
                                                                                                                                        .add_element_user(GETFILESRESPONSEELEMENT$0);
            }

            target.set(getFilesResponseElement);
        }
    }

    /**
     * Appends and returns a new empty "GetFilesResponseElement" element
     */
    public com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement addNewGetFilesResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement target =
                null;
            target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement) get_store()
                                                                                                                                    .add_element_user(GETFILESRESPONSEELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetFilesResponseElement(@http://nhcsys.com/webservices/getfiles/getfilestypes/v1).
     *
     * This is a complex type.
     */
    public static class GetFilesResponseElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument.GetFilesResponseElement {
        private static final javax.xml.namespace.QName FILERESPONSE$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
                "FileResponse");

        public GetFilesResponseElementImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets array of all "FileResponse" elements
         */
        public com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType[] getFileResponseArray() {
            synchronized (monitor()) {
                check_orphaned();

                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILERESPONSE$0, targetList);

                com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType[] result =
                    new com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType[targetList.size()];
                targetList.toArray(result);

                return result;
            }
        }

        /**
         * Gets ith "FileResponse" element
         */
        public com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType getFileResponseArray(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType target =
                    null;
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType) get_store()
                                                                                                 .find_element_user(FILERESPONSE$0,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                return target;
            }
        }

        /**
         * Returns number of "FileResponse" element
         */
        public int sizeOfFileResponseArray() {
            synchronized (monitor()) {
                check_orphaned();

                return get_store().count_elements(FILERESPONSE$0);
            }
        }

        /**
         * Sets array of all "FileResponse" element
         */
        public void setFileResponseArray(
            com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType[] fileResponseArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(fileResponseArray, FILERESPONSE$0);
            }
        }

        /**
         * Sets ith "FileResponse" element
         */
        public void setFileResponseArray(int i,
            com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType fileResponse) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType target =
                    null;
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType) get_store()
                                                                                                 .find_element_user(FILERESPONSE$0,
                        i);

                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }

                target.set(fileResponse);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "FileResponse" element
         */
        public com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType insertNewFileResponse(
            int i) {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType target =
                    null;
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType) get_store()
                                                                                                 .insert_element_user(FILERESPONSE$0,
                        i);

                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "FileResponse" element
         */
        public com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType addNewFileResponse() {
            synchronized (monitor()) {
                check_orphaned();

                com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType target =
                    null;
                target = (com.nhcsys.webservices.getfiles.getfilestypes.v1.FileResponseType) get_store()
                                                                                                 .add_element_user(FILERESPONSE$0);

                return target;
            }
        }

        /**
         * Removes the ith "FileResponse" element
         */
        public void removeFileResponse(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(FILERESPONSE$0, i);
            }
        }
    }
}
