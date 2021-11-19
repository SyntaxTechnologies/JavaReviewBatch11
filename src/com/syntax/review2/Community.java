package com.syntax.review2;

public class Community {
	
	public static void main(String[] args) {
		
		House house1=new House();
		house1.area=2000;
		house1.color="grey";
		house1.rooms=4;
		house1.clean();
		
		//house1.watch();
		// CE: The method watch() is undefined for the type House
		
		// house1.bathroom=2; 
		//--> CE: bathroom cannot be resolved or is not a field
		
		House house2=new House();
		house2.area=2000;
		house2.color="grey";
		house2.rooms=4;
		
	
		
	}
}
