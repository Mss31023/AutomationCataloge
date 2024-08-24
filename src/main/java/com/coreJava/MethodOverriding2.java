package com.coreJava;

public class MethodOverriding2 extends MethodOverriding {
	public void average(int a,int b,int c) {
		int sum=a+b+c;
		double avg=sum/3;
		System.out.println("Average is : "+avg);
	}
	
	
	
	
	public static void main(String[] args) {
		MethodOverriding2 obj=new MethodOverriding2();
		obj.average(3, 35, 29);

	}

}
