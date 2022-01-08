package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class B20 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(101);
		num.add(280);
		num.add(30);
		num.add(60);
		num.add(100);
		num.add(99);
		Collections.sort(num);	
		System.out.println(num);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("White");
		str.add("Orange");
		str.add("Banana");
		str.add("Blue");
		str.add("Black");
		Collections.sort(str);
		System.out.println(str);
	}

}
