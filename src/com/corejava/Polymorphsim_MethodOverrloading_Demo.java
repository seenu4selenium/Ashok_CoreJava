package com.corejava;

public class Polymorphsim_MethodOverrloading_Demo {

	public static void mod(int a) {
		a = 90;
		System.out.println("Mod results is: " + (a % 2));
	}

	public static void mod() {
		int a = 90;

		System.out.println("Mod results is: " + (a % 2));
	}

	public static void mod(String b, int a, String c) {
		a = 90;
		System.out.println("Mod results is: " + (a % 2));
	}

	public static void add() {
		int a = 90;
		int b = 90;
		System.out.println("Mod results is: " + (a + b));
	}

}
