/*
 * XML Type:  TaskExecutationStatusType
 * Namespace: http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1
 * Java type: com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType
 *
 * Automatically generated - do not modify.
 */
package com.nhcsys.webservices.updatestatus.updatestatustypes.v1;


/**
 * An XML TaskExecutationStatusType(@http://nhcsys.com/webservices/updatestatus/updatestatustypes/v1).
 *
 * This is an atomic type that is a restriction of com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType.
 */
public interface TaskExecutationStatusType extends org.apache.xmlbeans.XmlString {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaskExecutationStatusType.class.getClassLoader(),
            "schemaorg_apache_xmlbeans.system.sD31E19F1B75A0B807DEC7868DC7D4161")
                                                                                                                           .resolveHandle("taskexecutationstatustype8720type");
    static final Enum SUCCESS = Enum.forString("Success");
    static final Enum FAIL = Enum.forString("Fail");
    static final Enum UNKNOWN = Enum.forString("Unknown");
    static final int INT_SUCCESS = Enum.INT_SUCCESS;
    static final int INT_FAIL = Enum.INT_FAIL;
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;

    org.apache.xmlbeans.StringEnumAbstractBase enumValue();

    void set(org.apache.xmlbeans.StringEnumAbstractBase e);

    /**
     * Enumeration value class for com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SUCCESS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        static final int INT_SUCCESS = 1;
        static final int INT_FAIL = 2;
        static final int INT_UNKNOWN = 3;
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Success", INT_SUCCESS), new Enum("Fail", INT_FAIL),
                    new Enum("Unknown", INT_UNKNOWN),
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

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType newValue(
            java.lang.Object obj) {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) type.newValue(obj);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType newInstance() {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .newInstance(type,
                null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType newInstance(
            org.apache.xmlbeans.XmlOptions options) {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .newInstance(type,
                options);
        }

        /** @param xmlAsString the string value to parse */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.lang.String xmlAsString)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(xmlAsString,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(xmlAsString,
                type, options);
        }

        /** @param file the file from which to load an xml document */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.File file)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(file,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.File file, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(file,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.net.URL u)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(u,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.net.URL u, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(u,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.InputStream is)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(is,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.InputStream is, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(is,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.Reader r)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(r,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            java.io.Reader r, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(r,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            javax.xml.stream.XMLStreamReader sr)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(sr,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            javax.xml.stream.XMLStreamReader sr,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(sr,
                type, options);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(node,
                type, null);
        }

        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(node,
                type, options);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
                                                                                                                                    .parse(xis,
                type, null);
        }

        /** @deprecated {@link XMLInputStream} */
        public static com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType parse(
            org.apache.xmlbeans.xml.stream.XMLInputStream xis,
            org.apache.xmlbeans.XmlOptions options)
            throws org.apache.xmlbeans.XmlException,
                org.apache.xmlbeans.xml.stream.XMLStreamException {
            return (com.nhcsys.webservices.updatestatus.updatestatustypes.v1.TaskExecutationStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader()
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
