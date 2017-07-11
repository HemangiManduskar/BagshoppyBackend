package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table
public class Category {
@Id
String catid;

public String getCatid() {
	return catid;
}

public void setCatid(String catid) {
	this.catid = catid;
}
@Column
String catname;
public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}
@Column
String catdescriptn;
public String getCatdescriptn() {
	return catdescriptn;
}

public void setCatdescriptn(String catdescriptn) {
	this.catdescriptn = catdescriptn;
}
}
