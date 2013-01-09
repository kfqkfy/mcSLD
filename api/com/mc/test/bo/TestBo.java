/**
 * 
 */
package com.mc.test.bo;

import java.io.Serializable;

/**
 * @author kongfeiquan
 *
 */
public class TestBo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1121534055723180599L;
	private Long id;
	private String name;

	/**
	 * 
	 */
	public TestBo() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
