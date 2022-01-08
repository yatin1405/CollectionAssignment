package com.collectionDemo;

import java.util.ArrayList;

public class A3 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("Color");
		s.add("White");
		s.add("Black");
		s.add("Java");
		s.add("Android");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
	}

}
