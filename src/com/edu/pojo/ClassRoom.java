package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Classroom 
 * @author Shr
 * @since 2017-05-14
 */

public class ClassRoom implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** classroom's name */
	private String name;
	/** be arranged */
	private Set<Arrangement> arrangements = new HashSet<Arrangement>();

	/** default constructor */
	public ClassRoom() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Arrangement> getArrangements() {
		return arrangements;
	}

	public void setArrangements(Set<Arrangement> arrangements) {
		this.arrangements = arrangements;
	}

}