package com.edu.pojo;

/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;

	// Constructors

	/** default constructor */
	public College() {
	}

	/** full constructor */
	public College(String name) {
		this.name = name;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}