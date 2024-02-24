package com.handling.exception;

public class UnMatchedExcption {

	public static void main(String[] args) {
		
		System.out.println("start point");
		try {
			Employee p=null;
		
			p.printEmployeeInfo();
			
		}
		catch(Error e) {
			System.out.println(e.toString());
		}
		
		//Here we write risky code in try-catch block to handle exception ,and we use Error exception class object
		//and looks like we handled it properly but after checking we see still code is
		//abnormal terminate
		//Because of unmatched parent class or unmatched class of coming error class
		
	
		System.out.println("End point........");
	}
}


class Employee{
	
	void printEmployeeInfo() {
		System.out.println("Info......");
	}
}
