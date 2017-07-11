package com.niit.model;

public class Product {
String pid,catid,supid,pname;
int quantity;
double price;
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getCatid() {
	return catid;
}
public void setCatid(String catid) {
	this.catid = catid;
}
public String getSupid() {
	return supid;
}
public void setSupid(String supid) {
	this.supid = supid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
