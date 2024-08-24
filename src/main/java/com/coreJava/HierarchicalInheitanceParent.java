package com.coreJava;

public class HierarchicalInheitanceParent {
	
	public void swappingOfThreeNum(int a,int b,int c) {
		
		System.out.println("Before swapping : "+a+" "+b+" "+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("Before swapping : "+a+" "+b+" "+c);

	}
	
	
	

}
