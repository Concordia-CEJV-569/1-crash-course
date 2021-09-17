package com.concordia.basics;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, world!");

//		Variables =>

		String firstName = "Peter";
		String lastName = "Parker";

		int age = 25;
		int ageNextYear = 26;

//		System.out.println(ageNextYear);
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");

//		Integer
		int myInt = 100;

//		Byte - small type
		byte myByte = 123; // 128 won't work
		System.out.println("My Byte is: " + myByte);

//		Float
		float myFloat = 3.14f;
		System.out.println("My Float is: " + myFloat);

//		Double
		double myDouble = 23.89;
		System.out.println("My Double is: " + myDouble);

//		Char
		double myChar = 'B';
		System.out.println("My Char is: " + myChar);

//		Boolean
		boolean myBoolean = true;
		System.out.println("My Boolean is: " + myBoolean);
	}

}
