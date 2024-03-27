package com.programs.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo{

	
	public static void main(String[] args) {
		TreeMap<Integer, String> tree=new TreeMap<>(new MyOwnSortingOrder());
		
		
		//Default DNSO is available 11 POJO /modal class
		tree.put(1000, "harish");
		tree.put(20, "girish");
		tree.put(3, "mirish");
		tree.put(400, "varish");
		tree.put(50, "shesh");
		
		System.out.println(tree);
		
	}

	
}

class MyOwnSortingOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
}