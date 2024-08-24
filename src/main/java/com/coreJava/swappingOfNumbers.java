package com.coreJava;

public class swappingOfNumbers {

	public void swappingOfTwoNumbers(int a, int b) {
		int temp = 0;
		System.out.println("Enter two numbers");
		System.out.println("Before swapping : " + "a is " + a + " and b is " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : " + "a is " + a + " and b is " + b);

	}
	
	public void swappingOfThreeNumbers(int a, int b,int c) {
		int temp = 0;
		System.out.println("Enter two numbers");
		System.out.println("Before swapping : " + "a is " + a + " , b is " + b+ "and c is " + c);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : " + "a is " + a + " , b is " + b+ "and c is " + c);

	}

	public static void main(String[] args) {
		swappingOfNumbers obj = new swappingOfNumbers();
		obj.swappingOfTwoNumbers(25, 67);

	}

}
