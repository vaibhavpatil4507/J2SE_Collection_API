package com.pract.linkdlist;

public class CheckLinkListStackController {

	public static void main(String[] args) {
		
		LinkedListStack mine=new LinkedListStack();
		mine.push("akash");
		mine.push("rohit");
		mine.push("pranav");
		mine.push("sham");
		mine.push("sham");
		
		System.out.println(mine.push("raghuvir"));
		mine.printStack();
		mine.pop();
		mine.printStack();
		mine.push("raina");
		mine.printStack();
	}
}