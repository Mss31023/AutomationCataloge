package com.coreJava;

public class PositionsInArray {

	public static void main(String[] args) {
	String[] data = {"Python","java","Ruby","csharp"};
	for(int i=0;i<data.length;i++) {
		System.out.println("The position of data "+i+ " is  "+data[i]);
		System.out.println("The number of characters in "+data[i]+ " is "+data[i].length());
	}

	}

}
