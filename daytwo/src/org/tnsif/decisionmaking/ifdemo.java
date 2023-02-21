package org.tnsif.decisionmaking;
import java.util.Scanner;
public class ifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Decision if statement
		if(a==b)
			System.out.println("Value of a is equal to b");
		System.out.println("Value of a is not equal to b");
		

	}

}
