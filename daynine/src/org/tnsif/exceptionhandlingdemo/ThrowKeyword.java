package org.tnsif.exceptionhandlingdemo;

// program to demonstrate on throw and throws keyword
	import java.io.IOException;
	public class ThrowKeyword {
//method definition
//throws is used to declare an exception
	     public static void donate(int age, int weight)throws Exception
	     {
	    	 if(age>18 && weight>50)
	    		 System.out.println("Egligible to donate blood");
	    	 else
 // to throw an exception explicitly
	    		 throw new IOException("Not egligible");
	    	 
	    	 
	     }
		public static void main(String[] args) {
			try {
				 donate(20,44);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			

		}

	}


