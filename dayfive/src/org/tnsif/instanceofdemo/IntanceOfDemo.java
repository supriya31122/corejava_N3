package org.tnsif.instanceofdemo;
import java.util.Scanner;
public class IntanceOfDemo {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter Name,Address and age");
			String name = sc.next();
			String address = sc.next();
			int age = sc.nextInt();
			
			
			Child c = new Child();
			Child c1 = new Child(name,address,age);
			
			c1.setAddress(address);
			c1.setAge(age);
			c1.setName(name);
			System.out.println(c1);
			System.out.println(c instanceof Child);
			System.out.println(c1 instanceof Person);
			sc.close();
		}

	

	}


