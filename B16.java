package com.collectionDemo;

import java.util.ArrayList;

public class B16 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		number.add(70);
		System.out.println("Arraylist is : "+number);
		
		System.out.println("First element is: "+number.get(0));
		System.out.println("Second element is: "+number.get(1));
	}

}
