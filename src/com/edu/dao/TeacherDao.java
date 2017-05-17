package com.edu.dao;

import java.io.Serializable;

import com.edu.pojo.Teacher;

/**
 * POJO Teacher and POJO TeacherType between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherDao extends HibernateDao<Teacher>{

	public Teacher getTeaById(Class<Teacher> classz, Serializable id) {
		return super.find(classz, id);
	}
	
}
