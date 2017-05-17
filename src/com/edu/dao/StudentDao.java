package com.edu.dao;

import java.io.Serializable;

import com.edu.pojo.Student;

public class StudentDao extends HibernateDao<Student>{
	public Student getStuById(Class<Student> classz,Serializable id){
		Student stu = (Student) super.find(classz, id);
		return stu;
	}
}
