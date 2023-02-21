package org.tnsif.multipleinheritance;

public class Iphone extends Android {
	private String slottype;
	public void slot()
	{
		System.out.println("Slottype is "+slottype);
	}
//generate getter and setter
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone(String slottype) {
		super();
		this.slottype = slottype;
	}
	
	//generate constructor using SuperClass
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Generate Costructor using Fields
	public Iphone(int modelno, String version) {
		super(modelno, version);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Iphone(int modelno,String version,String slottype) {
		super(modelno,version);
		this.slottype = slottype;
		
	}
	//Generate tostring
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
	
	
	
	
	

}
