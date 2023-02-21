package org.tnsif.annotations;
//demo on Override annotation
class Parent{
	public void print(){
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
	@Override
	
	public void print(){
		super.print();
		System.out.println("Child class method");
	}
	
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Parent c=new Child();
		c.print();

	}

}
