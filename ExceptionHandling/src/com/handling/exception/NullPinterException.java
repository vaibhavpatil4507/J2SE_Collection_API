package com.handling.exception;

public class NullPinterException {

	public static void main(String[] args) {
	
		PrintData p=new PrintData();
		p.printData(null);
	}
}

class Student{
	void show() {
		System.out.println("Hello");
	}
}
