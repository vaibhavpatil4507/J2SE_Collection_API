package com.collection.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ContainsAndContainsAll {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);list.add(12);list.add(13);list.add(14);list.add(15);list.add(16);
		
		System.out.println(list);
		System.out.println(list.contains(12));
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		
		System.out.println(list.addAll(v));
		System.out.println(list);
		System.out.println(list.containsAll(v));
		
	}
}
