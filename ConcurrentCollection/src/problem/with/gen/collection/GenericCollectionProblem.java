package problem.with.gen.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollectionProblem {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400); //Here main thread adding data into list

		Iterator<Integer> itr = list.iterator();
		//Iterator create one new thread for its work,
		//now,new itrator created new thread doing reading data using using its functionality
		
		
		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.println(list.add(500));
			
//Currently here two threads trying to do work concurrently which is not possible in this collection api,
//except vector and hashable,So here ConcurrentModificationException will occur.			
			
			System.out.println(value);
		}
	}
}
