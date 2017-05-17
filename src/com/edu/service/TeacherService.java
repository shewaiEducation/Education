package com.edu.service;

<<<<<<< HEAD
import java.io.Serializable;

import com.edu.dao.TeacherDao;
=======
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import com.edu.dao.LoginUserDao;
import com.edu.dao.TeacherDao;
import com.edu.pojo.LoginUser;
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c
import com.edu.pojo.Teacher;

/**
 * An application layer to process business logic on POJO Teacher.
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherService implements Service{
<<<<<<< HEAD
	private TeacherDao teadao = new TeacherDao();
	public Teacher getTeaById(Class<Teacher> classz,Serializable id){
		return teadao.getTeaById(classz, id);
=======
	
	
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
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c
	}
}
