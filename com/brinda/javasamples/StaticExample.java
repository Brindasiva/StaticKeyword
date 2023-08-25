package com.brinda.javasamples;

public class StaticExample {
	
	int a;//non static
	static int b;//static 
	
	static void m1() {
		System.out.println("this is m1 - static method");
	}
	
	
	void m2() {
		System.out.println("this is m2 - Non static method");
	}
	
	//non static method can access everything(static and non static methods and variables)
	void m3() {
		a = 500	;//non static variable
		b = 1000;//static variable
		
		m1();
		m2();
	}
	
	public static void main(String args[])//static method
	{
		//static methods can access only static stuff directly
		
		b = 100;
		System.out.println(b);
		m1();
		
		//a = 200; //not access because it is non static variable.
		//m2();  //not access because it is non static method.
		
		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);
		se.m2();
		
		
		
	}
	
		
			
		
}
	
	

