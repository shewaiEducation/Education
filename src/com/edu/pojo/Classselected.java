package com.edu.pojo;

/**
 * Classselected entity. @author MyEclipse Persistence Tools
 */

public class Classselected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer arrangementid;
	private Integer startweek;
	private Integer endweek;
	private String week;
	private String lesson;
	private Integer studentselected;
	private Integer studenttemp;

	// Constructors

	/** default constructor */
	public Classselected() {
	}

	/** full constructor */
	public Classselected(Integer arrangementid, Integer startweek, Integer endweek, String week, String lesson,
			Integer studentselected, Integer studenttemp) {
		this.arrangementid = arrangementid;
		this.startweek = startweek;
		this.endweek = endweek;
		this.week = week;
		this.lesson = lesson;
		this.studentselected = studentselected;
		this.studenttemp = studenttemp;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getArrangementid() {
		return this.arrangementid;
	}

	public void setArrangementid(Integer arrangementid) {
		this.arrangementid = arrangementid;
	}

	public Integer getStartweek() {
		return this.startweek;
	}

	public void setStartweek(Integer startweek) {
		this.startweek = startweek;
	}

	public Integer getEndweek() {
		return this.endweek;
	}

	public void setEndweek(Integer endweek) {
		this.endweek = endweek;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getLesson() {
		return this.lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Integer getStudentselected() {
		return this.studentselected;
	}

	public void setStudentselected(Integer studentselected) {
		this.studentselected = studentselected;
	}

	public Integer getStudenttemp() {
		return this.studenttemp;
	}

	public void setStudenttemp(Integer studenttemp) {
		this.studenttemp = studenttemp;
	}

}