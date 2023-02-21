package org.tnsif.interfacedemo;

public class InterfaceExecutor {
	

		public static void main(String[] args) {
			// we can't instantiate the interface
			//Bike b=new Bike();
			Avenger a=new Avenger();
			a.engine();
			a.milage(45);

		}


	}


