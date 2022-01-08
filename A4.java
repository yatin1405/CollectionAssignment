package com.collectionDemo;

import java.util.HashSet;

public class A4 {
	public static void main(String[] args) {
		HashSet<String> fhs = new HashSet<String>();
		fhs.add("Mine");
		fhs.add("Name");
		fhs.add("is");
		fhs.add("Yatin");
		fhs.add("Gojariya");
		System.out.println("First hashset: "+fhs);
		
		HashSet<String> she = new HashSet<String>();
		she.add("My");
		she.add("Name");
		she.add("is");
		she.add("Jay");
		she.add("Khanapara");
		System.out.println("First hashset: "+she);
		fhs.retainAll(she);
		System.out.println(fhs);
	}
}
