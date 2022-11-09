package com.demo1;

public class Calculation {

	public void add(int a) {
		a++;
		System.out.println(a);
	}
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	public void add(char ch) {
	
		System.out.println((int)ch);
	}
	public void add(float x,float y) {
		
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.add(9);
		cal.add(9,15);
		cal.add(5);
		cal.add(6.6f,0.9f);
		
	}

}
