package assignments.bankaccount;

import assignments.bankaccount.CheckingAccount;

public class TestAccounts {

	public static void main(String[] args){
		testBankAccount();
		testCheckingAccount();
		testPolymorphism();
	}

	private static void testBankAccount()
	{
		// ***** Code to test the methods of BankAccount class *****
		print("***** Testing Bank Account *****\n");
		
		// Testing construction
		BankAccount bankAcct = new BankAccount(0.0);
		print("Bank Account after construction:");
		print(bankAcct);
		print("\n");

		// Testing deposit
		print("Bank Account after deposit of $20.00:");
		bankAcct.deposit(20.00);
		System.out.println(bankAcct);
		print("\n");

		// Testing withdrawal
		print("Bank Account after withdrawal of $8.00:");
		bankAcct.withdraw(8.00);
		print(bankAcct);
		print("\n");
		
		// Testing withdrawal when not enough in account
		print("Bank Account after attempted withdrawal of $50.00:");
		bankAcct.withdraw(50.00);
		print(bankAcct);
		print("\n");	}
	
	private static void testCheckingAccount( )
	{
		// ***** Code to test the methods of CheckingAccount class *****
		print("***** Testing Checking Account *****\n");
		
		// Testing construction
		CheckingAccount checkingAcct = new CheckingAccount(0.0, 5.00);
		print("Checking Account after construction:");
		print(checkingAcct);
		print("\n");
		
		// Testing deposit
		print("Checking Account after deposit of $30.00:");
		checkingAcct.deposit(30.00);
		print(checkingAcct);
		print("\n");
		
		// Testing withdrawal
		print("Checking Account after withdrawal of $1.00:");
		checkingAcct.withdraw(1.00);
		print(checkingAcct);
		print("Overdraft charge: $" + 
							checkingAcct.getOverdraftCharged());
		print("\n");
		
		// Testing cashing a check
		print("Checking Account after cashing a check for $2.00:");
		checkingAcct.cashCheck(2.00);
		print(checkingAcct);
		print("Overdraft charge: $" + 
							checkingAcct.getOverdraftCharged());
		print("\n");
		
		// Testing withdrawal when not enough in account
		print("Checking Account after withdrawal of $50.00:");
		checkingAcct.withdraw(50.00);
		print(checkingAcct);
		print("Overdraft charge: $" + 
							checkingAcct.getOverdraftCharged());
		print("\n");
		
		// Testing cashing a check when not enough in account
		print("Checking Account after cashing a check for $12.00:");
		checkingAcct.cashCheck(12.00);
		print(checkingAcct);
		print("Overdraft charge: $" + 
							checkingAcct.getOverdraftCharged());
		print("\n");
	}

	
	private static void testPolymorphism()
	{
		print("***** Testing Polymorphism *****\n");
		
		BankAccount[] accounts = new BankAccount[2];
		accounts[0] = new BankAccount(100.00);
		accounts[1] = new CheckingAccount(200.00, 12.00);
		
		// Deposit some money in each account, then print accounts
		print("Depositing $20 in each account");
		for (BankAccount acct : accounts)
			acct.deposit(20);
		for (BankAccount acct : accounts)
			print(acct);
		print("\n");
		
		// If BankAccount is a Checking Accountg cash a check, then print accounts
		print("Cashing $400 check from each checking account");
		for (BankAccount acct : accounts){
			if(acct instanceof CheckingAccount){
				CheckingAccount chkAcct = (CheckingAccount) acct;
				chkAcct.cashCheck(400);
				print("Overdraft Charged:" + chkAcct.getOverdraftCharged());
				print(chkAcct);
				print("\n");
			}
		}
		
	}


	public static void print(Object o){
		System.out.println(o);
	}

}
