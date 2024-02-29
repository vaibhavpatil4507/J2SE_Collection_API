package com.manually.exceptions;

public class VotingProcess {

	void doVoting(int a) {
		
		
		if(a<18) {
			
			try {
			NumberFormatException e=new NumberFormatException("age is less than 18");
			throw e;}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("You are eligble for voting");
		}
	}
}


//throw keyword
//using throw keyword we can create manually exception.