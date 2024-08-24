package com.coreJava;

 class FinalKeyword {
	final int a=20;
	 public void core() {
		System.out.println("Use of final key in method");
	}
	
}	

class java extends FinalKeyword{
	public void core() {
		System.out.println("Cant override the final method ");
	}
}
  class mainobj{
	public static void main(String[] args) {
		FinalKeyword obj=new FinalKeyword();
		int a=24;
		System.out.println(obj.a);
		
		
	}
	}
		

	


