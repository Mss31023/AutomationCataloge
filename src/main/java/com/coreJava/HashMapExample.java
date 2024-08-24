package com.coreJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer ,String> map=new HashMap<Integer,String>();
		map.put(1, "manual testing");   //putting elements in map
		map.put(2, "core java");
		map.put(3, "selenium");
		map.put(4, "TestNG");
		map.put(5, "framework");
		System.out.println("Iterating Hashmap...");     //Map  is interface and map is object of hashmap
		for(Map.Entry m:map.entrySet() ) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}




	}
	
	

}
