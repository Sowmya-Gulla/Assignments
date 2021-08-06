/*
public class Bank {
	public static void main(String[] args) {
		savingsAcc s=new savingsAcc(100);
		currentAcc c=new currentAcc(200);
		double totalcash=0;
		totalcash=s.getamt()+c.getamt();
		System.out.print("total Cash:" +totalcash);			
	}

}

class savingsAcc{
	double fixed_deposits;
	savingsAcc(double fixed_deposits){
		this.fixed_deposits=fixed_deposits;
	}
	 double getamt(){
		return fixed_deposits;
	}

}
class currentAcc{
	double cash_credits;
	currentAcc(double cash_credits){
		this.cash_credits=cash_credits;
	}
	double getamt(){
		return cash_credits;
	}
	
	
}*/
/*
class BankB
{
	BankB(SavingsAccount s,CurrentAccount c)
	{
		System.out.println("totalCash :"+(s.getCash()+c.getCash()));
	}
}

class SavingsAccount{	
	double fixeddeposits;
	void addCash(double fixeddeposits)
	{
		this.fixeddeposits=fixeddeposits;
	}
	double getCash()
	{
		return fixeddeposits;
	}
	
}
class CurrentAccount{
	double cashcredit;
	void addCash(double cashcredit)
	{
		this.cashcredit=cashcredit;
	}
	double getCash()
	{
		return cashcredit;
	}
}
class A2_Q3{
	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
		s.addCash(100);
		CurrentAccount c=new CurrentAccount();
		c.addCash(200);
		BankB b=new BankB(s,c);
				
	}
}

*/
class A2_Q3{
	public static void main(String args[]) {
		Savings s=new Savings();
		Current c=new Current();		
		Account a=new Account();	
		s.addamt(100);
		c.addamt(100);
		System.out.println(s.getamt()+c.getamt());
	}
}
class Account{
	double total;
	double getamt() {
		return total;
	}
	
	
}
class Savings extends Account{
	double fixed_deposits;
	void addamt(double fixed_deposits) {
		this.fixed_deposits=fixed_deposits;
	}
	 double getamt(){
		return fixed_deposits;
	}
	
}
class Current extends Account{
	double cash_credits;
	void addamt(double cash_credits) {
		this.cash_credits=cash_credits;
	}
	double getamt(){
		return cash_credits;
	}
	
}