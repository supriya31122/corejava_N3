package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value for age and weight");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>12)
		{
			if(weight>=40)
			{
				if(weight<120)
					System.out.println("Eligibal for bunjee Jumping");
				else
					System.out.println("Extra ropes are added");
			}
			else
				System.out.println("Not eligibal for bunjee Jumping");
				
		}
		else
			System.out.println("Not eligibal for bunjee Jumping");
		


	}

}
