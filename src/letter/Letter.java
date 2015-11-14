package letter;

import city.Inhabitant;
import content.Content;

public abstract class Letter {

	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content<?> content;
	
	public abstract void doAction();
	
	public abstract int cost();
	
	public abstract String toString();
	
	public Letter(Inhabitant sender, Inhabitant receiver){
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public Inhabitant getSender() {
		return this.sender;
	}
	
	public Inhabitant getReceiver() {
		return this.receiver;
	}
	
	public Content<?> getContent() {
		return this.content;
	}
}
