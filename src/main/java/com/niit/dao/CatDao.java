package com.niit.dao;
import java.util.List;

import com.niit.model.Category;
public interface CatDao {
	public List < Category > getAllCategory() ;
	public boolean save(Category c) ;
	 public boolean deleteById(String catid);
	 public boolean update(Category c);
	 public Category getById(String catid);
}
