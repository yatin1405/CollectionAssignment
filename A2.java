package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class A2 {
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(523);
		n.add(23);
		n.add(123);
		n.add(596);
		System.out.println(n);
		n.set(1, 899);
		System.out.println(n);
	}

}
