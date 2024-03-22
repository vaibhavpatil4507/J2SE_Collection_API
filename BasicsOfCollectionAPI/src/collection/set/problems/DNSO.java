package collection.set.problems;

import java.util.Comparator;
import java.util.TreeSet;

public class DNSO {

	public static void main(String[] args) {

		TreeSet<Book> tree = new TreeSet<>(new MyOwnSortingOrder1());
		tree.add(new Book(12, "The Himalay", "Himalay team", 323f));
		tree.add(new Book(15, "River", "Himalay team", 400f));
		tree.add(new Book(45, "Wanted House", "house team", 1000f));
		tree.add(new Book(10, "The Himalay", "Himalay team", 322.33f));
		tree.add(new Book(12, "The Himalay", "Himalay team", 500f));

		for (Book book : tree) {
			System.out.println(book);
		}
	}

}

class MyOwnSortingOrder1 implements Comparator<Book> {

	// case 1]DNSO with String name

//	@Override
//	public int compare(Book o1, Book o2) {
//		return -o1.getBook_name().compareTo(o2.getBook_name());
//	}

	// case 2]custom sorting if you not satisfy with developer DNSO sorting
//	@Override
//	public int compare(Book o1, Book o2) {
//		if(o1.getBook_id()<=o2.getBook_id()) {
//			return -1;	//ascending order madhe hoil		
//		}
//		else if(o1.getBook_id()>o2.getBook_id()) {
//			return 1;
//		}
//		else {
	// id madhe duplicate asel tr book_name madhe sorting hoil.
//			return o1.getBook_name().compareTo(o2.getBook_name());  
//			//return 0;  //----Duplicate value remove hotil
//		}
//	}

	// case 3]allow duplicate value and DNSO order
	
	@Override
	public int compare(Book o1, Book o2) {
		int t = o1.compareTo(o2);
		if (t != 0) {
			return t;
		} else {
			return -1;
		}

	}
}
