package city;

public class Inhabitant {

	protected String name;
	protected BankAccount bankAccount;
	protected City city;
	
	public Inhabitant(String name, int amount, City city) {
		this.name = name;
		this.bankAccount = new BankAccount(amount, this);
		this.city = city;
	}
	
	public BankAccount getBankAccount() {
		return this.bankAccount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public City getCity() {
		return this.city;
	}
	
	public String toString(){
		return name;
	}
	
}
