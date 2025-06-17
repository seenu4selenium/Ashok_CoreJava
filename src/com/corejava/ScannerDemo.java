package com.corejava;

import java.util.Scanner;

public class ScannerDemo {
	
	public static Scanner s  = new Scanner(System.in);
	
	public static int a ;//0
	public static int b ;//0

	public static void add() {
		System.out.println("Add results is: " + (a + b));
	}

	public static void sub() {
		System.out.println("Sub results is: " + (a - b));
	}

	public static void main(String[] args) {
		a = s.nextInt();
		b = s.nextInt();
		add();
		sub();
	}

}//class end
