package letter;

import city.Inhabitant;
import content.Content;

public class PromissoryLetter extends Letter {

	public PromissoryLetter(int value, Inhabitant sender, Inhabitant receiver){
		super(sender, receiver);
		this.content = new Content<Integer>(value); 
	}
	
	@Override
	public void doAction() {
		int amount = (int)this.content.getContent();
		this.sender.getBankAccount().debit(amount);
		
		this.receiver.getBankAccount().credit(amount);
	
		this.receiver.getCity().sendLetter(new SimpleLetter("Thanks you for the money !", this.receiver, this.sender));
	}

	@Override
	public int cost() {
		return 1 + (1/100) * (int)this.content.getContent();
	}

	public String toString(){
		return "an promissory letter whose content is a money content (" + this.content.getContent() + ")";
	}

}
