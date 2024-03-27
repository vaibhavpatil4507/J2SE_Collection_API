package methods.cocurrentmap.concolls;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapMethods {

	public static void main(String[] args) {
		ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
		System.out.println(map.put("A", 10));
		System.out.println(map);
		System.out.println(map.put("A", 100));
		System.out.println(map);
		
		// When we use Object put(x,y) method,
		// firstly add one object it return null and add that object. &
		// Second time when we add value then it return old value and add new value.
		System.out.println("_______________________________________________________________________");

		System.out.println(map.putIfAbsent("B", 10));
		System.out.println(map);
		System.out.println(map.putIfAbsent("B", 100));
		System.out.println(map);
		
		//when we use Object putIfAbsent(x,y) method,
		//firstly add one object and return null and add that object. &
		//second time when we add value then it return old value but don't add that value
		System.out.println("_______________________________________________________________________");

		
		
		//Boolean remove(k,y)
		map.remove("B",10);//Here,we need to pass perfect value of key and value until they can not remove the object
		System.out.println(map);
		System.out.println("_______________________________________________________________________");

		//replace
		map.replace("A", 500);
		map.replace("A", 500, 1000);
		System.out.println(map);
		System.out.println("_______________________________________________________________________");

		
		
	}
}
