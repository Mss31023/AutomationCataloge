package com.coreJava;

import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<String, Integer> emp = new HashMap<String, Integer>();
		emp.put("C++", 23);
		emp.put("Java", 32);
		emp.put("python", 45);
		emp.put("Ruby", 23); // duplicates override
		emp.put("JavaScript", 33);
		System.out.println("The value is : " + emp.get("python"));
		System.out.println("The value is :" + emp.get("Ruby"));
		System.out.println("The keys are :");
		for (String e : emp.keySet()) {
		
			System.out.println(e);
		}
		System.out.println("The values are :");
		for (Integer i : emp.values()) {
			

			System.out.println(i);
		}

	}

}
