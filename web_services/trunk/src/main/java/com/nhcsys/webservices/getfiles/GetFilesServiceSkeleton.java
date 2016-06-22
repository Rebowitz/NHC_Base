/**
 * GetFilesServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.getfiles;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesRequestElementDocument;
import com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument;

/**
 *  GetFilesServiceSkeleton java skeleton for the axisService
 */
public class GetFilesServiceSkeleton implements GetFilesServiceSkeletonInterface {
    /**
     * Auto generated method signature
     * @param getFilesRequestElement0
     */
    public com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesResponseElementDocument GetFiles(
        com.nhcsys.webservices.getfiles.getfilestypes.v1.GetFilesRequestElementDocument getFilesRequestElement0)
        throws GetFilesFailure {
        GetFilesServiceSkeletonInterface responseHandler = null;

        try {
                responseHandler = (GetFilesServiceSkeletonInterface) Factory.getHandler();
        } catch (InstantiationException e) {
                e.printStackTrace();
        } catch (IllegalAccessException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }

        return (GetFilesResponseElementDocument) responseHandler.GetFiles(getFilesRequestElement0);
    }

    public static final class Factory {
            private Factory() {
            } // No instance of this class allowed

            public static GetFilesServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
                    String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.GETFILES_SERVICE_HANDLERTYPE);
                    String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
                    return (GetFilesServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
            }
    }

}
