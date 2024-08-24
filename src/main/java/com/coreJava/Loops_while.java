package com.coreJava;

import java.util.Scanner;

public class Loops_while {

	public void multiplicationTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number");
		int n = sc.nextInt();
		int i = 1;
		System.out.println("The multiplication table of " + n + " is :");
		while (i <= 10) {
			int p = n * i;
			System.out.println(p);
			i++;
		}

	}
	public void divisibleBy3() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=3;
		do {
			int x=n/i;
			System.out.println("The given number is divisible by 3 and quotient is "+x);
		}
		while(n%i==0);
	}

	public static void main(String[] args) {
		Loops_while obj = new Loops_while();
		obj.multiplicationTable();
		obj.divisibleBy3();
	}

}
