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
public class Category {
@Id
@NotNull
int catid;
@Column
String catname;
@Column
String catdescriptn;
public int getCatid() {
	return catid;
}

public void setCatid(int catid) {
	this.catid = catid;
}

@NotNull
@Size(min =2 , max=20)

public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}

@NotNull
@Size(min =2 , max=20)


public String getCatdescriptn() {
	return catdescriptn;
}

public void setCatdescriptn(String catdescriptn) {
	this.catdescriptn = catdescriptn;
}
}
