package com.syntax.review2;

public class Doctor {
	
	//instance variables
	String name;
	String lastName;
	String speciality;
	double salary;
	
	//static variable
	static String hospital;
	
	//constructor
	Doctor(String name, String lastName, String speciality, double salary){
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
		this.salary=salary;
	}
	
	//constructor
	Doctor(String name, String lastName, String speciality){
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
	}
	
	void treatPatient(String name) {
		System.out.println("Doctor "+this.name+" treats patient "+name);
	}
	
	void printInfo() {
		System.out.println(name +" "+lastName+ " is a "+speciality);
	}
	
	//instance methods can work with instance and static
	void work() {
		System.out.println(name +" works at hospital "+hospital);
	}
	
	void getPaid() {
		System.out.println(name+" gets paid "+salary);
	}
	
	//static can work only with static
	static void companyName() {
		System.out.println("All doctors work at "+hospital);
	}

}
