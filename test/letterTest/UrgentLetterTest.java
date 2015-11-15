package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;
import letterDecorator.RegistredLetter;
import letterDecorator.UrgentLetter;

public class UrgentLetterTest extends LetterTest {

	@Before
	public void setUp() throws Exception {
		letter = new SimpleLetter("content", sender, receiver);
		letter = new UrgentLetter(letter);
	}

	@Override
	protected int computeCost() {
		// TODO Auto-generated method stub
		return 2 * 1;
	}

}
