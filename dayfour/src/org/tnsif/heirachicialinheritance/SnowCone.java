package org.tnsif.heirachicialinheritance;

public class SnowCone extends AndroidVersion{
	private int version;
//Generate Constructor Using Fields
	public SnowCone(int type, int version) {
		super(type);
		this.version = version;
	}
//Generate Constructor using Superclass
	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(int type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
//Generate Tostring version,type
	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", type=" + type + ", getType()=" + getType() + ", toString()="
				+ super.toString() + "]";
	}
	

}
