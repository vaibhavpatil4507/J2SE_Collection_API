package utilityclasses.collections.methods;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(39);
		list.add(33);
		list.add(56);
		list.add(339);
		list.add(55);
		list.add(76);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, (x,y)->x.compareTo(y));

		
	}
}
