/*
 * XML Type:  WNQType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WNQType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.impl;

/**
 * An XML WNQType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is a complex type.
 */
public class WNQTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WNQType {
    private static final javax.xml.namespace.QName PROVIDER$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Provider");
    private static final javax.xml.namespace.QName REMOTENAME$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "RemoteName");
    private static final javax.xml.namespace.QName LOCALNAME$4 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "LocalName");
    private static final javax.xml.namespace.QName IPADDRESS$6 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "IPAddress");
    private static final javax.xml.namespace.QName COMMENT$8 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Comment");
    private static final javax.xml.namespace.QName DISPLAYTYPE$10 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "DisplayType");
    private static final javax.xml.namespace.QName SCOPE$12 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Scope");
    private static final javax.xml.namespace.QName TYPE$14 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Type");
    private static final javax.xml.namespace.QName USAGE$16 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1",
            "Usage");

    public WNQTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "Provider" element
     */
    public java.lang.String getProvider() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PROVIDER$0,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Provider" element
     */
    public org.apache.xmlbeans.XmlString xgetProvider() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PROVIDER$0,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Provider" element
     */
    public void setProvider(java.lang.String provider) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(PROVIDER$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(PROVIDER$0);
            }

            target.setStringValue(provider);
        }
    }

    /**
     * Sets (as xml) the "Provider" element
     */
    public void xsetProvider(org.apache.xmlbeans.XmlString provider) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(PROVIDER$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(PROVIDER$0);
            }

            target.set(provider);
        }
    }

    /**
     * Gets the "RemoteName" element
     */
    public java.lang.String getRemoteName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(REMOTENAME$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "RemoteName" element
     */
    public org.apache.xmlbeans.XmlString xgetRemoteName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(REMOTENAME$2,
                    0);

            return target;
        }
    }

    /**
     * Sets the "RemoteName" element
     */
    public void setRemoteName(java.lang.String remoteName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(REMOTENAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(REMOTENAME$2);
            }

            target.setStringValue(remoteName);
        }
    }

    /**
     * Sets (as xml) the "RemoteName" element
     */
    public void xsetRemoteName(org.apache.xmlbeans.XmlString remoteName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(REMOTENAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(REMOTENAME$2);
            }

            target.set(remoteName);
        }
    }

    /**
     * Gets the "LocalName" element
     */
    public java.lang.String getLocalName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(LOCALNAME$4,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LocalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LOCALNAME$4,
                    0);

            return target;
        }
    }

    /**
     * Sets the "LocalName" element
     */
    public void setLocalName(java.lang.String localName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(LOCALNAME$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(LOCALNAME$4);
            }

            target.setStringValue(localName);
        }
    }

    /**
     * Sets (as xml) the "LocalName" element
     */
    public void xsetLocalName(org.apache.xmlbeans.XmlString localName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(LOCALNAME$4,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(LOCALNAME$4);
            }

            target.set(localName);
        }
    }

    /**
     * Gets the "IPAddress" element
     */
    public java.lang.String getIPAddress() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(IPADDRESS$6,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "IPAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetIPAddress() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(IPADDRESS$6,
                    0);

            return target;
        }
    }

    /**
     * Sets the "IPAddress" element
     */
    public void setIPAddress(java.lang.String ipAddress) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(IPADDRESS$6,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(IPADDRESS$6);
            }

            target.setStringValue(ipAddress);
        }
    }

    /**
     * Sets (as xml) the "IPAddress" element
     */
    public void xsetIPAddress(org.apache.xmlbeans.XmlString ipAddress) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(IPADDRESS$6,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(IPADDRESS$6);
            }

            target.set(ipAddress);
        }
    }

    /**
     * Gets the "Comment" element
     */
    public java.lang.String getComment() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(COMMENT$8,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Comment" element
     */
    public org.apache.xmlbeans.XmlString xgetComment() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(COMMENT$8,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Comment" element
     */
    public void setComment(java.lang.String comment) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(COMMENT$8,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(COMMENT$8);
            }

            target.setStringValue(comment);
        }
    }

    /**
     * Sets (as xml) the "Comment" element
     */
    public void xsetComment(org.apache.xmlbeans.XmlString comment) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(COMMENT$8,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(COMMENT$8);
            }

            target.set(comment);
        }
    }

    /**
     * Gets the "DisplayType" element
     */
    public java.lang.String getDisplayType() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DISPLAYTYPE$10,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DisplayType" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayType() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(DISPLAYTYPE$10,
                    0);

            return target;
        }
    }

    /**
     * Sets the "DisplayType" element
     */
    public void setDisplayType(java.lang.String displayType) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DISPLAYTYPE$10,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(DISPLAYTYPE$10);
            }

            target.setStringValue(displayType);
        }
    }

    /**
     * Sets (as xml) the "DisplayType" element
     */
    public void xsetDisplayType(org.apache.xmlbeans.XmlString displayType) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(DISPLAYTYPE$10,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(DISPLAYTYPE$10);
            }

            target.set(displayType);
        }
    }

    /**
     * Gets the "Scope" element
     */
    public java.lang.String getScope() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(SCOPE$12,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(SCOPE$12,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Scope" element
     */
    public void setScope(java.lang.String scope) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(SCOPE$12,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(SCOPE$12);
            }

            target.setStringValue(scope);
        }
    }

    /**
     * Sets (as xml) the "Scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(SCOPE$12,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(SCOPE$12);
            }

            target.set(scope);
        }
    }

    /**
     * Gets the "Type" element
     */
    public java.lang.String getType() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(TYPE$14,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(TYPE$14,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(TYPE$14,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(TYPE$14);
            }

            target.setStringValue(type);
        }
    }

    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(TYPE$14,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(TYPE$14);
            }

            target.set(type);
        }
    }

    /**
     * Gets the "Usage" element
     */
    public java.lang.String getUsage() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(USAGE$16,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Usage" element
     */
    public org.apache.xmlbeans.XmlString xgetUsage() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(USAGE$16,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Usage" element
     */
    public void setUsage(java.lang.String usage) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(USAGE$16,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(USAGE$16);
            }

            target.setStringValue(usage);
        }
    }

    /**
     * Sets (as xml) the "Usage" element
     */
    public void xsetUsage(org.apache.xmlbeans.XmlString usage) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(USAGE$16,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(USAGE$16);
            }

            target.set(usage);
        }
    }
}
