package city;

public class BankAccount {
	
	protected int amount;
	protected Inhabitant owner;
	
	public BankAccount(int amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}
	
	public void credit(int amount) {
		this.amount += amount;
		
		System.out.println("  + " + owner.getName() + " account is credited with " + amount + " euros; its balance is now " + this.amount + " euros");
	}
	
	public void debit(int amount) {
		this.amount -= amount;
		
		System.out.println("  - " + amount + " are debited from " + owner.getName() + " account whose balance is now " + this.amount + " euros");	
	}
	
	public int getAmount() {
		return this.amount;
	}
}
