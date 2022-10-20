/* writhe a program to print pass and fail 
@auther : Sandhya koshta
@Date: 19oct
*/
import java.util.Scanner; //import util packages from scanner class
class PassAndFail   //main class
{
 public static void main(String args[]) //main string
 {  
    Scanner sc=new Scanner(System.in); //declaring the obj of scanner class 
    float marks1; //
	System.out.println("enter the marks1:");
	marks1=sc.nextFloat();
	float marks2;
	System.out.println("enter the marks2:");
	marks2=sc.nextFloat();
    float marks3;
	System.out.println("enter the marks3:");
	marks3=sc.nextFloat();
	
	float percentage=((marks1+marks2+marks3)/300)*100;
	

    if(percentage>=40)      //condition apply for cheak pass & fail
		System.out.println("congratulation your pass:");
	else
		System.out.println("sorry you are fail:");
	}// end of main mathod
}//end of class PassAndFail
	