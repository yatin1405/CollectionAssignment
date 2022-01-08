package com.collectionDemo;

import java.util.ArrayList;

public class B17 {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Red");
		
		System.out.println("Original arraylist: "+color);
		
		color.set(1, "Orange");
		color.set(3, "Pink");
		System.out.println("New arraylist:      "+color);
	}

}
