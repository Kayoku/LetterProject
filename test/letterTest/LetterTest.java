package letterTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.Inhabitant;
import letter.Letter;
import mockedClass.MockedCity;

public abstract class LetterTest {

	protected Letter letter;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected MockedCity city;
	
	@Before
	public void createInhabitant(){
		city = new MockedCity("City");
		
		sender = new Inhabitant("toto",3,city);
		receiver = new Inhabitant("titi", 10, city);
	}
	
	@Test
	public void PositiveCostTest() {
		assertTrue(letter.cost() >= 0);
	}
	
	@Test
	public void LetterNotEmpty(){
		assertNotNull(letter.getSender());
		assertNotNull(letter.getReceiver());
	}

	protected abstract int computeCost();
	
	@Test 
	public void costTest(){
		assertEquals(letter.cost(), computeCost());
	}
}
