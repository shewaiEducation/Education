package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Major 
 * @author Shr
 * @since 2017-05-14
 */

public class Major implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** major serial number */
	private String id;
	/** college serial number */
	private String collegeId;
	/** major name */
	private String name;
	/** which belong to the college */
	private College college;
	/** all of the class */
	private Set<Class> classes = new HashSet<Class>();
	/** which term which course */
	private Set<MajorCourse> majorCourses = new HashSet<MajorCourse>();
	private Set<MajorCourse> majorCourseSels = new HashSet<MajorCourse>();
	
	public Major() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollegeId() {
		return this.collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Set<Class> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
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