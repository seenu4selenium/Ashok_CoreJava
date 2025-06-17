package com.corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTheSystemTimeStampDemo {

	public static void main(String[] args) {
		// Object creation for DATE class
		// classname objcetName = new classname();

		Date d = new Date();
		System.out.println(d);
		// Thu Jun 12 20:52:13 MDT 2025

		// yyyyMMMdd_HHmmss
		DateFormat df = new SimpleDateFormat("yyyyMMMddHHmmss");
		String timestamp = df.format(d);
		System.out.println(timestamp);

		System.out.println("Ashok" + timestamp + "@gmail.com");
		// Ashok2025Jun12205852@gmail.com
		// Ashok2025Jun12205906@gmail.com
		// Ashok2025Jun12205916@gmail.com
		//Ashok2025Jun12205948@gmail.com
		//Ashok2025Jun12210002@gmail.com


	}

}
