package letterDecorator;

public class RegistredLetter extends LetterDecorator{

	public RegistredLetter() {
		// TO COMPLETE
	}
	
	@Override
	public void doAction() {


	}

	@Override
	public int cost() {
		return this.letter.cost() + 15;
	}

	@Override
	public String toString() {
		return "a registered letter whose content is a " + this.letter.toString();
	}

	
}
