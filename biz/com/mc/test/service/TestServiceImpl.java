/**
 * 
 */
package com.mc.test.service;

import java.util.List;

import com.mc.test.bo.TestBo;
import com.mc.test.dao.ITestDao;
import com.mc.test.ITestService;

/**
 * @author kongfeiquan
 *
 */
public class TestServiceImpl implements ITestService {
	
	private ITestDao testdao;

	/**
	 * 
	 */
	public TestServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mc.test.service.ITestService#getTest()
	 */
	@Override
	public List<TestBo> getTest() {
		return testdao.getTest();
	}

	public ITestDao getTestdao() {
		return testdao;
	}

	public void setTestdao(ITestDao testdao) {
		this.testdao = testdao;
	}

}
