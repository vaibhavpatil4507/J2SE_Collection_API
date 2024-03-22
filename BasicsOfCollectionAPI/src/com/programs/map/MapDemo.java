package com.programs.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "ram");
		map.put(2,"laxman");
		map.put(3, "Sita");
		map.put(4, "Ravan");
		
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("krisna"));
		
		System.out.println(map.get(2));
		
		System.out.println(map.remove(4));
		System.out.println(map);
		
		
		
		
	}
}
