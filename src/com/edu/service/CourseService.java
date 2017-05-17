package com.edu.service;

import java.util.List;

import com.edu.dao.CourseDao;
import com.edu.dao.CourseTypeDao;
import com.edu.dao.MajorCourseDao;
import com.edu.dao.MajorDao;
import com.edu.pojo.Course;
import com.edu.pojo.CourseType;
import com.edu.pojo.Major;
import com.edu.pojo.MajorCourse;
/**
 * An application layer to process business logic on POJO Course and POJO CourseType.
 * @author Shr
 * @since 2017-05-16
 */
public class CourseService{

	
	
	/**
	 * Return all of course in a major
	 * @return list
	 */
	public List<MajorCourse> findAllMajorCourse(){
		MajorCourseDao dao = new MajorCourseDao();
		List<MajorCourse> mcs = dao.findAllMajorCourse();
		for(MajorCourse mc : mcs){
			MajorDao mDao = new MajorDao();
			Major major = mDao.find(Major.class,mc.getMajor().getId());
			CourseDao cDao = new CourseDao();
			Course course = cDao.find(Course.class, mc.getCourse().getId());
			mc.setMajor(major);
			mc.setCourse(course);
		}
		return mcs;
	}
	
	/**
	 * Return all of course
	 * @return list
	 */
	public List<Course> findAllCourse(){
		CourseDao dao = new CourseDao();
		return dao.findAllCourse();
	}
	
	/**
	 * Return all of course type
	 * @return list
	 */
	public List<CourseType> findAllCourseType(){
		CourseTypeDao dao = new CourseTypeDao();
		return dao.findAllCourseType();
	}
}
