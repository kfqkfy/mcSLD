/**
 * 
 */
package com.mc.btenant.dao.impl;

import java.util.List;

import com.mc.btenant.dao.IBTenantDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BTenant;

/**
 * @author kongfeiquan
 *
 */
public class BTenantDaoImpl extends GenericHibernateDao<BTenant,Long> implements
		IBTenantDao {

	@Override
	public int insertBTenant(BTenant tenant) {
		// TODO Auto-generated method stub
		return super.insert(tenant);
	}

	@Override
	public void deleteBTenant(BTenant tenant) {
		// TODO Auto-generated method stub
		super.delete(tenant);
	}

	@Override
	public void updateBTenant(BTenant tenant) {
		// TODO Auto-generated method stub
		super.update(tenant);
	}

	@Override
	public BTenant getBTenant(BTenant tenant) {
		// TODO Auto-generated method stub
		return super.queryById(tenant.getId());
	}
//	
//	@Override
//	public List<BTenant> queryAll() {
//		// TODO Auto-generated method stub
//		String hql = "from " + BTenant.class.getSimpleName();  
//        return queryForList(hql, null); 
//	}

}
