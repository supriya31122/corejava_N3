package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for song");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Kesariya");
		    break;
		
		case 2:
			System.out.println("Ved");
		    break;
		
		case 3:
			System.out.println("Cam down");
		    break;
		
		default: System.out.println("Thank you...");
		
		}

	}

}
