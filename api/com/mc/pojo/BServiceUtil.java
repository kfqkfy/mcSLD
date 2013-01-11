package com.mc.pojo;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * BServiceUtil entity. @author MyEclipse Persistence Tools
 */

public class BServiceUtil implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664894062624836450L;
	private Integer id;
	private String name;
	private String description;
	private String monitorStatus;
	private String version;
	private String ip;
	private String port;
	private String createdBy;
	private String createdOn;
	private String lastChangedBy;
	private String lastChangedOn;
	private Set BAppClusters = new HashSet(0);
	private Set BDbClustersForSuId = new HashSet(0);
	private Set BDbClustersForId = new HashSet(0);

	// Constructors

	/** default constructor */
	public BServiceUtil() {
	}

	/** full constructor */
	public BServiceUtil(String name, String description, String monitorStatus,
			String version, String ip, String port, String createdBy,
			String createdOn, String lastChangedBy, String lastChangedOn,
			Set BAppClusters, Set BDbClustersForSuId, Set BDbClustersForId) {
		this.name = name;
		this.description = description;
		this.monitorStatus = monitorStatus;
		this.version = version;
		this.ip = ip;
		this.port = port;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastChangedBy = lastChangedBy;
		this.lastChangedOn = lastChangedOn;
		this.BAppClusters = BAppClusters;
		this.BDbClustersForSuId = BDbClustersForSuId;
		this.BDbClustersForId = BDbClustersForId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public Set getBAppClusters() {
		return this.BAppClusters;
	}

	public void setBAppClusters(Set BAppClusters) {
		this.BAppClusters = BAppClusters;
	}

	public Set getBDbClustersForSuId() {
		return this.BDbClustersForSuId;
	}

	public void setBDbClustersForSuId(Set BDbClustersForSuId) {
		this.BDbClustersForSuId = BDbClustersForSuId;
	}

	public Set getBDbClustersForId() {
		return this.BDbClustersForId;
	}

	public void setBDbClustersForId(Set BDbClustersForId) {
		this.BDbClustersForId = BDbClustersForId;
	}

}