package com.coreJava;

import java.util.Scanner;

public class Constructors {
	
	//Default constructor called implicitly
	Constructors(){
		System.out.println("Default constructor is called");
		
	}
	//Parameterized constructor
	Constructors(int id,String name){
		
		System.out.println("Parametrised constructor is called");
		System.out.println(id+" "+ name);
	}
	
	public void cubeOfNumbers() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int b=a*a*a;
		System.out.println("Cube of given number is :" + b);
	}
	

	public static void main(String[] args) {
		Constructors obj1= new Constructors(2887,"minakshi");//call to parametrized constructor
		obj1.cubeOfNumbers();
		

	}

}
