package com.edu.pojo;

/**
 * Loginuser entity. @author MyEclipse Persistence Tools
 */

public class Loginuser implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String usertype;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public Loginuser() {
	}

	/** full constructor */
	public Loginuser(String usertype, String username, String password) {
		this.usertype = usertype;
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}