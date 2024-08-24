package com.coreJava;

import java.util.Scanner;

public class HierarchicalInheitanceChild2 extends HierarchicalInheitanceParent {

	public void decimalToBinary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n = sc.nextInt();
		System.out.println(Integer.toBinaryString(n));

	}

	public static void main(String[] args) {
		HierarchicalInheitanceChild2 obj2 = new HierarchicalInheitanceChild2();
		obj2.swappingOfThreeNum(67, 20, 30);
		obj2.decimalToBinary();
	}

}
