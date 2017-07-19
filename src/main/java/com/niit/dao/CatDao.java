package com.niit.dao;
import java.util.List;

import com.niit.model.Category;

public interface CatDao {
	public List < Category > getAllCategory() ;
	public boolean savecat(Category c) ;
	 public boolean deletecatById(String catid);
	 public boolean updatecat(Category c);
	 public Category getcatById(String catid);
}
