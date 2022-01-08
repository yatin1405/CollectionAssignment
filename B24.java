package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class B24 {
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		str.add("Black");
		str.add("White");
		str.add("Pink");
		str.add("Blue");
		str.add("Jeans");
		str.add("Java");
		str.add("Hello!");
		
		Iterator<String> p = str.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}

}
