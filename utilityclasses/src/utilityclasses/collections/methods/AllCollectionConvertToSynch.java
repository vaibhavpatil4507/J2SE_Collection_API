package utilityclasses.collections.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AllCollectionConvertToSynch {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(100);list.add(200);list.add(300);list.add(400);
		
		System.out.println(list);
		List<Integer> list1=Collections.synchronizedList(list);
		//now list is thread safe but performance is low because of synchronization.
		System.out.println(list1);
		
		HashSet<Float> hashset=new HashSet<>();
		hashset.add(10f); hashset.add(20f);hashset.add(30f);hashset.add(40f);
	}
}
