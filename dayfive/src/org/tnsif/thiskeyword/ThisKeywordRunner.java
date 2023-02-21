package org.tnsif.thiskeyword;

//this keyword can be used to return current class instance
class Mathematics{
	int a,b;
	Mathematics()
	{
		a=10;
		b=20;
	}
	Mathematics get()
	{
		return this;
	}
	void dispaly()
	{
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}
}

public class ThisKeywordRunner {

	public static void main(String[] args) {
		Mathematics m=new Mathematics();
		m.get().dispaly();

	}

}


/*
 * A is: 10
B is: 20
*/
