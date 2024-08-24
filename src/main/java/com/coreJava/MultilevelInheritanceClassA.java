package com.coreJava;

import java.util.Scanner;

public class MultilevelInheritanceClassA {
	
	public void swappingWithoutTempVar(int a,int b) {
		System.out.println("Before swapping :" + a +" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : "+a+" " +b);
		
		
	}
	public void range_PrimeNumbers() {
		int min,max,i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Minimum value of range");
		min=sc.nextInt();
		System.out.println("Enter the maximum value of range");
		max=sc.nextInt();
		for(i=min;i<=max;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) 
				break;	
				
			}
			
			if(i==j) {
				System.out.println(i+" ");
			}
		}

		
	}
	
}
