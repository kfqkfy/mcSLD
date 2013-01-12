package com.mc.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * BCustomer entity. @author MyEclipse Persistence Tools
 */

public class BCustomer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set BTenants = new HashSet(0);

	// Constructors

	/** default constructor */
	public BCustomer() {
	}

	/** full constructor */
	public BCustomer(String name, Set BTenants) {
		this.name = name;
		this.BTenants = BTenants;
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

	public Set getBTenants() {
		return this.BTenants;
	}

	public void setBTenants(Set BTenants) {
		this.BTenants = BTenants;
	}

}