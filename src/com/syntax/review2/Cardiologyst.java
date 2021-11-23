package com.syntax.review2;

public class Cardiologyst extends Doctor{
	
	public Cardiologyst(String name, String lastName, String speciality) {
		super(name,lastName, speciality);
	}
	
	public static void main(String[] args) {
		
		Cardiologyst smith=new Cardiologyst("John", "Smith", "Cardiologyst");
		smith.printInfo();
		smith.treatPatient("Jack");
		smith.work();
		//smith.getPaid(); PRIVATE DON'T PARTICIPATE IN THE INHERITANCE
		smith.think();
		//smith.haveCertificate(); cannot have an access to the method from other child class
	}
}
			