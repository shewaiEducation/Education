package com.edu.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Class 
 * @author Shr
 * @since 2017-05-14
 */

public class Class implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private String id;
	/** class name */
	private String name;
	/** class time */
	private Date openTime;
	/** which belong to the major */
	private Major major;
	/** all of student in this class */
	private Set<Student> students = new HashSet<Student>();
	/** be arrangement class */
	private Set<TeacherClass> teacherClasses = new HashSet<TeacherClass>();
	
	public Class() {
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

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Set<TeacherClass> getTeacherClasses() {
		return teacherClasses;
	}

	public void setTeacherClasses(Set<TeacherClass> teacherClasses) {
		this.teacherClasses = teacherClasses;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}