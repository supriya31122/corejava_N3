package org.tnsif.finalkeyword;
//program to demonstrate on final keyword with method
	public class Cake {
		protected String flavor;
		//final method
		final void display()
		{
			System.out.println("Flavor of cake is: "+flavor);
			
		}
		

	}

	class Rasmalai extends Cake
	{
		
		private int price;
		void display(int price1)
		{
			flavor="Rasmalai";
			price=price1;
			display();
			System.out.println("Price of cake is: "+price);
		}
		
	}
	class RedVelvet extends Cake
	{
		
		private int price;
		void display(int price1)
		{
			flavor="RedVelveti";
			price=price1;
			display();
			System.out.println("Price of cake is: "+price);
		}
		
	}


