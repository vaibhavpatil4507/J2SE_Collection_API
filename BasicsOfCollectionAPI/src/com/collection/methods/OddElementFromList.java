package com.collection.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddElementFromList {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);list.add(11);list.add(12);list.add(13);list.add(14);list.add(14);
		System.out.println(list);
		
	for(int i=0;i<list.size();i++) {
		Integer element=list.get(i);
		
		if(element%2==1) {
			System.out.println(element);
		}
	}
	}
}
