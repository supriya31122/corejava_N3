package org.tnsif.abstractiondemo;

public class AbstractionExecutor {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		ButterChicken b=new ButterChicken();
//We can't instantiate the abstract class
//Menu m=new Menu();
		
		b.foodType();
		b.menuType();
		b.recipe();

	}

}


