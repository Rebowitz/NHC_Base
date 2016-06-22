/*
 * XML Type:  ProductListType
 * Namespace: http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1
 * Java type: com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.impl;

/**
 * An XML ProductListType(@http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1).
 *
 * This is a complex type.
 */
public class ProductListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getorderinfo.getorderinfotypes.v1.ProductListType {
    private static final javax.xml.namespace.QName PRODUCTID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
            "ProductID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
            "Description");
    private static final javax.xml.namespace.QName LICENSEKEY$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getorderinfo/getorderinfotypes/v1",
            "LicenseKey");

    public ProductListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "ProductID" element
     */
    public java.lang.String getProductID() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTID$0,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProductID" element
     */
    public org.apache.xmlbeans.XmlString xgetProductID() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTID$0,
                    0);

            return target;
        }
    }

    /**
     * Sets the "ProductID" element
     */
    public void setProductID(java.lang.String productID) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PRODUCTID$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(PRODUCTID$0);
            }

            target.setStringValue(productID);
        }
    }

    /**
     * Sets (as xml) the "ProductID" element
     */
    public void xsetProductID(org.apache.xmlbeans.XmlString productID) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PRODUCTID$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(PRODUCTID$0);
            }

            target.set(productID);
        }
    }

    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DESCRIPTION$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(DESCRIPTION$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DESCRIPTION$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(DESCRIPTION$2);
            }

            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(DESCRIPTION$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(DESCRIPTION$2);
            }

            target.set(description);
        }
    }

    /**
     * Gets the "LicenseKey" element
     */
    public java.lang.String getLicenseKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(LICENSEKEY$4,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LicenseKey" element
     */
    public org.apache.xmlbeans.XmlString xgetLicenseKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LICENSEKEY$4,
                    0);

            return target;
        }
    }

    /**
     * Tests for nil "LicenseKey" element
     */
    public boolean isNilLicenseKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LICENSEKEY$4,
                    0);

            if (target == null) {
                return false;
            }

            return target.isNil();
        }
    }

    /**
     * Sets the "LicenseKey" element
     */
    public void setLicenseKey(java.lang.String licenseKey) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(LICENSEKEY$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(LICENSEKEY$4);
            }

            target.setStringValue(licenseKey);
        }
    }

    /**
     * Sets (as xml) the "LicenseKey" element
     */
    public void xsetLicenseKey(org.apache.xmlbeans.XmlString licenseKey) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LICENSEKEY$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(LICENSEKEY$4);
            }

            target.set(licenseKey);
        }
    }

    /**
     * Nils the "LicenseKey" element
     */
    public void setNilLicenseKey() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LICENSEKEY$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(LICENSEKEY$4);
            }

            target.setNil();
        }
    }
}
