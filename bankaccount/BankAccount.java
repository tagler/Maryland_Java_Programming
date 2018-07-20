package assignments.bankaccount;

public class BankAccount{
	private static int counter = 1000;
	private int accountNum;  // Account number
	private double balance;  // Current balance

	// Constructor
	public BankAccount(double initialBalance){
		accountNum += counter++;
		balance = initialBalance;
	}

	// Getters and setters
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Deposit funds
	public void deposit(double amount){
		balance += amount;
	}

	// Withdraw funds
	// Do not allow balance to go negative
	public void withdraw(double amount){
	 if (balance - amount >= 0)
	     balance -= amount;
	}

	// Create bank account attributes string
	public String toString(){
		return("Account #: " + accountNum +
				"   Balance: $" + balance);
	}
}