package com.syntax.review4;

public abstract class Teacher extends Human {

	protected double salary;

	public Teacher(String name, String lastName, double salary) {
		super(name, lastName);
		this.salary = salary;
	}

	public void getPaid() {
		System.out.println("Teacher gets paid " + salary);
	}

	public abstract void takeExam();

	private void hasVacation() {
		System.out.println("All teachers should have vacation");
	}
	
	// overridden
	protected void teach() {
		System.out.println("Every Teacher teach");
	}
	
}
class MathTeacher extends Teacher {

	String subject;

	public MathTeacher(String name, String lastName, double salary, String subject) {
		super(name, lastName, salary);
		this.subject = subject;
	}

	// overriding teach method
	protected void teach() {
		System.out.println(name + " teaches " + subject);
	}
	/*
	 * Overriding --> same method name within sub and super class
	 */
	
	/*
	 * Rules of overriding:
	 *  1. Inheritance
	 *  2. method signature(name+parameters) +return type MUST be same
	 *  3. access modifiers cannot be more restrictive
	 *  4. cannot override private
	 *  5. cannot override static
	 */

	/*
	 * Overloading --> same method name within same class
	 */
	
	/*
	 * Rules of Overloading:
	 * 1. method signature must be different (by # and type of the parameters)
	 * 2. return type CAN BE different
	 * 3. access modifiers CAN be different
	 * 4. we can overload private
	 * 5. we can overload static method
	 */
	
	public void speak() {
		System.out.println(name + " " + lastName + " speaks math language");
	}
	
	public void speak(String language) {
		System.out.println(name + " " + lastName + " speaks math and "+language+" language");
	}
	
	public void takeExam() {
		System.out.println(name + " " + lastName + " takes exam on " + subject);
	}

	//this is not overriding --> because hasVacation() in parent is not visible
	private void hasVacation() {
		System.out.println(name + " " + lastName + " have 30 days vacation");
	}

}