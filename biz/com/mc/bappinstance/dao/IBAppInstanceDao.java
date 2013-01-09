/**
 * 
 */
package com.mc.bappinstance.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BAppInstance;

/**
 * @author kongfeiquan
 *
 */
public interface IBAppInstanceDao extends GenericDao<BAppInstance> {

	public void updateAppInstance(BAppInstance appInstance);

	public int insertAppInstance(BAppInstance appInstance);

	public void deleteAppInstance(BAppInstance appInstance);

	public BAppInstance getAppInstance(BAppInstance appInstance);
}
