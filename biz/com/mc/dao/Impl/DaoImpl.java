/**
 * 
 */
package com.mc.dao.Impl;

import com.mc.dao.IDao;
import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.pojo.BAppCluster;
import com.mc.pojo.BServiceUtil;

/**
 * @author kongfeiquan
 *
 */
public class DaoImpl extends GenericHibernateDao<Object> implements IDao {

	
	/**
	 * 
	 */
	public DaoImpl() {
		// TODO Auto-generated constructor stub
		super(Object.class);
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#updateAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int updateAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
//		Session s = sessionFactory.getCurrentSession();
////		s.beginTransaction();
//		s.update(appCluster);
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#insertAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int insertAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
//		Session sess = sessionFactory.getCurrentSession();
//		 Transaction tx = sess.beginTransaction();
		 BServiceUtil bsu = new BServiceUtil();
		 bsu.setId(1);
//		 appCluster.setSu(super.queryById(1, BServiceUtil.class));
		 super.insert(appCluster);
//		     sess.save(appCluster);
//		     tx.commit();
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#deleteAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int deleteAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
//		Session s = sessionFactory.getCurrentSession();
////		s.beginTransaction();
//		s.delete(appCluster);
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.mc.dao.IDao#getAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public BAppCluster getAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
//		Session s = sessionFactory.getCurrentSession();
////		s.beginTransaction();
//		return (BAppCluster) s.get(appCluster.getClass(), 1);
		return null;
	}
	
	@Override
	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil) {
		// TODO Auto-generated method stub
//		Session s = sessionFactory.getCurrentSession();
//		tran = s.beginTransaction();
//		return (BServiceUtil) s.get(serviceUtil.getClass(), 1);
		return null;
	}


}
