package com.edu.pojo;

/**
 * Arrangement entity. @author MyEclipse Persistence Tools
 */

public class Arrangement implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String courseId;
	private String teacherId;
	private String teachBuild;
	private String classRoom;
	public Arrangement() {
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
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeachBuild() {
		return teachBuild;
	}
	public void setTeachBuild(String teachBuild) {
		this.teachBuild = teachBuild;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
}