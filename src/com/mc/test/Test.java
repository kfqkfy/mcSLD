/**
 * 
 */
package com.mc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mc.util.BaseAction;

import com.mc.pojo.BAppCluster;
import com.mc.pojo.BAppInstance;
import com.mc.pojo.BCustomer;
import com.mc.pojo.BDbCluster;
import com.mc.pojo.BDbInstance;
import com.mc.pojo.BServiceUtil;
import com.mc.pojo.BTenant;
import com.mc.service.IService;
import com.mc.test.bo.TestBo;

/**
 * @author kongfeiquan
 *
 */
public class Test{
	
	private List<TestBo> testlist;
	private ITestService testService;
	private TestBo t;
	private BAppCluster appCluster;
	private BAppInstance appInstance;
	private BCustomer customer;
	private BDbCluster dbcluster;
	private BDbInstance dbInstance;
	private BServiceUtil serviceUtil;
	private BTenant tenant;
	private IService service;

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public String goIndex(){
		testlist = testService.getTest();
		t = testlist.get(0);
		return "success";
	}
	
	public String testAppCluster(){
		int r1 = service.insertAppCluster(appCluster);
		appCluster.setName("7676");
		appCluster.setId(r1);
		service.updateAppCluster(appCluster);
		appCluster = service.getAppCluster(appCluster);
		service.deleteAppCluster(appCluster);
		return "AppCluster";
	}

	public List<TestBo> getTestlist() {
		return testlist;
	}

	public void setTestlist(List<TestBo> testlist) {
		this.testlist = testlist;
	}

	public ITestService getTestService() {
		return testService;
	}

	public void setTestService(ITestService testService) {
		this.testService = testService;
	}

	public TestBo getT() {
		return t;
	}

	public void setT(TestBo t) {
		this.t = t;
	}

	public BAppCluster getAppCluster() {
		return appCluster;
	}

	public void setAppCluster(BAppCluster appCluster) {
		this.appCluster = appCluster;
	}

	public BAppInstance getAppInstance() {
		return appInstance;
	}

	public void setAppInstance(BAppInstance appInstance) {
		this.appInstance = appInstance;
	}

	public BCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(BCustomer customer) {
		this.customer = customer;
	}

	public BDbCluster getDbCluster() {
		return dbcluster;
	}

	public void setDbCluster(BDbCluster dbcluster) {
		this.dbcluster = dbcluster;
	}

	public BDbInstance getDbInstance() {
		return dbInstance;
	}

	public void setDbInstance(BDbInstance dbInstance) {
		this.dbInstance = dbInstance;
	}

	public BServiceUtil getServiceUtil() {
		return serviceUtil;
	}

	public void setServiceUtil(BServiceUtil serviceUtil) {
		this.serviceUtil = serviceUtil;
	}

	public BTenant getTenant() {
		return tenant;
	}

	public void setTenant(BTenant tenant) {
		this.tenant = tenant;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	
	
}
