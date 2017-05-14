package com.edu.pojo;

/**
 * javaBean:Arrangement 
 * @author Shr
 * @since 2017-05-14
 */

public class Arrangement implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** couse serial number */
	private String courseId;
	/** teacher serial number */
	private String teacherId;
	/** teaching building name */
	private String teachBuild;
	/** classroom name */
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