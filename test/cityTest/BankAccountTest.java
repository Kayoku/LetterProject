package cityTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import city.*;

public class BankAccountTest {

	protected BankAccount account;
	
	@Before
	public void setup(){
		Inhabitant owner = new Inhabitant("toto", -1, null);
		account = new BankAccount(3, owner);
	}

	@Test
	public void creditTest(){
		account.credit(3);
		assertEquals(account.getAmount(), 6);
	}
	
	@Test
	public void debitTest(){
		account.debit(3);
		assertEquals(account.getAmount(), 0);
	}
	
}
