package org.tnsif.annotations;
import java.util.Scanner;

	public class SupressWarningDemo {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			//This annotation is used to remove a warnings which occurs in compile time
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println(x);
			//sc.close();

		}

	}


