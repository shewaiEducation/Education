package com.edu.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Student
 * @author Shr
 * @since 2017-05-15
 */

public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** student's student ID */
	private String id;
	/** student's name */
	private String name;
	/** time of enrollment */
	private Date enterTime;
	/** student's idcard */
	private String idcard;
	/** sex */
	private String sex;
	/** phone number */
	private String phone;
	/** family phone */
	private String relativePhone;
	/** student's nation */
	private String nation;
	/** student's address */
	private String address;
	/** student in class */
	private Class clazz;
	/** all of selective course */
	private Set<InClassSelected> inClassSelecteds = new HashSet<InClassSelected>();
	/** student's all of score */
	private Set<Score> scores = new HashSet<Score>();

	/** default constructor */
	public Student() {
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

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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

	public String getRelativePhone() {
		return relativePhone;
	}

	public void setRelativePhone(String relativePhone) {
		this.relativePhone = relativePhone;
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

	public Set<InClassSelected> getInClassSelecteds() {
		return inClassSelecteds;
	}

	public void setInClassSelecteds(Set<InClassSelected> inClassSelecteds) {
		this.inClassSelecteds = inClassSelecteds;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}
}