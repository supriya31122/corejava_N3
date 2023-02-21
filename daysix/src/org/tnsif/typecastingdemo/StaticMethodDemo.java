package org.tnsif.typecastingdemo;

import java.util.Scanner;

	//program to demonstrate on static method
	//Parent class
	class StaticMethod{
		//static variable
		public static double salary;
		
		//static method
		public static void display()
		{
			System.out.println("Salary is: "+salary);
		}
		
	}

	//Derive class
	public class StaticMethodDemo {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the salary...");
			StaticMethod.salary=sc.nextDouble();
			StaticMethod.display();
			

		}

	}


