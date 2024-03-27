package utilityclasses.arrays.methods;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {
public static void main(String[] args) {
	
	Integer[] arr= {21,32,42,42,11};
	
	List<Integer> list=Arrays.asList(arr);
	System.out.println(list);
	
	//list.add(10); unsupportedoperation exception will come.
	
	//Only read operation you can do here.
}
	
}
