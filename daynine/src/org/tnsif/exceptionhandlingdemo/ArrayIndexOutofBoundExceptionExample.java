package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutofBoundExceptionExample {
	

		public static void main(String[] args) {
			System.out.println("First line....");
			System.out.println("Second line....");
			
			try {
				int array[]=new int[]{10,20,30,40,50};
				for(int i: array)
					System.out.print(i+" ");
					
				
			}
			catch(Exception e)
			{
				System.out.println("\nThe array doesont have sixth element");

			}
			System.out.println("\nthird line...");
			
			
			

		}
		public static void printValue(int[] arr)
		{
			System.out.println(arr[3]);

		}

	}


