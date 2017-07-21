package com.niit.dao;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
import com.niit.model.Supplier;
@Repository("supplierDAO")

@Transactional
public class SuppDaoImpl implements SuppDao
{
	@Autowired
	 SessionFactory sessionFactory;
	@Override
	 public List < Supplier > getAllSupplier() {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Supplier"); // HQL is used here
	               // not SQL
	  List < Supplier > supplierlist = query.list();
	  session.close();
	  return supplierlist;
	 }
	@Override
	 public boolean savesup(Supplier s) {
	  try {
	   Session session = sessionFactory.openSession();
	  
	   Query q= session.createQuery("select max(supid) from Supplier");
       int maxsupid=(Integer)q.list().get(0);
       s.setSupid(maxsupid+1);
	   
	   session.save(s);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	@Override
	 public boolean deletesupById(int supid) {
	  try {
	   Session session = sessionFactory.openSession();
	Supplier s= (Supplier) session.get(Supplier.class, supid);
	   if (s == null)
	    return false;
	   session.delete(s);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }
	  return true;
	 }
	 @Override
	 public boolean updatesup(Supplier s) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.update(s);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }	
	  return true;
	 }
	 @Override
	 public Supplier getsupById(int supid) {

	  Session session = sessionFactory.openSession();
	  Supplier s = (Supplier) session.get(Supplier.class, supid);
	  session.close();
	  return s;
	 }
	
}
