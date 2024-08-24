package com.coreJava;

import java.util.Scanner;

public class NumbersPrograms {
	public void reverseOfNumber() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter an number");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("The reverse of number is : "+ rev);

	}
	//Palindrome number means reverse of that number is equal to original eg.343
	public void palindrome() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter an number");
		int num=sc.nextInt();
		int p=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(p==rev) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
	}

	
	

	public static void main(String[] args) {
		NumbersPrograms obj=new NumbersPrograms();
		obj.reverseOfNumber();
		obj.palindrome();
	}
}
