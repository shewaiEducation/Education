package com.edu.pojo;

/**
 * javaBean:Loginuser 
 * @author Shr
 * @since 2017-05-15
 */

public class LoginUser implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** user type */
	private String userType;
	/** username */
	private String username;
	/** password */
	private String password;

	/** default constructor */
	public LoginUser() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}