/**
 * 
 */
package com.mc.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BAppCluster;
import com.mc.pojo.BServiceUtil;

/**
 * @author kongfeiquan
 *
 */
public interface IDao extends GenericDao<Object,Long> {

	public int updateAppCluster(BAppCluster appCluster);

	public int insertAppCluster(BAppCluster appCluster);

	public int deleteAppCluster(BAppCluster appCluster);

	public BAppCluster getAppCluster(BAppCluster appCluster);

	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil);

}
