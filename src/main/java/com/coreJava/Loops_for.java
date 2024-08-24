package com.coreJava;

public class Loops_for {
	public void evennumber() {
		int[] num = { 2, 4, 5, 6, 34, 21, 17, 89, 90, 54, 77, 31 };
		int i = 0;
		int count = 0;
		for (int n : num) {
			if (n % 2 == 0) {

				System.out.println("The number " + n + " is even");
				count++;

			}
		}
		System.out.println("The total even numbers in given array are : " + count);

	}
	public void sumOfNumbers() {
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of natural numbers from 1 to 50 is :" + sum);
	}

	public static void main(String[] args) {
		Loops_for obj1 = new Loops_for();
		obj1.evennumber();;
		obj1.sumOfNumbers();

	}

}
