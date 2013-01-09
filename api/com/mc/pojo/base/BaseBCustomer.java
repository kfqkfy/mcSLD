package com.mc.pojo.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the b_customer table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="b_customer"
 */

public abstract class BaseBCustomer  implements Serializable {

	public static String REF = "BCustomer";
	public static String PROP_NAME = "Name";
	public static String PROP_ID = "Id";


	// constructors
	public BaseBCustomer () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBCustomer (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String name;

	// collections
	private java.util.Set<com.mc.pojo.BTenant> bTenants;



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
	 * Return the value associated with the column: BTenants
	 */
	public java.util.Set<com.mc.pojo.BTenant> getBTenants () {
		return bTenants;
	}

	/**
	 * Set the value related to the column: BTenants
	 * @param bTenants the BTenants value
	 */
	public void setBTenants (java.util.Set<com.mc.pojo.BTenant> bTenants) {
		this.bTenants = bTenants;
	}

	public void addToBTenants (com.mc.pojo.BTenant bTenant) {
		if (null == getBTenants()) setBTenants(new java.util.TreeSet<com.mc.pojo.BTenant>());
		getBTenants().add(bTenant);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.mc.pojo.BCustomer)) return false;
		else {
			com.mc.pojo.BCustomer bCustomer = (com.mc.pojo.BCustomer) obj;
			if (null == this.getId() || null == bCustomer.getId()) return false;
			else return (this.getId().equals(bCustomer.getId()));
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