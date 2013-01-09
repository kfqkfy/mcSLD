/**
 * 
 */
package com.mc.bdbinstance.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BDbInstance;

/**
 * @author kongfeiquan
 *
 */
public interface IBDbInstanceDao extends GenericDao<BDbInstance> {

	public int insertBDbInstance(BDbInstance dbInstance);
	
	public void updateBDbInstance(BDbInstance dbInstance);
	
	public void deleteBDbInstance(BDbInstance dbInstance);
	
	public BDbInstance getBDbInstance(BDbInstance dbInstance);
}
