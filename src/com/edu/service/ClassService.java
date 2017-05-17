package com.edu.service;

import java.util.List;

import com.edu.dao.ClassDao;
import com.edu.pojo.Class;
/**
 * An application layer to process business logic on POJO Class.
 * @author Shr
 * @since 2017-05-16
 */
public class ClassService{

	/**
	 * Return all of college
	 * @return list
	 */
	public List<Class> findAllClass(){
		ClassDao dao = new ClassDao();
		return dao.findAllClass();
	}
}
