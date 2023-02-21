package org.tnsif.polymorphismdemo;

public class Multiplication {

		
		//Method overloading in terms of same parameter
		int mul(int x,int y)
		{
			return x*y;
		}
		
		int mul(float x, float y)
		{
			return (int)(x*y);
		}

	}


