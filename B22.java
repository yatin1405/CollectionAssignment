package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class B22 {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Pink");
		color.add("Black");
		color.add("Orange");
		color.add("Blue");
		color.add("Radium");
		System.out.println("Before shuffling :"+color);
		
		Collections.shuffle(color);
		System.out.println("After shuffling: "+color);
	}

}
