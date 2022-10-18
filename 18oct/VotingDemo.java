//Program to check whether the given age is eligible for voting



import java.util.*; //package 
class VotingDemo     //declaring a class
{
public static void main(String args[]) //main method 
  {
    Scanner sc=new Scanner(System.in); //creating scanner object
	System.out.println("enter the age");
	int age=sc.nextInt();  //creating variables 
	if(age>18)
	System.out.println("The Age"+age+"is eligible for voting ");
	else
	System.out.println("The Age "+age+"is not eligible for voting ");
	
  } //end main method 
}  //end of a class VotingDemo