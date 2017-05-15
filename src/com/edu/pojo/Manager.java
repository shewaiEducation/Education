package com.edu.pojo;

/**
 * javaBean:Manager 
 * @author Shr
 * @since 2017-05-15
 */

public class Manager implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** manager's name */
	private String name;
	/** manager's idcard */
	private String idcard;
	/** manager's address */
	private String address;

	/** default constructor */
	public Manager() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}