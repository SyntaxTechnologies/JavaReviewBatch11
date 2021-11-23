package com.syntax.review3;

import com.syntax.review2.Doctor;

public class Dentist extends Doctor {
	
	String certificate;
	String office;

	public Dentist(String name, String lastName, String speciality) {
		super(name,lastName, speciality);
	}
	
	public Dentist(String name, String lastName, String speciality, String certificate, String office) {
		super(name,lastName, speciality);
		this.certificate=certificate;
		this.office=office;
	}
	
	public void haveCertificate() {
		System.out.println(name +" has a dentist certificate");
	}
	
	/*
	 * 2 methods within same class have same name --> overload
	 *  to overload we need (method signature must be different (name & parameters))
	 *  Ways to overload :
	 *  				1. change the number of the parameters
	 *  				2. change type of the parameters
	 */
	public void haveOffice() {
		System.out.println(name +" has 1 office");
	}
	
	public void haveOffice(String state) {
		System.out.println(name +" has a 2nd office in "+state);
	}
	
	public static void main(String[] args) {
		
		Dentist doe=new Dentist("Jack", "Doe", "Dentist");
		doe.printInfo(); //comes from Doctor (parent)
		doe.treatPatient("Jane"); //PROTECTED IA AVAILABLE BECAUSE DENTIST IS A SUBCLASS OF DOCTOR
		//doe.work(); DEFAULT
		//doe.getPaid(); PRIVATE
		doe.think(); // comes from Human (grandparent)
		doe.haveCertificate(); // comes from Dentist (it's own class)
		doe.haveOffice();
		doe.haveOffice("VA");
	}
}
