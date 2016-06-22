/*
 * XML Type:  MessageDestinationType
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1.impl;

/**
 * An XML MessageDestinationType(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
 *
 * This is a complex type.
 */
public class MessageDestinationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl
    implements com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType {
    private static final javax.xml.namespace.QName DESTINATION$0 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
            "Destination");
    private static final javax.xml.namespace.QName GROUPNAME$2 = new javax.xml.namespace.QName("http://nhcsys.com/webservices/getmessages/getmessagestypes/v1",
            "GroupName");

    public MessageDestinationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    /**
     * Gets the "Destination" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum getDestination() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DESTINATION$0,
                    0);

            if (target == null) {
                return null;
            }

            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum) target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "Destination" element
     */
    public com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType xgetDestination() {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType) get_store()
                                                                                                  .find_element_user(DESTINATION$0,
                    0);

            return target;
        }
    }

    /**
     * Sets the "Destination" element
     */
    public void setDestination(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType.Enum destination) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(DESTINATION$0,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(DESTINATION$0);
            }

            target.setEnumValue(destination);
        }
    }

    /**
     * Sets (as xml) the "Destination" element
     */
    public void xsetDestination(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType destination) {
        synchronized (monitor()) {
            check_orphaned();

            com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType target =
                null;
            target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType) get_store()
                                                                                                  .find_element_user(DESTINATION$0,
                    0);

            if (target == null) {
                target = (com.nhcsys.webservices.getmessages.getmessagestypes.v1.DestinationType) get_store()
                                                                                                      .add_element_user(DESTINATION$0);
            }

            target.set(destination);
        }
    }

    /**
     * Gets the "GroupName" element
     */
    public java.lang.String getGroupName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(GROUPNAME$2,
                    0);

            if (target == null) {
                return null;
            }

            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "GroupName" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(GROUPNAME$2,
                    0);

            return target;
        }
    }

    /**
     * Tests for nil "GroupName" element
     */
    public boolean isNilGroupName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(GROUPNAME$2,
                    0);

            if (target == null) {
                return false;
            }

            return target.isNil();
        }
    }

    /**
     * Sets the "GroupName" element
     */
    public void setGroupName(java.lang.String groupName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                           .find_element_user(GROUPNAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue) get_store()
                                                               .add_element_user(GROUPNAME$2);
            }

            target.setStringValue(groupName);
        }
    }

    /**
     * Sets (as xml) the "GroupName" element
     */
    public void xsetGroupName(org.apache.xmlbeans.XmlString groupName) {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(GROUPNAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(GROUPNAME$2);
            }

            target.set(groupName);
        }
    }

    /**
     * Nils the "GroupName" element
     */
    public void setNilGroupName() {
        synchronized (monitor()) {
            check_orphaned();

            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString) get_store()
                                                         .find_element_user(GROUPNAME$2,
                    0);

            if (target == null) {
                target = (org.apache.xmlbeans.XmlString) get_store()
                                                             .add_element_user(GROUPNAME$2);
            }

            target.setNil();
        }
    }
}
