import java.util.Scanner; //importing util package for Scanner class
class ScannerDemo  //declaring a class 
   {
 public static void main(String args[])  //main method
 {  
 
  //declaring and initializing local variables
 int number1=10;         
	int number2=10;      
	int number3=7;       
	int sum=number1+number2+number3;
	int avg=sum/3;   
 Scanner sc=new Scanner(System.in);   //create object of scanner class	

	System.out.println(avg);   //printing tha value of variable

	} //end of main
} //end of class ScannerDemo
	