/*
Program:To understand NestedDemo1 : WAP to print pass and fail according to the marks
@auther: Sandhya koshta 
@Date: 19 oct 2022  
*/
import java.util.Scanner;    //import packages 

class NestedIfDemo2  //declaring a class
{
	public static void main(String args[])   //main started
	{
	
		Scanner sc = new Scanner(System.in);  //declaring the object of scanner
		int age;       //declaring variables
		float weight;
		char gender;
		System.out.println("Enter your age:");   //taking input
		age= sc.nextInt();
		if(age>=18)  //checking age criteria
		{
			System.out.println("Enter your gender(m/f):");   //taking input
		    gender= sc.next().charAt(0);
			
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();

			if(gender=='m')    //checking weight criteria
			{
				if(weight>=60)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight... Please start healthy eating habits");
					
			}
			else
			{
				if(weight>=50)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight... Please start healthy eating habits");
				
			}//end of nested ifelse
			
		}
		else
			System.out.println("You are too young to donate blood... Please wait!" );
		//end of outer ifelse
	}    // end of main
}
// end of class 
