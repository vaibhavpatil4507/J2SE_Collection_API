package com.gk.with.exception;

public class GkWithReturn {

	public static void main(String[] args) {
		
		GkWithReturn g=new GkWithReturn();
		g.printData();
	}
	
	void printData() {
		
		System.out.println("start");
		for (int i = 0; i <=50; i++) {
			System.out.println(i);
			
			if(i==10) {
				return;//It helps to jump outside method.meansIt directly break the method
			}
			
		}
		
		System.out.println("End");
	}
	

}
