package com.edu.action;

import java.util.List;

import com.edu.pojo.ClassRoom;
import com.edu.pojo.TeachBuild;
import com.edu.service.BuildService;

public class BuildAction {
	private List<TeachBuild> builds;
	private List<ClassRoom> classrooms;
	
	public String buildlist(){
		BuildService service = new BuildService();
		builds = service.findAllTeachBuild();
		return "list";
	}
	
	public String classroomlist(){
		BuildService service = new BuildService();
		classrooms = service.findAllClassRoom();
		return "list";
	}
	
	public List<TeachBuild> getBuilds() {
		return builds;
	}
	public List<ClassRoom> getClassrooms() {
		return classrooms;
	}
	
}
