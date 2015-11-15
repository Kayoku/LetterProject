package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;
import letterDecorator.RegistredLetter;

public class RegisteredLetterTest extends AcknowledgmentLetterTest {

	@Before
	public void setUp() throws Exception {
		letter = new SimpleLetter("content", sender, receiver);
		letter = new RegistredLetter(letter);
	}

	@Override
	protected int computeCost() {
		return 15 + 1;
	}

}
