package com.imp.list.methods;

import java.util.ArrayList;
import java.util.List;

public class LoopFormatForPrint {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(100);list.add(200);list.add(300);
		list.add(400);list.add(500);list.add(600);
		
		
		//1]for loop:
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//2]while
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		//3]do-while
		int i1=0;
		do {
			System.out.println(list.get(i1));
			i1++;
		}while(i1<list.size());
		
		
		//4]forEach
		for(Integer obj:list) {
			System.out.println(obj);
		}
		
	}
}
