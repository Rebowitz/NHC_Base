/**
 * UpdateStatusServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */
package com.nhcsys.webservices.updatestatus;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.nhcsys.common.Constants;
import com.nhcsys.common.WebServicesConfig;
import com.nhcsys.common.exception.WebServicesException;
import com.nhcsys.webservices.login.LoginServiceSkeletonInterface;

//import com.nhcsys.webservices.login.OracleHandlerLoginService;
//import com.nhcsys.webservices.login.ResponseXMLHandlerLoginService;
//import com.nhcsys.webservices.login.ZenHandlerLoginService;

import com.nhcsys.webservices.updatestatus.UpdateStatusFailure;

import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.ProcessCompletedStatusElementDocument;
import com.nhcsys.webservices.updatestatus.updatestatustypes.v1.UpdateStatusElementDocument;

/**
 * UpdateStatusServiceSkeleton java skeleton for the axisService
 */
public class UpdateStatusServiceSkeleton implements
                UpdateStatusServiceSkeletonInterface {
        public static String CLASS = "UpdateStatusServiceSkeleton:  ";


        public ProcessCompletedStatusElementDocument UpdateStatus(UpdateStatusElementDocument updateStatusElement) throws UpdateStatusFailure {

                        UpdateStatusServiceSkeletonInterface responseHandler = null;

                        try {
                                responseHandler = (UpdateStatusServiceSkeletonInterface) Factory
                                                .getHandler();
                        } catch (InstantiationException e) {
                                e.printStackTrace();
                        } catch (IllegalAccessException e) {
                                e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                        }
                return (ProcessCompletedStatusElementDocument)
                    responseHandler.UpdateStatus(updateStatusElement);

        }

        public static final class Factory {
                private Factory() {
                } // No instance of this class allowed

                public static UpdateStatusServiceSkeletonInterface getHandler() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
                        String handlerType=  WebServicesConfig.getConfiguration().getString(Constants.UPDATESTATUS_SERVICE_HANDLERTYPE);
                        String handlerClassName= WebServicesConfig.getConfiguration().getString(handlerType);
                        return (UpdateStatusServiceSkeletonInterface) Class.forName(handlerClassName).newInstance();
                }
        }

}
