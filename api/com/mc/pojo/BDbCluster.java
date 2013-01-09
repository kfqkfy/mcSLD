package com.mc.pojo;

import com.mc.pojo.base.BaseBDbCluster;



public class BDbCluster extends BaseBDbCluster {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BDbCluster () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BDbCluster (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BDbCluster (
		java.lang.Integer id,
		com.mc.pojo.BServiceUtil su) {

		super (
			id,
			su);
	}

/*[CONSTRUCTOR MARKER END]*/


}