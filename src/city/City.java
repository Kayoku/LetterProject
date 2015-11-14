package city;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;

public class City {
	
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter> postbox;
	
	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.postbox = new ArrayList<Letter>();
	}
	
	public void sendLetter(Letter letter) {
		this.postbox.add(letter);
	}
	
	public void distributeLetter() {
		// TO COMPLETE
	}
}
