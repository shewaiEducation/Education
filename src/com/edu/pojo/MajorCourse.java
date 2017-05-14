package com.edu.pojo;

/**
 * javaBean:Majorcourse 
 * @author Shr
 * @since 2015-05-15
 */

public class MajorCourse implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** which course serial number */
	private String courseId;
	/** which major serial number */
	private String majorId;
	/** which term which major which course */
	private Integer term;
	/** which major */
	private Major major;
	/** which course */
	private Course course;
	
	public MajorCourse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
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