/**
 * 
 */
package com.mc.bcustomer.dao.impl;

import com.mc.bcustomer.dao.IBCustomerDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BCustomer;

/**
 * @author kongfeiquan
 *
 */
public class BCustomerDaoImpl extends GenericHibernateDao<BCustomer,Long> implements
		IBCustomerDao {

	@Override
	public int insertBCustomer(BCustomer customer) {
		// TODO Auto-generated method stub
		return super.insert(customer);
	}

	@Override
	public void deleteBCustomer(BCustomer customer) {
		// TODO Auto-generated method stub
		super.delete(customer);
	}

	@Override
	public void updateBCustomer(BCustomer customer) {
		// TODO Auto-generated method stub
		super.update(customer);
	}

	@Override
	public BCustomer getBCustomer(BCustomer customer) {
		// TODO Auto-generated method stub
		return super.queryById(customer.getId());
	}

}
