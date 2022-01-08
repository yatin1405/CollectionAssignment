package com.collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class B26 {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(0, "Hello");
		hmap.put(1, "How");
		hmap.put(2, "R U?");
		
		for(Map.Entry map4 : hmap.entrySet()) {
			System.out.println(map4.getKey()+" "+map4.getValue());
		}
	}

}
