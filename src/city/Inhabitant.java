package city;

public class Inhabitant {

	protected String name;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, int amount) {
		this.name = name;
		this.bankAccount = new BankAccount(amount);
	}
	
	public BankAccount getBankAccount() {
		return this.bankAccount;
	}
	
}
