package com.syntax.review4;

public abstract class Teacher extends Human {
	
	protected double salary;
	
	public Teacher(String name, String lastName, double salary) {
		super(name, lastName);
		this.salary=salary;
	}
	
	public void teach() {
		System.out.println("Every Teacher teach");
	}
	
	public void getPaid() {
		System.out.println("Teacher gets paid "+salary);
	}
	
	public abstract void takeExam();
	
}
class MathTeacher extends Teacher {
	
	String subject;
	
	public MathTeacher(String name,String lastName, double salary, String subject) {
		super(name, lastName, salary);
		this.subject=subject;
	}
	
	public void speak() {
		System.out.println(name +" "+lastName+" speaks math language");
	}
	
	public void takeExam() {
		System.out.println(name +" "+lastName+" takes exam on "+subject);
	}
	
	public void hasVacation() {
		System.out.println(name +" "+lastName+" have 30 days vacation");
	}
	
	//overriding teach method
	public void teach() {
		System.out.println(name+" teaches "+subject);
	}
}