package com.edu.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import com.edu.dao.LoginUserDao;
import com.edu.dao.TeacherDao;
import com.edu.dao.TeacherTypeDao;
import com.edu.pojo.LoginUser;
import com.edu.pojo.Teacher;
import com.edu.pojo.TeacherType;

/**
 * An application layer to process business logic on POJO Teacher.
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherService {
	
	/**
	 * 
	 * @return list
	 */
	public List<Teacher> findAllTeacher(){
		TeacherDao dao = new TeacherDao();
		return dao.findAllTeacher();
	}
	
	/**
	 * 
	 * @return list
	 */
	public List<TeacherType> findAllTeacherType(){
		TeacherTypeDao dao = new TeacherTypeDao();
		return dao.findAllTeacherType();
	}
	
	/**
	 * update the teacher's information
	 * @param teacher
	 */
	public void modify(Teacher teacher){
		TeacherDao tDao = new TeacherDao();
		tDao.modify(teacher);
	}
	
	/**
	 * add a teacher,and add username and password to user
	 * @param teacher 
	 */
	public void add(Teacher teacher){
		TeacherDao tDao = new TeacherDao();
		teacher.setHiredate(new Date());
		tDao.add(teacher);
		String username = teacher.getId();
		String password = MD5(username);
		LoginUser user = new LoginUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType("教师");
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
