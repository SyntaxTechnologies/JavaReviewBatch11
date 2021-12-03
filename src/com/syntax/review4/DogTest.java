package com.syntax.review4;

public class DogTest {
	
	public static void main(String[] args) {
		
		Puppy p=new Puppy();
		
		p.sleep();
		p.bark();
		p.drinkMilk();
		
		System.out.println("   ------    ");
		
		Dog dog=new Puppy();
		//run time polymorphism
		dog.bark();
		// 
		dog.sleep();
		
		System.out.println("   ------    ");
		/*
		 * compile gives access to the methods based on the Reference Type
		 * Java executes code based on the Object type
		 */
		Animal animal=new Puppy();
		animal.eat();
		
		//downcasting
		//Puppy p=new Animal();
	}
}
