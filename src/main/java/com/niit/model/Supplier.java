package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Supplier {
	@Id
	@NotNull
    int supid;
	@Column
	String supname;
	@Column
	String supadd;
public int getSupid() {
	return supid;
}

public void setSupid(int supid) {
	this.supid = supid;
}

@NotNull
@Size(min =2 , max=20)

public String getSupname() {
	return supname;
}

public void setSupname(String supname) {
	this.supname = supname;
}

@NotNull
@Size(min =2 , max=20)

public String getSupadd() {
	return supadd;
}

public void setSupadd(String supadd) {
	this.supadd = supadd;
}
}
