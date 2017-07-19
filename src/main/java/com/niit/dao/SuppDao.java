package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SuppDao {
	public List < Supplier> getAllSupplier() ;
	public boolean savesup(Supplier s) ;
	 public boolean deletesupById(int supid);
	 public boolean updatesup(Supplier s);
	 public Supplier getsupById(int supid);
}
