package com.edu.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import com.edu.dao.LoginUserDao;
import com.edu.dao.StudentDao;
import com.edu.dao.TeacherDao;
import com.edu.pojo.LoginUser;
import com.edu.pojo.Student;
import com.edu.pojo.Teacher;

/**
 * An application layer to process business logic on POJO Student.
 * @author Shr
 * @since 2017-05-16
 */
public class StudentService {
	
	/**
	 * update the student's information
	 * @param student
	 */
	public void modify(Student student){
		StudentDao sDao = new StudentDao();
		sDao.modify(student);
	}
	
	/**
	 * add a student,and add username and password to user
	 * @param teacher 
	 */
	public void add(Student student){
		StudentDao sDao = new StudentDao();
		student.setEnterTime(new Date());
		sDao.add(student);
		String username = student.getId();
		String password = MD5(username);
		LoginUser user = new LoginUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType("学生");
		LoginUserDao luDao = new LoginUserDao();
		luDao.add(user);
	}
	
	/**
	 * 将密码用MD5加密
	 * @param password 加密前的密码
	 * @return 加密后的密码
	 */
	private String MD5(String password){
		String result = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte [] temp = md5.digest(password.getBytes());
			result = new String(temp, "UTF-8");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
}
