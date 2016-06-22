/*
 * An XML document type.
 * Localname: GetManifestResponseElement
 * Namespace: http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1
 * Java type: com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.impl;

/**
 * A document containing one GetManifestResponseElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1) element.
 *
 * This is a complex type.
 */
public class GetManifestResponseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument {
    private static final javax.xml.namespace.QName GETMANIFESTRESPONSEELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
            "GetManifestResponseElement");

    public GetManifestResponseElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetManifestResponseElement" element
     */
    public com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement getGetManifestResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) get_store()
                                                                                                                                                .find_element_user(GETMANIFESTRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetManifestResponseElement" element
     */
    public void setGetManifestResponseElement(
        com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement getManifestResponseElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) get_store()
                                                                                                                                                .find_element_user(GETMANIFESTRESPONSEELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) get_store()
                                                                                                                                                    .add_element_user(GETMANIFESTRESPONSEELEMENT$0);
            }

            target.set(getManifestResponseElement);
        }
    }

    /**
     * Appends and returns a new empty "GetManifestResponseElement" element
     */
    public com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement addNewGetManifestResponseElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement target =
                null;
            target = (com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement) get_store()
                                                                                                                                                .add_element_user(GETMANIFESTRESPONSEELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetManifestResponseElement(@http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1).
     *
     * This is a complex type.
     */
    public static class GetManifestResponseElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.getmanifest.getmanifesttypes.v1.GetManifestResponseElementDocument.GetManifestResponseElement {
        private static final javax.xml.namespace.QName FILENAME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "FileName");
        private static final javax.xml.namespace.QName FILESIZE$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "FileSize");
        private static final javax.xml.namespace.QName MD5HASH$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "MD5Hash");
        private static final javax.xml.namespace.QName MANIFESTRESPONSE$6 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmanifest/getmanifesttypes/v1",
                "ManifestResponse");

        public GetManifestResponseElementImpl(
            org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "FileName" element
         */
        public java.lang.String getFileName() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(FILENAME$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "FileName" element
         */
        public org.apache.xmlbeans.XmlString xgetFileName() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(FILENAME$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "FileName" element
         */
        public void setFileName(java.lang.String fileName) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(FILENAME$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(FILENAME$0);
                }

                target.setStringValue(fileName);
            }
        }

        /**
         * Sets (as xml) the "FileName" element
         */
        public void xsetFileName(org.apache.xmlbeans.XmlString fileName) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(FILENAME$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(FILENAME$0);
                }

                target.set(fileName);
            }
        }

        /**
         * Gets the "FileSize" element
         */
        public java.lang.String getFileSize() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(FILESIZE$2,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "FileSize" element
         */
        public org.apache.xmlbeans.XmlString xgetFileSize() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(FILESIZE$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "FileSize" element
         */
        public void setFileSize(java.lang.String fileSize) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(FILESIZE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(FILESIZE$2);
                }

                target.setStringValue(fileSize);
            }
        }

        /**
         * Sets (as xml) the "FileSize" element
         */
        public void xsetFileSize(org.apache.xmlbeans.XmlString fileSize) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(FILESIZE$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(FILESIZE$2);
                }

                target.set(fileSize);
            }
        }

        /**
         * Gets the "MD5Hash" element
         */
        public java.lang.String getMD5Hash() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MD5HASH$4,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "MD5Hash" element
         */
        public org.apache.xmlbeans.XmlString xgetMD5Hash() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MD5HASH$4,
                        0);

                return target;
            }
        }

        /**
         * Sets the "MD5Hash" element
         */
        public void setMD5Hash(java.lang.String md5Hash) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MD5HASH$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(MD5HASH$4);
                }

                target.setStringValue(md5Hash);
            }
        }

        /**
         * Sets (as xml) the "MD5Hash" element
         */
        public void xsetMD5Hash(org.apache.xmlbeans.XmlString md5Hash) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(MD5HASH$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(MD5HASH$4);
                }

                target.set(md5Hash);
            }
        }

        /**
         * Gets the "ManifestResponse" element
         */
        public byte[] getManifestResponse() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MANIFESTRESPONSE$6,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getByteArrayValue();
            }
        }

        /**
         * Gets (as xml) the "ManifestResponse" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetManifestResponse() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary) get_store()
                                                                   .find_element_user(MANIFESTRESPONSE$6,
                        0);

                return target;
            }
        }

        /**
         * Sets the "ManifestResponse" element
         */
        public void setManifestResponse(byte[] manifestResponse) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(MANIFESTRESPONSE$6,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(MANIFESTRESPONSE$6);
                }

                target.setByteArrayValue(manifestResponse);
            }
        }

        /**
         * Sets (as xml) the "ManifestResponse" element
         */
        public void xsetManifestResponse(
            org.apache.xmlbeans.XmlBase64Binary manifestResponse) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary) get_store()
                                                                   .find_element_user(MANIFESTRESPONSE$6,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBase64Binary) get_store()
                                                                       .add_element_user(MANIFESTRESPONSE$6);
                }

                target.set(manifestResponse);
            }
        }
    }
}
