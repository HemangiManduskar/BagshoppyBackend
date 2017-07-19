package com.niit.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.model.Customer;
@Repository("CustomerDAO")

@Transactional
public class CusDaoImpl implements CusDao{
	@Autowired
	 SessionFactory sessionFactory;
	@Override
	 public List < Customer > getAllCustomer() {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Customer"); // HQL is used here
	               // not SQL
	  List < Customer > Customerlist = query.list();
	  session.close();
	  return Customerlist;
	 }
	@Override
	 public boolean savecus(Customer cu) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.save(cu);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	@Override
	 public boolean deletecusById(int cusid) {
	  try {
	   Session session = sessionFactory.openSession();
	   Customer cu= (Customer) session.get(Customer.class, cusid);
	   if (cu == null)
	    return false;
	   session.delete(cu);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	 @Override
	 public boolean updatecus(Customer cu) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.update(cu);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }	
	  return true;
	 }
	 @Override
	 public Customer getcusById(int cusid) {

	  Session session = sessionFactory.openSession();
	  Customer cu = (Customer) session.get(Customer.class, cusid);
	  session.close();
	  return cu;
	 }
	
}
