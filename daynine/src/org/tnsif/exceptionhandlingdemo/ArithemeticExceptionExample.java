package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;
//program to demonstrate on Arithmetic exception handling
	public class ArithemeticExceptionExample  {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of x and y: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			//try block contains the exception code
			try {
				int res=x/y;
				System.out.println("result: "+res);
			}
			//catch block handle the exception
			catch(Exception e) {
				System.out.println("Exception handled using catch : "+e);
				
			}
			finally{
				System.out.println("finally block...");
				
			}
			
			
			

		}

	}


