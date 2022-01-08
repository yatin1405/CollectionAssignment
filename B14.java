package com.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class B14 {
	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		System.out.println("By using arraylist: "+in);
		for(int i=0;i<in.size();i++) {
			System.out.print(in.get(i));
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("by using foreach loop");
		for (Integer integer : in) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
		System.out.println("By using iterator");		
		ListIterator<Integer> iterate = in.listIterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+" ");
		}
	}

}
