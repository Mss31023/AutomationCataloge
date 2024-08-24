package com.coreJava;

import java.util.Scanner;

public class ConditionalStatements {

	public void ifStatement() {
		int[] n = { 45, 87, 99, 20, 1287, 900 };
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 5 == 0) {
				System.out.println("The number " + n[i] + " is divisible by 5");
			}
		}
	}

	public void ifElseStatement() {
		// The odd numbers from 1 to 20
		System.out.println("The odd and even  numbers from 1 to 20");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " is odd ");
			} else {
				System.out.println(i + " is even ");
			}
		}

	}

	public void ifElseIfStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 == n2) {
			System.out.println("The given numbers are equal");
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else if (n1 < n2) {
			System.out.println(n1 + " is smaller than  " + n2);
		}
	}

	public static void main(String[] args) {
		ConditionalStatements obj1 = new ConditionalStatements();
		obj1.ifStatement();
		obj1.ifElseIfStatement();
		obj1.ifElseStatement();
	}

}
