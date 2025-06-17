package com.corejava;

public class StringsDemo {

	public static void main(String[] args) {
//		String a;
//		a = "Ashok";

		String a = "Ashok";
		String b = "SeleNium";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + "," + b);

		// length
		System.out.println(a.length());
		// index
		System.out.println(a.charAt(2));

		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());

		String f = "Ashok";
		String g = "ASHok";
		// f,g Both are equal?
		if (f.equals(g)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are NOT equal");
		}

		System.out.println("###############################");

		if (f.equalsIgnoreCase(g)) {
			System.out.println("Both are equal****");
		} else {
			System.out.println("Both are NOT equal****");
		}
		// Verify Ashok word is there in the string?
		String h = "Hi Ashok garu, How are you?";
		if (h.contains("ashok")) {
			System.out.println("Ashok text is available in the String");
		} else {
			System.out.println("Ashok text is NOT available in the String");
		}

	}

}
