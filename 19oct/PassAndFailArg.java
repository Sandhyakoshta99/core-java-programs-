/*
Program :To understand commandline arguments
@author:Sandhya
@date: 19thOct
*/
class PassAndFailArg                            //declaring a class
{
	public static void main(String args [])  //main method
	{
		 float number=Float.parseFloat(args [0]);           //declaring local variables of commandline arguments
		 float number=Float.parseFloat(args [1]);
		 float number=Float.parseFloat(args [2]);
		float sum = number+number1+number2;                 //Calculating sum of two number
		int avg = (number+number1+number2)/3;              // calculating avg
		System.out.println("Sum of two number is : "+sum); // print result
		System.out.println("Avg of two number is : "+avg); // print result
		{
			if(avg>=35)
			{
				System.out.print("pass");
			}
			else
			{
				System.out.println("fail");
			}	
		}
	}
	// end of main method
}	
//end of class  PassAndFailArg