package com.coreJava;

public class BreakAndContinue {

	public static void continueExample() {
		System.out.println("Test of continue ");
		for (int i = 0; i <= 10; i++) {

			if (i > 4 && i < 8) {
				continue; // this will continue the looping
			}
			System.out.println(i);
		}

	}

	public void breakExample() {
		System.out.println("Test of break");
		int i = 0;
		while (i < 6) {
			if (i == 3) {
				break; // this statement will stop the loop
			}
			System.out.println(i++);
		}

	}

	public static void main(String[] args) {
		BreakAndContinue.continueExample();
		BreakAndContinue obj2 = new BreakAndContinue();
		obj2.breakExample();

	}

}
