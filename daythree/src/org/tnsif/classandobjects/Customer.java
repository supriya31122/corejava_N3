package org.tnsif.classandobjects;

public class Customer {

	
	private int id;
	private String cust_name;
	private String city;
	
	public Customer() {
		super();
	}
	
	
	
	public Customer(int id, String cust_name, String city) {
		
	super();
		
		this.id = id;
		this.cust_name = cust_name;
		this.city = city;
	}
	void display() 
	{
	System.out.println(id+" " +city+" "+cust_name);
		


	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

}
