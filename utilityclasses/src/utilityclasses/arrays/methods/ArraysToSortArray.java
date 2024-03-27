package utilityclasses.arrays.methods;

import java.util.Arrays;

public class ArraysToSortArray {

	
	public static void main(String[] args) {
		
		int[] arr= {10,40,23,89,43,89};
		
		for(int a:arr) {
			System.out.print(" "+a);
		}
		
		System.out.println();
		
     //Rule1:For primitive array Only Default natural sorting order
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(" "+a);
		}
		
		//Arrays.stream(arr).forEach(System.out::println);
		
		
		Integer[] arr1= {10,40,23,89,43,89};
		
		
	//Rule2: With reference you can do any type of sorting
		Arrays.sort(arr1,(x,y)->y.compareTo(x));
		System.out.println();
		for(Integer z:arr1) {
			System.out.print(" "+z);
		}
		
	}
}

