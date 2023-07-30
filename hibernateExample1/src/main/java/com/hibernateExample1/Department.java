package com.hibernateExample1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
	@Column(name="dname",nullable=false)
private String name;
	@Column(name="address",nullable=false)
private String address;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
