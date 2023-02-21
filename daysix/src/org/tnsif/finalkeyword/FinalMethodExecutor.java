package org.tnsif.finalkeyword;

import java.util.Scanner;

	public class FinalMethodExecutor {

		public static void main(String[] args) {
			
			System.out.println("flavors...");
			System.out.println("1.Rasmalai\n2.RedVelve");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the no which flavor do you want");
			int n=sc.nextInt();
			if(n==1)
			{
				Rasmalai r=new Rasmalai();
				r.display(250); 
			}
			//r.display();
			else
			{
				RedVelvet r1=new RedVelvet();
				r1.display(450);
				
			}
			

		}

	}


