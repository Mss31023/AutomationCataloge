package com.coreJava;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSorting {
	public static void sortingUsingLoops(int[] arr) {
		int n = arr.length;
		System.out.println("Array before sorting :" );
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		
		System.out.println(" Array after sorting :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {
		int[] num = { 12, 76, 50, -1, 0, 77, 10 };
		System.out.println("Numbers before sorting are: " + Arrays.toString(num));
		Arrays.sort(num); // To sort a numbers using existing java method

		System.out.println("Numbers before sorting are: " + Arrays.toString(num));
		int[] arr = {34,65,12,90,0};
		BubbleSorting.sortingUsingLoops(arr);

	}

}
