package letterDecorator;

import letter.Letter;

public class UrgentLetter extends LetterDecorator {
	
	public UrgentLetter(Letter letter) {
		super(letter.getSender(), letter.getReceiver());
		this.letter = letter;
	}
	
	@Override
	public void doAction() {}

	@Override
	public int cost() {
		return this.letter.cost() * 2;
	}

	@Override
	public String toString() {
		return "an urgent letter whose content is a " + this.letter.toString();
	}
}
