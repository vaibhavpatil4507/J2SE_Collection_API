package com.handling.exception;

public class UncheckedExcOnLoop {

	public static void main(String[] args) {
		
		Integer[] arr= {10,20,30,40,50,32,43,56};
		
		System.out.println("start line");
		for(int i=0;i<=arr.length;i++) {
			try {
			System.out.println(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
		}
		
		System.out.println("end line");

	}
}
