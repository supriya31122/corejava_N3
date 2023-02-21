package org.tnsif.heirachicialinheritance;

public class Tiramisu extends AndroidVersion {
	private int version;
	//Generate Getter and Setter
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
//Constructor using fields
	public Tiramisu(int type, int version) {
		super(type);
		this.version = version;
	}
//contructor using Superclass
	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(int type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
//Generate tostring
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", type=" + type + ", getVersion()=" + getVersion() + ", getType()="
				+ getType() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	
}
