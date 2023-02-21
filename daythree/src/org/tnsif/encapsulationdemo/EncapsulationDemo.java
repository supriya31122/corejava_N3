package org.tnsif.encapsulationdemo;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a pin of Your choice");
		HDFC a= new HDFC();
		a.setPin(sc.nextInt());
		System.out.println(a.getPin());
		System.out.println("Your pin is Successfully Updated");
		a.accept();

	}

}

