/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.j2ee.session;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import com.nhcsys.dataaccess.j2ee.session.TelesalesCallSourceSession;

public interface TelesalesCallSourceSessionHome extends EJBHome
{
	/**
	 * Method 'create'
	 * 
	 * @throws CreateException
	 * @throws RemoteException
	 * @return TelesalesCallSourceSession
	 */
	public TelesalesCallSourceSession create() throws CreateException, RemoteException;

}
