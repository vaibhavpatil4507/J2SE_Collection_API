package collection.set.problems;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>(new MyOwnSortingOrder());
		ts.add(100);
		ts.add(20);
		ts.add(40);
		ts.add(50);
		ts.add(35);

		
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}
}

class MyOwnSortingOrder implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		//return -1*o1.compareTo(o2);
		
	       if(o1<o2) {
	    	   return 1;
	       }else if(o1>o2) {
	    	   return -1;
	       }return 0;

	}
}
