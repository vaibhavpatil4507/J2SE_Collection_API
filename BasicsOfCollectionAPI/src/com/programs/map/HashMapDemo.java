package com.programs.map;

import java.util.HashMap;

public class HashMapDemo {

	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hs=new HashMap<>();
		hs.put(1, "book");
		hs.put(2, "notebook");
		hs.put(3, "eraser");
		
		
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(101, "vaibhav");
		map.put(35, "raghav");
		map.put(110, "rajendra");
		map.put(50, "prakash");
		
		System.out.println(map);
		
		
		map.putAll(hs);
		System.out.println(map);
		
		System.out.println(map.get(101));
		
		System.out.println(map.containsKey(35));
		
		
		System.out.println(map.containsValue("book"));
		
		System.out.println(map.size());
		
		map.remove(50);
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		
		
		
			}
}
