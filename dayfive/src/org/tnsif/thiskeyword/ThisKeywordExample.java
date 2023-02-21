package org.tnsif.thiskeyword;


	//this keyword in terms of constructor
class Main{
	int num;
	Main()
	{
		
	}
	Main(int num)
	{
		this.num=num;
	}
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		Main m=new Main(5);
		System.out.println("Num value: "+m.num);

	}

}
