/*
Program :To understand NestedDemo :WAP to printto donate blood if or not 
@author:Sandhya koshta
@date: 19thOct
*/
import java.util.Scanner; //import packages
class NestedDemo  //main class
{
 public static void main(String args[]) //main string
 {  
    Scanner sc=new Scanner(System.in); //declaring the obj of scanner class 
	int age;       //declaring variables
	float weight;
	          //taking input
	 System.out.println("Enter Your age:");
	 age=sc.nextInt();
	         
		if(age>=18)    //checking age criteria
		{
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(weight>=50)
				System.out.println("You can donate the blood....");
		    else
				System.out.println("You are underweight... Please start healthy eating habits");
			//end of nested ifelse
			
		}
		else
			System.out.println("You are too young to donate blood... " );
		//end of outer ifelse	
	 }//end main String
}//end of class NestedDemo