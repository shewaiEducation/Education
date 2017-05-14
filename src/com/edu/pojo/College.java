package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:College 
 * @author Shr
 * @since 2017-05-14
 */

public class College implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** college serial number */
	private String id;
	/** college name */
	private String name;
	/** all of the college major */
	private Set<Major> majors = new HashSet<Major>();

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

	public Set<Major> getMajors() {
		return majors;
	}

	public void setMajors(Set<Major> majors) {
		this.majors = majors;
	}

}