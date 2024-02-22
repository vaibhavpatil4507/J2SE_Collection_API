package com.collection.methods;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);list.add(12);list.add(13);list.add(14);list.add(15);list.add(16);
		
		System.out.println(list);
		System.out.println(list.get(2));//we know internally arrayList is like array so we have to find using index then must use get method and pass the index
		
		Object[] array=list.toArray();
		for(Integer i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
