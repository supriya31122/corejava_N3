package org.tnsif.polymorphismdemo;

public class SmartPhone {
	//program to demonstrate on method overloading
	
		//private data members
		private int resolution; 
		private String slottype;
		
		//method overloading in terms of no.of arguments
		void display(int resolution)
		{
			System.out.println("Camera resolution: "+resolution);
		}
		void display(int resolution, String slottype)
		{
			System.out.println("Camera resolution: "+resolution+"\nSlot type: "+slottype);
			
		}
		
		//getters and setters
		public int getResolution() {
			return resolution;
		}
		public void setResolution(int resolution) {
			this.resolution = resolution;
		}
		public String getSlottype() {
			return slottype;
		}
		public void setSlottype(String slottype) {
			this.slottype = slottype;
		}
		

	}


