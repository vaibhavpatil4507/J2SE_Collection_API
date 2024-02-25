package com.handling.exception;

public class HowToPrintExceptionMsg {

	public static void main(String[] args) {
		try {
			Integer i=Integer.valueOf("ten");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();//This method is recommended bcz it give full info exception.
		}
	}
}
