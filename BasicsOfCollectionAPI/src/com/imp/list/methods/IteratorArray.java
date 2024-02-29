package com.imp.list.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorArray {

	public static void isExist(Object obj) {

		
		
	}

	
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(200);
		list.add(300);
		list.add(100);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			Object element = itr.next();
			isExist(element);
		}

		
		
		
		List<CopyCountUsingIterator> list1=new ArrayList<>();
		
		
	}

}
