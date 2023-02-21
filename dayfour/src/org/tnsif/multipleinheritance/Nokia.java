package org.tnsif.multipleinheritance;

public class Nokia {
	private int modelno;
	public void Display()
	{
		System.out.println("The model no is: "+modelno);
	}
	
	
	public Nokia() {
		System.out.println("Nokia Class");
		
	}


	//default constructor (using fields)
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	

}
