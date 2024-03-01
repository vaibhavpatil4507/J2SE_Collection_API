package com.pract.linkdlist;

import java.util.LinkedList;

public class LinkedListStack {

	

	
	//private LinkedList<String> list=new LinkedList<>();    -----Its also valid
	
	private LinkedList<String> list;
	
	
	//default constructor
	public LinkedListStack() {
		
	list=new LinkedList<>();
		
		
	}
	
	Boolean push(String name) {
		list.addLast(name);
		return true;
	}
	
	String pop() {
		
		return list.removeLast();
	}
	
	void printStack() {
		System.out.println(list);
	}
}
