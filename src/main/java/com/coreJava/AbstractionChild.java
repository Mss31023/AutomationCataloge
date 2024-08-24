package com.coreJava;

class AbstractionChild extends AbstractionExample {

	public void country() {
		System.out.println("India is an developing nation");
	}

	public void states() {
		System.out.println("There are 28 states in india");
	}

	public static void main(String[] args) {
		AbstractionChild c = new AbstractionChild();
		c.country();
		c.states();

	}

}
