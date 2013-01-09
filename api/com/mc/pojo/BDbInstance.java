package com.mc.pojo;

import com.mc.pojo.base.BaseBDbInstance;



public class BDbInstance extends BaseBDbInstance {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BDbInstance () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BDbInstance (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BDbInstance (
		java.lang.Integer id,
		com.mc.pojo.BDbCluster dbc) {

		super (
			id,
			dbc);
	}

/*[CONSTRUCTOR MARKER END]*/


}