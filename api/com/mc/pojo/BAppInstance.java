package com.mc.pojo;

import com.mc.pojo.base.BaseBAppInstance;



public class BAppInstance extends BaseBAppInstance {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BAppInstance () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BAppInstance (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BAppInstance (
		java.lang.Integer id,
		com.mc.pojo.BAppCluster sc) {

		super (
			id,
			sc);
	}

/*[CONSTRUCTOR MARKER END]*/


}