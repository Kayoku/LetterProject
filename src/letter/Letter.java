package letter;

import city.Inhabitant;
import content.Content;

public abstract class Letter {

	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected int cost;
	protected Content content;
	
	public abstract void doAction();
	
}
