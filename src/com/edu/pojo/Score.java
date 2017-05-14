package com.edu.pojo;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String studentid;
	private String courseid;
	private Integer dailyscore;
	private Integer examscore;
	private Integer totalscore;
	private String selecttime;
	private Integer ispass;
	private Integer iscommit;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(String studentid, String courseid, Integer dailyscore, Integer examscore, Integer totalscore,
			String selecttime, Integer ispass, Integer iscommit) {
		this.studentid = studentid;
		this.courseid = courseid;
		this.dailyscore = dailyscore;
		this.examscore = examscore;
		this.totalscore = totalscore;
		this.selecttime = selecttime;
		this.ispass = ispass;
		this.iscommit = iscommit;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentid() {
		return this.studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getCourseid() {
		return this.courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public Integer getDailyscore() {
		return this.dailyscore;
	}

	public void setDailyscore(Integer dailyscore) {
		this.dailyscore = dailyscore;
	}

	public Integer getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Integer examscore) {
		this.examscore = examscore;
	}

	public Integer getTotalscore() {
		return this.totalscore;
	}

	public void setTotalscore(Integer totalscore) {
		this.totalscore = totalscore;
	}

	public String getSelecttime() {
		return this.selecttime;
	}

	public void setSelecttime(String selecttime) {
		this.selecttime = selecttime;
	}

	public Integer getIspass() {
		return this.ispass;
	}

	public void setIspass(Integer ispass) {
		this.ispass = ispass;
	}

	public Integer getIscommit() {
		return this.iscommit;
	}

	public void setIscommit(Integer iscommit) {
		this.iscommit = iscommit;
	}

}