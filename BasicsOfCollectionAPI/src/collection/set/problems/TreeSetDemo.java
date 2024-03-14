package collection.set.problems;

import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(100);
		t.add(20);
		t.add(50);
		t.add(20);
		System.out.println(t);
		
//		TreeSet:
//			It dont allow duplicate Object.
//			default sorting order is ascending.
		//We can add any type of object but,object need homogeneous and comparable.
		
		
//		TreeSet<Object> t1=new TreeSet<>();
//		t1.add(20);
//		t1.add("ram");
//		t1.add(new Object());
//		t1.add(40.32f);
//		System.out.println(t1);
		//Classcast error will come because it unbale to compare between different type and sorting is impossible
		
		
			
	}
}
