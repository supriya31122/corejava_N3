package org.tnsif.finalkeyword;

//program to demonstrate on final keyword with variable
	public class FinalVariable {

		//final variable
		final static private int x=23;
		public static void display()
		{
			/*
			 * we can't change the value of x here
			 * as x is declared as final*/
			System.out.println("Value of X is: "+x);
			
		}
		public static void main(String arg[])
		{
			display();
		}
		

	}



