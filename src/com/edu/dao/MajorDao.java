package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.Major;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO Major between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class MajorDao extends HibernateDao<Major> {

	/**
	 * Return all of major
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<Major> findAllMajor(){
		List<Major> majors = new ArrayList<Major>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			majors = session.getNamedQuery("findAllMajor").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return majors;
	}
}
