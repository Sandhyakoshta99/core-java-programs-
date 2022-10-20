/*
Program: WAP to print the grade according to the percentage
@author: Sandhya 
@Date: 19 oct 2022  
*/
import java.util.Scanner;                  //import packages of Scanner
class GradSystemDemo                        //declar class
{
	public static void main(String args[])   //main method
	{
		Scanner sc = new Scanner(System.in);  //declar object of scanner
        float percentage;                    //declar variables
		char grade;
		System.out.println("Enter the percentage....:");     //taking input 
		percentage= sc.nextFloat();                 //check percentage and calculate grade
			if(percentage>=85)
	     	 grade='A';
				else if(percentage>=70)
				grade='B';
					else if(percentage>=65)
						grade='C';
						else if(percentage>=45)
                           grade='D';
                           else
                             grade='F';
                                                              //end of ifelse					 	   		
        if(grade=='F') // compare
	      System.out.println("Sorry   You have failed... ");
		else
            System.out.println("You have cleared the exam with grade:"+grade);		   
		    
	}// end of main
		
}// end of class  GradSystemDemo  
 