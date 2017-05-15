package com.edu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * javaBean:Classselected 
 * @author Shr
 * @since 2017-05-15
 */

public class ClassSelected implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** selective course class number */
	private String id;
	/** selective course class name */
	private String name;
	/** start */
	private Integer startWeek;
	/** end */
	private Integer endWeek;
	/** day of the week */
	private String week;
	/** in a day */
	private String lesson;
	/** max student number */
	private Integer studentSelected;
	/** how many student choose */
	private Integer studentTemp;
	/** class time */
	private String openTime;
	/** be arranged */
	private Arrangement arrangement;
	/** all of selective course */
	private Set<InClassSelected> inClassSelecteds = new HashSet<InClassSelected>();

	/** default constructor */
	public ClassSelected() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}

	public Integer getEndWeek() {
		return endWeek;
	}

	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Integer getStudentSelected() {
		return studentSelected;
	}

	public void setStudentSelected(Integer studentSelected) {
		this.studentSelected = studentSelected;
	}

	public Integer getStudentTemp() {
		return studentTemp;
	}

	public void setStudentTemp(Integer studentTemp) {
		this.studentTemp = studentTemp;
	}

	public Arrangement getArrangement() {
		return arrangement;
	}

	public void setArrangement(Arrangement arrangement) {
		this.arrangement = arrangement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public Set<InClassSelected> getInClassSelecteds() {
		return inClassSelecteds;
	}

	public void setInClassSelecteds(Set<InClassSelected> inClassSelecteds) {
		this.inClassSelecteds = inClassSelecteds;
	}
}