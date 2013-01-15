package com.mc.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * BDbCluster entity. @author MyEclipse Persistence Tools
 */

public class BDbCluster implements java.io.Serializable {

	// Fields

	private Integer id;
	private BServiceUtil BServiceUtilById;
	private BServiceUtil BServiceUtilBySuId;
	private String name;
	private String description;
	private String monitorStatus;
	private String ip;
	private String port;
	private String dbType;
	private String dbVersion;
	private String connectionUserName;
	private String connectionUserPassword;
	private String createdBy;
	private String createdOn;
	private String lastChangedBy;
	private String lastChangedOn;
	private Set BDbInstances = new HashSet(0);

	// Constructors

	/** default constructor */
	public BDbCluster() {
	}

	/** minimal constructor */
	public BDbCluster(BServiceUtil BServiceUtilById,
			BServiceUtil BServiceUtilBySuId) {
		this.BServiceUtilById = BServiceUtilById;
		this.BServiceUtilBySuId = BServiceUtilBySuId;
	}

	/** full constructor */
	public BDbCluster(BServiceUtil BServiceUtilById,
			BServiceUtil BServiceUtilBySuId, String name, String description,
			String monitorStatus, String ip, String port, String dbType,
			String dbVersion, String connectionUserName,
			String connectionUserPassword, String createdBy, String createdOn,
			String lastChangedBy, String lastChangedOn, Set BDbInstances) {
		this.BServiceUtilById = BServiceUtilById;
		this.BServiceUtilBySuId = BServiceUtilBySuId;
		this.name = name;
		this.description = description;
		this.monitorStatus = monitorStatus;
		this.ip = ip;
		this.port = port;
		this.dbType = dbType;
		this.dbVersion = dbVersion;
		this.connectionUserName = connectionUserName;
		this.connectionUserPassword = connectionUserPassword;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastChangedBy = lastChangedBy;
		this.lastChangedOn = lastChangedOn;
		this.BDbInstances = BDbInstances;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BServiceUtil getBServiceUtilById() {
		return this.BServiceUtilById;
	}

	public void setBServiceUtilById(BServiceUtil BServiceUtilById) {
		this.BServiceUtilById = BServiceUtilById;
	}

	public BServiceUtil getBServiceUtilBySuId() {
		return this.BServiceUtilBySuId;
	}

	public void setBServiceUtilBySuId(BServiceUtil BServiceUtilBySuId) {
		this.BServiceUtilBySuId = BServiceUtilBySuId;
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

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
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

	public Set getBDbInstances() {
		return this.BDbInstances;
	}

	public void setBDbInstances(Set BDbInstances) {
		this.BDbInstances = BDbInstances;
	}

}