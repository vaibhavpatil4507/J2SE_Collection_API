package voter.card.service;

import my.custom.exception.InValidAgeException;

public class VoterService {


	void doVoting(Person person) {
		if(person.getAge()<18) {
			throw new InValidAgeException( person.getName() + " your age is less than 18 " );
			
		}else {
			System.out.println("Successfully registered!");
		}
	}

}
