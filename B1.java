package com.collectionDemo;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B1 {
	public static void main(String[] args) {
		
		/* Initialization with add()
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Yatin");
		str.add("For");
		System.out.println(str);
		*/
		
		
		/* Initialization with asList()
		
		ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(20,30,40,50,60,70));
		System.out.println("ArrayList: "+obj);
		*/
		
		
		/* Initialization with List.of() Method
		
		ArrayList<Double> sc = new ArrayList<Double>(List.of(10.2,25.3,89.5,12.3));
		System.out.println(sc);
		*/
		
		
		/* Initialization using another Collection
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("jay");
		str.add("Yatin");
		str.add("yash");
		
		ArrayList<String> str2 = new ArrayList<String>(str);
		System.out.println(str2);
		*/
	}

}
