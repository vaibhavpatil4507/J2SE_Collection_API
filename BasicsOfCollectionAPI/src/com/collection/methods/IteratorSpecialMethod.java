package com.collection.methods;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class IteratorSpecialMethod {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(100);list.add(201);list.add(300);
		list.add(400);list.add(501);list.add(405);
		
		//using ietrator method how to write elements of list
		
		Iterator<Integer> itr=list.iterator();
		
		
		while(itr.hasNext()) {
			Integer element=itr.next();
			if(element%2==1) {
				itr.remove();
			}
			}	
		
		System.out.println(list);
		}

	}

