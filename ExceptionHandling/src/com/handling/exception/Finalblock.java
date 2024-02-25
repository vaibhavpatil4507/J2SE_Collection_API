package com.handling.exception;

public class Finalblock {

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("1");
		
		try {
			System.out.println("2");
			int i=40/0;
			System.out.println("3");
		}catch(Exception e) {
			System.out.println("4");
		}finally {
			System.out.println("5");
		}
			
	System.out.println("7");
	}
}
//exception occur or not its not mendatory, In any condition finally block will execute.