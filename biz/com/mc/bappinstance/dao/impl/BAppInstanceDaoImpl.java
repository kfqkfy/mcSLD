package com.mc.bappinstance.dao.impl;

import com.mc.bappinstance.dao.IBAppInstanceDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BAppInstance;

public class BAppInstanceDaoImpl extends GenericHibernateDao<BAppInstance,Long> implements
		IBAppInstanceDao {

	@Override
	public void deleteAppInstance(BAppInstance appInstance) {
		// TODO Auto-generated method stub
		super.delete(appInstance);
	}
	
	@Override
	public BAppInstance getAppInstance(BAppInstance appInstance) {
		// TODO Auto-generated method stub
		return super.queryById(appInstance.getId());
	}
	
	@Override
	public int insertAppInstance(BAppInstance appInstance) {
		// TODO Auto-generated method stub
		return super.insert(appInstance);
	}
	
	@Override
	public void updateAppInstance(BAppInstance appInstance) {
		// TODO Auto-generated method stub
		super.update(appInstance);
	}
}
