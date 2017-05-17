package com.edu.action;

import java.util.List;

import com.edu.pojo.Course;
import com.edu.pojo.CourseType;
import com.edu.pojo.MajorCourse;
import com.edu.service.CourseService;
/**
 * Control on class and type
 * @author Shr
 * @since 2017-05-16
 */
public class CourseAction {
	private List<Course> courses;
	private List<CourseType> types;
	private List<MajorCourse> mcs;
	
	public String list(){
		CourseService service = new CourseService();
		courses = service.findAllCourse();
		return "list";
	}
	
	public String typelist(){
		CourseService service = new CourseService();
		types = service.findAllCourseType();
		return "list";
	}
	
	public String mclist(){
		CourseService service = new CourseService();
		mcs = service.findAllMajorCourse();
		return "list";
	}

	public List<Course> getCourses() {
		return courses;
	}

	public List<CourseType> getTypes() {
		return types;
	}

	public List<MajorCourse> getMcs() {
		return mcs;
	}

}
