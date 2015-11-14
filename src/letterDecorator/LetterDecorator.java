package letterDecorator;

import city.Inhabitant;
import letter.Letter;

public abstract class LetterDecorator extends Letter {

	protected Letter letter;
	
	public LetterDecorator(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver);
	}

}
