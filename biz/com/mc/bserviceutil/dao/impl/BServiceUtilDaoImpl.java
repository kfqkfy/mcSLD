/**
 * 
 */
package com.mc.bserviceutil.dao.impl;

import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BServiceUtil;
import com.mc.bserviceutil.dao.IBServiceUtilDao;

/**
 * @author kongfeiquan
 *
 */
public class BServiceUtilDaoImpl extends GenericHibernateDao<BServiceUtil,Long> implements IBServiceUtilDao {


	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#updateAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void updateServiceUtil(BServiceUtil serviceUtil) {
		// TODO Auto-generated method stub
		super.update(serviceUtil);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#insertAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int insertServiceUtil(BServiceUtil serviceUtil) {
		// TODO Auto-generated method stub
		return super.insert(serviceUtil);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#deleteAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void deleteServiceUtil(BServiceUtil serviceUtil) {
		super.delete(serviceUtil);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#getAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil) {
		// TODO Auto-generated method stub
		return super.queryById(serviceUtil.getId());
	}
	
}
