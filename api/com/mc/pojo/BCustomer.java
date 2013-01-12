package com.mc.pojo;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * BCustomer entity. @author MyEclipse Persistence Tools
 */

public class BCustomer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2680610994454147919L;
	// Fields

	private Integer id;
	private String name;
	private Set BTenantsForCid = new HashSet(0);
	private Set BTenantsForId = new HashSet(0);

	// Constructors

	/** default constructor */
	public BCustomer() {
	}

	/** full constructor */
	public BCustomer(String name, Set BTenantsForCid, Set BTenantsForId) {
		this.name = name;
		this.BTenantsForCid = BTenantsForCid;
		this.BTenantsForId = BTenantsForId;
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

	public Set getBTenantsForCid() {
		return this.BTenantsForCid;
	}

	public void setBTenantsForCid(Set BTenantsForCid) {
		this.BTenantsForCid = BTenantsForCid;
	}

	public Set getBTenantsForId() {
		return this.BTenantsForId;
	}

	public void setBTenantsForId(Set BTenantsForId) {
		this.BTenantsForId = BTenantsForId;
	}

}