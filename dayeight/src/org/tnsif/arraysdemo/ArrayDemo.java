package org.tnsif.arraysdemo;


	import java.util.Arrays;
	import java.util.Scanner;
	//program to demonstrate the array using user inputs
	public class ArrayDemo {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of elements in the array: ");
			int n=sc.nextInt();
			//array declaration
			int ar[]=new int[n];
			//To allocate the value to a array
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
				
			}
			System.out.println("Array elements are: ");
			for(int i=0;i<n;i++)
			{
				System.out.print(ar[i]+"\t ");
			}
	//to sort an array elements
			Arrays.sort(ar);
			System.out.println("\nArray sorted elemnts are: ");
/*for(int i=0;i<n;i++)
			{
				System.out.print(ar[i]+"\t ");
	}*/
			for(int i: ar)
			{
				System.out.print(i+"\t ");
				
			}
			
			
		}

	}



