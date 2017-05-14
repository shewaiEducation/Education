package com.edu.pojo;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String classid;
	private String name;
	private Date entertime;
	private String idnumber;
	private String sex;
	private String phone;
	private String relativephone;
	private String nation;
	private String address;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String classid, String name, Date entertime, String idnumber, String sex, String phone,
			String relativephone, String nation, String address) {
		this.classid = classid;
		this.name = name;
		this.entertime = entertime;
		this.idnumber = idnumber;
		this.sex = sex;
		this.phone = phone;
		this.relativephone = relativephone;
		this.nation = nation;
		this.address = address;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEntertime() {
		return this.entertime;
	}

	public void setEntertime(Date entertime) {
		this.entertime = entertime;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelativephone() {
		return this.relativephone;
	}

	public void setRelativephone(String relativephone) {
		this.relativephone = relativephone;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}