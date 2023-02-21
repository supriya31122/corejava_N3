package org.tnsif.typecastingdemo;
//to demonstrate the example of static variable
	public class StaticVariableDemo {

		//non static variable
		private String name;
		
		//static variable
		public static String companyName="Techno Serve India";
		
		

		public StaticVariableDemo(String name) {
			super();
			this.name = name;
		}



		@Override
		public String toString() {
			return "StaticVariableDemo [name=" + name + "]";
		}
		

	}


