package com.imp.list.methods;

import java.util.ArrayList;
import java.util.List;

public class CopyCount {
	
	
	static List<OutPutFormat> list1=new ArrayList<>();
	
	
	public static void isExit(Integer ele) {
		
		boolean flag=true;
		for( OutPutFormat outputObj:list1) {
			Integer count=outputObj.getCount();
			count++;
			outputObj.setCount(count);
			break;
		}
		
	
	if(!flag) {
		
		list1.add(new OutPutFormat(ele,1));
	}
	
	}
	

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		
		list.add(100);list.add(200);list.add(300);list.add(200);
		list.add(200);list.add(100);list.add(100);list.add(300);
			
		//System.out.println(list);
		
		
		
		for(Integer ele:list) {
			isExit(ele);
		}
	}
}
