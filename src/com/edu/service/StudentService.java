package com.edu.service;

<<<<<<< HEAD
import java.io.Serializable;

import com.edu.dao.StudentDao;
import com.edu.pojo.Student;

public class StudentService {
	private StudentDao studao = new StudentDao();
	
	public Student getStuById(Class<Student> classz,Serializable id){
		return studao.getStuById(classz, id);
=======
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
		user.setUserType("ѧ��");
		LoginUserDao luDao = new LoginUserDao();
		luDao.add(user);
	}
	
	/**
	 * ��������MD5����
	 * @param password ����ǰ������
	 * @return ���ܺ������
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
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c
	}
}
