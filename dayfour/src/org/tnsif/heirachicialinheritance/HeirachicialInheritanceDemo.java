package org.tnsif.heirachicialinheritance;

public class HeirachicialInheritanceDemo {
	public static void main(String[] args)
	{
		Tiramisu T = new Tiramisu(1,13);
		
		SnowCone S = new SnowCone(1,12);
		
		T.getType();
		
		S.getType();
		
		System.out.println(T);
		
		System.out.println(S);
		
	}
	
	

	}


