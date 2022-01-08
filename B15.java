package com.collectionDemo;

import java.util.ArrayList;

public class B15 {
	public static void main(String[] args) {
		ArrayList<Float> flow = new ArrayList<Float>();
		flow.add(50.3f);
		flow.add(20.3f);
		flow.add(40.36f);
		flow.add(80.97f);
		flow.add(50.78f);
		System.out.println("Original arraylist: "+flow);
		
		flow.add(0, 10.2f);
		System.out.println("New arraylist:      "+flow);
		
	}

}
