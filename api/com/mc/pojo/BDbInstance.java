package com.mc.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * BDbInstance entity. @author MyEclipse Persistence Tools
 */

public class BDbInstance implements java.io.Serializable {

	// Fields

	private Integer id;
	private BDbCluster BDbCluster;
	private String name;
	private String description;
	private String monitorStatus;
	private String ip;
	private String dbType;
	private String dbVersion;
	private String connectionUserName;
	private String connectionUserPassword;
	private String createdBy;
	private String createdOn;
	private String lastChangedBy;
	private String lastChangedOn;
	private Set BTenants = new HashSet(0);

	// Constructors

	/** default constructor */
	public BDbInstance() {
	}

	/** full constructor */
	public BDbInstance(BDbCluster BDbCluster, String name, String description,
			String monitorStatus, String ip, String dbType, String dbVersion,
			String connectionUserName, String connectionUserPassword,
			String createdBy, String createdOn, String lastChangedBy,
			String lastChangedOn, Set BTenants) {
		this.BDbCluster = BDbCluster;
		this.name = name;
		this.description = description;
		this.monitorStatus = monitorStatus;
		this.ip = ip;
		this.dbType = dbType;
		this.dbVersion = dbVersion;
		this.connectionUserName = connectionUserName;
		this.connectionUserPassword = connectionUserPassword;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastChangedBy = lastChangedBy;
		this.lastChangedOn = lastChangedOn;
		this.BTenants = BTenants;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BDbCluster getBDbCluster() {
		return this.BDbCluster;
	}

	public void setBDbCluster(BDbCluster BDbCluster) {
		this.BDbCluster = BDbCluster;
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

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbVersion() {
		return this.dbVersion;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	public String getConnectionUserName() {
		return this.connectionUserName;
	}

	public void setConnectionUserName(String connectionUserName) {
		this.connectionUserName = connectionUserName;
	}

	public String getConnectionUserPassword() {
		return this.connectionUserPassword;
	}

	public void setConnectionUserPassword(String connectionUserPassword) {
		this.connectionUserPassword = connectionUserPassword;
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

	public Set getBTenants() {
		return this.BTenants;
	}

	public void setBTenants(Set BTenants) {
		this.BTenants = BTenants;
	}

}