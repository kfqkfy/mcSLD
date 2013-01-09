/**
 * 
 */
package com.mc.service;

import com.mc.bappcluster.dao.IBAppClusterDao;
import com.mc.bappinstance.dao.IBAppInstanceDao;
import com.mc.bcustomer.dao.IBCustomerDao;
import com.mc.bdbcluster.dao.IBDbClusterDao;
import com.mc.bdbinstance.dao.IBDbInstanceDao;
import com.mc.bserviceutil.dao.IBServiceUtilDao;
import com.mc.btenant.dao.IBTenantDao;
import com.mc.dao.IDao;
import com.mc.pojo.BAppCluster;
import com.mc.pojo.BServiceUtil;

/**
 * @author kongfeiquan
 *
 */
public class ServiceImpl implements IService {

	private IDao dao;
	private IBAppClusterDao iacd;
	private IBServiceUtilDao isu;
	private IBAppInstanceDao iaid;
	private IBCustomerDao icd;
	private IBDbClusterDao idcd;
	private IBDbInstanceDao idid;
	private IBTenantDao itd;
	
	/**
	 * 
	 */
	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mc.service.IService#updateAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void updateAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		iacd.updateAppCluster(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.service.IService#insertAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public int insertAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		appCluster.setSu(isu.queryById(1));
		return iacd.insertAppCluster(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.service.IService#deleteAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public void deleteAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		iacd.deleteAppCluster(appCluster);
	}

	/* (non-Javadoc)
	 * @see com.mc.service.IService#getAppCluster(com.mc.pojo.BAppCluster)
	 */
	@Override
	public BAppCluster getAppCluster(BAppCluster appCluster) {
		// TODO Auto-generated method stub
		return iacd.getAppCluster(appCluster);
	}
	
	@Override
	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil) {
		// TODO Auto-generated method stub
		return dao.getServiceUtil(serviceUtil);
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public IBAppClusterDao getIacd() {
		return iacd;
	}

	public void setIacd(IBAppClusterDao iacd) {
		this.iacd = iacd;
	}

	public IBServiceUtilDao getIsu() {
		return isu;
	}

	public void setIsu(IBServiceUtilDao isu) {
		this.isu = isu;
	}

	public IBAppInstanceDao getIaid() {
		return iaid;
	}

	public void setIaid(IBAppInstanceDao iaid) {
		this.iaid = iaid;
	}

	public IBCustomerDao getIcd() {
		return icd;
	}

	public void setIcd(IBCustomerDao icd) {
		this.icd = icd;
	}

	public IBDbClusterDao getIdcd() {
		return idcd;
	}

	public void setIdcd(IBDbClusterDao idcd) {
		this.idcd = idcd;
	}

	public IBDbInstanceDao getIdid() {
		return idid;
	}

	public void setIdid(IBDbInstanceDao idid) {
		this.idid = idid;
	}

	public IBTenantDao getItd() {
		return itd;
	}

	public void setItd(IBTenantDao itd) {
		this.itd = itd;
	}

}
