/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.nhcsys.dataaccess.dao;

import com.nhcsys.dataaccess.dto.*;
import com.nhcsys.dataaccess.exceptions.*;

public interface MachinesDao
{
	/** 
	 * Inserts a new row in the MACHINES table.
	 */
	public MachinesPk insert(Machines dto) throws MachinesDaoException;

	/** 
	 * Updates a single row in the MACHINES table.
	 */
	public void update(MachinesPk pk, Machines dto) throws MachinesDaoException;

	/** 
	 * Deletes a single row in the MACHINES table.
	 */
	public void delete(MachinesPk pk) throws MachinesDaoException;

	/** 
	 * Returns the rows from the MACHINES table that matches the specified primary-key value.
	 */
	public Machines findByPrimaryKey(MachinesPk pk) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public Machines findByPrimaryKey(long machineId) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria ''.
	 */
	public Machines[] findAll() throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'MACHINE_ID = :machineId'.
	 */
	public Machines[] findWhereMachineIdEquals(long machineId) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'CUSTOMER_ID = :customerId'.
	 */
	public Machines[] findWhereCustomerIdEquals(long customerId) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'VIVE_ID = :viveId'.
	 */
	public Machines[] findWhereViveIdEquals(String viveId) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'CPU_SERIAL_NO = :cpuSerialNo'.
	 */
	public Machines[] findWhereCpuSerialNoEquals(String cpuSerialNo) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'KEY_DATA = :keyData'.
	 */
	public Machines[] findWhereKeyDataEquals(String keyData) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'KEY_TIMESTAMP = :keyTimestamp'.
	 */
	public Machines[] findWhereKeyTimestampEquals(long keyTimestamp) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'STOLEN_FLAG = :stolenFlag'.
	 */
	public Machines[] findWhereStolenFlagEquals(int stolenFlag) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'TERMINATE_FLAG = :terminateFlag'.
	 */
	public Machines[] findWhereTerminateFlagEquals(int terminateFlag) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the criteria 'REGISTERED_FLAG = :registeredFlag'.
	 */
	public Machines[] findWhereRegisteredFlagEquals(int registeredFlag) throws MachinesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the MACHINES table that match the specified arbitrary SQL statement
	 */
	public Machines[] findByDynamicSelect(String sql, Object[] sqlParams) throws MachinesDaoException;

	/** 
	 * Returns all rows from the MACHINES table that match the specified arbitrary SQL statement
	 */
	public Machines[] findByDynamicWhere(String sql, Object[] sqlParams) throws MachinesDaoException;

}
