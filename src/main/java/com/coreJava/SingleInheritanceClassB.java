package com.coreJava;

import java.util.Scanner;

public class SingleInheritanceClassB extends SingleInheritanceClassA {

	public void sumOfDigitsInNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int q = sc.nextInt();
		int r, sum = 0;
		while (q > 0) {
			r = q % 10;
			sum = sum + r;
			q = q / 10;
		}
		System.out.println("The sum of digits is : " + sum);

	}

	public static void main(String[] args) {
		SingleInheritanceClassB obj = new SingleInheritanceClassB();
		obj.swappingOfElementOfArray(); // calling parentclass method through childclass object
		obj.sumOfDigitsInNum();
		obj.areaOfCircle();
	}

}
