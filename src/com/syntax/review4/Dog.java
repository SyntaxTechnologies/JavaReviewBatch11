package com.syntax.review4;

class Animal {
	
	public void eat() {
		System.out.println("All animals eat");
	}
}

public class Dog extends Animal{
	
	public void bark() {
		System.out.println("Dog barks");
	}
	
	public void sleep() {
		System.out.println("Dog sleeps");
	}
}

class Puppy extends Dog {
	
	//overriding
	public void bark() {
		System.out.println("Puppy barks");
	}
	
	public void drinkMilk() {
		System.out.println("Puppy drinks milk");
	}
	
	//overriding method eat
	public void eat() {
		System.out.println("Puppy eats");
	}
}
