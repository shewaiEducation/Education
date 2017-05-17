package com.edu.service;

import java.util.List;

import com.edu.dao.ClassRoomDao;
import com.edu.dao.TeachBuildDao;
import com.edu.pojo.ClassRoom;
import com.edu.pojo.TeachBuild;

public class BuildService {

	/**
	 * Return a list include TeachBuild
	 * @return
	 */
	public List<TeachBuild> findAllTeachBuild(){
		TeachBuildDao dao = new TeachBuildDao();
		return dao.findAllTeachBuild();
	}
	
	/**
	 * Return a list include classroom
	 * @return
	 */
	public List<ClassRoom> findAllClassRoom(){
		ClassRoomDao dao = new ClassRoomDao();
		return dao.findAllClassRoom();
	}
}
