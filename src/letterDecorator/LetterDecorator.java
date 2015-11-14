package letterDecorator;

import city.Inhabitant;
import letter.Letter;

public abstract class LetterDecorator extends Letter {

	public LetterDecorator(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver);
	}

	protected Letter letter;
	
}
