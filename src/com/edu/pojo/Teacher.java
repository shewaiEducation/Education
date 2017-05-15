package com.edu.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Teacher 
 * @author Shr
 * @since 2017-05-15
 */

public class Teacher implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** teacher's job number */
	private String id;
	/** teacher's name */
	private String name;
	/** teacher's idcard */
	private String idcard;
	/** hiredate */
	private Date hiredate;
	/** sex */
	private String sex;
	/** person phone number */
	private String phone;
	/** nation */
	private String nation;
	/** address */
	private String address;
	/** teacher's type */
	private TeacherType teacherType;
	/** be arranged */
	private Set<Arrangement> arrangements = new HashSet<Arrangement>();

	public Teacher() {
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

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TeacherType getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(TeacherType teacherType) {
		this.teacherType = teacherType;
	}

	public Set<Arrangement> getArrangements() {
		return arrangements;
	}

	public void setArrangements(Set<Arrangement> arrangements) {
		this.arrangements = arrangements;
	}
}