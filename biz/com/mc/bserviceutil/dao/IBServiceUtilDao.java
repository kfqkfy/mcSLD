/**
 * 
 */
package com.mc.bserviceutil.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BServiceUtil;

/**
 * @author kongfeiquan
 *
 */
public interface IBServiceUtilDao extends GenericDao<BServiceUtil> {

	public void updateServiceUtil(BServiceUtil serviceUtil);

	public int insertServiceUtil(BServiceUtil serviceUtil);

	public void deleteServiceUtil(BServiceUtil serviceUtil);

	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil);

}
