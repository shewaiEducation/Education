package com.edu.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.edu.pojo.Arrangement;
import com.edu.pojo.Class;
import com.edu.pojo.ClassRoom;
import com.edu.pojo.ClassSelected;
import com.edu.pojo.College;
import com.edu.pojo.Course;
import com.edu.pojo.CourseType;
import com.edu.pojo.InClassSelected;
import com.edu.pojo.LoginUser;
import com.edu.pojo.Major;
import com.edu.pojo.MajorCourse;
import com.edu.pojo.MajorCourseSelected;
import com.edu.pojo.Manager;
import com.edu.pojo.Score;
import com.edu.pojo.Student;
import com.edu.pojo.TeachBuild;
import com.edu.pojo.Teacher;
import com.edu.pojo.TeacherClass;
import com.edu.pojo.TeacherType;
import com.edu.util.HibernateSessionFactory;

public class Dao {
	private Session session = null;
	
	@Test
	public void addManager(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			Manager m1 = new Manager();
			m1.setName("管理员1");
			
			LoginUser lu1 = new LoginUser();
			lu1.setUsername("admin");
			lu1.setPassword("123456");
			
			session.save(m1);
			session.save(lu1);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addScore(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Student stu1 = new Student();
			stu1.setId("stud1001");
			stu1.setName("学生名字1");
			
			Student stu2 = new Student();
			stu2.setId("stud1002");
			stu2.setName("学生名字2");
			
			Course c1 = new Course();
			c1.setId("course1001");
			c1.setName("课程名1");
			
			Course c2 = new Course();
			c2.setId("course1002");
			c2.setName("课程名2");
			
			Score s1 = new Score();
			s1.setStudent(stu1);
			s1.setCourse(c1);
			
			Score s2 = new Score();
			s2.setStudent(stu1);
			s2.setCourse(c2);
			
			Score s3 = new Score();
			s3.setStudent(stu2);
			s3.setCourse(c1);
			
			Score s4 = new Score();
			s4.setStudent(stu2);
			s4.setCourse(c2);
			
			session.save(stu1);
			session.save(stu2);
			session.save(c1);
			session.save(c2);
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.save(s4);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addStudent(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Class c1 = new Class();
			c1.setId("class1001");
			c1.setName("班级1001");
			
			Student stu1 = new Student();
			stu1.setId("stud1001");
			stu1.setName("学生名字1");
			stu1.setClazz(c1);
			
			Student stu2 = new Student();
			stu2.setId("stud1002");
			stu2.setName("学生名字2");
			stu2.setClazz(c1);
			
//			session.save(c1);
//			session.save(stu1);
//			session.save(stu2);
			
			session.delete(stu1);
			session.delete(stu2);
			session.delete(c1);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addInClassSelected(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Course c1 = new Course();
			c1.setId("c1001");
			c1.setName("测试课程名字1");
			Teacher t1 = new Teacher();
			t1.setId("t1001");
			t1.setName("测试教师名字1");
			TeachBuild tb1 = new TeachBuild();
			tb1.setName("测试教学楼名字1");
			ClassRoom cr1 = new ClassRoom();
			cr1.setName("测试教室1");
			
			Arrangement a = new Arrangement();
			a.setId(5);  //
			a.setCourse(c1);
			a.setTeacher(t1);
			a.setTeachingbuilding(tb1);
			a.setClassroom(cr1);
			
			ClassSelected cs1 = new ClassSelected();
			cs1.setId("cs1001");
			cs1.setName("测试班级1");
			cs1.setArrangement(a);
			cs1.setStartWeek(1);
			cs1.setEndWeek(16);
			cs1.setStudentSelected(120);
			cs1.setStudentTemp(80);
			cs1.setOpenTime("2016-2017-2");
			
			Student stu1 = new Student();
			stu1.setId("stu1001");
			stu1.setName("测试学生名字1");
			
			InClassSelected ics = new InClassSelected();
			ics.setClassSelected(cs1);
			ics.setStudent(stu1);
			
//			session.save(c1);
//			session.save(t1);
//			session.save(tb1);
//			session.save(cr1);
//			session.save(a);
//			session.save(cs1);
//			session.save(stu1);
//			session.save(ics);
			
			session.delete(ics);
			session.delete(stu1);
			session.delete(cs1);
			session.delete(a);
			session.delete(cr1);
			session.delete(tb1);
			session.delete(t1);
			session.delete(c1);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addClassSelected(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Course c1 = new Course();
			c1.setId("c1001");
			c1.setName("测试课程名字1");
			Teacher t1 = new Teacher();
			t1.setId("t1001");
			t1.setName("测试教师名字1");
			TeachBuild tb1 = new TeachBuild();
			tb1.setName("测试教学楼名字1");
			ClassRoom cr1 = new ClassRoom();
			cr1.setName("测试教室1");
			
			Arrangement a = new Arrangement();
			a.setCourse(c1);
			a.setTeacher(t1);
			a.setTeachingbuilding(tb1);
			a.setClassroom(cr1);
			
			ClassSelected cs1 = new ClassSelected();
			cs1.setId("cs1001");
			cs1.setName("测试班级1");
			cs1.setArrangement(a);
			cs1.setStartWeek(1);
			cs1.setEndWeek(16);
			cs1.setStudentSelected(120);
			cs1.setStudentTemp(80);
			cs1.setOpenTime("2016-2017-2");
			
			session.save(c1);
			session.save(t1);
			session.save(tb1);
			session.save(cr1);
			session.save(a);
			session.save(cs1);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addTeacherClass(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Course c1 = new Course();
			c1.setId("c1001");
			c1.setName("测试课程名字1");
			Teacher t1 = new Teacher();
			t1.setId("t1001");
			t1.setName("测试教师名字1");
			TeachBuild tb1 = new TeachBuild();
			tb1.setName("测试教学楼名字1");
			ClassRoom cr1 = new ClassRoom();
			cr1.setName("测试教室1");
			
			Arrangement a = new Arrangement();
			a.setCourse(c1);
			a.setTeacher(t1);
			a.setTeachingbuilding(tb1);
			a.setClassroom(cr1);
			
			Class class1 = new Class();
			class1.setId("class1001");
			class1.setName("测试班级1");
			
			TeacherClass tc1 = new TeacherClass();
			tc1.setArrangement(a);
			tc1.setClazz(class1);
			tc1.setStartWeek(1);
			tc1.setEndWeek(16);
			tc1.setTeachTime("2015-2016-1");
			
			session.save(c1);
			session.save(t1);
			session.save(tb1);
			session.save(cr1);
			session.save(a);
			session.save(class1);
			session.save(tc1);
			
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addArrangement(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			
			Course c1 = new Course();
			c1.setId("c1001");
			c1.setName("测试课程名字1");
			Teacher t1 = new Teacher();
			t1.setId("t1001");
			t1.setName("测试教师名字1");
			TeachBuild tb1 = new TeachBuild();
			tb1.setName("测试教学楼名字1");
			ClassRoom cr1 = new ClassRoom();
			cr1.setName("测试教室1");
			
			Arrangement a = new Arrangement();
			a.setCourse(c1);
			a.setTeacher(t1);
			a.setTeachingbuilding(tb1);
			a.setClassroom(cr1);
			
			session.save(c1);
			session.save(t1);
			session.save(tb1);
			session.save(cr1);
			session.save(a);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void addTeacher(){
		try{
			session = HibernateSessionFactory.getSession();
			Transaction tr = session.beginTransaction();
			TeacherType type = new TeacherType();
			type.setType("测试教师类型");
			Teacher t1 = new Teacher();
			t1.setId("t1001");
			t1.setName("测试教师名字1");
			Teacher t2 = new Teacher();
			t2.setId("t1002");
			t2.setName("测试教师名字2");
			
			t1.setTeacherType(type);
			t2.setTeacherType(type);
			
			session.save(type);
			session.save(t1);
			session.save(t2);
			
			tr.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
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
			
			c1.setType(type);
			c11.setType(type);
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
		m1.setName("测试的专业1");
		
		Major m2 = new Major();
		m2.setId("1002");
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
