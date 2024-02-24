package com.handling.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		Integer[] arr= {10,20,30};
		
		System.out.println("start point");
		
		try {
			System.out.println(arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("child exception class");
		}
		
		catch(Exception e) {
			System.out.println("Parent excpetion class");
		}
		
		System.out.println("end point");
	}
}
//If we want to write multiple catch blocks while handling then we must child it child to parent approch