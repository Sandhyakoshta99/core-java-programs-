//Java Program to check whether the given number is positive or negative


import java.util.*;
class PositiveNegative
{
 public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in); 
	int number;     //Number declaration
	System.out.println("Enter the number:");
	number=sc.nextInt();   //Number Initialization
	if(number>0)
	System.out.println("The number is positive");
 else
      	System.out.println("The number is negative");
	if(number<0)	
	{  
	  	System.out.println("The number is negative");
	}
	else 
		System.out.println("The number is positive");
   }
}
	