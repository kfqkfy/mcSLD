package com.mc.pojo;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * BDbInstance entity. @author MyEclipse Persistence Tools
 */

public class BDbInstance implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6333539838508663121L;
	private Integer id;
	private BDbCluster BDbClusterById;
	private BDbCluster BDbClusterByDbcId;
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
	private Set BTenantsForDbiId = new HashSet(0);
	private Set BTenantsForId = new HashSet(0);

	// Constructors

	/** default constructor */
	public BDbInstance() {
	}

	/** minimal constructor */
	public BDbInstance(BDbCluster BDbClusterById, BDbCluster BDbClusterByDbcId) {
		this.BDbClusterById = BDbClusterById;
		this.BDbClusterByDbcId = BDbClusterByDbcId;
	}

	/** full constructor */
	public BDbInstance(BDbCluster BDbClusterById, BDbCluster BDbClusterByDbcId,
			String name, String description, String monitorStatus, String ip,
			String dbType, String dbVersion, String connectionUserName,
			String connectionUserPassword, String createdBy, String createdOn,
			String lastChangedBy, String lastChangedOn, Set BTenantsForDbiId,
			Set BTenantsForId) {
		this.BDbClusterById = BDbClusterById;
		this.BDbClusterByDbcId = BDbClusterByDbcId;
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
		this.BTenantsForDbiId = BTenantsForDbiId;
		this.BTenantsForId = BTenantsForId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BDbCluster getBDbClusterById() {
		return this.BDbClusterById;
	}

	public void setBDbClusterById(BDbCluster BDbClusterById) {
		this.BDbClusterById = BDbClusterById;
	}

	public BDbCluster getBDbClusterByDbcId() {
		return this.BDbClusterByDbcId;
	}

	public void setBDbClusterByDbcId(BDbCluster BDbClusterByDbcId) {
		this.BDbClusterByDbcId = BDbClusterByDbcId;
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

	public Set getBTenantsForDbiId() {
		return this.BTenantsForDbiId;
	}

	public void setBTenantsForDbiId(Set BTenantsForDbiId) {
		this.BTenantsForDbiId = BTenantsForDbiId;
	}

	public Set getBTenantsForId() {
		return this.BTenantsForId;
	}

	public void setBTenantsForId(Set BTenantsForId) {
		this.BTenantsForId = BTenantsForId;
	}

}