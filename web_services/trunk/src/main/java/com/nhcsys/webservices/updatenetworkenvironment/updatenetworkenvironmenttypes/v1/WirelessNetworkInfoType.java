/*
 * XML Type:  WirelessNetworkInfoType
 * Namespace: http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1
 * Java type: com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1;


/**
 * An XML WirelessNetworkInfoType(@http://nhcsys.com/webservices/updatenetworkenvironment/updatenetworkenvironmenttypes/v1).
 *
 * This is an atomic type that is a restriction of com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType.
 */
public interface WirelessNetworkInfoType extends org.apache.xmlbeans.XmlString {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WirelessNetworkInfoType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.s9DCD30C8DB2E5E9A0C1B748FD52E35F7")
                                                                                                                           .resolveHandle("wirelessnetworkinfotype126ctype");
    static final Enum HAS_SSID = Enum.forString("HasSSID");
    static final Enum HAS_SSID_PASSPHRASE = Enum.forString("HasSSID+Passphrase");
    static final Enum NO_INFO = Enum.forString("NoInfo");
    static final Enum NO_WIRELESS_NETWORK = Enum.forString("NoWirelessNetwork");
    static final int INT_HAS_SSID = Enum.INT_HAS_SSID;
    static final int INT_HAS_SSID_PASSPHRASE = Enum.INT_HAS_SSID_PASSPHRASE;
    static final int INT_NO_INFO = Enum.INT_NO_INFO;
    static final int INT_NO_WIRELESS_NETWORK = Enum.INT_NO_WIRELESS_NETWORK;

    org.apache.xmlbeans.StringEnumAbstractBase enumValue();

    void set(org.apache.xmlbeans.StringEnumAbstractBase e);

    /**
     * Enumeration value class for com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HAS_SSID
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        static final int INT_HAS_SSID = 1;
        static final int INT_HAS_SSID_PASSPHRASE = 2;
        static final int INT_NO_INFO = 3;
        static final int INT_NO_WIRELESS_NETWORK = 4;
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("HasSSID", INT_HAS_SSID),
                    new Enum("HasSSID+Passphrase", INT_HAS_SSID_PASSPHRASE),
                    new Enum("NoInfo", INT_NO_INFO),
                    new Enum("NoWirelessNetwork", INT_NO_WIRELESS_NETWORK),
                });
        private static final long serialVersionUID = 1L;

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum) table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum) table.forInt(i);
        }

        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory {
        private Factory() {
        } // No instance of this class allowed

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType newValue(
            java.lang.Object obj) {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) type.newValue(obj);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType newInstance() {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                                          .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatenetworkenvironment.updatenetworkenvironmenttypes.v1.WirelessNetworkInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
