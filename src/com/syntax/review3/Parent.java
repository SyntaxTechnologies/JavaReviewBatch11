package com.syntax.review3;

public class Parent {
	
	public Parent(String str) {
		System.out.println("I am a parent class constructor"+str);
	}

}


class Child extends Parent{
	
	/*
	 * Child(){
		 * super();
		 * 	
		 * }
	 */
	
	public Child(String str) {
		super(str);
		System.out.println("I am a child class constructor");
	}
	
}