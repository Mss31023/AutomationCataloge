package com.coreJava;

public class DataTypesAndOperators {
	
	public void primitiveDataType() {
	   int a=2980;
	   double b=56.87;
	   byte c=100;
	   char credit= 'A';
	   float f= 29;
	   int g=80;
	   //short ,long,boolean are also the primitive data types
	   //Arithmetic operations using primitive data type
	   int z=a+c;
	   System.out.println("Addition is : "+ z);
	   double y=b-f;
	   System.out.println("Substraction is :"+y);
	   System.out.println("The credits are " +credit);
	   int x=a*g;
	   System.out.println("The multiplication is :"+ x);
	   int p=a/g;
	   System.out.println("The division is :" + p);
	    	
	}
	public static void referenceDataType() {
		
		String s1= "Welcome to java";  //String
		String s2="This is String";
		boolean result = s1.equals(s2);//boolean is primitive
		System.out.println(result);
		int[] a= {29,7,10};  //array 
		int y= a.length;
		System.out.println(a.length);
		String []fruits= {"mango","apple","orange","banana"};
		int z= fruits.length;
		boolean compare =y>=z;
		System.out.println(compare);   //Relational operators
		
		
		
		
		
}
	

	public static void main(String[] args) {
		DataTypesAndOperators obj1= new DataTypesAndOperators();
		obj1.primitiveDataType();
		DataTypesAndOperators.referenceDataType();

	}

}
