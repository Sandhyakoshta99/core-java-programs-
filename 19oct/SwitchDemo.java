/*
Program: wap to print the day according to number using switchcase
@author: Sandhya Koshta
@Date: 19 oct 2022  
*/
import java.util.Scanner;  //import packages 
class SwitchDemo    //declar class
{
	static void printDay(int A)   	// method to print the day
	{	
	   switch(A)      //switch case
	   {
		    case 1:System.out.println("Monday");
		          break;
		    case 2:System.out.println("Tuesday");
		          break;
		    case 3:System.out.println("Wednesday");
		          break;
		    case 4:System.out.println("Thursday");
		          break;
		   default: System.out.println("Wrong input");
		          break;
		    case 5:System.out.println("Friday");
		          break;
		    case 6:System.out.println("Saturday");
		          break;
		    case 7:System.out.println("Sunday"); 		  
	   }     // end of switch
	}    //end of method printDay
	//end of method printDay

	public static void main(String args[])             //main started
	{
		Scanner sc = new Scanner(System.in);             //declar object of scanner 
		
		int day; 		//declar variable
		System.out.println("Enter any number 1 to 7:");
		day= sc.nextInt();
		
		printDay(day);           		//calling method to print day
		    
	}// end of main
}   // end of class 