package com.edu.pojo;

/**
 * Classroom entity. @author MyEclipse Persistence Tools
 */

public class Classroom implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	// Constructors

	/** default constructor */
	public Classroom() {
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}