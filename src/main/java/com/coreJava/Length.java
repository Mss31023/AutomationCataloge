package com.coreJava;

public class Length {
	
	
	
	

	public static void main(String[] args) {
		
		String[] str = {"Pycharm","Java","Selenium","Automation"};
		
		int len=str.length;   //length is used to get size of int array
		System.out.println("The length of String is : "+ len);
		int len2=str[2].length();   //length() is used to get the number of characters
		System.out.println("The length of Selenium String is : "+ len2);
	}

}
