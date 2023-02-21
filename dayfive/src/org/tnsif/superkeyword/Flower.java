package org.tnsif.superkeyword;
//program to demonstrate example of super keyword
public class Flower {
	private String name;

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//constructors
	public Flower() {
		super();
		System.out.println("Flower - Parent class");
	}

	public Flower(String name) {
		super();
		this.name = name;
	}
	
	


}
