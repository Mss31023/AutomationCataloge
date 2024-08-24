package com.coreJava;

import java.util.Scanner;

public class Assignment {
	public static void rangeOfPrimeNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum value");
		int n1 = sc.nextInt();
		System.out.println("Enter the maximum value");
		int n2 = sc.nextInt();
		int i, j;
		for (i = n1; i <= n2; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i + "is a prime number");
			}

		}

	}

	public static void stringReverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String[] strings = str.split(" ");
		String first = strings[0];
		String second = strings[1];
		String third = strings[2];
		StringBuilder st = new StringBuilder(second);
		StringBuilder rev = st.reverse();
		System.out.println("The reverse of second string is : " + rev);

	}

	public static void main(String[] args) {
		Assignment obj = new Assignment();
		obj.rangeOfPrimeNumbers();
		obj.stringReverse();
	}

}
