package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table

public class Customer {
String cusid,cname,cuspswrd,cusemail,cusadd,cusph;
@Id
public String getCusid() {
	return cusid;
}

public void setCusid(String cusid) {
	this.cusid = cusid;
}
@Column
public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}
@Column
public String getCuspswrd() {
	return cuspswrd;
}

public void setCuspswrd(String cuspswrd) {
	this.cuspswrd = cuspswrd;
}
@Column
public String getCusemail() {
	return cusemail;
}

public void setCusemail(String cusemail) {
	this.cusemail = cusemail;
}
@Column
public String getCusadd() {
	return cusadd;
}

public void setCusadd(String cusadd) {
	this.cusadd = cusadd;
}
@Column
public String getCusph() {
	return cusph;
}

public void setCusph(String cusph) {
	this.cusph = cusph;
}
}
