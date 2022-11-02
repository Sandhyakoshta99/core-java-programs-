package com.student;
            //........Declaring a class............
public class StudentTest {
 
	//................main method...............
	public static void main(String args[])
	{
		//..................Tight coupling.......................
		//...............creating a Student class object.............
		Student s1 =new Student(101,"Sandhya",87.09f);       
		Student s2=new Student(102,"Shikha",07.09f);
		Student s3=new Student(103,"riya",98.88f);
		
		//...............copy the values...............
		Student s5 =new Student();
		s5=s3;
		
		//..................Loose coupling.......................
		Student s4=new Student();
			s4.setId( 104 );
			s4.setStName("Deepti  ");
			s4.setMarks(55.89f );
	//..............to print details............
	  System.out.println(s2);
	  System.out.println(s3);
	  System.out.println(s5);
	  
	
	 
	  System.out.print(" Student ID :"+s4.getId());
	  System.out.print(" Student name :"+s4.getStName());			
	  System.out.print(" Student Makrs :"+s4.getMarks());			
	}//..................end of main................
}            //..................end of class
