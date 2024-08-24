package com.coreJava;

public class FinallyKeyword {

	public static void main(String[] args) {
		try {
			int a=45/0;
			System.out.println(a);
			
		}catch(Exception e){
			System.out.println("It is an airthematic expection from Exception ");
			
		}
		finally {
			System.out.println("Finally will execute even expection is coming");
		}

	}

}
