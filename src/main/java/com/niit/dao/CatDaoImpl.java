package com.niit.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
@Repository("CategoryDAO")

@Transactional
public class CatDaoImpl implements CatDao{
	@Autowired
	 SessionFactory sessionFactory;
	@Override
	 public List < Category > getAllCategory() {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Category"); // HQL is used here
	               // not SQL
	  List < Category > productlist = query.list();
	  session.close();
	  return productlist;
	 }
	@Override
	 public boolean save(Category c) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.save(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	@Override
	 public boolean deleteById(String catid) {
	  try {
	   Session session = sessionFactory.openSession();
	   Category c= (Category) session.get(Category.class, catid);
	   if (c == null)
	    return false;
	   session.delete(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	 @Override
	 public boolean update(Category c) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.update(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }	
	  return true;
	 }
	 @Override
	 public Category getById(String catid) {

	  Session session = sessionFactory.openSession();
	 Category c = (Category) session.get(Category.class, catid);
	  session.close();
	  return c;
	 }
	
}
