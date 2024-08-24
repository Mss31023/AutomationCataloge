package com.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class InterviewPractice {
	
	
	
	public static void NumberProgram(){
		
		int i;
		int count=0;
		for(i=1;i<=1000;i++){
			if(i%10==0){
				System.out.println(i);
				count++;
		
			}
		}
		System.out.println("Total numbers divisible by 10 upto 1000 are :" +count);
	}
	
	public static void StringAnagram() {
		String str1="listen";
		String str2="silent";
		if(str1.length()==str2.length()) {
			char[] chararr1=str1.toCharArray();
			char[] chararr2=str2.toCharArray();
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			boolean result=Arrays.equals(chararr1, chararr2);
			if(result) {
				System.out.println(str1+" and "+str2 +" are anagram");
			}else {
				System.out.println(str1+" and "+str2 +" are  not anagram");

			}
		}else {
			System.out.println(str1+" and "+str2 +" are anagram");

		}
		
		
		
	}
	public static void fibonacciSeries(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	      int len=sc.nextInt();
		 int[] num=new int[len];
		 num[0]=0;
		 num[1]=1;
		 for(int i=2;i<len;i++){
			 num[i]=num[i-1]+num[i-2];
		 }
		 for(int i=0;i<len;i++){
			 System.out.println(num[i]+" ");
		 }
	}
	public static int SumofDigits(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0){
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		return sum;
	}
	public static void Hashmap(){
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Manual",1);
		hmap.put("selenium",2);
		hmap.put("Testng",3);
		hmap.put("Core java",4);
		hmap.put("Sql",5);
		Iterator<String> it =hmap.keySet().iterator();
		while(it.hasNext()){
			String key=it.next();
			int value=hmap.get(key);
			System.out.println("key " + key+ " ---" + "Value "+value);
		}
	}
	public static void HashmapToArraylist(){
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Manual",1);
		hmap.put("selenium",2);
		hmap.put("Testng",3);
		hmap.put("Core java",4);
		hmap.put("Sql",5);
		ArrayList<String> arrList=new ArrayList<String>(hmap.keySet());
		System.out.println("Hashmap keys are ");
		for(String s:arrList){
			System.out.println(s);
		}
		ArrayList<Integer> arrlist=new ArrayList<Integer>(hmap.values());
		System.out.println("Hashmap values are ");
		for(int n:arrlist){
			System.out.println(n);
		
		}
	}
		public static void ReverseArraylist(){
			ArrayList arr=new ArrayList();
			arr.add("Hello");
			arr.add(23);
			arr.add(87.5);
			arr.add(true);
			System.out.println("Before reverse" +arr);
			Collections.reverse(arr);
			System.out.println("After reverse" +arr);
		}
		
		
		public static void CompressString(){
			String s="aaabbbbccccc";
			HashMap<Character,Integer> map = new HashMap();
			
			for(int i=0;i<s.length();i++){
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i),map.get(s.charAt(i))+1);
				}else{
					map.put(s.charAt(i),1);
				}
			}
			map.forEach((key,value)->System.out.print(key+""+ value));
		}
		public static void StringDuplicate() {
			String str="allowa";
			char[] s=str.toCharArray();
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<i;j++) {
					if(s[i]==s[j]) {
						System.out.println("Duplicte char" +":"+ s[i]);
					}
				}
			
			}
			}
		public static void subString(String str1,String str2) {
			
		   boolean result=str1.contains(str2);
			if (result) {
				System.out.println(str2 + "contains in" + str1);
			}else {
				System.out.println(str2 + " does not contains in" + str1);
			}
		}
		public static void removejunkfromString() {
			String s="hja#12&GH09@";
			s=s.replaceAll("[^a-zA-Z0-9]", " ");
			System.out.println(s);
		}
		public static void charCount() {
			String s="kjsiudndjod";
			char c=' ';
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=c) {
					count++;
				}
			}
			System.out.println("number of characters in string are "+ count);
			
			
			
		}
		public static void missingnumberinarray() {
			int[] arr= {10,11,13,14,15,16,17,18,19,20};
			int sum=0,sum1=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			for(int j=10;j<=20;j++) {
				sum1=sum1+j;
			}
			 int missnum=sum1-sum;
			 System.out.println("Missing number is "+missnum);
		}
		public static void factorial(){
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter an number");
			int n=sc.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println("Factorial of given number is " + fact);
		}
		public static void stringPalindrome(){
			String s="pop";
			String rev=" ";
			for(int i=s.length()-1;i>=0;i--){
				rev=rev+s.charAt(i);
			}
			if(s.equals(rev)){
				System.out.println("String is palindrome");
			}else{
				System.out.println("String is  not palindrome");
			}
		}
		public static void AvgNumExcludeMinMax() {
			int[] arr= {7,99,20,108,78,11,8};
			float sum=0;
			Arrays.sort(arr);
			for( int i=1;i<arr.length-1;i++) {
				sum=sum+arr[i];
			}
			float avg=sum/(arr.length-2);
			System.out.println("Average of numbers in an given array excluding minimum and maximum is "+ avg);
			
		}
		public static void productArr(){
			int[] nums={-1,1,-1,1,-1};
			int product=1;
			for(int i=0;i<nums.length;i++){
			product=product*nums[i];
			}
			if(product>0){
				System.out.println("1");
			}else if(product<0){
				System.out.println("-1");
			}else{
				System.out.println("0");
			}
		}
		public static void revnum() {
		long x=1534236469;
		long rev=0;
		while(x>0){
			long r=x%10;
			rev=(rev*10)+r;
			x=x/10;
		}
		System.out.println("The reverse of given number is " + rev);
		}	
		public static int[] runningSum(int[] nums){
			
			int[] result =new int[nums.length];
			nums[0]=result[0];
			
			for(int i=1;i<nums.length;i++){
				
				result[i]=nums[i]+nums[i-1];
				
			}

			return result;
			
			
		}
		public static void CountrepetativeChar(){
			String s="GoodMorning";
			int countG=0;
			int countM=0;
			int countO=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='G'){
					countG++;
					i++;
				}else if(s.charAt(i)=='o'){
				countO++;
				i++;
				}else if(s.charAt(i)=='M'){
				countM++;
				i++;
				}else{
					i++;
				}
			}
			System.out.println("G appears " +countG+ " times"+" O appears " +countO+ " times"+" M appears "+ countM+" times");
		}
		public static void CountEvenOddDigit(long n){
			int even_count=0;
			int odd_count=0;
			while(n>0){
				long r=n%10;
				if(r%2==0){
					even_count++;
				}else{
					odd_count++;
				}
				n=n/10;
			}
		}
		public static void MaxMineleInArray(){
			int arr[]={60,78,23,11,8};
			int max=arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			System.out.println("Maximum element in an array is" + max);
			int arr1[]={5,11,26,99,43};
			int min=arr1[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]<min){
					min=arr[i];
				}
			}
			System.out.println("Minimum element in an array is" + min);
			}
		public static void LinearSearch(){
			int arr[]={29,56,70,22,100};
			boolean flag=false;
			int search_value=40;
			for(int i=0;i<arr.length;i++){
				
				if(search_value==arr[i]){
		        System.out.println("Element found at "+ i + " position");
				flag=true;
				}
			}
		if(flag=false){
		System.out.println(" Element not found");
		}
		}
		public static void RemoveWhiteSpaces(){
			String s="Welcome to java";
			String s1=s.replaceAll("\\s" ,"");
			System.out.println("After removing spaces "+ s1);
			}	
		

	public static void main(String[] args) {
		//InterviewPractice.NumberProgram();
		//InterviewPractice.StringAnagram();
		//InterviewPractice.fibonacciSeries();
		//InterviewPractice.SumofDigits();
		//InterviewPractice.Hashmap();
		//InterviewPractice.HashmapToArraylist();
		//InterviewPractice.ReverseArraylist();
		//InterviewPractice.CompressString();
		//InterviewPractice.StringDuplicate();
		//InterviewPractice.subString("HelloWorld","world");
		//InterviewPractice.removejunkfromString();
		//InterviewPractice.charCount();
		//InterviewPractice.missingnumberinarray();
		//InterviewPractice.factorial();
		//InterviewPractice.stringPalindrome();
		//InterviewPractice.AvgNumExcludeMinMax();
		//InterviewPractice.productArr();
		//InterviewPractice.revnum();
		//InterviewPractice.runningSum(new int[]{5,9,70,45,38});
		//InterviewPractice.CountrepetativeChar();
		//InterviewPractice.CountEvenOddDigit(872509);
		//InterviewPractice.MaxMineleInArray();
		//InterviewPractice.LinearSearch();
		InterviewPractice.RemoveWhiteSpaces();
	}

}
