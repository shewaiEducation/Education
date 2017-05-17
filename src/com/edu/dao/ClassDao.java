package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.Class;
import com.edu.util.HibernateSessionFactory;
/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class ClassDao extends HibernateDao<Class>{
	
	/**
	 * Return all of class
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<Class> findAllClass(){
		List<Class> classes = new ArrayList<Class>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			classes = session.getNamedQuery("findAllClass").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return classes;
	}
}
