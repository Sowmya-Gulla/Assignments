
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
class BankAccountTest {

	@Test
	void validateWithdraw(){
		BankAccount b=new BankAccount();
		assertThrows(InsufficientBalanceException.class,()->b.withdraw(100000));
		
	}

}

