package city;

import java.util.List;

import letter.Letter;

public class City {
	
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter> postbox;
	
	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
	}
	
	public void sendLetter(Letter letter) {
		// TO COMPLETE
	}
	
	public void distributeLetter() {
		// TO COMPLETE
	}
}
