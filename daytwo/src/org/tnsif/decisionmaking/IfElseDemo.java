package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("Value of a is greater than  b");
		else
			System.out.println("Value of a is not greater than b");

	}

}
