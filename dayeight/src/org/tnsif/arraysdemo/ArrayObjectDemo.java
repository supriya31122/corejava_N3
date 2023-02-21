package org.tnsif.arraysdemo;
import java.util.Scanner;

public class ArrayObjectDemo {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("How many students record you want to enter...\nenter the number:");
			int n=sc.nextInt();
			Student arr[];
			arr=new Student[n];
			System.out.println("Enter the Roll_no, Name and Percentage ");
			for(int i=0;i<n;i++)
			{
				arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			}
			System.out.println("Elements of array: ");
			
			for(int i=0;i<n;i++)
			{
		      System.out.println("record : "+i+"\t "+arr[i].getRoll_no()+"\t "+arr[i].getName()+"\t "+arr[i].getPercentage());
			}
		}

		

	}


