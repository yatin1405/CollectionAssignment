package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class I5 {
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Hello");
		s1.add("How");
		s1.add("R U ?");
		
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("I");
		s2.add("Am");
		s2.add("Fine");
		
		s1.addAll(s2);
		System.out.println(s1);
	}

}
