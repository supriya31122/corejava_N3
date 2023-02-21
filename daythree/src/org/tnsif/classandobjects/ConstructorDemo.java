package org.tnsif.classandobjects;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter id, name,city");
  int id= sc.nextInt();
  String cust_name=sc.next();
  String city=sc.next();
  sc.close();
  Customer c= new Customer();
  c.setId(id);
  c.setCust_name(cust_name);
  c.setCity(city);
  c.display();
  
	}

}
