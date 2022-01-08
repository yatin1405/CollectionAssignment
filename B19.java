package com.collectionDemo;

import java.util.ArrayList;

public class B19 {
	public static void main(String[] args) {
		ArrayList<Integer> no = new ArrayList<Integer>();
		no.add(101);
		no.add(102);
		no.add(103);
		no.add(104);
		no.add(105);
		System.out.println("Original arraylist: "+no);
		
		if(no.contains(106)) {
			System.out.println("Your element in arraylist");
		}else {
			System.out.println("Your element not in arraylist");
		}
	}

}
