package com.coreJava;
 class SuperKeyword {
	 public static void main(String[] args) {
		 Child c=new Child();
		 c.method();
	 }
	int a=1;
	public void method() {
		System.out.println(a);
	}
}
 class Child extends SuperKeyword{
	int a=2;
	public void method() {
		System.out.println(super.a);
		System.out.println(a);

	}
}
 