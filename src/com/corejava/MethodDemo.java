package com.corejava;

public class MethodDemo {
	// Customized method
	public static void add() {
		int a = 90;
		int b = 80;
		System.out.println("Add results is: "+(a + b));
	}
	public static void sub() {
		int a = 90;
		int b = 80;
		System.out.println("Sub results is: "+(a - b));
	}
	

	public static void main(String[] args) {
		System.out.println("i am Main method");
		//method calling
		add();
		sub();
	}

}
