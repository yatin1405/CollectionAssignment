package com.collectionDemo;

import java.util.ArrayList;

public class B18 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("Original arraylist:"+num);
		
		num.remove(2);
		System.out.println("New arraylist:     "+num);
	}

}
