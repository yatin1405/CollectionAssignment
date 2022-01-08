package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class I2 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(500);
		num.add(590);
		num.add(508);
		num.add(423);
		num.add(785);
		num.add(1023);
		System.out.println("Original arraylist: "+num);
		
		System.out.println("New arraylist:      "+num.subList(4, 6));
	}

}
