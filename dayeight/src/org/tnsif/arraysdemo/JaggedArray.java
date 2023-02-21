package org.tnsif.arraysdemo;
import java.util.Scanner;

	//to demonstrate 2D jagged array
	public class JaggedArray {

		public static void main(String[] args) {
			 int arr[][]=new int [2][];
			 //first array 3 columns
			 arr[0]=new int[3];
			 //second array 2 columns
			 arr[1]=new int[2];
			 /*int count=0;
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=0;j<arr[i].length;j++)
				 {
					 arr[i][j]=count++;
				 }
			 }*/
			 Scanner sc=new Scanner(System.in);
				System.out.println("Enter jagged array elemts: ");
				
				for(int i=0;i<arr.length;i++)
				 {
					 for(int j=0;j<arr[i].length;j++)
					 {
						 arr[i][j]=sc.nextInt();
					 }
				 }
			 System.out.println("Content of 2D jagged array...");
			 
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=0;j<arr[i].length;j++)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
				 System.out.println();
			 }
			 

		}

	}


