package com.coreJava;

public class MethodOverloading {
	// methods with same name but different parameters

	public void customerInfo(int id, int contact) {
		System.out.println("The customer id: " + id + "  and contact is : " + contact);
	}

	public void customerInfo(String name, int age) {
		System.out.println("The customer name : " + name + "  and age is : " + age);

	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.customerInfo("Rahul sharma", 26);
		obj.customerInfo(18876543, 975425709);

	}

}
