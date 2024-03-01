package collection.cursor.methods;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(105);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer element = itr.next();
			if (element % 2 == 1) {
				itr.remove();
			}

		}

		System.out.println(list);
	
		}
	}

//Iterator is universal cursor
//it has three methods 1]hasNext() 2]next() 3]remove()