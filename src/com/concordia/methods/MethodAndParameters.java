package com.concordia.methods;

public class MethodAndParameters {

	public static void main(String[] args) {
		getName("George");
		getName("Haley");
		
		addNumbers(45, 55);
	}

//	public static void getName() {
//		System.out.println("Peter Parker");
//	}

	public static void getName(String name) {
		System.out.println(name);
	}

	public static void addNumbers(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}
}
