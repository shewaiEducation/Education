package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Arrangement
 * 
 * @author Shr
 * @since 2017-05-14
 */

public class Arrangement implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** course */
	private Course course;
	/** teacher */
	private Teacher teacher;
	/** teaching building */
	private TeachBuild teachingbuilding;
	/** classroom */
	private ClassRoom classroom;
	/** be arrangement class info */
	private Set<TeacherClass> teacherClasses = new HashSet<TeacherClass>();
	private Set<ClassSelected> classSelecteds = new HashSet<ClassSelected>();
	
	public Arrangement() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ClassRoom getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}

	public TeachBuild getTeachingbuilding() {
		return teachingbuilding;
	}

	public void setTeachingbuilding(TeachBuild teachingbuilding) {
		this.teachingbuilding = teachingbuilding;
	}

	public Set<TeacherClass> getTeacherClasses() {
		return teacherClasses;
	}

	public void setTeacherClasses(Set<TeacherClass> teacherClasses) {
		this.teacherClasses = teacherClasses;
	}

	public Set<ClassSelected> getClassSelecteds() {
		return classSelecteds;
	}

	public void setClassSelecteds(Set<ClassSelected> classSelecteds) {
		this.classSelecteds = classSelecteds;
	}
}