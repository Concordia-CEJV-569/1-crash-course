package com.concordia.operators;

public class BasicOperators {

	public static void main(String[] args) {

//		1) Addition, Subtraction, Multiplication and Division

		int num1 = 34;
		int num2 = 3;

		System.out.println("Sum is: " + (num1 + num2));
		System.out.println("Difference is: " + (num1 - num2));
		System.out.println("Multiplication is: " + (num1 * num2));
		System.out.println("Division is: " + (num1 / num2) + "\n");

		double num1D = 34;
		double num2D = 3;

		System.out.println("Sum is: " + (num1D + num2D));
		System.out.println("Difference is: " + (num1D - num2D));
		System.out.println("Multiplication is: " + (num1D * num2D));
		System.out.println("Division is: " + (num1D / num2D) + "\n");

		// Remainder
		System.out.println("Remainder is: " + (num1 % num2) + "\n");
		
		double result = num1D % num2D;

		System.out.println("The remainder is: " + result);
	}

}
