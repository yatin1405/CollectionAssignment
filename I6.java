package com.collectionDemo;

import java.util.HashSet;

public class I6 {
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<String>();
		s1.add("Blue");
		s1.add("Black");
		s1.add("White");
		s1.add("Pink");
		System.out.println("Original hashset: "+s1);
		
		String[] s2 = new String[s1.size()];
		s1.toArray(s2);
		for(String element:s2) {
			System.out.println(element);
		}
	}

}
