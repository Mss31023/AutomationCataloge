package com.coreJava;

public class HierarchicalInheitanceChild1 extends HierarchicalInheitanceParent{
	
	public void reverseOfString(String str) {
		System.out.println("Original string is : " + str );
		char[] s =str.toCharArray();
		System.out.println("Reverse of string is : ");
		for(int i=s.length-1;i>=0;i--) {

			System.out.print(s[i]);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		HierarchicalInheitanceChild1 obj2=new HierarchicalInheitanceChild1();
		obj2.reverseOfString("HelloWorld");
		obj2.swappingOfThreeNum(29, 34, 89);
	}

}
