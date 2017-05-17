package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.CourseType;
import com.edu.util.HibernateSessionFactory;

/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class CourseTypeDao extends HibernateDao<CourseType>{
	
	/**
	 * Return all of type
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<CourseType> findAllCourseType(){
		List<CourseType> types = new ArrayList<CourseType>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			types = session.getNamedQuery("findAllCourseType").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return types;
	}
}
