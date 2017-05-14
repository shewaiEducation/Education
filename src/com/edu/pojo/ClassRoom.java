package com.edu.pojo;

/**
 * javaBean:Classroom 
 * @author Shr
 * @since 2017-05-14
 */

public class ClassRoom implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** classroom name */
	private String name;

	// Constructors

	/** default constructor */
	public ClassRoom() {
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}