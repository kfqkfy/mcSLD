package com.mc.pojo.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the b_service_util table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="b_service_util"
 */

public abstract class BaseBServiceUtil  implements Serializable {

	public static String REF = "BServiceUtil";
	public static String PROP_NAME = "Name";
	public static String PROP_IP = "Ip";
	public static String PROP_PORT = "Port";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_CREATED_ON = "CreatedOn";
	public static String PROP_CREATED_BY = "CreatedBy";
	public static String PROP_LAST_CHANGED_ON = "LastChangedOn";
	public static String PROP_ID = "Id";
	public static String PROP_LAST_CHANGED_BY = "LastChangedBy";
	public static String PROP_MONITOR_STATUS = "MonitorStatus";
	public static String PROP_VERSION = "Version";


	// constructors
	public BaseBServiceUtil () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBServiceUtil (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String monitorStatus;
	private java.lang.String version;
	private java.lang.String ip;
	private java.lang.String port;
	private java.lang.String createdBy;
	private java.lang.String createdOn;
	private java.lang.String lastChangedBy;
	private java.lang.String lastChangedOn;

	// collections
	private java.util.Set<com.mc.pojo.BAppCluster> bAppClusters;
	private java.util.Set<com.mc.pojo.BDbCluster> bDbClusters;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: name
	 */
	public java.lang.String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: monitor_status
	 */
	public java.lang.String getMonitorStatus () {
		return monitorStatus;
	}

	/**
	 * Set the value related to the column: monitor_status
	 * @param monitorStatus the monitor_status value
	 */
	public void setMonitorStatus (java.lang.String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}



	/**
	 * Return the value associated with the column: version
	 */
	public java.lang.String getVersion () {
		return version;
	}

	/**
	 * Set the value related to the column: version
	 * @param version the version value
	 */
	public void setVersion (java.lang.String version) {
		this.version = version;
	}



	/**
	 * Return the value associated with the column: ip
	 */
	public java.lang.String getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (java.lang.String ip) {
		this.ip = ip;
	}



	/**
	 * Return the value associated with the column: port
	 */
	public java.lang.String getPort () {
		return port;
	}

	/**
	 * Set the value related to the column: port
	 * @param port the port value
	 */
	public void setPort (java.lang.String port) {
		this.port = port;
	}



	/**
	 * Return the value associated with the column: created_by
	 */
	public java.lang.String getCreatedBy () {
		return createdBy;
	}

	/**
	 * Set the value related to the column: created_by
	 * @param createdBy the created_by value
	 */
	public void setCreatedBy (java.lang.String createdBy) {
		this.createdBy = createdBy;
	}



	/**
	 * Return the value associated with the column: created_on
	 */
	public java.lang.String getCreatedOn () {
		return createdOn;
	}

	/**
	 * Set the value related to the column: created_on
	 * @param createdOn the created_on value
	 */
	public void setCreatedOn (java.lang.String createdOn) {
		this.createdOn = createdOn;
	}



	/**
	 * Return the value associated with the column: last_changed_by
	 */
	public java.lang.String getLastChangedBy () {
		return lastChangedBy;
	}

	/**
	 * Set the value related to the column: last_changed_by
	 * @param lastChangedBy the last_changed_by value
	 */
	public void setLastChangedBy (java.lang.String lastChangedBy) {
		this.lastChangedBy = lastChangedBy;
	}



	/**
	 * Return the value associated with the column: last_changed_on
	 */
	public java.lang.String getLastChangedOn () {
		return lastChangedOn;
	}

	/**
	 * Set the value related to the column: last_changed_on
	 * @param lastChangedOn the last_changed_on value
	 */
	public void setLastChangedOn (java.lang.String lastChangedOn) {
		this.lastChangedOn = lastChangedOn;
	}



	/**
	 * Return the value associated with the column: BAppClusters
	 */
	public java.util.Set<com.mc.pojo.BAppCluster> getBAppClusters () {
		return bAppClusters;
	}

	/**
	 * Set the value related to the column: BAppClusters
	 * @param bAppClusters the BAppClusters value
	 */
	public void setBAppClusters (java.util.Set<com.mc.pojo.BAppCluster> bAppClusters) {
		this.bAppClusters = bAppClusters;
	}

	public void addToBAppClusters (com.mc.pojo.BAppCluster bAppCluster) {
		if (null == getBAppClusters()) setBAppClusters(new java.util.TreeSet<com.mc.pojo.BAppCluster>());
		getBAppClusters().add(bAppCluster);
	}



	/**
	 * Return the value associated with the column: BDbClusters
	 */
	public java.util.Set<com.mc.pojo.BDbCluster> getBDbClusters () {
		return bDbClusters;
	}

	/**
	 * Set the value related to the column: BDbClusters
	 * @param bDbClusters the BDbClusters value
	 */
	public void setBDbClusters (java.util.Set<com.mc.pojo.BDbCluster> bDbClusters) {
		this.bDbClusters = bDbClusters;
	}

	public void addToBDbClusters (com.mc.pojo.BDbCluster bDbCluster) {
		if (null == getBDbClusters()) setBDbClusters(new java.util.TreeSet<com.mc.pojo.BDbCluster>());
		getBDbClusters().add(bDbCluster);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.mc.pojo.BServiceUtil)) return false;
		else {
			com.mc.pojo.BServiceUtil bServiceUtil = (com.mc.pojo.BServiceUtil) obj;
			if (null == this.getId() || null == bServiceUtil.getId()) return false;
			else return (this.getId().equals(bServiceUtil.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}