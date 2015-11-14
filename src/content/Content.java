package content;

public class Content<T> {

	protected T message;
	
	public Content(T message) {
		this.message = message;
	}
	
	public T getContent() {
		return this.message;
	}
	
}
