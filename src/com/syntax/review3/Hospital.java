package com.syntax.review3;

import com.syntax.review2.Doctor;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctor d1=new Doctor("Naoual", "Ali", "Cardologyst");
		d1.printInfo(); //can access only public members in different package
		
		System.out.println(d1.name);
		System.out.println(d1.lastName);
		
		Doctor.hospital="ABC Hospital";
		//doctor.treatPatient(); NO PROTECTED
		d1.think();
		//d1.haveCertificate(); cannot access methods from child class
		
	}
} 
