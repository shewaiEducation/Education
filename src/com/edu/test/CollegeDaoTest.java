package com.edu.test;

import org.junit.Before;
import org.junit.Test;

import com.edu.dao.CollegeDao;
import com.edu.pojo.College;

public class CollegeDaoTest {
	private CollegeDao dao = null;
	
	@Before
	public void init() {
		dao = new CollegeDao();
	}

	@Test
	public void add(){
		College c = new College();
		c.setId("1001");
		c.setName("name");
		dao.add(c);
	}
}
