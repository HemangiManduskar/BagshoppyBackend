package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table

public class Customer {
	@Id
	@NotNull
int cusid;
	@Column
String cusname;
	@Column
String username;
	@Column
String passwrd;
	@Column
	int phnno;
	@Column
	String email;
	@Column
	String cusadd;
	@Column
	String userrole;
public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPasswrd() {
	return passwrd;
}
public void setPasswrd(String passwrd) {
	this.passwrd = passwrd;
}
public int getPhnno() {
	return phnno;
}
public void setPhnno(int phnno) {
	this.phnno = phnno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCusadd() {
	return cusadd;
}
public void setCusadd(String cusadd) {
	this.cusadd = cusadd;
}
public String getUserrole() {
	return userrole;
}
public void setUserrole(String userrole) {
	this.userrole = userrole;
}


}
