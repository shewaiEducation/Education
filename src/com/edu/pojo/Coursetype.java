package com.edu.pojo;

/**
 * Coursetype entity. @author MyEclipse Persistence Tools
 */

public class Coursetype implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String type;

	// Constructors

	/** default constructor */
	public Coursetype() {
	}

	/** full constructor */
	public Coursetype(String type) {
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