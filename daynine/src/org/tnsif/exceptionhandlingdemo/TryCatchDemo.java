package org.tnsif.exceptionhandlingdemo;

//program to demonstrate when finally block not executed
	public class TryCatchDemo {

		public static void main(String[] args) {
			int arr[]=new int[]{10,20,30};
			try {
				System.out.println("C2TC");
//1.It call exit(0)
//System.exit(0);
				System.out.println(arr[5]);
			}
			catch(Exception e)
			{
				System.out.println("Exception handled...."+e);
			}
			finally {
//2. Finally block contains exception
				System.out.println("Result: "+20/0);
				System.out.println("Finally block.....");
		}

	}

}


