package com.coreJava;

import java.util.Scanner;

public class AreasUsingMethodOverloading {

	void area(float side) {

		float areaSquare = side * side;
		System.out.println("Area of square is :" + areaSquare);

	}
	void area(float length, float breadth) {
		float arearectangle = length * breadth;
		System.out.println("Area of rectangle is :" + arearectangle);
	}

	void area(double radius) {
		double pi = 3.14;
		double areacircle = pi * radius * radius;
		System.out.println("Area of circle is :" + areacircle);
	}
	public static void main(String[] args) {
		AreasUsingMethodOverloading obj = new AreasUsingMethodOverloading();
		obj.area(8);
		obj.area(15, 5);
		obj.area(7);
	}
}
