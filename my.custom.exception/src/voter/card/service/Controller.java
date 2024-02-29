package voter.card.service;

public class Controller {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("harihar");
		p.setAdhar_card_no(1236547899874L);
		p.setAge(15);
		
		
		VoterService v=new VoterService();
		v.doVoting(p);
	}
}
