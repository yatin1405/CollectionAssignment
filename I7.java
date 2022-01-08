package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class I7 {
	public static void main(String[] args) {
		HashSet<Integer> no = new HashSet<Integer>();
		no.add(154);
		no.add(135);
		no.add(298);
		no.add(1002);
		no.add(5986);
		System.out.println("Original hashset: "+no);
		
		ArrayList<Integer> al = new ArrayList<Integer>(no);
		System.out.println("Convert arraylist "+al);
	}

}
