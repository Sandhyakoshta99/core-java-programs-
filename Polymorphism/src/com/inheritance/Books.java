package com.inheritance;

public class Books {
	private  int book_id;
	private String book_name,author_name;
	private float price;
	public Books() {
		super();
		this.book_id = 101;
		this.book_name = "Ponniyan Selvan";
		this.author_name = "Kalki";
		this.price = 2400f;
		
	}
	public void display()
	{
	System.out.println("ID :"+ book_id+"\nName :"+book_name+"\nAuthor :"+author_name+"\nPrice :"+ price);
	}
}