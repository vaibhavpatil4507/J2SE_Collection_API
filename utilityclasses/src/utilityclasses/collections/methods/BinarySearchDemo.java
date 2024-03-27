package utilityclasses.collections.methods;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(50);
		list.add(32);
		list.add(12);
		list.add(31);
		list.add(5);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		//If we don't take sorted list then answer will come always in minus
		System.out.println(Collections.binarySearch(list, 50));
		
		int index=Collections.binarySearch(list,5);
		System.out.println(index);
		
		
		int index1=Collections.binarySearch(list, 50, (x,y)->y.compareTo(x));
		System.out.println(index1);

	}
}
