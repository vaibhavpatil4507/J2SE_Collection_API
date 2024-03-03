
package collection.set.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(20);
		hs.add(21);
		hs.add(22);
		hs.add(23);
		hs.add(24);
		hs.add(25);
		hs.add(20);//
		System.out.println(hs.add(21));//these are not allow bcaz hs not allow duplicate object.inernally allowed but overriding happen
		hs.add(30);

		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//default capacity is 16
		//but upto fill ratio data is filled then new capacity will generate i,e like,
		//default fill ratio is 0.75%       ...it is betwn ->0 to 1
		//new capacity=current capacity*2;
		//				16*2;
		
		
		
		//Construcotrs
		
		//1]		HashSet<Integer> hs=new HashSet<>();  default cap:16
		
		
		//2]
		
		HashSet<?> hs1=new HashSet<>(100);
		//75 non duplicates if added then capacity will double.
		
		//3]custom fill ratio
		
		HashSet<?> hs2=new HashSet<>(50,0.5f);
		
		
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(200);
		list.add(300);
		//4]dancing constructor
		HashSet<Integer> hs3=new HashSet<>(list);
		System.out.println(hs3);


	}
}

