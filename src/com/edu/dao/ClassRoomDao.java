package com.edu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.ClassRoom;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO  ClassRoom between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class ClassRoomDao extends HibernateDao<ClassRoom>{

	/**
	 * Return all of college
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public List<ClassRoom> findAllClassRoom(){
		List<ClassRoom> classRooms = new ArrayList<ClassRoom>();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			classRooms = session.getNamedQuery("findAllClassRoom").list();
		}catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return classRooms;
	}
}
