package cityTest;

import static org.junit.Assert.*;
import letter.SimpleLetter;
import mockedClass.MockedCity;

import org.junit.Before;
import org.junit.Test;

import city.Inhabitant;

public class CityTest {

	protected MockedCity city;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	@Before
	public void setup(){
		city = new MockedCity("Dallas");
		sender = new Inhabitant("toto",3,city);
		receiver = new Inhabitant("titi", 10, city);
	}
	
	@Test
	public void initTest() {
		assertNotNull(city);
	}
	
	@Test
	public void sendLetterTest(){
		int numberOfLetterSend = city.numberOfLetterSend(sender);
		SimpleLetter letter = new SimpleLetter("toto", sender, receiver);
		
		//envoyer une lettre
		city.sendLetter(letter);
		
		//regarder si la lettre est dans la boite aux lettres
		assertTrue(city.isInPostBox(letter));
		
		// regarder si la le prix de la lettre est débité du compte du sender
		assertEquals((sender.getBankAccount()).getAmount(), 2);
		
		// verifier que le posteur à envoyé une lettre de plus
		assertEquals(numberOfLetterSend + 1, city.numberOfLetterSend(sender));
	}
	
	@Test
	public void distributeLetterTest(){
		int numberOfLetterReceive = city.numberOfLetterReceive(receiver);
		
		//envoyer une lettre
		SimpleLetter letter = new SimpleLetter("toto", sender, receiver);
		city.sendLetter(letter);
		
		//distribuer le courier
		city.distributeLetter();
		
		//verifier que la lettre n'est plus dans la boite aux lettre
		assertFalse(city.isInPostBox(letter));
		
		//Verifier que le reveveur à bien reçus une lettre de plus
		assertEquals(numberOfLetterReceive + 1, city.numberOfLetterReceive(receiver));
	}

	@Test
	public void addInhabitantTest(){
		city.addInhabitant(sender);
		assertTrue(city.isInCity(sender));
		assertFalse(city.isInCity(receiver));
	}

}
