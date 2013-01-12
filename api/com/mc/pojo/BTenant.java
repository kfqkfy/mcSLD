package com.mc.pojo;

/**
 * BTenant entity. @author MyEclipse Persistence Tools
 */

public class BTenant implements java.io.Serializable {

	// Fields

	private Integer id;
	private BCustomer BCustomer;
	private BDbInstance BDbInstance;
	private String name;
	private String description;
	private String monitorStatus;
	private String version;
	private String lcStatus;
	private String usage;
	private String connectionUserPassword;
	private String createdBy;
	private String createdOn;
	private String lastChangedBy;
	private String lastChangedOn;

	// Constructors

	/** default constructor */
	public BTenant() {
	}

	/** minimal constructor */
	public BTenant(BCustomer BCustomer, BDbInstance BDbInstance) {
		this.BCustomer = BCustomer;
		this.BDbInstance = BDbInstance;
	}

	/** full constructor */
	public BTenant(BCustomer BCustomer, BDbInstance BDbInstance, String name,
			String description, String monitorStatus, String version,
			String lcStatus, String usage, String connectionUserPassword,
			String createdBy, String createdOn, String lastChangedBy,
			String lastChangedOn) {
		this.BCustomer = BCustomer;
		this.BDbInstance = BDbInstance;
		this.name = name;
		this.description = description;
		this.monitorStatus = monitorStatus;
		this.version = version;
		this.lcStatus = lcStatus;
		this.usage = usage;
		this.connectionUserPassword = connectionUserPassword;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastChangedBy = lastChangedBy;
		this.lastChangedOn = lastChangedOn;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BCustomer getBCustomer() {
		return this.BCustomer;
	}

	public void setBCustomer(BCustomer BCustomer) {
		this.BCustomer = BCustomer;
	}

	public BDbInstance getBDbInstance() {
		return this.BDbInstance;
	}

	public void setBDbInstance(BDbInstance BDbInstance) {
		this.BDbInstance = BDbInstance;
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

	public String getLcStatus() {
		return this.lcStatus;
	}

	public void setLcStatus(String lcStatus) {
		this.lcStatus = lcStatus;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
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

}