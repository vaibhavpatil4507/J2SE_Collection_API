package com.pract.linkdlist;

import java.util.LinkedList;

public class MyQueue {

	private LinkedList<String> list1;
	
	public MyQueue() {
		list1=new LinkedList<>();
	}
	
	
	Boolean push(String name) {	
		list1.addLast(name);
		return true;
	}
	
	String fpop() {
		return list1.removeFirst();
	}
	
	void printMyQueue() {
		System.out.println(list1);
	}
}
