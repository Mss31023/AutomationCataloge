package com.coreJava;

public class Duplicate_words {

	public static void main(String[] args) {
		// Store the data
		String[] input = { "Java ", " Python", "Ruby ", " C#", "JavaScript ", "Java " };
		boolean temp = false;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					System.out.println(input[i]);
					temp = true;
				}
			}
		}
	}

}
