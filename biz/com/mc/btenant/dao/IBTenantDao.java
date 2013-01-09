/**
 * 
 */
package com.mc.btenant.dao;

import com.mc.framwork.dao.GenericDao;
import com.mc.pojo.BTenant;

/**
 * @author kongfeiquan
 *
 */
public interface IBTenantDao extends GenericDao<BTenant> {

	public int insertBTenant(BTenant tenant);
	
	public void deleteBTenant(BTenant tenant);
	
	public void updateBTenant(BTenant tenant);
	
	public BTenant getBTenant(BTenant tenant);
}
