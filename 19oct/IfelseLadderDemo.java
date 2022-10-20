/*
Program: WAP to print the grade according to the percentage
@author:Sandhya 
@Date: 19 oct 2022  
*/
import java.util.Scanner;          //import util packages for Scanner class
class IfelseLadderDemo               // declaring a class
{
	public static void main(String args[])   //main mathod start
	{
	Scanner sc = new Scanner(System.in);   //declaring object of Scanner class
	int n1,n2,n3,n4;                           //declaring a variables

	System.out.println("Enter the 1st number  : ");    //taking input
	n1 = sc.nextInt();
	System.out.println("Enter the 2nd number  : ");
	n2 = sc.nextInt();
	System.out.println("Enter the 3rd number  : ");
	n3 = sc.nextInt();
	
	if((n1>n2)&&(n1>n3))        //cheaking greater number 
		{
			System.out.println("the greater number is   :"+n1);
		}
		else if(n2>n3)
		{
			System.out.println("The greater number is   :"+n2);
			
		}
	else
		{
			System.out.println("The greater number is   :"+n3);
		}
	}// End of main method
}// end of class  IfelseLadderDemo    