package com.handling.exception;

public class Test {

	public static void main(String[] args) {
		Integer[] array= {10,20,34,21,344,44,42,55};
		
		System.out.println("start line");

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		try {
			
		
		System.out.println(array[3]);
		System.out.println(array[2]);
		System.out.println(array[1]);
		System.out.println(array[8]);

		}
		catch (Exception r) {
			System.out.println(r);
		}
		
		
		
		System.out.println(array[0]);

		System.out.println("end line");

	}
}
