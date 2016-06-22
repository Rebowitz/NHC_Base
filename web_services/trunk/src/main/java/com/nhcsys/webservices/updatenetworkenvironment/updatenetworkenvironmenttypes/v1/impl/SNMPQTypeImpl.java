/*
 * XML Type:  SNMPQType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.impl;

/**
 * An XML SNMPQType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is a complex type.
 */
public class SNMPQTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.SNMPQType {
    private static final javax.xml.namespace.QName NAME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Name");
    private static final javax.xml.namespace.QName TREE$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Tree");

    public SNMPQTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets the "Tree" element
     */
    public java.lang.String getTree() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(TREE$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Tree" element
     */
    public org.apache.xmlbeans.XmlString xgetTree() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(TREE$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Tree" element
     */
    public void setTree(java.lang.String tree) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(TREE$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(TREE$2);
            }

            target.setStringValue(tree);
        }
    }

    /**
     * Sets (as xml) the "Tree" element
     */
    public void xsetTree(org.apache.xmlbeans.XmlString tree) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(TREE$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(TREE$2);
            }

            target.set(tree);
        }
    }
}
