package collection.cursor.methods;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerstionDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		v.add(108);
		v.add(109);

		
		Enumeration<Integer> etr=v.elements();
		etr.nextElement();
		etr.asIterator();
		etr.hasMoreElements();
	}
}
