/*
 * XML Type:  StoreInstalledSoftwareType
 * Namespace: http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1
 * Java type: com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.impl;

/**
 * An XML StoreInstalledSoftwareType(@http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1).
 *
 * This is a complex type.
 */
public class StoreInstalledSoftwareTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.storeinstalledsoftware.storeinstalledsoftwaretypes.v1.StoreInstalledSoftwareType {
    private static final javax.xml.namespace.QName PRODUCTKEY$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1",
            "ProductKey");
    private static final javax.xml.namespace.QName PRODUCTNAME$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1",
            "ProductName");
    private static final javax.xml.namespace.QName COMPANYNAME$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1",
            "CompanyName");
    private static final javax.xml.namespace.QName PRODUCTVERSION$6 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/storeinstalledsoftware/storeinstalledsoftwaretypes/v1",
            "ProductVersion");

    public StoreInstalledSoftwareTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "ProductKey" element
     */
    public java.lang.String getProductKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTKEY$0,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProductKey" element
     */
    public org.apache.xmlbeans.XmlString xgetProductKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTKEY$0,
                    0);

            return target;
        }
    }

    /**
     * Sets the "ProductKey" element
     */
    public void setProductKey(java.lang.String productKey) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTKEY$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(PRODUCTKEY$0);
            }

            target.setStringValue(productKey);
        }
    }

    /**
     * Sets (as xml) the "ProductKey" element
     */
    public void xsetProductKey(org.apache.xmlbeans.XmlString productKey) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTKEY$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(PRODUCTKEY$0);
            }

            target.set(productKey);
        }
    }

    /**
     * Gets the "ProductName" element
     */
    public java.lang.String getProductName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTNAME$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProductName" element
     */
    public org.apache.xmlbeans.XmlString xgetProductName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTNAME$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "ProductName" element
     */
    public void setProductName(java.lang.String productName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTNAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(PRODUCTNAME$2);
            }

            target.setStringValue(productName);
        }
    }

    /**
     * Sets (as xml) the "ProductName" element
     */
    public void xsetProductName(org.apache.xmlbeans.XmlString productName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTNAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(PRODUCTNAME$2);
            }

            target.set(productName);
        }
    }

    /**
     * Gets the "CompanyName" element
     */
    public java.lang.String getCompanyName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(COMPANYNAME$4,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CompanyName" element
     */
    public org.apache.xmlbeans.XmlString xgetCompanyName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(COMPANYNAME$4,
                    0);

            return target;
        }
    }

    /**
     * Sets the "CompanyName" element
     */
    public void setCompanyName(java.lang.String companyName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(COMPANYNAME$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(COMPANYNAME$4);
            }

            target.setStringValue(companyName);
        }
    }

    /**
     * Sets (as xml) the "CompanyName" element
     */
    public void xsetCompanyName(org.apache.xmlbeans.XmlString companyName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(COMPANYNAME$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(COMPANYNAME$4);
            }

            target.set(companyName);
        }
    }

    /**
     * Gets the "ProductVersion" element
     */
    public java.lang.String getProductVersion() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTVERSION$6,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProductVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetProductVersion() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTVERSION$6,
                    0);

            return target;
        }
    }

    /**
     * Sets the "ProductVersion" element
     */
    public void setProductVersion(java.lang.String productVersion) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTVERSION$6,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(PRODUCTVERSION$6);
            }

            target.setStringValue(productVersion);
        }
    }

    /**
     * Sets (as xml) the "ProductVersion" element
     */
    public void xsetProductVersion(org.apache.xmlbeans.XmlString productVersion) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTVERSION$6,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(PRODUCTVERSION$6);
            }

            target.set(productVersion);
        }
    }
}
