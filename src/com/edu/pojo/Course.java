package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Course 
 * @author Shr
 * @since 2017-05-14
 */

public class Course implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** course serial number */
	private String id;
	/** course name */
	private String name;
	/** the course of total hours */
	private Integer totalHours;
	/** the course of credit */
	private Integer credit;
	/** note */
	private String note;
	/** which belong to type */
	private CourseType type;
	/** which term which major */
	private Set<MajorCourse> majorCourses = new HashSet<MajorCourse>();
	private Set<MajorCourse> majorCourseSels = new HashSet<MajorCourse>();
	/** be arranged */
	private Set<Arrangement> arrangements = new HashSet<Arrangement>();
	/** student's all of score */
	private Set<Score> scores = new HashSet<Score>();
	
	public Course() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Integer totalHours) {
		this.totalHours = totalHours;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Set<MajorCourse> getMajorCourses() {
		return majorCourses;
	}

	public void setMajorCourses(Set<MajorCourse> majorCourses) {
		this.majorCourses = majorCourses;
	}

	public Set<MajorCourse> getMajorCourseSels() {
		return majorCourseSels;
	}

	public void setMajorCourseSels(Set<MajorCourse> majorCourseSels) {
		this.majorCourseSels = majorCourseSels;
	}

	public Set<Arrangement> getArrangements() {
		return arrangements;
	}

	public void setArrangements(Set<Arrangement> arrangements) {
		this.arrangements = arrangements;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

}