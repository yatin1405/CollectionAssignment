package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class I1 {
	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		System.out.println(in);
		
		Collections.reverse(in);
		System.out.println(in);
	}

}
