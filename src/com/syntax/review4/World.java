package com.syntax.review4;

public class World {
	
	public static void main(String[] args) {
		
		//Human human=new Human(); CE->Cannot instantiate the type Human
		
		MathTeacher math=new MathTeacher("John", "Smith", 40000, "Math");
		
		// from Human
		math.printInfo();
		Human.sleep();
		Human.eat();
		
		//from Teacher
		math.getPaid();
		math.takeExam();
		
		//from MathTeacher
		
		/*
		 * Compile Time polymorphism - achieved through method overloading
		 * (static or early binding)
		 */
		math.speak();
		math.speak("russian");
		math.teach();
		
		/*
		 * Run Time polymorphism - achieved through method overriding
		 * (dynamic or late binding)
		 */
		
		double d=10;
		
		System.out.println(" ----  Object of Math but reference as of Parent = Human ---  ");
		//Casting of non primitives: Upcasting and Downcasting
		Teacher teacher=new MathTeacher("Jane", "Doe", 45000, "math");
		teacher.getPaid();
		
		//runtime polymorphism --> during runtime JAVA executes method based on the object type
		teacher.teach(); //teach from child will get executed 
		
		teacher.takeExam();
		
		teacher.printInfo();
		//teacher.speak("russian"); //this is not accessible as it was defined inside child class
		
		
		
		
	}
}
