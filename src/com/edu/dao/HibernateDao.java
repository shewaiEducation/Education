package com.edu.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edu.util.HibernateSessionFactory;

/**
 * the templet class between a Java application and Database
 * @author Shr
 * @since 2017-05-16
 */
public class HibernateDao<T> {

	/**
	 * Return the persistent instance of the given entity class with the given
	 identifier, or null if there is no such persistent instance.
	 * @param classz The entity type
	 * @param id an identifier
	 * @return a persistent instance or null
	 */
	@SuppressWarnings("unchecked")
	public T find(Class<T> classz, Serializable id) {
		Session session = null;
		T t = null;
		try{
			session = HibernateSessionFactory.getSession();
			t = (T) session.get(classz, id);
		} catch(Exception e){
			throw e;
		} finally{
			session.close();
		}
		return t;
	}

	/**
	 * Persist the given transient instance
	 * @param t a transient instance of a persistent class
	 */
	public void add(T t) {
		Session session = null;
		Transaction tx = null;
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
		} catch(Exception e){
			tx.rollback();
			throw e;
		} finally{
			session.close();
		}
	}

	/**
	 * Update the persistent instance with the identifier of the given detached instance.
	 * @param t a detached instance containing updated state
	 */
	public void modify(T t) {
		Session session = null;
		Transaction tx = null;
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			session.update(t);
			tx.commit();
		} catch(Exception e){
			tx.rollback();
			throw e;
		} finally{
			session.close();
		}
	}

	/**
	 * Remove a persistent instance from the datastore.
	 * @param t the instance to be removed
	 */
	public void remove(T t) {
		Session session = null;
		Transaction tx = null;
		try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			session.delete(t);
			tx.commit();
		} catch(Exception e){
			tx.rollback();
			throw e;
		} finally{
			session.close();
		}
	}
}
