package com.corejava;

public class CalculatorDemo extends InheritanceDemo1 {
	public static void mod() {
		int a = 90;		
		System.out.println("Mod results is: " + (a%2));
	}

	public static void main(String[] args) {
		sub();
		add();
		div();
		mul();
	}

}
