package com.edu.pojo;

/**
 * javaBean:Inclassselected 
 * @author Shr
 * @since 2017-05-15
 */

public class InClassSelected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** select time */
	private String selectTime;
	/** student */
	private Student student;
	/** classSelected */
	private ClassSelected classSelected;

	/** default constructor */
	public InClassSelected() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(String selectTime) {
		this.selectTime = selectTime;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ClassSelected getClassSelected() {
		return classSelected;
	}

	public void setClassSelected(ClassSelected classSelected) {
		this.classSelected = classSelected;
	}
}