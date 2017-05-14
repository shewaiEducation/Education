package com.edu.pojo;

import java.util.Date;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String majorid;
	private String name;
	private Date opentime;

	// Constructors

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(String majorid, String name, Date opentime) {
		this.majorid = majorid;
		this.name = name;
		this.opentime = opentime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajorid() {
		return this.majorid;
	}

	public void setMajorid(String majorid) {
		this.majorid = majorid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOpentime() {
		return this.opentime;
	}

	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}

}