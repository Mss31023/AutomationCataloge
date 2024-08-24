package com.coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class SingleInheritanceClassA {

	public void swappingOfElementOfArray() {
		int[] arr= {19,87,45,34};
		System.out.println("Original array is: "+ Arrays.toString(arr));
		int x=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=x;
		System.out.println("After swapping : "+ Arrays.toString(arr));
	}
	public void areaOfCircle() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter an radius");
		double r= sc.nextDouble();
		double area =3.14*r*r;
		System.out.println("The area of circle is : "+area);
		
	}
		

	

}
