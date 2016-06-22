/*
 * XML Type:  UpdateStatusType
 * Namespace: http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1
 * Java type: com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatestatus.updatestatustypes.v1.impl;

/**
 * An XML UpdateStatusType(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1).
 *
 * This is a complex type.
 */
public class UpdateStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusType {
    private static final javax.xml.namespace.QName PRODUCTID$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "ProductID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "Description");
    private static final javax.xml.namespace.QName REPORT$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "Report");
    private static final javax.xml.namespace.QName STATUS$6 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1",
            "Status");

    public UpdateStatusTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets the "Report" element
     */
    public java.lang.String getReport() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(REPORT$4,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Report" element
     */
    public org.apache.xmlbeans.XmlString xgetReport() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(REPORT$4,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Report" element
     */
    public void setReport(java.lang.String report) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(REPORT$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(REPORT$4);
            }

            target.setStringValue(report);
        }
    }

    /**
     * Sets (as xml) the "Report" element
     */
    public void xsetReport(org.apache.xmlbeans.XmlString report) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(REPORT$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(REPORT$4);
            }

            target.set(report);
        }
    }

    /**
     * Gets the "Status" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType.Enum getStatus() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(STATUS$6,
                    0);

            if (target == null) {
                return null;
            }

            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType.Enum) target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "Status" element
     */
    public com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType xgetStatus() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) get_store()
                                                                                                              .find_element_user(STATUS$6,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Status" element
     */
    public void setStatus(
        com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType.Enum status) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(STATUS$6,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(STATUS$6);
            }

            target.setEnumValue(status);
        }
    }

    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(
        com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType status) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType target =
                null;
            target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) get_store()
                                                                                                              .find_element_user(STATUS$6,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) get_store()
                                                                                                                  .add_element_user(STATUS$6);
            }

            target.set(status);
        }
    }
}
