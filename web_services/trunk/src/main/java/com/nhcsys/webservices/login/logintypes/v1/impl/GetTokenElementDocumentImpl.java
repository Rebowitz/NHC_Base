/*
 * An XML document type.
 * Localname: GetTokenElement
 * Namespace: http://nhcsys.com/webservices/login/logintypes/v1
 * Java type: com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.login.logintypes.v1.impl;

/**
 * A document containing one GetTokenElement(@http://nhcsys.com/webservices/login/logintypes/v1) element.
 *
 * This is a complex type.
 */
public class GetTokenElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument {
    private static final javax.xml.namespace.QName GETTOKENELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
            "GetTokenElement");

    public GetTokenElementDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "GetTokenElement" element
     */
    public com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement getGetTokenElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement) get_store()
                                                                                                              .find_element_user(GETTOKENELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "GetTokenElement" element
     */
    public void setGetTokenElement(
        com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement getTokenElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement) get_store()
                                                                                                              .find_element_user(GETTOKENELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement) get_store()
                                                                                                                  .add_element_user(GETTOKENELEMENT$0);
            }

            target.set(getTokenElement);
        }
    }

    /**
     * Appends and returns a new empty "GetTokenElement" element
     */
    public com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement addNewGetTokenElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement) get_store()
                                                                                                              .add_element_user(GETTOKENELEMENT$0);

            return target;
        }
    }

    /**
     * An XML GetTokenElement(@http://nhcsys.com/webservices/login/logintypes/v1).
     *
     * This is a complex type.
     */
    public static class GetTokenElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.login.logintypes.v1.GetTokenElementDocument.GetTokenElement {
        private static final javax.xml.namespace.QName USERID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "UserID");
        private static final javax.xml.namespace.QName PASSWORD$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "Password");
        private static final javax.xml.namespace.QName CPUSERIALNUMBER$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "CpuSerialNumber");
        private static final javax.xml.namespace.QName APPNAME$6 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "AppName");

        public GetTokenElementImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "UserID" element
         */
        public java.lang.String getUserID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(USERID$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "UserID" element
         */
        public org.apache.xmlbeans.XmlString xgetUserID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(USERID$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "UserID" element
         */
        public void setUserID(java.lang.String userID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(USERID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(USERID$0);
                }

                target.setStringValue(userID);
            }
        }

        /**
         * Sets (as xml) the "UserID" element
         */
        public void xsetUserID(org.apache.xmlbeans.XmlString userID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(USERID$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(USERID$0);
                }

                target.set(userID);
            }
        }

        /**
         * Gets the "Password" element
         */
        public java.lang.String getPassword() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(PASSWORD$2,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "Password" element
         */
        public org.apache.xmlbeans.XmlString xgetPassword() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(PASSWORD$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "Password" element
         */
        public void setPassword(java.lang.String password) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(PASSWORD$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(PASSWORD$2);
                }

                target.setStringValue(password);
            }
        }

        /**
         * Sets (as xml) the "Password" element
         */
        public void xsetPassword(org.apache.xmlbeans.XmlString password) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(PASSWORD$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(PASSWORD$2);
                }

                target.set(password);
            }
        }

        /**
         * Gets the "CpuSerialNumber" element
         */
        public java.lang.String getCpuSerialNumber() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CPUSERIALNUMBER$4,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "CpuSerialNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetCpuSerialNumber() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(CPUSERIALNUMBER$4,
                        0);

                return target;
            }
        }

        /**
         * Sets the "CpuSerialNumber" element
         */
        public void setCpuSerialNumber(java.lang.String cpuSerialNumber) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(CPUSERIALNUMBER$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(CPUSERIALNUMBER$4);
                }

                target.setStringValue(cpuSerialNumber);
            }
        }

        /**
         * Sets (as xml) the "CpuSerialNumber" element
         */
        public void xsetCpuSerialNumber(
            org.apache.xmlbeans.XmlString cpuSerialNumber) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(CPUSERIALNUMBER$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(CPUSERIALNUMBER$4);
                }

                target.set(cpuSerialNumber);
            }
        }

        /**
         * Gets the "AppName" element
         */
        public java.lang.String getAppName() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(APPNAME$6,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "AppName" element
         */
        public org.apache.xmlbeans.XmlString xgetAppName() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(APPNAME$6,
                        0);

                return target;
            }
        }

        /**
         * Sets the "AppName" element
         */
        public void setAppName(java.lang.String appName) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(APPNAME$6,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(APPNAME$6);
                }

                target.setStringValue(appName);
            }
        }

        /**
         * Sets (as xml) the "AppName" element
         */
        public void xsetAppName(org.apache.xmlbeans.XmlString appName) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(APPNAME$6,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(APPNAME$6);
                }

                target.set(appName);
            }
        }
    }
}
