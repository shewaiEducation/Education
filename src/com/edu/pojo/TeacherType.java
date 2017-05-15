package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:TeacherType 
 * @author Shr
 * @since 2017-05-15
 */

public class TeacherType implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** teacherType serial number */
	private Integer id;
	/** type name */
	private String type;
	/** all of teacher */
	private Set<Teacher> teachers = new HashSet<Teacher>();

	public TeacherType() {
	}

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

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

}