package com.edu.pojo;

/**
 * Inclassselected entity. @author MyEclipse Persistence Tools
 */

public class Inclassselected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String studentid;
	private String classselectedid;
	private String selecttime;

	// Constructors

	/** default constructor */
	public Inclassselected() {
	}

	/** full constructor */
	public Inclassselected(String studentid, String classselectedid, String selecttime) {
		this.studentid = studentid;
		this.classselectedid = classselectedid;
		this.selecttime = selecttime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentid() {
		return this.studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getClassselectedid() {
		return this.classselectedid;
	}

	public void setClassselectedid(String classselectedid) {
		this.classselectedid = classselectedid;
	}

	public String getSelecttime() {
		return this.selecttime;
	}

	public void setSelecttime(String selecttime) {
		this.selecttime = selecttime;
	}

}