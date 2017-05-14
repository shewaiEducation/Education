package com.edu.pojo;

/**
 * Teacherclass entity. @author MyEclipse Persistence Tools
 */

public class Teacherclass implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer arrangementid;
	private String classid;
	private Integer startweek;
	private Integer endweek;
	private String week;
	private String lesson;
	private String teachtime;

	// Constructors

	/** default constructor */
	public Teacherclass() {
	}

	/** full constructor */
	public Teacherclass(Integer arrangementid, String classid, Integer startweek, Integer endweek, String week, String lesson,
			String teachtime) {
		this.arrangementid = arrangementid;
		this.classid = classid;
		this.startweek = startweek;
		this.endweek = endweek;
		this.week = week;
		this.lesson = lesson;
		this.teachtime = teachtime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArrangementid() {
		return this.arrangementid;
	}

	public void setArrangementid(Integer arrangementid) {
		this.arrangementid = arrangementid;
	}

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
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

	public String getTeachtime() {
		return this.teachtime;
	}

	public void setTeachtime(String teachtime) {
		this.teachtime = teachtime;
	}

}