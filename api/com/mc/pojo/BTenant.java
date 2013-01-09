package com.mc.pojo;

import com.mc.pojo.base.BaseBTenant;



public class BTenant extends BaseBTenant {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BTenant () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BTenant (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BTenant (
		java.lang.Integer id,
		com.mc.pojo.BDbInstance dbi,
		com.mc.pojo.BCustomer cid) {

		super (
			id,
			dbi,
			cid);
	}

/*[CONSTRUCTOR MARKER END]*/


}