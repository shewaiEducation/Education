package com.edu.action;

import java.util.List;

import com.edu.service.ClassService;
import com.edu.pojo.Class;
/**
 * Control on class 
 * @author Shr
 * @since 2017-05-16
 */
public class ClassAction {
	private List<Class> classes;
	
	public String execute(){
		ClassService service = new ClassService();
		classes = service.findAllClass();
		return "success";
	}

	public List<Class> getClasses() {
		return classes;
	}
}
