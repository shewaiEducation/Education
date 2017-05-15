package com.edu.pojo;

/**
 * javaBean:Score entity 
 * @author Shr
 * @since 2017-05-15
 */

public class Score implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** logic primary key */
	private Integer id;
	/** daily score */
	private Integer dailyScore;
	/** exam score */
	private Integer examScore;
	/** total score */
	private Integer totalScore;
	/** select time */
	private String selectTime;
	/** either pass or not */
	private Integer isPass;
	/** either commit or not */
	private Integer isCommit;
	/** student's info */
	private Student student;
	/** course's info */
	private Course course;

	/** default constructor */
	public Score() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDailyScore() {
		return dailyScore;
	}

	public void setDailyScore(Integer dailyScore) {
		this.dailyScore = dailyScore;
	}

	public Integer getExamScore() {
		return examScore;
	}

	public void setExamScore(Integer examScore) {
		this.examScore = examScore;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public String getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(String selectTime) {
		this.selectTime = selectTime;
	}

	public Integer getIsPass() {
		return isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}

	public Integer getIsCommit() {
		return isCommit;
	}

	public void setIsCommit(Integer isCommit) {
		this.isCommit = isCommit;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}