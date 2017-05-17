package com.edu.service;

import java.io.Serializable;

import com.edu.dao.TeacherDao;
import com.edu.pojo.Teacher;

/**
 * An application layer to process business logic on POJO Teacher.
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherService implements Service{
	private TeacherDao teadao = new TeacherDao();
	public Teacher getTeaById(Class<Teacher> classz,Serializable id){
		return teadao.getTeaById(classz, id);
	}
}
