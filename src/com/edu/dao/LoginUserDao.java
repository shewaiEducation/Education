package com.edu.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.edu.pojo.LoginUser;
import com.edu.util.HibernateSessionFactory;

/**
 * POJO LoginUser between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class LoginUserDao extends HibernateDao<LoginUser>{
	
	public LoginUser check(String username,String password){
		Session session = HibernateSessionFactory.getSession();
		String hql = "from LoginUser where 1=1";
		hql+=" and username = :username ";
		hql+=" and password = :password ";
		Query query = session.createQuery(hql);
		query.setString("username", username);
		query.setString("password", password);
		LoginUser user = (LoginUser) query.uniqueResult();
		session.close();
		return user;
	}
}
