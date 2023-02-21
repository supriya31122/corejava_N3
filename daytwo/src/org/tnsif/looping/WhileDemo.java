package org.tnsif.looping;
import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("Reverse");
		int j=n;
		while(j>=1)
		{
			System.out.print(j+" ");
			j--;
		}
		

	}

}
