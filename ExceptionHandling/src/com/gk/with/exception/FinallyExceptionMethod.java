package com.gk.with.exception;

public class FinallyExceptionMethod {

	public static void main(String[] args)  {
		
		
		PrintData p=new PrintData();
		p.testMe();
	}
}
class PrintData{
	
	public void testMe() {
		System.out.println("Hello");
		try {
			System.out.println("Hi");
			
			System.exit(0);//This method will stop the JVM and whole program will crash.& after finally block
			//and finally block also will not execute
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("i am finally block");
		}
	}
}


//As we know finally block always executable but in this case it is not working