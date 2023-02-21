package org.tnsif.heirachicialinheritance;

public class AndroidVersion {
	int type;
//generate constructor using Fields
	public AndroidVersion(int type) {
		super();
		this.type = type;
	}
	
//generate constructor using Superclass
	public AndroidVersion() {
		super();
		// TODO Auto-generated constructor stub
	}
//generate getter and setter

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
//Generate tostring (types & methods)
	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + ", getType()=" + getType() + "]";
	}
	
	
	
	
	

}
