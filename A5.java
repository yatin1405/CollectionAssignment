package com.collectionDemo;

import java.util.HashMap;

public class A5 {
	public static void main(String[] args) {
		HashMap<Integer, String> is = new HashMap<Integer, String>();
		is.put(1, "Miracles");
		is.put(2, "are");
		is.put(3, "endless");
		System.out.println("The collection keys are: "+is.keySet());
		System.out.println("The collection views are: "+is.values());
	}

}
