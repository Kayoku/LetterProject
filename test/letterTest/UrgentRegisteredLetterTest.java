package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;
import letterDecorator.RegistredLetter;
import letterDecorator.UrgentLetter;

public class UrgentRegisteredLetterTest extends AcknowledgmentLetterTest {

	@Before
	public void setUp() throws Exception {
		letter = new SimpleLetter("content", sender, receiver);
		letter = new UrgentLetter(letter);
		letter = new RegistredLetter(letter);
	}

	@Override
	protected int computeCost() {
		return 2 * 1 + 15;
	}

}
