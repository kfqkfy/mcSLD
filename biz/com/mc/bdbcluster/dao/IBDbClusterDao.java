/**
 * 
 */
package com.mc.bdbcluster.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BDbCluster;

/**
 * @author kongfeiquan
 *
 */
public interface IBDbClusterDao extends GenericDao<BDbCluster> {

	public int insertBDbCluster(BDbCluster dbCluster);
	
	public void updateBDbCluster(BDbCluster dbCluster);
	
	public void deleteBDbCluster(BDbCluster dbCluster);
	
	public BDbCluster getBDbCluster(BDbCluster dbCluster);
}
