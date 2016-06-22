/*
 * XML Type:  WMIQType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WMIQType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.impl;

/**
 * An XML WMIQType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is a complex type.
 */
public class WMIQTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WMIQType {
    private static final javax.xml.namespace.QName NAME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Name");
    private static final javax.xml.namespace.QName QUERY$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Query");
    private static final javax.xml.namespace.QName RESULT$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Result");

    public WMIQTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "Name" element
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(NAME$0,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(NAME$0,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(NAME$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(NAME$0);
            }

            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(NAME$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(NAME$0);
            }

            target.set(name);
        }
    }

    /**
     * Gets the "Query" element
     */
    public java.lang.String getQuery() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(QUERY$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Query" element
     */
    public org.apache.xmlbeans.XmlString xgetQuery() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(QUERY$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Query" element
     */
    public void setQuery(java.lang.String query) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(QUERY$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(QUERY$2);
            }

            target.setStringValue(query);
        }
    }

    /**
     * Sets (as xml) the "Query" element
     */
    public void xsetQuery(org.apache.xmlbeans.XmlString query) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(QUERY$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(QUERY$2);
            }

            target.set(query);
        }
    }

    /**
     * Gets the "Result" element
     */
    public java.lang.String getResult() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(RESULT$4,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Result" element
     */
    public org.apache.xmlbeans.XmlString xgetResult() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(RESULT$4,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Result" element
     */
    public void setResult(java.lang.String result) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(RESULT$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(RESULT$4);
            }

            target.setStringValue(result);
        }
    }

    /**
     * Sets (as xml) the "Result" element
     */
    public void xsetResult(org.apache.xmlbeans.XmlString result) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(RESULT$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(RESULT$4);
            }

            target.set(result);
        }
    }
}
