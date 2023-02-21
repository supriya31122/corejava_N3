package org.tnsif.polymorphismdemo;

import java.util.Scanner;

		public class ConstructorOverloadingExecutor  {
			

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				//constructor overloading
				HondaCity h=new HondaCity();
				System.out.println("\nEnter the speed and color of Hondacity: ");
				HondaCity h1=new HondaCity(sc.nextInt(),sc.next());
				// TODO Auto-generated method stub

			}

		
	}


