package org.tnsif.typecastingdemo;
//program to demonstrate on type casting
	public class TypeCastingDemo {

		public static void main(String[] args) {
			//implicit type casting
		   int x=15;
		   float y=x;
		   System.out.println("Value of Y is: "+y);
		   
		   //Explicit type casting
		   double d=234.56d;
		   long l=(long)d;
		   System.out.println("Value of L is: "+l);
		   char f=(char)d;
		   System.out.println("Value of F is: "+f);
		   int i=66;
		   char j=(char)i;
		   System.out.println("Value of J is: "+j);
		   
		   

		}

	}


