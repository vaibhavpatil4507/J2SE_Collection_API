package com.programs.map;

import java.util.HashMap;
import java.util.Map;

public class StudentController {

	public static void main(String[] args) {
		
		Map<Integer, Student> map=new HashMap<>();
		map.put(1,new Student(1,"radhika",40.50));
		map.put(2, new Student(2,"sham",90.00));
		map.put(3, new Student(3,"gopika",95.00));
		//System.out.println(map.put(2, new Student(2,"sham",90.00)));
		
		System.out.println(map);

	}
}
