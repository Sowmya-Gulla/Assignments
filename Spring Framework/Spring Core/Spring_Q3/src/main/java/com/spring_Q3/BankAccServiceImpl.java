package com.spring_Q3;

public class BankAccServiceImpl implements BankAccService {
	
	BankAccRepository bankRepo;

	public BankAccRepository getBankRepo() {
		return bankRepo;
	}

	public void setBankRepo(BankAccRepository bankRepo) {
		this.bankRepo = bankRepo;
	}

	public double withdraw(long accountId, double balance) {
		return bankRepo.updateBalance(accountId, bankRepo.getBalance(accountId)-balance);
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		return bankRepo.updateBalance(accountId, bankRepo.getBalance(accountId)+balance);
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankRepo.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		bankRepo.updateBalance(fromAccount, bankRepo.getBalance(fromAccount)-amount);
		bankRepo.updateBalance(toAccount, bankRepo.getBalance(toAccount)+amount);
		return true;
	}
	
}