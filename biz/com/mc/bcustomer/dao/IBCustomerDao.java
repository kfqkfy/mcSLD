/**
 * 
 */
package com.mc.bcustomer.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BCustomer;

/**
 * @author kongfeiquan
 *
 */
public interface IBCustomerDao extends GenericDao<BCustomer,Long> {

	public int insertBCustomer(BCustomer customer);
	
	public void deleteBCustomer(BCustomer customer);
	
	public void updateBCustomer(BCustomer customer);
	
	public BCustomer getBCustomer(BCustomer customer);
}
