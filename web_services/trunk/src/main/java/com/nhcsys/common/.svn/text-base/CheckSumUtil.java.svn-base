package com.nhcsys.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;

import com.nhcsys.common.exception.CheckSumException;

public class CheckSumUtil
{
    protected static final Logger log = Logger.getLogger(CheckSumUtil.class);

    public static String computeMD5(byte[] bytes) throws CheckSumException
    {
    	String checkSum = null;
    	try {
    		checkSum = DigestUtils.md5Hex(bytes);
    	} catch (Exception ex) {
    		log.error("Error while computing MD5:" , ex);
        	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
        	CheckSumException exception = new CheckSumException("Error While computing MD5: " + ex.getMessage());
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription());
			throw exception;
    	}
        if (log.isDebugEnabled())
            log.debug("CheckSum for bytes : " + checkSum);

        return checkSum;
    }

    public static String computeMD5(File file) throws CheckSumException
    {
        FileInputStream is = null;
        String checkSum = null;
        if (file == null)
        {
            return checkSum;
        }

        try
        {
            long length = file.length();
            byte[] bytes = new byte[(int)length];

            is = new FileInputStream(file);
            is.read(bytes);
            is.close();

            checkSum = computeMD5(bytes);
        } catch (FileNotFoundException fnEx) {
        	log.error("File Not Found:" + file.getName(), fnEx);
        	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.INVALID_FILE_NAME;
        	CheckSumException exception = new CheckSumException("Could Not Find File: "+ file.getName()+ " "+fnEx.getMessage());
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(file.getName()));
			throw exception;
        } catch (IOException ioEx) {
        	log.error("Error while reading File Bytes:" + file.getName(), ioEx);
        	WebServicesFaultTypesEnum myEnum = WebServicesFaultTypesEnum.UNKNOWN_PROBLEM;
        	CheckSumException exception = new CheckSumException("Error While reading File: "+file.getName()+ " "+ioEx.getMessage());
			exception.setFaultCode(myEnum.getCode());
			exception.setFaultDescription(myEnum.getDescription(ioEx.getMessage()));
			throw exception;
        }
        finally
        {
        	try {
            if (is != null) 
                is.close();
        	} catch (IOException ioE){
        		log.error("Error while closing file Input Stream:" + ioE.getMessage(), ioE);
        	}
        }

        if (log.isDebugEnabled())
            log.debug("CheckSum for file : " + file.getAbsolutePath() + " (" + checkSum + ")");

        return checkSum;
    }

}
