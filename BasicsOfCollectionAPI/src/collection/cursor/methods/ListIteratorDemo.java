package collection.cursor.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(105);

		ListIterator<Integer> str = list.listIterator();

		while (str.hasNext()) {
			System.out.println(str.next());
		}
		System.out.println("----------------------------------------------------");

		while (str.hasPrevious()) {
			System.out.println(str.previous());
		}
		

		System.out.println("----------------------------------------------------");

		str.add(20);
		str.add(45);
		str.add(43);
		str.set(20);

		System.out.println(list);
		}
	}

