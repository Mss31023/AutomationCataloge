package com.coreJava;

import java.util.Scanner;

public class ProgramString2 {

	public static boolean checkPalindromeString(String str) {
		StringBuilder b = new StringBuilder(str);
		StringBuilder rev = b.reverse();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}
	public  static void firstCharUpper() {
		String input="troubleShoot";
		//the next step is to get the substring with start index and end-1
		//It gives the first letter of the string
		String first =input.substring(0, 1);
		//It gives the remaining char after 1
		String remain=input.substring(1, input.length());
		//To make the first letter uppercase
		String upper=first.toUpperCase();
		//to print string with first letter uppercase
		String expected=upper+remain;
		System.out.println("The expected string with first uppercase letter is : "+expected);
		
		
		
	
	}
	public static void stringOccurance(String str) {
		char ch= 'a';
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.println("The occurance of a in the given string is : "+ count);
		
	}
	public static void equalsmethodString() {
		String str1="Browser";
		String str2="browser";
		if(str1.equals(str2)) {
			System.out.println("The given strings are equal");
		}else {
			System.out.println("The given strings are not equal");
		}
	}
	public static void equalsIgnorecase() {
		String os1="Windows";
		String os2="windows";
		if(os1.equalsIgnoreCase(os2)) {
			System.out.println("Both are equal ignored case sensitive");
		}else {
			System.out.println("Both are not equal ");
		}
	}
	public static void startsWithMethod() {
		String proverb="As you sow,as you gain";
		boolean x=proverb.startsWith("As");
		if(x) {
			System.out.println("Its true");
		}else {
			System.out.println("Its false");
		}
	}

	public static void main(String[] args) {
		
		System.out.println(ProgramString2.checkPalindromeString("nitin")); 
		ProgramString2.firstCharUpper();
		ProgramString2.stringOccurance("Selenium is open source automation tool");
		ProgramString2.equalsmethodString();
		ProgramString2.equalsIgnorecase();
		ProgramString2.startsWithMethod();
	}

}
