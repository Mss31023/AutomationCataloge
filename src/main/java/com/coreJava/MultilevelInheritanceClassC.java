package com.coreJava;

import java.util.Scanner;

public class MultilevelInheritanceClassC extends MultilevelInheritanceClassB {

	public void factorialOfNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i = 1;
		int fact = 1;
		while (i < n) {
			fact = fact * i;
			i++;
		}
		System.out.println("The factorial of a number is : " + fact);

	}

	public static void main(String[] args) {
		MultilevelInheritanceClassC obj1 =new MultilevelInheritanceClassC();
		//obj1.swappingWithoutTempVar(45, 89);
		//obj1.primeNumber();
		//obj1.factorialOfNum();
		//obj1.range_PrimeNumbers();
		obj1.arrays_equal();
	}
}
