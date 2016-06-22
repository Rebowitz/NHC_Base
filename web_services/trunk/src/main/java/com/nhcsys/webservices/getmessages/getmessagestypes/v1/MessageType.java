/*
 * XML Type:  MessageType
 * Namespace: http://nhcsys.com/webservices/getmessages/getmessagestypes/v1
 * Java type: com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.getmessages.getmessagestypes.v1;


/**
 * An XML MessageType(@http://nhcsys.com/webservices/getmessages/getmessagestypes/v1).
 *
 * This is a complex type.
 */
public interface MessageType extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sC540DD0316FD145EB8D5083A517154DB")
                                                                                                                           .resolveHandle("messagetypebdfbtype");

    /**
     * Gets the "MessageID" element
     */
    long getMessageID();

    /**
     * Gets (as xml) the "MessageID" element
     */
    org.apache.xmlbeans.XmlLong xgetMessageID();

    /**
     * Sets the "MessageID" element
     */
    void setMessageID(long messageID);

    /**
     * Sets (as xml) the "MessageID" element
     */
    void xsetMessageID(org.apache.xmlbeans.XmlLong messageID);

    /**
     * Gets the "Type" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessageType.Enum getType();

    /**
     * Gets (as xml) the "Type" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessageType xgetType();

    /**
     * Sets the "Type" element
     */
    void setType(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessageType.Enum type);

    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.SupportMessageType type);

    /**
     * Gets the "StartTime" element
     */
    java.util.Calendar getStartTime();

    /**
     * Gets (as xml) the "StartTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();

    /**
     * Sets the "StartTime" element
     */
    void setStartTime(java.util.Calendar startTime);

    /**
     * Sets (as xml) the "StartTime" element
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);

    /**
     * Gets the "EndTime" element
     */
    java.util.Calendar getEndTime();

    /**
     * Gets (as xml) the "EndTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndTime();

    /**
     * Sets the "EndTime" element
     */
    void setEndTime(java.util.Calendar endTime);

    /**
     * Sets (as xml) the "EndTime" element
     */
    void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);

    /**
     * Gets the "Title" element
     */
    java.lang.String getTitle();

    /**
     * Gets (as xml) the "Title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();

    /**
     * Sets the "Title" element
     */
    void setTitle(java.lang.String title);

    /**
     * Sets (as xml) the "Title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);

    /**
     * Gets the "Content" element
     */
    java.lang.String getContent();

    /**
     * Gets (as xml) the "Content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();

    /**
     * Sets the "Content" element
     */
    void setContent(java.lang.String content);

    /**
     * Sets (as xml) the "Content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);

    /**
     * Gets the "Summary" element
     */
    java.lang.String getSummary();

    /**
     * Gets (as xml) the "Summary" element
     */
    org.apache.xmlbeans.XmlString xgetSummary();

    /**
     * Sets the "Summary" element
     */
    void setSummary(java.lang.String summary);

    /**
     * Sets (as xml) the "Summary" element
     */
    void xsetSummary(org.apache.xmlbeans.XmlString summary);

    /**
     * Gets the "Priority" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.PriorityType.Enum getPriority();

    /**
     * Gets (as xml) the "Priority" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.PriorityType xgetPriority();

    /**
     * Sets the "Priority" element
     */
    void setPriority(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.PriorityType.Enum priority);

    /**
     * Sets (as xml) the "Priority" element
     */
    void xsetPriority(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.PriorityType priority);

    /**
     * Gets the "PopupDuration" element
     */
    int getPopupDuration();

    /**
     * Gets (as xml) the "PopupDuration" element
     */
    org.apache.xmlbeans.XmlInt xgetPopupDuration();

    /**
     * Sets the "PopupDuration" element
     */
    void setPopupDuration(int popupDuration);

    /**
     * Sets (as xml) the "PopupDuration" element
     */
    void xsetPopupDuration(org.apache.xmlbeans.XmlInt popupDuration);

    /**
     * Gets the "ClickURL" element
     */
    java.lang.String getClickURL();

    /**
     * Gets (as xml) the "ClickURL" element
     */
    org.apache.xmlbeans.XmlString xgetClickURL();

    /**
     * Sets the "ClickURL" element
     */
    void setClickURL(java.lang.String clickURL);

    /**
     * Sets (as xml) the "ClickURL" element
     */
    void xsetClickURL(org.apache.xmlbeans.XmlString clickURL);

    /**
     * Gets the "To" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType getTo();

    /**
     * Sets the "To" element
     */
    void setTo(
        com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType to);

    /**
     * Appends and returns a new empty "To" element
     */
    com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageDestinationType addNewTo();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType newInstance() {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.getmessages.getmessagestypes.v1.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                    .parse(xis,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                               .newValidatingXMLInputStream(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                               .newValidatingXMLInputStream(xis,
                type, options);
        }
    }
}
