package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.Teacher;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO Teacher and POJO TeacherType between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherDao extends HibernateDao<Teacher>{
	
	/**
	 * Return all of teacher
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<Teacher> findAllTeacher(){
		List<Teacher> teachers = new ArrayList<Teacher>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			teachers = session.getNamedQuery("findAllTeacher").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return teachers;
	}
}
