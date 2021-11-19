package com.syntax.review2;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctor.hospital="Inova";
		
		Doctor doctor1=new Doctor("John", "Smith", "Dentist", 200000 );
		doctor1.printInfo();
		doctor1.work();
	
		Doctor doctor2=new Doctor("Jane", "Doe", "Cardiologyst");
		doctor2.work();
		doctor2.lastName="Bond";
		// change will affect all instances
		doctor2.hospital="JW Hospital";
		
		System.out.println();
		doctor2.work();
		doctor1.work();
		System.out.println(doctor1.lastName);
		System.out.println(doctor2.lastName);
		
		//accessing static method
		Doctor.companyName();
		
		doctor1.treatPatient("James");
		doctor2.treatPatient("Anna");
		
	}
}
