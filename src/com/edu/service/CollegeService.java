package com.edu.service;

import java.util.List;

import com.edu.dao.CollegeDao;
import com.edu.pojo.College;

/**
 * An application layer to process business logic on POJO College.
 * @author Shr
 * @since 2017-05-16
 */
public class CollegeService{

	/**
	 * Return all of college
	 * @return list
	 */
	public List<College> findAllCollege(){
		CollegeDao dao = new CollegeDao();
		return dao.findAllCollege();
	}
}
