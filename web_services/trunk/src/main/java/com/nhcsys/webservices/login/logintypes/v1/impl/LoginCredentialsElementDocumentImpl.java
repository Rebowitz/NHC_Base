/*
 * An XML document type.
 * Localname: LoginCredentialsElement
 * Namespace: http://nhcsys.com/webservices/login/logintypes/v1
 * Java type: com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.login.logintypes.v1.impl;

/**
 * A document containing one LoginCredentialsElement(@http://nhcsys.com/webservices/login/logintypes/v1) element.
 *
 * This is a complex type.
 */
public class LoginCredentialsElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument {
    private static final javax.xml.namespace.QName LOGINCREDENTIALSELEMENT$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
            "LoginCredentialsElement");

    public LoginCredentialsElementDocumentImpl(
        org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "LoginCredentialsElement" element
     */
    public com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement getLoginCredentialsElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) get_store()
                                                                                                                              .find_element_user(LOGINCREDENTIALSELEMENT$0,
                    0);

            if (target == null) {
                return null;
            }

            return target;
        }
    }

    /**
     * Sets the "LoginCredentialsElement" element
     */
    public void setLoginCredentialsElement(
        com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement loginCredentialsElement) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) get_store()
                                                                                                                              .find_element_user(LOGINCREDENTIALSELEMENT$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) get_store()
                                                                                                                                  .add_element_user(LOGINCREDENTIALSELEMENT$0);
            }

            target.set(loginCredentialsElement);
        }
    }

    /**
     * Appends and returns a new empty "LoginCredentialsElement" element
     */
    public com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement addNewLoginCredentialsElement() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement target =
                null;
            target = (com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement) get_store()
                                                                                                                              .add_element_user(LOGINCREDENTIALSELEMENT$0);

            return target;
        }
    }

    /**
     * An XML LoginCredentialsElement(@http://nhcsys.com/webservices/login/logintypes/v1).
     *
     * This is a complex type.
     */
    public static class LoginCredentialsElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
        implements com.nhcsys.webservices.login.logintypes.v1.LoginCredentialsElementDocument.LoginCredentialsElement {
        private static final javax.xml.namespace.QName TOKEN$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "Token");
        private static final javax.xml.namespace.QName VIVEID$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "ViveID");
        private static final javax.xml.namespace.QName APPNAME$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/login/logintypes/v1",
                "AppName");

        public LoginCredentialsElementImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        /**
         * Gets the "Token" element
         */
        public java.lang.String getToken() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(TOKEN$0,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "Token" element
         */
        public org.apache.xmlbeans.XmlString xgetToken() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(TOKEN$0,
                        0);

                return target;
            }
        }

        /**
         * Sets the "Token" element
         */
        public void setToken(java.lang.String token) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(TOKEN$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(TOKEN$0);
                }

                target.setStringValue(token);
            }
        }

        /**
         * Sets (as xml) the "Token" element
         */
        public void xsetToken(org.apache.xmlbeans.XmlString token) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(TOKEN$0,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(TOKEN$0);
                }

                target.set(token);
            }
        }

        /**
         * Gets the "ViveID" element
         */
        public java.lang.String getViveID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(VIVEID$2,
                        0);

                if (target == null) {
                    return null;
                }

                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "ViveID" element
         */
        public org.apache.xmlbeans.XmlString xgetViveID() {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(VIVEID$2,
                        0);

                return target;
            }
        }

        /**
         * Sets the "ViveID" element
         */
        public void setViveID(java.lang.String viveID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .find_element_user(VIVEID$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(VIVEID$2);
                }

                target.setStringValue(viveID);
            }
        }

        /**
         * Sets (as xml) the "ViveID" element
         */
        public void xsetViveID(org.apache.xmlbeans.XmlString viveID) {
            synchronized (monitor()) {
                check_orphaned();

                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .find_element_user(VIVEID$2,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(VIVEID$2);
                }

                target.set(viveID);
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
                                                               .find_element_user(APPNAME$4,
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
                                                             .find_element_user(APPNAME$4,
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
                                                               .find_element_user(APPNAME$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                                   .add_element_user(APPNAME$4);
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
                                                             .find_element_user(APPNAME$4,
                        0);

                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString) get_store()
                                                                 .add_element_user(APPNAME$4);
                }

                target.set(appName);
            }
        }
    }
}
