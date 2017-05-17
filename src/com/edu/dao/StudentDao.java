package com.edu.dao;

<<<<<<< HEAD
import java.io.Serializable;

import com.edu.pojo.Student;

public class StudentDao extends HibernateDao<Student>{
	public Student getStuById(Class<Student> classz,Serializable id){
		Student stu = (Student) super.find(classz, id);
		return stu;
	}
=======
import com.edu.pojo.Student;

/**
 * 
 * @author Shr
 * @since 2017-05-16
 */
public class StudentDao extends HibernateDao<Student>{

	
>>>>>>> ce3cb433de2b20a32484f04f172d5633e6e1570c
}
