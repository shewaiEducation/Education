package com.edu.pojo;

/**
 * Majorcourse entity. @author MyEclipse Persistence Tools
 */

public class Majorcourse implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String courseid;
	private String majorid;
	private Integer term;

	// Constructors

	/** default constructor */
	public Majorcourse() {
	}

	/** full constructor */
	public Majorcourse(String courseid, String majorid, Integer term) {
		this.courseid = courseid;
		this.majorid = majorid;
		this.term = term;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseid() {
		return this.courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getMajorid() {
		return this.majorid;
	}

	public void setMajorid(String majorid) {
		this.majorid = majorid;
	}

	public Integer getTerm() {
		return this.term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

}