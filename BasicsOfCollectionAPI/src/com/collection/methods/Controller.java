package com.collection.methods;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		Integer c=10;
		Object b=null;
		String d="harry";
		Boolean e=true;
		
		a.add(c);
		System.out.println(a);
		System.out.println(a.add(b));
		System.out.println(a.add(d));
		System.out.println(a.add(e));
		System.out.println(a);

System.out.println("---------------------------------------------------------------------------------------");
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//list.add("akash");The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		//add(Object o) returns boolean value;
		
		System.out.println(list);
		System.out.println(list.add(50));
		
System.out.println("---------------------------------------------------------------------------------------");

		List<String> l=new ArrayList<String>();
		l.add("akash");
		l.add("pradip");
		l.add("Omkar");
		l.add("akash");
		l.add("akash");
		System.out.println(l);
		
		//List interface is child interface of collection interface and it have follows features:-
		//it can store duplicate values
		//It must preserve insertion order
		//use is searching element very easily through object
		
		System.out.println("---------------------------------------------------------------------------------------");

		ArrayList<Integer> l1=new ArrayList<>();
	
		


	}
}
