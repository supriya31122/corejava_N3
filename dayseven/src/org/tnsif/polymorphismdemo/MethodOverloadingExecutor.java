package org.tnsif.polymorphismdemo;


	import java.util.Scanner;

public class MethodOverloadingExecutor {

		public static void main(String[] args) {
			SmartPhone s=new SmartPhone();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the resolution : ");
			s.display(sc.nextInt());
			System.out.println("\nEnter the resolution and slot type : ");
			s.display(sc.nextInt(),sc.next());
			
			Multiplication m=new Multiplication();
			System.out.println("\nEnter the two Integer values : ");
			System.out.println("Multiplicaton : "+m.mul(sc.nextInt(),sc.nextInt()));
			System.out.println("\nEnter the two Float values : ");
			System.out.println("Multiplicaton : "+m.mul(sc.nextFloat(), sc.nextFloat()));

		}


}
