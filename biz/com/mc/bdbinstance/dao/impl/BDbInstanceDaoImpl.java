/**
 * 
 */
package com.mc.bdbinstance.dao.impl;

import com.mc.bdbinstance.dao.IBDbInstanceDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BDbInstance;

/**
 * @author kongfeiquan
 *
 */
public class BDbInstanceDaoImpl extends GenericHibernateDao<BDbInstance,Long> implements
		IBDbInstanceDao {

	@Override
	public int insertBDbInstance(BDbInstance dbInstance) {
		// TODO Auto-generated method stub
		return super.insert(dbInstance);
	}

	@Override
	public void updateBDbInstance(BDbInstance dbInstance) {
		// TODO Auto-generated method stub
		super.update(dbInstance);
	}

	@Override
	public void deleteBDbInstance(BDbInstance dbInstance) {
		// TODO Auto-generated method stub
		super.delete(dbInstance);
	}

	@Override
	public BDbInstance getBDbInstance(BDbInstance dbInstance) {
		// TODO Auto-generated method stub
		return super.queryById(dbInstance.getId());
	}


}
