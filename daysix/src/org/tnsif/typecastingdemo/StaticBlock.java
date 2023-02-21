package org.tnsif.typecastingdemo;


	//program on demonstrate static block
	public class StaticBlock {
		//non static variable
		private int num;
		//Static variable
		private static String name;
		//static block used to initialize static variable
		static {
			name="Dhanashri";
		}
		//setter getter
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public static String getName() {
			return name;
		}
		public static void setName(String name) {
			StaticBlock.name = name;
		}
		
		

	}


