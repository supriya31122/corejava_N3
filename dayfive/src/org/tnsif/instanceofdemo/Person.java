package org.tnsif.instanceofdemo;

public class Person {
	private String name;
	private String address;

	
	//getters and setters 
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
	
	
	
	//constructors
	public Person() {
		super();
		
		System.out.println("Parent class");
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	
}



