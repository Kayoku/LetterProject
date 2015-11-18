package city;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;

public class City {
	
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter> postbox;
	
	public City(String name) {
		this.name = name;
		this.postbox = new ArrayList<Letter>();
		this.inhabitants = new ArrayList<Inhabitant>();
	}
	

	public void sendLetter(Letter letter) {
		// Add the letter in the box
		this.postbox.add(letter);

		// Display the send
		System.out.print("-> " + letter.getSender().getName() + " mails ");
		System.out.print(letter.toString());
		System.out.println(" to " + letter.getReceiver().getName() + " for a cost of " + letter.cost());
	
		// Debit the count of the letter
		letter.getSender().getBankAccount().debit(letter.cost());
	
	}
	
	public void distributeLetter() {
		
		int i;
		Letter letter;
		
		ArrayList<Letter> postBoxOld = new ArrayList<>(this.postbox);
		this.postbox.removeAll(postBoxOld);
		
		// For each letters
		for(i = 0 ; i < postBoxOld.size() ; i++){
			letter = postBoxOld.get(i);
			
			// Display the receive
			System.out.print("<- " + letter.getReceiver().getName() + " receives ");
			System.out.print(letter.toString());
			System.out.println(" from " + letter.getSender().getName());
			
			letter.doAction();
			
		}
		
	}
	
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
	}
	
	public List<Inhabitant> getInhabitants() {
		return this.inhabitants;
	}
}
