package city;

public class BankAccount {
	
	protected int amount;
	
	public BankAccount(int amount) {
		this.amount = amount;
	}
	
	public void credit(int amount) {
		this.amount += amount;
	}
	
	public void debit(int amount) {
		this.amount -= amount;
	}
}
