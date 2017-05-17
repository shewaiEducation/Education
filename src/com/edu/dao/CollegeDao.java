package com.edu.dao;

import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.College;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO College between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class CollegeDao extends HibernateDao<College>{
	
	/**
	 * Return all of college
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<College> findAllCollege(){
		List<College> colleges = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			colleges = session.getNamedQuery("findAllCollege").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return colleges;
	}
	
}
