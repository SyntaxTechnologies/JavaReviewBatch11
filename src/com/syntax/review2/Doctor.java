package com.syntax.review2;

public class Doctor extends Human {

	// instance variables
	public String name;
	public String lastName;
	protected String speciality;
	double salary;
	private long ssn; // visible only within same class

	// static variable
	public static String hospital;

	// constructor
	public Doctor(String name, String lastName, String speciality) {
		this.name = name;
		this.lastName = lastName;
		this.speciality = speciality;
	}

	// constructor
	private Doctor(String name, String lastName, String speciality, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.speciality = speciality;
		this.salary = salary;
	}

	protected void treatPatient(String name) { //AVAILABLE INSIDE SAME PACKAGE AND TO DIFFERENT PACKAGE ONLY THROUGH INHERITANCE
		System.out.println("Doctor " + this.name + " treats patient " + name);
	}

	public void printInfo() { //AVAILABLE THROUGH THE ENTIRE PROJECT
		System.out.println(name + " " + lastName + " is a " + speciality);
	}

	// instance methods can work with instance and static
	void work() { //AVAILABLE TO CLASSES INSIDE SAME PACKAGE ONLY
		System.out.println(name + " works at hospital " + hospital);
	}

	private void getPaid() { //AVAILABLE ONLY TO IT'S OWN CLASS
		System.out.println(name + " gets paid " + salary);
	}

	// static can work only with static
	static void companyName() {
		System.out.println("All doctors work at " + hospital);
	}

}

/*
 * 
 */

/*
 * to define a variable we need
 * 
 * 
 * OPTIONAL MUST MUST non access modifier dataType name
 * 
 */

/*
 * to define a method we need
 * 
 * OPTIONAL OPTIONAL MUST MUST access modifier non access modifier returnType
 * name ()
 * 
 */
