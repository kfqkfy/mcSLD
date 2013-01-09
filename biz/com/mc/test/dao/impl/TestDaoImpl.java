/**
 * 
 */
package com.mc.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mc.framwork.dao.Impl.GenericHibernateDao;
import com.mc.test.bo.TestBo;
import com.mc.test.dao.ITestDao;

/**
 * @author kongfeiquan
 *
 */
public class TestDaoImpl extends GenericHibernateDao<Object> implements ITestDao{

	SessionFactory sessionFactory;
	/**
	 * 
	 */
	public TestDaoImpl() {
		// TODO Auto-generated constructor stub
		super(Object.class);
	}
	
	public List<TestBo> getTest() {
		List<TestBo> l = new ArrayList<TestBo>();
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		l.add((TestBo) s.get(TestBo.class, 1l));
		return l;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
