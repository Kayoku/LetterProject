package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.Inhabitant;
import letter.Letter;
import letter.PromissoryLetter;

public class PromissoryLetterTest extends AcknowledgmentLetterTest {


	@Before
	public void setUp() throws Exception {
		letter = new PromissoryLetter(100, sender, receiver);
	}

	@Override
	protected int computeCost() {
		return 2;
	}

}
