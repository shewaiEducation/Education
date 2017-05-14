package com.edu.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.edu.pojo.Class;
import com.edu.pojo.College;
import com.edu.pojo.Course;
import com.edu.pojo.CourseType;
import com.edu.pojo.Major;
import com.edu.pojo.MajorCourse;
import com.edu.pojo.MajorCourseSelected;
import com.edu.util.HibernateSessionFactory;

public class Dao {
	private Session session = null;
	
	@Test
	public void addMajorCourseSelected(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			Major m1 = new Major();
			m1.setId("major1001");
			m1.setName("测试专业1");
			Major m2 = new Major();
			m2.setId("major1002");
			m2.setName("测试专业2");
			
			Course c1 = new Course();
			c1.setId("ke1003");
			c1.setName("测试课程名3");
			Course c2 = new Course();
			c2.setId("ke1004");
			c2.setName("测试课程名4");
			
			MajorCourseSelected mc1 = new MajorCourseSelected();
			mc1.setCourse(c1);
			mc1.setMajor(m1);
			mc1.setTerm(1);
			mc1.setGrade("2014");
			
			MajorCourseSelected mc2 = new MajorCourseSelected();
			mc2.setCourse(c1);
			mc2.setMajor(m2);
			mc2.setTerm(2);
			mc2.setGrade("2015");
			
			MajorCourseSelected mc3 = new MajorCourseSelected();
			mc3.setCourse(c2);
			mc3.setMajor(m1);
			mc3.setTerm(3);
			mc3.setGrade("2016");
			
			MajorCourseSelected mc4 = new MajorCourseSelected();
			mc4.setCourse(c2);
			mc4.setMajor(m2);
			mc4.setTerm(4);
			mc4.setGrade("2017");
			
			session.save(m1);
			session.save(m2);
			session.save(c1);
			session.save(c2);
			session.save(mc1);
			session.save(mc2);
			session.save(mc3);
			session.save(mc4);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addMajorCourse(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			Major m1 = new Major();
			m1.setId("major1001");
			m1.setName("测试专业1");
			Major m2 = new Major();
			m2.setId("major1002");
			m2.setName("测试专业2");
			
			Course c1 = new Course();
			c1.setId("ke1003");
			c1.setName("测试课程名3");
			Course c2 = new Course();
			c2.setId("ke1004");
			c2.setName("测试课程名4");
			
			MajorCourse mc1 = new MajorCourse();
			mc1.setCourse(c1);
			mc1.setMajor(m1);
			mc1.setTerm(1);
			
			MajorCourse mc2 = new MajorCourse();
			mc2.setCourse(c1);
			mc2.setMajor(m2);
			mc2.setTerm(2);
			
			MajorCourse mc3 = new MajorCourse();
			mc3.setCourse(c2);
			mc3.setMajor(m1);
			mc3.setTerm(3);
			
			MajorCourse mc4 = new MajorCourse();
			mc4.setCourse(c2);
			mc4.setMajor(m2);
			mc4.setTerm(4);
			
			session.save(m1);
			session.save(m2);
			session.save(c1);
			session.save(c2);
			session.save(mc1);
			session.save(mc2);
			session.save(mc3);
			session.save(mc4);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addCourse(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			CourseType type = new CourseType();
			type.setType("测试课程类型");
			
			Course c1 = new Course();
			c1.setId("ke1001");
			c1.setName("测试课程名1");
			Course c11 = new Course();
			c11.setId("ke1002");
			c11.setName("测试课程名2");
			
			c1.setCourseType(type);
			c11.setCourseType(type);
			session.save(type);
			session.save(c1);
			session.save(c11);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addClass(){
		session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		Major m1 = new Major();
		m1.setId("1001");
		m1.setCollegeId("1001");
		m1.setName("测试的专业1");
		
		Class c1 = new Class();
		c1.setId("1001");
		c1.setName("测试班级1");
		
		Class c11 = new Class();
		c11.setId("1002");
		c11.setName("测试班级2");
		
		c1.setMajor(m1);
		c11.setMajor(m1);
		
		session.save(m1);
		session.save(c11);
		session.save(c1);
		tr.commit();
		session.close();
	}
	
	@Test
	public void addMajor(){
		session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		College college = new College();
		college.setId("1001");
		college.setName("测试的学院");
		
		Major m1 = new Major();
		m1.setId("1001");
		m1.setCollegeId("1001");
		m1.setName("测试的专业1");
		
		Major m2 = new Major();
		m2.setId("1002");
		m2.setCollegeId("1001");
		m2.setName("测试的专业2");
		
		m1.setCollege(college);
		m2.setCollege(college);
		
		session.save(college);
		session.save(m1);
		session.save(m2);
		tr.commit();
		session.close();
	}
}
