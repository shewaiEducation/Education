package com.edu.service;

import java.util.List;

import com.edu.dao.MajorDao;
import com.edu.pojo.Major;

/**
 * An application layer to process business logic on POJO College.
 * @author Shr
 * @since 2017-05-16
 */
public class MajorService {

	/**
	 * Return all of major
	 * @return list
	 */
	public List<Major> findAllMajor(){
		MajorDao dao = new MajorDao();
		return dao.findAllMajor();
	}
}
