package com.gk.with.exception;

import java.io.File;

public class ThrowException {

	public static void main(String[] args)  {
		System.out.println("1");
		A a=new A();
		a.m3();
		System.out.println("8");
	}
	
}											//throws keyword can handover the current method exception to 
											//parent method.upto main method then after JVM will take care of that exception

class A{
	

	public void m3() {
		System.out.println("2");
		B b=new B();
		try {
		b.m2();}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("7");
	}
}

class B{
	
	public void m2() throws Exception {
		System.out.println("3");
		C c=new C();
		c.m1();
		System.out.println("6");
	}

	
	
}

class C{
	
	public void m1() throws Exception {
		System.out.println("4");
		File f=new File("xxx");
		f.createNewFile();
		System.out.println("5");
	}
}