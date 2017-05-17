package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.Course;
import com.edu.util.HibernateSessionFactory;

/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class CourseDao extends HibernateDao<Course>{

	/**
	 * Return all of type
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<Course> findAllCourse(){
		List<Course> courses = new ArrayList<Course>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			courses = session.getNamedQuery("findAllCourse").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return courses;
	}
}
