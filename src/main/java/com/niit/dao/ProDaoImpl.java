package com.niit.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.model.Product;
@Repository("ProductDAO")

@Transactional
public class ProDaoImpl implements ProDao{
	@Autowired
	 SessionFactory sessionFactory;
	@Override
	 public List < Product > getAllProduct() {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Product"); // HQL is used here
	               // not SQL
	  List < Product > productlist = query.list();
	  session.close();
	  return productlist;
	 }
	@Override
	 public boolean savepro(Product p) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.save(p);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	@Override
	 public boolean deleteproById(int pid) {
	  try {
	   Session session = sessionFactory.openSession();
	   
	   Product p= (Product) session.get(Product.class, pid);
	   if (p == null)
	    return false;
	   session.delete(p);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	 @Override
	 public boolean updatepro(Product p) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.update(p);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }	
	  return true;
	 }
	 @Override
	 public Product getproById(int pid) {

	  Session session = sessionFactory.openSession();
	 Product p = (Product) session.get(Product.class, pid);
	  session.close();
	  return p;
	 }
	
	
}
