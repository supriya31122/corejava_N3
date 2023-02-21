package org.tnsif.exceptionhandlingdemo;

public class MultipleException {


		public static void main(String[] args) {
			try 
			{
				
				try 
				{
					System.out.println("Line 1...");
				    int arr[]=new int[] {12,30,40};
				    System.out.println(arr[5]);
					
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index Out Of Bounds Exception"+e);
					
				}
				
				try {
					System.out.println("Result: "+20/0);
					
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception"+e);
				}
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("finally block...");
			}
				

		}

	}
	


