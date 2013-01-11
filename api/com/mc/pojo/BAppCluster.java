package com.mc.pojo;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * BAppCluster entity. @author MyEclipse Persistence Tools
 */

public class BAppCluster implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3480860782128234951L;
	private Integer id;
	private BServiceUtil BServiceUtil;
	private String name;
	private String description;
	private String monitorStatus;
	private String ip;
	private String version;
	private String port;
	private String createdBy;
	private String createdOn;
	private String lastChangedBy;
	private String lastChangedOn;
	private Set BAppInstancesForScId = new HashSet(0);
	private Set BAppInstancesForId = new HashSet(0);

	// Constructors

	/** default constructor */
	public BAppCluster() {
	}

	/** minimal constructor */
	public BAppCluster(BServiceUtil BServiceUtil) {
		this.BServiceUtil = BServiceUtil;
	}

	/** full constructor */
	public BAppCluster(BServiceUtil BServiceUtil, String name,
			String description, String monitorStatus, String ip,
			String version, String port, String createdBy, String createdOn,
			String lastChangedBy, String lastChangedOn,
			Set BAppInstancesForScId, Set BAppInstancesForId) {
		this.BServiceUtil = BServiceUtil;
		this.name = name;
		this.description = description;
		this.monitorStatus = monitorStatus;
		this.ip = ip;
		this.version = version;
		this.port = port;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastChangedBy = lastChangedBy;
		this.lastChangedOn = lastChangedOn;
		this.BAppInstancesForScId = BAppInstancesForScId;
		this.BAppInstancesForId = BAppInstancesForId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BServiceUtil getBServiceUtil() {
		return this.BServiceUtil;
	}

	public void setBServiceUtil(BServiceUtil BServiceUtil) {
		this.BServiceUtil = BServiceUtil;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMonitorStatus() {
		return this.monitorStatus;
	}

	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getLastChangedBy() {
		return this.lastChangedBy;
	}

	public void setLastChangedBy(String lastChangedBy) {
		this.lastChangedBy = lastChangedBy;
	}

	public String getLastChangedOn() {
		return this.lastChangedOn;
	}

	public void setLastChangedOn(String lastChangedOn) {
		this.lastChangedOn = lastChangedOn;
	}

	public Set getBAppInstancesForScId() {
		return this.BAppInstancesForScId;
	}

	public void setBAppInstancesForScId(Set BAppInstancesForScId) {
		this.BAppInstancesForScId = BAppInstancesForScId;
	}

	public Set getBAppInstancesForId() {
		return this.BAppInstancesForId;
	}

	public void setBAppInstancesForId(Set BAppInstancesForId) {
		this.BAppInstancesForId = BAppInstancesForId;
	}

}