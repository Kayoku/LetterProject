package letterTest;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AcknowledgmentLetterTest extends LetterTest {

	@Test
	public void AcknowledgmentTest() {
		int numberOfLetterSend = city.numberOfLetterSend(sender);
		int numberOfLetterReceive = city.numberOfLetterReceive(receiver);
		letter.doAction();
		
		assertEquals(numberOfLetterSend + 1, city.numberOfLetterSend(sender));
		city.distributeLetter();
		assertEquals(numberOfLetterReceive + 1, city.numberOfLetterReceive(receiver));
	}

}
