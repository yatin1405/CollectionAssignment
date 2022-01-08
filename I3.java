package com.collectionDemo;

import java.util.ArrayList;

public class I3 {
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Black");
		s1.add("White");
		s1.add("Orange");
		s1.add("Blue");
		System.out.println(s1);
		
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Black");
		s2.add("White");
		s2.add("Orange");
		s2.add("Blue");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	}

}
