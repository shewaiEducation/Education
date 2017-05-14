package com.edu.pojo;

/**
 * Teachertype entity. @author MyEclipse Persistence Tools
 */

public class Teachertype implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String type;

	// Constructors

	/** default constructor */
	public Teachertype() {
	}

	/** full constructor */
	public Teachertype(String type) {
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}