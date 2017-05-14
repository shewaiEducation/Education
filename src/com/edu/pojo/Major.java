package com.edu.pojo;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String collegeid;
	private String name;

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** full constructor */
	public Major(String collegeid, String name) {
		this.collegeid = collegeid;
		this.name = name;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollegeid() {
		return this.collegeid;
	}

	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}