/*
 * XML Type:  FileDescriptorType
 * Namespace: http://nhcsys.com/webservices/getfiles/getfilestypes/v1
 * Java type: com.nhcsys.webservices.getfiles.getfilestypes.v1.FileDescriptorType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getfiles.getfilestypes.v1.impl;

/**
 * An XML FileDescriptorType(@http://nhcsys.com/webservices/getfiles/getfilestypes/v1).
 *
 * This is a complex type.
 */
public class FileDescriptorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getfiles.getfilestypes.v1.FileDescriptorType {
    private static final javax.xml.namespace.QName NAME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
            "Name");
    private static final javax.xml.namespace.QName VERSION$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getfiles/getfilestypes/v1",
            "Version");

    public FileDescriptorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets the "Version" element
     */
    public java.lang.String getVersion() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(VERSION$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(VERSION$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(VERSION$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(VERSION$2);
            }

            target.setStringValue(version);
        }
    }

    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(VERSION$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(VERSION$2);
            }

            target.set(version);
        }
    }
}
