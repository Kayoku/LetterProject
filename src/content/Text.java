package content;

public class Text extends Content {
	
	protected String text;
	
	public Text(String text) {
		this.text = text;
	}

	@Override
	public int getContent() {
		// TODO Auto-generated method stub
		return 1;
	}
}
