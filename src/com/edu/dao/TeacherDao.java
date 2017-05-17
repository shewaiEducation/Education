package com.edu.dao;

<<<<<<< HEAD
import java.io.Serializable;

import com.edu.pojo.Teacher;
=======
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.edu.pojo.Teacher;
import com.edu.util.HibernateSessionFactory;
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c

/**
 * POJO Teacher and POJO TeacherType between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherDao extends HibernateDao<Teacher>{
<<<<<<< HEAD

	public Teacher getTeaById(Class<Teacher> classz, Serializable id) {
		return super.find(classz, id);
	}
=======
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c
	
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
