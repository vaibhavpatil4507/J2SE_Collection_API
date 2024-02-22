package com.collection.methods;

import java.util.ArrayList;
import java.util.LinkedList;

public class Add {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Before add size :-"+list.size());
		System.out.println("Before add checking:-"+list.isEmpty());
		
		System.out.println(list.add(10));
		System.out.println(list.add(20));
		System.out.println(list.add(30));
		System.out.println(list.add(40));
		
		System.out.println(list);
		System.out.println("After add size :-"+list.size());
		System.out.println("After add checking :-"+list.isEmpty());
		
		
		
		
		//---------------------------------AddAll(collection c)--------------------------
		
System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Before add size :-"+list.size());
		System.out.println("Before add checking:-"+list.isEmpty());
		
		LinkedList<Integer> list2=new LinkedList<>();
		list2.add(40);list2.add(50);list2.add(60);list2.add(50);
		System.out.println(list.addAll(list2));
		
		
		System.out.println(list);
		System.out.println("After add size :-"+list.size());
		System.out.println("After add checking :-"+list.isEmpty());



	}
}
