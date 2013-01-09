package com.mc.service;

import com.mc.pojo.BAppCluster;
import com.mc.pojo.BServiceUtil;

public interface IService {

	public void updateAppCluster(BAppCluster appCluster);

	public int insertAppCluster(BAppCluster appCluster);

	public void deleteAppCluster(BAppCluster appCluster);

	public BAppCluster getAppCluster(BAppCluster appCluster);

	public BServiceUtil getServiceUtil(BServiceUtil serviceUtil);

}
