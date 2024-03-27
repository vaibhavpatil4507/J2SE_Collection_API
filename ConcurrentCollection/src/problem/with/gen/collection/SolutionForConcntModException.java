package problem.with.gen.collection;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolutionForConcntModException {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(100);vector.add(200);vector.add(300);vector.add(400);
		
		Iterator<Integer> itr=vector.iterator();
		
		while(itr.hasNext()) {
			Integer value=itr.next();
			System.out.println(vector.add(500));
			System.out.println(value);
			
			
			
			
//			CopyOnWriteArrayList<Integer> vector=new CopyOnWriteArrayList<>();
//			vector.add(100);vector.add(200);vector.add(300);vector.add(400);
//			
//			Iterator<Integer> itr=vector.iterator();
//			
//			while(itr.hasNext()) {
//				Integer value=itr.next();
//				System.out.println(vector.add(500));
//				System.out.println(value);
		}
	}
}
