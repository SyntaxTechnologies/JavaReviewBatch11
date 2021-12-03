package com.syntax.review4;

public abstract class Human { //every abstract class MUST participate in the INHERITANCE
	
	protected String name, lastName;
	
	public static boolean brain;
	
	public Human(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
	}

	public void printInfo() {
		System.out.println(name+" "+lastName);
	}
	
	static void sleep() {
		System.out.println("All Humans sleep");
	}

	static void eat() {
		System.out.println("All Humans eat");
	}
	
	private void live() {
		System.out.println("This method is useless");
	}
	
	public abstract void speak(); //can have any access modifiers except PRIVATE 

}
