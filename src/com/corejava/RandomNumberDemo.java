package com.corejava;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
		//Print any value in between from  0 to 10000 !
		// classname objcetName = new classname();
		Random r = new Random();
		
		int randomNum = r.nextInt(10000);
		System.out.println(randomNum);

		
		int myNum = r.nextInt(999, 1500);
		System.out.println("myNum is : " + myNum);
	}

}
