package com.edu.pojo;

/**
 * javaBean:Teacherclass 
 * @author Shr
 * @since 2017-05-15
 */

public class TeacherClass implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** start */
	private Integer startWeek;
	/** end */
	private Integer endWeek;
	/** day of the week */
	private String week;
	/** in a day */
	private String lesson;
	/** teaching time */
	private String teachTime;
	/** be arrangement */
	private Arrangement arrangement;
	/** be arrangement class */
	private Class clazz;
	
	/** default constructor */
	public TeacherClass() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}

	public Integer getEndWeek() {
		return endWeek;
	}

	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getTeachTime() {
		return teachTime;
	}

	public void setTeachTime(String teachTime) {
		this.teachTime = teachTime;
	}

	public Arrangement getArrangement() {
		return arrangement;
	}

	public void setArrangement(Arrangement arrangement) {
		this.arrangement = arrangement;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
}