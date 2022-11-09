package com.inheritance;

public class PaperBook extends Books {
	int shipping_charges=10;
	void print() 
	{
		display();
		System.out.println("Shipping Charges :"+shipping_charges);
	}
	public static void main(String args[])
	{
		PaperBook ob=new PaperBook();
		ob.print();		
	}
}
