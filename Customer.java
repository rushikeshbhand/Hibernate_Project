package com.hibernate.hibernateproject;
//importing important annotaions which we have used in our program
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private int cid;
	private String cname;
	//this is a constructor
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
