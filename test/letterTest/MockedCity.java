package letterTest;

import java.util.Hashtable;

import city.City;
import city.Inhabitant;
import letter.Letter;

public class MockedCity extends City {

	protected Hashtable <Inhabitant, Integer> LetterSend;
	protected Hashtable <Inhabitant, Integer> LetterReceived;
	
	public MockedCity(String name) {
		super(name);
		LetterSend = new Hashtable<>();
		LetterReceived = new Hashtable<>();
	}

	public void sendLetter(Letter letter) {
		super.sendLetter(letter);
		LetterSend.put(letter.getSender(), LetterSend.get(letter.getSender()) + 1);
	}
	
	public void distributeLetter(){
		for(Letter letter: postbox){
			Inhabitant receiver = letter.getReceiver();
			LetterReceived.put(receiver, LetterReceived.get(letter) + 1);
		}
		
		super.distributeLetter();
	}
	
	public int numberOfLetterSend(Inhabitant sender){
		return (LetterSend.get(sender)).intValue();
	}
	
	public int numberOfLetterReceive(Inhabitant receiver){
		return (LetterReceived.get(receiver)).intValue();
	}
	
}
