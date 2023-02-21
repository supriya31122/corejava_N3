package org.tnsif.thiskeyword;
//this keyword in terms of method argument
public class ThisKeywordExecutor {
	void function1(ThisKeywordExecutor e)
	{
		System.out.println("Function 1 invoked");
	}
	void function2()
	{
		function1(this);
	}

	public static void main(String[] args) {
		ThisKeywordExecutor e=new ThisKeywordExecutor();
		e.function2();

	}

}


