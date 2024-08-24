package com.coreJava;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ProgramStrings {

	public void reverseOfString() {
		String str = "Automation";

		int len = str.length();
		String str1 = " ";
		for (int i = len - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);

		}
		System.out.println("The reverse of string is : " + str1);

	}
	public void reverseUsingStringBuffer() {
		
		StringBuffer a=new StringBuffer("Automation testing");
		StringBuffer rev=a.reverse();
		System.out.println("The reverse is : "+rev);
		
		
		
	}
	public void reverseParticularString() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter three strings");
		//scan the names from console
		String name=sc.nextLine();
		//split the names
		String[] names=name.split(" ");
		//crete the positions
		String first=names[0];
		String second=names[1];
		String third=names[2];
		//to print expected string reverse
		StringBuilder expected=new StringBuilder(second);
		String exp =expected.reverse().toString();
		System.out.println("The reverse of expected string " +second + " is "+ exp);
		
	}
	public void vowelsInString() {
		String input="Core Java";
		
		int vcount=0,ccount=0;
		String str=input.toLowerCase();
		for(int i=0;i<=str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			vcount++;
		}else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
			ccount++;
		}
		}
		System.out.println("The number of vowels in given string are "+ vcount);
		System.out.println("The number of consonants in given string are "+ ccount);

	}
	public static void charCount() {
		String s="JavaPrograms";
		char c=' ';
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=c){
				count++;
			}
		}
		System.out.println("The number of characters in given string are " +count);
	}
	
	
	
	

	public static void main(String[] args) {
		ProgramStrings obj = new ProgramStrings();
		//obj.reverseOfString();
		//obj.reverseUsingStringBuffer();
		//obj.reverseParticularString();
		//obj.vowelsInString();
		obj.charCount();
	}

}
