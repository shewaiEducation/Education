package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.TeacherType;
import com.edu.util.HibernateSessionFactory;

/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherTypeDao extends HibernateDao<TeacherType>{

	/**
	 * Return all of teacher type
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<TeacherType> findAllTeacherType(){
		List<TeacherType> teacherTypes = new ArrayList<TeacherType>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			teacherTypes = session.getNamedQuery("findAllTeacherType").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return teacherTypes;
	}
}
