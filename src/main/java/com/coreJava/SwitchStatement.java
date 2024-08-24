package com.coreJava;

public class SwitchStatement {

	public void switchCaseExample(char ch1) {

		char ch = ch1;

		switch (ch) {

		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		case 'A':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");

		}
	}

	public static void main(String[] args) {
		SwitchStatement obj1 = new SwitchStatement();
		obj1.switchCaseExample('o');
		obj1.switchCaseExample('F');


	}

}
