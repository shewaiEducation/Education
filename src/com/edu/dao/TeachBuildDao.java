package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.TeachBuild;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO TeachBuild between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class TeachBuildDao extends HibernateDao<TeachBuild>{
	
	/**
	 * Return all of teaching building
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<TeachBuild> findAllTeachBuild(){
		List<TeachBuild> teachings = new ArrayList<TeachBuild>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			teachings = session.getNamedQuery("findAllTeachBuild").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return teachings;
	}
}
