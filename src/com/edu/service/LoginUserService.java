package com.edu.service;

import com.edu.dao.LoginUserDao;
import com.edu.pojo.LoginUser;

/**
 * An application layer to process business logic on POJO LoginUser.
 * @author Shr
 * @since 2017-05-16
 */
public class LoginUserService implements Service{
	private LoginUserDao loginDao = new LoginUserDao();
	public LoginUser check(String username,String password){
		if(username==null||password==null||username.length()<1||password.length()<1){
			return null;
		}
		return loginDao.check(username, password);
	}
}
