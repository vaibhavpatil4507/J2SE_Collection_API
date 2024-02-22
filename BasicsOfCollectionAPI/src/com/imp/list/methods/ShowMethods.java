package com.imp.list.methods;

import java.util.ArrayList;
import java.util.List;

public class ShowMethods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(5);
		list.add(100);list.add(200);list.add(300);list.add(100);list.add(200);list.add(400);list.add(500);list.add(200);
	
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add(new Integer(10));
		System.out.println(list);
		
		System.out.println(list.indexOf(100));
		System.out.println(list.lastIndexOf(100));
		
		list.set(1, 800);
		System.out.println(list);
	}
}
