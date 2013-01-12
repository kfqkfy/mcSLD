/**
 * 
 */
package com.mc.bappcluster.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BAppCluster;

/**
 * @author kongfeiquan
 *
 */
public interface IBAppClusterDao extends GenericDao<BAppCluster,Long> {

	public void updateAppCluster(BAppCluster appCluster);

	public int insertAppCluster(BAppCluster appCluster);

	public void deleteAppCluster(BAppCluster appCluster);

	public BAppCluster getAppCluster(BAppCluster appCluster);

}
