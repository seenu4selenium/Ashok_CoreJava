package com.corejava;

public class LoopingStatmentsDemo {

	public static void main(String[] args) {
		// for(initialize the variable; condition;increment/decrement of variable){}
		// print 1 to 10 numbers
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("*****************************");
		// from 20 to 8 have to print?
		for (int j = 20; j >= 10; j--) {
			System.out.println(j);
		}

		System.out.println("*****************************");
		int k = 1;
		while (k <= 5) {
			System.out.println(k);
			k++;
		}

		System.out.println("*****************************");

		int m = 25;
		do {
			System.out.println(m);
			m++;
		} while (m <= 10);

		// nested for loop: Loop with in the loop
		for (int j = 20; j >= 10; j--) {
			for (int n = 20; n >= 10; n--) {
				System.out.println(n);
			}
		}

		// for each loop / advance for loop / Enhanced for loop
		int d[] = { 2324, 454, 97897, 64, 4, 646, 4, 567 };
		System.out.println("Array length is: " + d.length);

		for (int i : d) {
			System.out.println(i);
		}
		System.out.println("*****************************");
		for (int s = 0; s < d.length; s++) {
			System.out.println(d[s]);
		}

	}

}
