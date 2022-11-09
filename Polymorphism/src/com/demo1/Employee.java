package com.demo1;
public class Employee{
	 int eID=0;
	 String eName=null; 
	 double eSalary=0.0d;
	 
	void enterEmpDetails(int id,String name,double sal) {
		System.out.println("In method 1");
		eID=id;
		eName=name;
		eSalary=sal;
		
	}
	//..............Method to enter employee details...................
	void enterEmpDetails(int id,String name) {
		System.out.println("In method 2");
		eID=id;
		eName=name;
		
	}
	//..........Method to enter employee details.............
	void printEmpDetails() {
		System.out.println("Employee ID: "+eID);
		System.out.println("Employee Name :"+eName);
	}
	
	
	

	
}