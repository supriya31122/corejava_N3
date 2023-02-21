package org.tnsif.polymorphismdemo;

//program to demonstrate on constructor overloading
	public class HondaCity {
		//private data members
		private int speed;
		private String color;
		
		//getters and setters
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		//Constructor 
		public HondaCity() {
			System.out.println("I like to drivr a HondCity");
		}
		public HondaCity(int speed, String color) {
			super();
			this.speed = speed;
			this.color = color;
			System.out.println("\nSpeed : "+speed+"km/hr"
					+ "\nColor: "+color);
		}
		

	}



