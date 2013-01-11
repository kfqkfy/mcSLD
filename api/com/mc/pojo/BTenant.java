package com.mc.pojo;
// default package

/**
 * BTenant entity. @author MyEclipse Persistence Tools
 */

public class BTenant implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -7296069903031648955L;
	private Integer id;
	private BCustomer BCustomerByCid;
	private BDbInstance BDbInstanceById;
	private BCustomer BCustomerById;
	private BDbInstance BDbInstanceByDbiId;
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
	public BTenant(BCustomer BCustomerByCid, BDbInstance BDbInstanceById,
			BCustomer BCustomerById, BDbInstance BDbInstanceByDbiId) {
		this.BCustomerByCid = BCustomerByCid;
		this.BDbInstanceById = BDbInstanceById;
		this.BCustomerById = BCustomerById;
		this.BDbInstanceByDbiId = BDbInstanceByDbiId;
	}

	/** full constructor */
	public BTenant(BCustomer BCustomerByCid, BDbInstance BDbInstanceById,
			BCustomer BCustomerById, BDbInstance BDbInstanceByDbiId,
			String name, String description, String monitorStatus,
			String version, String lcStatus, String usage,
			String connectionUserPassword, String createdBy, String createdOn,
			String lastChangedBy, String lastChangedOn) {
		this.BCustomerByCid = BCustomerByCid;
		this.BDbInstanceById = BDbInstanceById;
		this.BCustomerById = BCustomerById;
		this.BDbInstanceByDbiId = BDbInstanceByDbiId;
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

	public BCustomer getBCustomerByCid() {
		return this.BCustomerByCid;
	}

	public void setBCustomerByCid(BCustomer BCustomerByCid) {
		this.BCustomerByCid = BCustomerByCid;
	}

	public BDbInstance getBDbInstanceById() {
		return this.BDbInstanceById;
	}

	public void setBDbInstanceById(BDbInstance BDbInstanceById) {
		this.BDbInstanceById = BDbInstanceById;
	}

	public BCustomer getBCustomerById() {
		return this.BCustomerById;
	}

	public void setBCustomerById(BCustomer BCustomerById) {
		this.BCustomerById = BCustomerById;
	}

	public BDbInstance getBDbInstanceByDbiId() {
		return this.BDbInstanceByDbiId;
	}

	public void setBDbInstanceByDbiId(BDbInstance BDbInstanceByDbiId) {
		this.BDbInstanceByDbiId = BDbInstanceByDbiId;
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