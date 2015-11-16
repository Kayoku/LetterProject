package mockedClass;

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
		Inhabitant sender = letter.getSender();
		
		LetterSend.put(sender, numberOfLetterSend(sender) + 1);
	}
	
	public void distributeLetter(){
		for(Letter letter: postbox){
			Inhabitant receiver = letter.getReceiver();
			LetterReceived.put(receiver, numberOfLetterReceive(receiver) + 1);		
		}
		super.distributeLetter();
	}
	
	public boolean isInPostBox(Letter letter){
		return postbox.contains(letter);
	}
	public boolean isInCity(Inhabitant inhabitant){
		return inhabitants.contains(inhabitant);
	}
	
	public int numberOfLetterSend(Inhabitant sender){
		Integer N = LetterSend.get(sender);
		if(N == null)
			return 0;
		else
			return N.intValue();
	}
	
	public int numberOfLetterReceive(Inhabitant receiver){
		Integer N = LetterReceived.get(receiver);
		if(N == null)
			return 0;
		else
			return N.intValue();
	}
	
}
