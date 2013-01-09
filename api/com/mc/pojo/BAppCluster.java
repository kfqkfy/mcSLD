package com.mc.pojo;

import com.mc.pojo.base.BaseBAppCluster;



public class BAppCluster extends BaseBAppCluster {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BAppCluster () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BAppCluster (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BAppCluster (
		java.lang.Integer id,
		com.mc.pojo.BServiceUtil su) {

		super (
			id,
			su);
	}

/*[CONSTRUCTOR MARKER END]*/


}