
public class BankAccount {
	
	int balance;
	public BankAccount() {
		balance=3000;
	}
	public int getBalance() {
		return balance;
	}
	
	void withdraw(int amt) throws InsufficientBalanceException{
		if(amt>balance) {
			throw new InsufficientBalanceException();
		}
		else {
			balance-=amt;
			System.out.println("TransactionSuccessful!!"+"Balance:"+balance);
		}
	}
}
class InsufficientBalanceException extends Exception{
	
}  



