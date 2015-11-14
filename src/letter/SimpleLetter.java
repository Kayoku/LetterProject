package letter;

import city.Inhabitant;
import content.Content;

public class SimpleLetter extends Letter {
	
	public SimpleLetter(String text, Inhabitant sender, Inhabitant receiver){
		super(sender, receiver);
		this.content = new Content<String>(text);
	}
	
	@Override
	public void doAction() {}

	@Override
	public int cost() {
		return 1;
	}

	@Override
	public String toString() {
		return "a simple letter whose content is a text content (" + this.content.getContent() + ")";
	}
	
}
