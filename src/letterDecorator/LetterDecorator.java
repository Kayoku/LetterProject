package letterDecorator;

import letter.ConcreteLetter;
import letter.Letter;

public abstract class LetterDecorator<T extends ConcreteLetter> extends Letter {

	protected T letter;
	
}
