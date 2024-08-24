package com.coreJava;

public class Patterns {

	public static void starPattern(int row) {
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public static void pyramidPattern(int n) {
		int i,j;
		for ( i = 0; i <= n; i++) 
		{
			for (  j=n-i; j>1; j--)   
			{  
			 
			System.out.print(" ");   
			}   
		
		for ( j = 0; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
			
			
		
	}
	public static void triangleUsingNumbers() {
		int row=5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

		
	}

	public static void main(String[] args) {
		Patterns.starPattern(5);
		Patterns.pyramidPattern(5);
		Patterns.triangleUsingNumbers();
	}

}
