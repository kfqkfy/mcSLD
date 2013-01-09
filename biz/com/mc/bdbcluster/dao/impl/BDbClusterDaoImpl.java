/**
 * 
 */
package com.mc.bdbcluster.dao.impl;

import com.mc.bdbcluster.dao.IBDbClusterDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BDbCluster;

/**
 * @author kongfeiquan
 *
 */
public class BDbClusterDaoImpl extends GenericHibernateDao<BDbCluster> implements
		IBDbClusterDao {

	@Override
	public int insertBDbCluster(BDbCluster dbCluster) {
		// TODO Auto-generated method stub
		return super.insert(dbCluster);
	}

	@Override
	public void updateBDbCluster(BDbCluster dbCluster) {
		// TODO Auto-generated method stub
		super.update(dbCluster);
	}

	@Override
	public void deleteBDbCluster(BDbCluster dbCluster) {
		// TODO Auto-generated method stub
		super.delete(dbCluster);
	}

	@Override
	public BDbCluster getBDbCluster(BDbCluster dbCluster) {
		// TODO Auto-generated method stub
		return super.queryById(dbCluster.getId());
	}

}
