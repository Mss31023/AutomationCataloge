package com.coreJava;

import java.util.Scanner;

public class Arrays {

	// single/one dimensional array
	public static void arrayOneDimensional() {
		int[] a = new int[6]; // Initialize and declaration of array
		a[0] = 34;
		a[1] = 45;
		a[2] = 77;
		a[3] = 80;
		a[4] = 11;
		a[5] = 20;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void array1() {
		char[] c = new char[6];
		c[0] = 's';
		c[1] = 'a';
		c[2] = 'c';
		c[3] = 'h';
		c[4] = 'i';
		c[5] = 'n';
		String str = String.valueOf(c);
		System.out.println(str);

	}

	public static void sumOfArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] array = new int[n];
		int sum = 0;
		System.out.println("Enter an elements in an array");
		for (int i = 0; i < n; i++) {

			array[i] = sc.nextInt();
			sum = sum + array[i];

		}
		System.out.println("Sum of array is " + sum);

	}

	// data_type [] [] array_name = new data_type[row_size][column_size]; Two
	// dimensional array
	public static void multidimensionalArray() {
		int[][] array1 = { { 2, 6, 7 }, { 4, 9, 11 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array1[i][j] + " ");
			}

			System.out.println();
		}

	}
	public static void multidimensionalArray1(){
		int[][] multiarr=new int[2][3];  //here 2 is like row and 3 is like column in 2*3 matrix
		multiarr[0][0]=1;
		multiarr[0][1]=3;
		multiarr[0][2]=5;
		multiarr[1][0]=7;
		multiarr[1][1]=11;
		multiarr[1][2]=13;
		System.out.println(multiarr.length);
	//or we can also define as int[][] multiarray={{1,3,5},{7,11,13}};
	//To print all elements in an array ,use nested for loop	
		for(int i=0;i<multiarr.length;i++){
			for(int j=0;j<multiarr[i].length;j++){
				System.out.println(multiarr[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		//Arrays.arrayOneDimensional();
		// Arrays.array1();
		//Arrays.sumOfArray();
		//Arrays.multidimensionalArray();
		Arrays.multidimensionalArray1();
	}

}
