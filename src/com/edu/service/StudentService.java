package com.edu.service;

import java.io.Serializable;

import com.edu.dao.StudentDao;
import com.edu.pojo.Student;

public class StudentService {
	private StudentDao studao = new StudentDao();
	
	public Student getStuById(Class<Student> classz,Serializable id){
		return studao.getStuById(classz, id);
	}
}
