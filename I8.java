package com.collectionDemo;

import java.util.HashMap;

public class I8 {
	public static void main(String[] args) {
		HashMap<Integer, String> has = new HashMap<Integer, String>();
		has.put(1, "Hello");
		has.put(2, "How");
		has.put(3, "R U");
		System.out.println(has);
		System.out.println(has.isEmpty());
		
		has.clear();
		System.out.println(has);
		System.out.println(has.isEmpty());
	}

}
