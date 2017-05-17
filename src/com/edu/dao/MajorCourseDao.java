package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.MajorCourse;
import com.edu.util.HibernateSessionFactory;

/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class MajorCourseDao extends HibernateDao<MajorCourse>{
	
	/**
	 * Return all of mcs
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<MajorCourse> findAllMajorCourse(){
		List<MajorCourse> mcs = new ArrayList<MajorCourse>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			mcs = session.getNamedQuery("findAllMajorCourse").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return mcs;
	}
}
