package com.edu.action;

import java.util.List;

import com.edu.pojo.Major;
import com.edu.service.MajorService;

/**
 * Control on major 
 * @author Shr
 * @since 2017-05-16
 */
public class MajorAction {
	private List<Major> majors;
	
	public String execute(){
		MajorService service = new MajorService();
		majors = service.findAllMajor();
		for(Major m : majors){
			System.out.println(m.getId()+" "+m.getName());
		}
		return "success";
	}

	public List<Major> getMajors() {
		return majors;
	}

}
