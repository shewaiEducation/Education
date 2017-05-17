package com.edu.action;

import java.util.List;

import com.edu.pojo.Teacher;
import com.edu.pojo.TeacherType;
import com.edu.service.TeacherService;

/**
 * Control on teacher
 * @author Shr
 * @since 2017-05-16
 */
public class TeacherAction {
	private List<TeacherType> types;
	private List<Teacher> teachers;
	
	
	public String list(){
		TeacherService service = new TeacherService();
		teachers = service.findAllTeacher();
		return "list";
	}
	
	public String typelist(){
		TeacherService service = new TeacherService();
		types = service.findAllTeacherType();
		return "list";
	}
	
	
	
	public List<TeacherType> getTypes() {
		return types;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
}
