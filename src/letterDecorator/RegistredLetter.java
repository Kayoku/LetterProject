package letterDecorator;

import letter.Letter;
import letter.SimpleLetter;

public class RegistredLetter extends LetterDecorator{

	public RegistredLetter(Letter letter) {
		super(letter.getSender(), letter.getReceiver());
		this.letter = letter;
	}
	
	@Override
	public void doAction() {
		this.letter.doAction();
		this.getReceiver().getCity().sendLetter(new SimpleLetter("Aknowledgment of receipt", this.getReceiver(), this.getSender()));
	}

	@Override
	public int cost() {
		return this.letter.cost() + 15;
	}

	@Override
	public String toString() {
		return "a registered letter whose content is " + this.letter.toString();
	}

	
}
