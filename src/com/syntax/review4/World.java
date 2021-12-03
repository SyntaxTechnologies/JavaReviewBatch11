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
		math.teach();
		math.getPaid();
		math.takeExam();
		
		
	}
}
