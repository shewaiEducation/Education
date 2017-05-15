package com.edu.pojo;

/**
 * javaBean:Majorcourseselected 
 * @author Shr
 * @since 2017-05-15
 */

public class MajorCourseSelected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** which term which major which course */
	private Integer term;
	/** which grade student choose */
	private String grade;
	/** which major */
	private Major major;
	/** which course */
	private Course course;

	public MajorCourseSelected() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}