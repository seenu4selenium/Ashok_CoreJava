package com.corejava;

public class VariablesDemo {
//	 Global Variable
	public static int a = 50;
	public static int b = 40;

	public static void add() {
//		Local Variable
		//int a = 20;
		int b = 10;
		System.out.println("Add results is: " + (a + b));
	}
	public static void sub() {
//		Local Variable
		//int a = 100;
		//int b = 60;
		System.out.println("Sub results is: " + (a - b));
	}
	
	public static void main(String[] args) {
		add();
		sub();
	}
}
