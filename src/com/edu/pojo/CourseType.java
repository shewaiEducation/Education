package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Coursetype 
 * @author Shr
 * @since 2017-05-14
 */

public class CourseType implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** course type name */
	private String type;
	/** this type all of courses */
	private Set<Course> courses = new HashSet<Course>();
	// Constructors

	/** default constructor */
	public CourseType() {
	}

	/** full constructor */
	public CourseType(String type) {
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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}