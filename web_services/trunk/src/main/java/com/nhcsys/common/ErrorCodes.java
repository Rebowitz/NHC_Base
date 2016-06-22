/**
 * 
 */
package com.nhcsys.common;

/**
 * @author Mahadevan.Raju
 *
 */
public class ErrorCodes
{
    public static final long ERROR_CODE_BASE = 1000;
    
    public static final long DEFAULT_ERROR              = ERROR_CODE_BASE + 0;
    public static final long UNKNOWN_ERROR              = ERROR_CODE_BASE + 1;
    public static final long INTERNAL_ERROR             = ERROR_CODE_BASE + 2;
    public static final long CLIENT_NOT_ONLINE          = ERROR_CODE_BASE + 3;
    public static final long CLIENT_ALREADY_ONLINE      = ERROR_CODE_BASE + 4;
    public static final long MACHINE_ID_NOT_FOUND       = ERROR_CODE_BASE + 5;
    public static final long TOO_MANY_MACHINES          = ERROR_CODE_BASE + 6;
    public static final long CPU_NOT_FOUND              = ERROR_CODE_BASE + 7;
    public static final long INVALID_REQUEST            = ERROR_CODE_BASE + 8;
    public static final long NO_CLIENT_CERTIFICATE      = ERROR_CODE_BASE + 9;
    public static final long INCORRECT_CERT_COMMON_NAME = ERROR_CODE_BASE + 10;
    public static final long MISSING_REQUEST_PARAM      = ERROR_CODE_BASE + 11;
        
    public static final long INVALID_UPLOAD_SESSION     = ERROR_CODE_BASE + 12;
    public static final long INVALID_ENCODING_TYPE      = ERROR_CODE_BASE + 13;
    public static final long CHECK_SUM_MISMATCH         = ERROR_CODE_BASE + 14;
    public static final long INVALID_CHUNK_SIZE         = ERROR_CODE_BASE + 15;
    public static final long UNSUPPORTED_SCHEMA_VERSION = ERROR_CODE_BASE + 16;

}
