package com.syntax.review2;

public class DoctorsOffice {

	public static void main(String[] args) {
		
		Doctor doctor1=new Doctor("John", "Doe", "ENT");
		System.out.println(doctor1.name);
		System.out.println(doctor1.lastName);
		System.out.println(doctor1.speciality);
		System.out.println(doctor1.salary);
		//System.out.println(doctor1.ssn); //CE: The field Doctor.ssn is not visible
		
		doctor1.printInfo();
		doctor1.treatPatient("Hasim");
		doctor1.work();
		//doctor1.getPaid(); CE: The method getPaid() from the type Doctor is not visible

		/*
		 * Doctor doctor2=new Doctor("Jane", "Smith", "Dentist", 200000);
		 * CE: The constructor Doctor(String, String, String, double) is not visible
		 */
	}
}
