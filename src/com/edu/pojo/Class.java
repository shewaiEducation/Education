package com.edu.pojo;

import java.util.Date;

/**
 * javaBean:Class 
 * @author Shr
 * @since 2017-05-14
 */

public class Class implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private String id;
	/** major serial number */
	private String majorId;
	/** class name */
	private String name;
	/** class time */
	private Date openTime;
	/** which belong to the major */
	private Major major;

	public Class() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}
}