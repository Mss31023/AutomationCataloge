package com.coreJava;

import java.util.Scanner;

public class MobileSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] mobiles = { "iphone", "oneplus", "oppo", "Redmi" };
		int[] ramInGB = { 2, 4, 6, 8 };
		int[] romInGB = { 32, 64, 128, 512 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile Name From This List - iphone,neplus,oppo,Redmi");
		String input = sc.next();
		for (String str : mobiles) {
			if (input.equalsIgnoreCase(str)) {
				for (int i = 0; i < ramInGB.length; i++) {
					for (int j = 0; j < romInGB.length; j++) {
						System.out.println("Available are " + input + ramInGB[i] + " " + romInGB[j]);
					}
				}

			} else {
				System.out.println("mobille choosen is not available");
			}

		}
	}

}
