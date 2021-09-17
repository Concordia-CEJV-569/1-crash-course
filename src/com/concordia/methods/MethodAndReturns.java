package com.concordia.methods;

public class MethodAndReturns {

	public static void main(String[] args) {
		System.out.println("The area is: " + getArea(12, 20));

		System.out.println("Full name is: " + getFullName("Lucifer", "Morningstar"));
	}

	public static int getArea(int width, int height) {
		return width * height;
	}

	public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
