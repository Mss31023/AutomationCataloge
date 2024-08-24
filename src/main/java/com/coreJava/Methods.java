package com.coreJava;

import java.util.Scanner;

public class Methods {
	// local method/Instance method
	public void evenOdd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = input.nextInt();
		if (a % 2 == 0) {
			System.out.println("The given numer is even");
		} else {
			System.out.println("The given number is odd");
		}

	}

	public static void swapping() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double a = sc.nextInt();
		System.out.println("Enter second number");
		double b = sc.nextInt();
		System.out.println("Before swapping :first" + a + "second" + b);
		double temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : first " + a + "second" + b);

	}
	public void average(int a,int b,int c) {
		Scanner sc = new Scanner(System.in);
	
		double avg=a+b+c/3;
		System.out.println("Average of given numbers is :"+ avg);
	}
	

	public static void main(String[] args) {
		Methods obj1 = new Methods();
		obj1.evenOdd();  //Instance method call
		//Methods.swapping();  //static method call
		obj1.average(46,57 , 68);
	}

}
