package com.edu.pojo;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer typeid;
	private String name;
	private Integer totalhours;
	private Integer credit;
	private String note;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(Integer typeid, String name, Integer totalhours, Integer credit, String note) {
		this.typeid = typeid;
		this.name = name;
		this.totalhours = totalhours;
		this.credit = credit;
		this.note = note;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalhours() {
		return this.totalhours;
	}

	public void setTotalhours(Integer totalhours) {
		this.totalhours = totalhours;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}