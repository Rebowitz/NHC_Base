/*
 * XML Type:  CLQType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.CLQType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.impl;

/**
 * An XML CLQType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is a complex type.
 */
public class CLQTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.CLQType {
    private static final javax.xml.namespace.QName NAME$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Name");
    private static final javax.xml.namespace.QName CMDLINE$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "CmdLine");
    private static final javax.xml.namespace.QName RESULT$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Result");

    public CLQTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets the "CmdLine" element
     */
    public java.lang.String getCmdLine() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(CMDLINE$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CmdLine" element
     */
    public org.apache.xmlbeans.XmlString xgetCmdLine() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(CMDLINE$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "CmdLine" element
     */
    public void setCmdLine(java.lang.String cmdLine) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(CMDLINE$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(CMDLINE$2);
            }

            target.setStringValue(cmdLine);
        }
    }

    /**
     * Sets (as xml) the "CmdLine" element
     */
    public void xsetCmdLine(org.apache.xmlbeans.XmlString cmdLine) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(CMDLINE$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(CMDLINE$2);
            }

            target.set(cmdLine);
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
