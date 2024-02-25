package com.handling.exception;

public class TryCatchFlow {

	public static void main(String[] args) {
		System.out.println("1");
		
		try {
			System.out.println("2");
			System.out.println("3");
			int i=10/0;
			System.out.println("4");
			System.out.println("5");

		}catch(Exception e) {
			
			
			try {
				int j=30/0;
			}
			catch(Exception e1) {
				System.out.println("**");
			}
			System.out.println("6");

		}
		
	}
}
