package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.Inhabitant;
import letter.Letter;

public class PromissoryLetter extends AcknowledgmentLetterTest {

	public PromissoryLetter(int i, Inhabitant sender, Inhabitant receiver) {
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setUp() throws Exception {
		letter = new PromissoryLetter(100, sender, receiver);
	}

	@Override
	protected int computeCost() {
		// TODO Auto-generated method stub
		return 2;
	}

}
