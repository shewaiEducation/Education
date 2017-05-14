package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Course 
 * @author Shr
 * @since 2015-05-14
 */

public class Course implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** course serial number */
	private String id;
	/** which type serial number */
	private Integer typeId;
	/** course name */
	private String name;
	/** the course of total hours */
	private Integer totalHours;
	/** the course of credit */
	private Integer credit;
	/** note */
	private String note;
	/** which belong to type */
	private CourseType courseType;
	/** which term which major */
	private Set<MajorCourse> majorCourses = new HashSet<MajorCourse>();
	private Set<MajorCourse> majorCourseSels = new HashSet<MajorCourse>();
	
	public Course() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
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

}