package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;

public class SimpleLetterTest extends LetterTest {

	@Before
	public void setUp() {
		letter = new SimpleLetter("content", sender, receiver);
	}

	@Override
	protected int computeCost() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
