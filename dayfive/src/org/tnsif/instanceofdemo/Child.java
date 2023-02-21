package org.tnsif.instanceofdemo;

public class Child extends Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child(int age) {
		super();
		this.age = age;
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, String address,int age) {
		super(name, address);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}

	
	
	
}

