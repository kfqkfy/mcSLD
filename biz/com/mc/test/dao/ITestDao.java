/**
 * 
 */
package com.mc.test.dao;

import java.util.List;

import com.mc.framwork.dao.GenericDao;
import com.mc.test.bo.TestBo;

/**
 * @author kongfeiquan
 *
 */
public interface ITestDao extends GenericDao<Object>{
	
	
	
	public List<TestBo> getTest();
}
