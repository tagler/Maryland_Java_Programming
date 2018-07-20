package assignments.bankaccount;

import assignments.bankaccount.CheckingAccount;

public class TestAccounts2 {

	public static void main(String[] args) {
		
		// Testing construction
		
		CheckingAccount checkingAcct1 = new CheckingAccount(0.0, 5.00);
		print("Checking Account after construction - valid inputs:");
		print(checkingAcct1);
		print("\n");
		
		CheckingAccount checkingAcct2 = new CheckingAccount(-1.0, 5.00);
		print("Checking Account after construction - invalid balance:");
		print(checkingAcct2);
		print("\n");
		
		CheckingAccount checkingAcct3 = new CheckingAccount(100, -10);
		print("Checking Account after construction - invalid fee:");
		print(checkingAcct3);
		print("\n");
		
		CheckingAccount checkingAcct4 = new CheckingAccount(-232.12, -5.00);
		print("Checking Account after construction - both invalid values:");
		print(checkingAcct4);
		print("\n");
		
		CheckingAccount checkingAcct5 = new CheckingAccount(.123,0.23723423);
		print("Checking Account after construction - both invalid values:");
		print(checkingAcct5);
		print("\n");

		// Testing deposit
		
		print("Checking Account after deposit of $30.00:");
		checkingAcct1.deposit(30.00);
		print(checkingAcct1);
		print("\n");
		
		print("Checking Account after deposit of $1000.00:");
		checkingAcct1.deposit(1000.00);
		print(checkingAcct1);
		print("\n");
		
		print("Checking Account after deposit of invalid $-1000.00:");
		checkingAcct1.deposit(-1000.00);
		print(checkingAcct1);
		print("\n");
		
		print("Checking Account after deposit of invalid $0.00:");
		checkingAcct1.deposit(0.00);
		print(checkingAcct1);
		print("\n");
		
		// Testing withdrawal
		
		print("Checking Account after withdrawal of $1.00:");
		checkingAcct1.withdraw(1.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
		// Testing cashing a check
		
		print("Checking Account after cashing a check for $2.00:");
		checkingAcct1.cashCheck(2.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
		// Testing withdrawal when not enough in account
		
		print("Checking Account after withdrawal of $1000000.00:");
		checkingAcct1.withdraw(1000000.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
		print("Checking Account after withdrawal of $-100.00:");
		checkingAcct1.withdraw(-100.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
		// Testing cashing a check when not enough in account
		
		print("Checking Account after cashing a check for $-12.00:");
		checkingAcct1.cashCheck(-12.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
		print("Checking Account after cashing a check for $1000000000000.00:");
		checkingAcct1.cashCheck(1000000000000.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");

		// check overdraft charge value back to 0
		
		print("Checking Account after cashing a check for $10000000000000.00:");
		checkingAcct1.deposit(10000000000000.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		print("Checking Account after cashing a check for $10.00:");
		checkingAcct1.cashCheck(10.00);
		print(checkingAcct1);
		print("Overdraft charge: $" + 
							checkingAcct1.getOverdraftCharged());
		print("\n");
		
	}
	
	public static void print(Object o) {
		System.out.println(o);
	}
}
