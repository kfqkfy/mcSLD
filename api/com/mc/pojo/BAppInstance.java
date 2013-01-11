package com.mc.pojo;
// default package

/**
 * BAppInstance entity. @author MyEclipse Persistence Tools
 */

public class BAppInstance implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3087796217093225258L;
	private Integer id;
	private BAppCluster BAppClusterById;
	private BAppCluster BAppClusterByScId;
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

	// Constructors

	/** default constructor */
	public BAppInstance() {
	}

	/** minimal constructor */
	public BAppInstance(BAppCluster BAppClusterById,
			BAppCluster BAppClusterByScId) {
		this.BAppClusterById = BAppClusterById;
		this.BAppClusterByScId = BAppClusterByScId;
	}

	/** full constructor */
	public BAppInstance(BAppCluster BAppClusterById,
			BAppCluster BAppClusterByScId, String name, String description,
			String monitorStatus, String ip, String version, String port,
			String createdBy, String createdOn, String lastChangedBy,
			String lastChangedOn) {
		this.BAppClusterById = BAppClusterById;
		this.BAppClusterByScId = BAppClusterByScId;
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
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BAppCluster getBAppClusterById() {
		return this.BAppClusterById;
	}

	public void setBAppClusterById(BAppCluster BAppClusterById) {
		this.BAppClusterById = BAppClusterById;
	}

	public BAppCluster getBAppClusterByScId() {
		return this.BAppClusterByScId;
	}

	public void setBAppClusterByScId(BAppCluster BAppClusterByScId) {
		this.BAppClusterByScId = BAppClusterByScId;
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

}