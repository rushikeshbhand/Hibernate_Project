package com.hibernate.hibernateproject;
//importing annotations 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//entity name is table name
@Entity
@Table(name = "Product")

public class Product {
	@Id
	int pid;
//variable name is column name
	String pname;
//here is one to one relationship
	@OneToOne
	Customer customer;
	//here we create a custome constructor
	public Product(int pid, String pname, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}
//getters and setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


}
