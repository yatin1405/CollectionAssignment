package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

import javax.print.attribute.standard.Copies;

public class B21 {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<String>();
		n.add("a");
		n.add("b");
		n.add("c");
		n.add("d");
		n.add("e");
		System.out.println("Before copy: "+n);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println("Before copy: "+str);
		
		
		Collections.copy(n, str);
		System.out.println("After copy: "+n);
	}

}
