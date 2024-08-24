package com.coreJava;

public class Encapsulation {
	
	private int age;
	public void setAge(int age) {  //set method to set the values
		if(age>100) {
			this.age=100;
			
		}else if(age<0){
			this.age=0;
		}else {
			this.age=age;
		}
	}
	public int getAge() {          //get method to get the values
		return age;
	}
	
	
	
	

	
}
