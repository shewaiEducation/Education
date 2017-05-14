package com.edu.pojo;

/**
 * Majorcourseselected entity. @author MyEclipse Persistence Tools
 */

public class Majorcourseselected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String courseid;
	private String majorid;
	private Integer term;
	private String grade;

	// Constructors

	/** default constructor */
	public Majorcourseselected() {
	}

	/** full constructor */
	public Majorcourseselected(String courseid, String majorid, Integer term, String grade) {
		this.courseid = courseid;
		this.majorid = majorid;
		this.term = term;
		this.grade = grade;
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

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}