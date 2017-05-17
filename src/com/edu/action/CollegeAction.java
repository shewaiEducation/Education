package com.edu.action;

import java.util.List;

import com.edu.pojo.College;
import com.edu.service.CollegeService;

/**
 * Control on college 
 * @author Shr
 * @since 2017-05-16
 */
public class CollegeAction {
	private List<College> colleges;
	
	public String execute(){
		CollegeService service = new CollegeService();
		colleges = service.findAllCollege();
		for(College c : colleges){
			System.out.println(c.getId()+" "+c.getName());
		}
		return "success";
	}

	public List<College> getColleges() {
		return colleges;
	}

}
