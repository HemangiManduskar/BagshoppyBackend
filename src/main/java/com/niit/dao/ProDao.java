package com.niit.dao;
import java.util.List;

import com.niit.model.Product;

public interface ProDao {
	public List < Product> getAllProduct() ;
	public boolean savepro(Product p) ;
	 public boolean deleteproById(int pid);
	 public boolean updatepro(Product p);
	 public Product getproById(int pid);
	
}
