package org.tnsif.arraysdemo;
	import java.util.Scanner;
	//program to demonstrate multidimentional array
	public class MultiDimensionalArray  {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter outer array size");
			int r=sc.nextInt();
			System.out.println("Enter inner array size");
			int c=sc.nextInt();
			int arr[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("Array elements are: ");
			
			for(int i=0;i<r;i++)
			{
				System.out.print("arr["+i+"] ");
				
				for(int j=0;j<c;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}

		}

	}


