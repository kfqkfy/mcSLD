/**
 * 
 */
package com.mc.bappcluster.dao.impl;

import com.mc.bappcluster.dao.IBAppClusterDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BAppCluster;

/**
 * @author kongfeiquan
 *
 */
public class BAppClusterDaoImpl extends GenericHibernateDao<BAppCluster,Long> implements IBAppClusterDao {

	

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#updateAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void updateAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		super.update(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#insertAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int insertAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		return super.insert(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#deleteAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void deleteAppCluster(BAppCluster appCluster) {
		super.delete(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#getAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public BAppCluster getAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		return super.queryById(appCluster.getId());
	}
	
}
