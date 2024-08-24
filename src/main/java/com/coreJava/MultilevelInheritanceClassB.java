package com.coreJava;

import java.util.Scanner;
import java.util.Arrays;

public class MultilevelInheritanceClassB extends MultilevelInheritanceClassA{

	
	
	public void primeNumber() {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter an number");
		int n=sc.nextInt();
		int count=0;
		if(n==1) {
			System.out.println("The given number is neither prime nor composite");
		
		}else {
		for(int i=1;i<=n;i++) {
		        if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime");
		}
		}
		
	}
	
	
	public void arrays_equal() {
		int[] a= {2,87,90,22,91};
		int[] b= {20,87,76,11,23};
		boolean status= Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Both arrays are equal");
				
				
		}else {
			System.out.println("Given arrays are not equal");
		}
	}
}

	
	
	
	

