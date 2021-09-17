package com.concordia.operators;

public class ConditionalProgramming {

	public static void main(String[] args) {
		double num1 = 34;
		double num2 = 3;
		double result = num1 % num2;

		if (num1 != num2) {
			System.out.println("The remainder is: " + result);
		} else {
			System.out.println("WOW");
		}
	}

}
