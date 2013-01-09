package com.mc.pojo.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the b_tenant table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="b_tenant"
 */

public abstract class BaseBTenant  implements Serializable {

	public static String REF = "BTenant";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_CONNECTION_USER_PASSWORD = "ConnectionUserPassword";
	public static String PROP_LAST_CHANGED_ON = "LastChangedOn";
	public static String PROP_MONITOR_STATUS = "MonitorStatus";
	public static String PROP_USAGE = "Usage";
	public static String PROP_NAME = "Name";
	public static String PROP_DBI = "Dbi";
	public static String PROP_CID = "Cid";
	public static String PROP_CREATED_BY = "CreatedBy";
	public static String PROP_CREATED_ON = "CreatedOn";
	public static String PROP_ID = "Id";
	public static String PROP_LAST_CHANGED_BY = "LastChangedBy";
	public static String PROP_LC_STATUS = "LcStatus";
	public static String PROP_VERSION = "Version";


	// constructors
	public BaseBTenant () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBTenant (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBTenant (
		java.lang.Integer id,
		com.mc.pojo.BDbInstance dbi,
		com.mc.pojo.BCustomer cid) {

		this.setId(id);
		this.setDbi(dbi);
		this.setCid(cid);
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
	private java.lang.String lcStatus;
	private java.lang.String usage;
	private java.lang.String connectionUserPassword;
	private java.lang.String createdBy;
	private java.lang.String createdOn;
	private java.lang.String lastChangedBy;
	private java.lang.String lastChangedOn;

	// many to one
	private com.mc.pojo.BDbInstance dbi;
	private com.mc.pojo.BCustomer cid;



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
	 * Return the value associated with the column: lc_status
	 */
	public java.lang.String getLcStatus () {
		return lcStatus;
	}

	/**
	 * Set the value related to the column: lc_status
	 * @param lcStatus the lc_status value
	 */
	public void setLcStatus (java.lang.String lcStatus) {
		this.lcStatus = lcStatus;
	}



	/**
	 * Return the value associated with the column: usage
	 */
	public java.lang.String getUsage () {
		return usage;
	}

	/**
	 * Set the value related to the column: usage
	 * @param usage the usage value
	 */
	public void setUsage (java.lang.String usage) {
		this.usage = usage;
	}



	/**
	 * Return the value associated with the column: connection_user_password
	 */
	public java.lang.String getConnectionUserPassword () {
		return connectionUserPassword;
	}

	/**
	 * Set the value related to the column: connection_user_password
	 * @param connectionUserPassword the connection_user_password value
	 */
	public void setConnectionUserPassword (java.lang.String connectionUserPassword) {
		this.connectionUserPassword = connectionUserPassword;
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
	 * Return the value associated with the column: dbi_id
	 */
	public com.mc.pojo.BDbInstance getDbi () {
		return dbi;
	}

	/**
	 * Set the value related to the column: dbi_id
	 * @param dbi the dbi_id value
	 */
	public void setDbi (com.mc.pojo.BDbInstance dbi) {
		this.dbi = dbi;
	}



	/**
	 * Return the value associated with the column: cid
	 */
	public com.mc.pojo.BCustomer getCid () {
		return cid;
	}

	/**
	 * Set the value related to the column: cid
	 * @param cid the cid value
	 */
	public void setCid (com.mc.pojo.BCustomer cid) {
		this.cid = cid;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.mc.pojo.BTenant)) return false;
		else {
			com.mc.pojo.BTenant bTenant = (com.mc.pojo.BTenant) obj;
			if (null == this.getId() || null == bTenant.getId()) return false;
			else return (this.getId().equals(bTenant.getId()));
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