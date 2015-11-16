package letterTest;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AcknowledgmentLetterTest extends LetterTest {

	@Test
	public void AcknowledgmentTest() {
		int numberOfLetterSend = city.numberOfLetterSend(receiver);
		int numberOfLetterReceive = city.numberOfLetterReceive(sender);
		letter.doAction();
		assertEquals(numberOfLetterSend + 1, city.numberOfLetterSend(receiver));
		city.distributeLetter();
		assertEquals(numberOfLetterReceive + 1, city.numberOfLetterReceive(sender));
	}

}
