package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class I4 {
	public static void main(String[] args) {
		ArrayList<Integer> no = new ArrayList<Integer>();
		no.add(154);
		no.add(231);
		no.add(123);
		no.add(786);
		no.add(896);
		System.out.println("Before swapping: "+no);
		
		Collections.swap(no, 1, 3);
		System.out.println("After swapping: "+no);
		
	}

}
