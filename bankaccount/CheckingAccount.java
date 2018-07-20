// -----------------------------------------------------------------------------
// Java Programming Assessment #2
// CheckingAccount class that supports deposits, withdraws, and cashed checks
// - extends BankAccount class (overrides deposit, withdraw, toString methods)
// - checks/prevents invalid inputs (i.e. deposits, checks, withdraws < 0)
// - formats output print string in $X.XX "money" format
//------------------------------------------------------------------------------

package assignments.bankaccount;

import assignments.bankaccount.BankAccount;
import java.text.DecimalFormat;

public class CheckingAccount extends BankAccount {

	// data attributes
	
	private double overDraftFee;
	private double overDraftCharged = 0.00;
	private String lastCheckCashedOverDraft = "No";
	private DecimalFormat df = new DecimalFormat("0.00");
	
	// construct
	
	public CheckingAccount(double initialBalance, double fee) {
		
		super(initialBalance);
		this.overDraftFee = fee;
		
		// invalid initial balance value
		if (super.getBalance() < 0) {
			System.out.println("Account #: " + super.getAccountNum() );
			System.out.print("Error: Invalid initial account balance value");
			System.out.println(" (must be greater than or equal to zero)");
			System.out.println("Note: Account balance will default to $0.00\n");
			super.setBalance(0.00);
		}
		
		// invalid overdraft fee value
		if (fee < 0) {
			System.out.println("Account #: " + super.getAccountNum() );
			System.out.print("Error: Invalid overdraft fee");
			System.out.println(" (must be greater than or equal to zero)");
			System.out.println("Note: Overdraft fee will default to $0.00\n");
			this.overDraftFee = 0.00;
		}

	}
	
	// methods
	
	public double getOverDraftFee() {
		return this.overDraftFee;
	}
	
	public double getOverdraftCharged() {
		return this.overDraftCharged;
	}
	
	public void setOverDraftFee(double overDraftFee) {
		
		// valid overdraft fee value
		if (overDraftFee >= 0.0) {
			this.overDraftFee = overDraftFee;
		}
		// invalid overdraft fee value
		else {
			System.out.print("\nError: Invalid overdraft fee");
			System.out.println(" (must be greater than or equal to zero)\n");
		}
		
	}
		
	public void cashCheck(double out) {
		
		// valid cash check value
		if (out > 0.0) {
			
			// check balance
			double newBalance = super.getBalance() - out;
			
			// normal withdraw
			if (newBalance >= 0) {
				super.withdraw(out);
				this.overDraftCharged = 0.0; 
			}
			// overdraft withdraw
			else {
				super.setBalance( newBalance-this.overDraftFee );
				this.overDraftCharged = this.overDraftFee;
				
			}
			
		}
		
		// invalid cash check value
		else {
			System.out.print("\nError: Invalid cashed check value");
			System.out.println(" (must be greater than zero)\n");
		}
		
	}
	
	@Override
	public void withdraw(double out) {
		
		// valid withdraw value
		if (out > 0.0) {
			if (out > super.getBalance()) {
				System.out.print("\nError: Unable to withdraw an amount");
				System.out.println("greater than account balance\n");
			}
			super.withdraw(out);
		}
		// invalid withdraw value
		else {
			System.out.print("\nError: Invalid withdraw value");
			System.out.println(" (must be greater than zero)\n");
		}
		
	}
	
	@Override
	public void deposit(double in) {
		
		// valid deposit value
		if (in > 0.0) {
			super.deposit(in);
		}
		// invalid deposit value
		else {
			System.out.print("\nError: Invalid deposit value");
			System.out.println(" (must be greater than zero)\n");
		}
		
	}
	
	@Override
	public String toString() {
		
		// check if last translation was overdraft fee
		if (this.overDraftCharged != 0.00) {
			lastCheckCashedOverDraft = "Yes";
		}
		else {
			lastCheckCashedOverDraft = "No";
		}
		
		return( "Account #: " + 
		        super.getAccountNum() +
				"   Balance: $" + 
				df.format( super.getBalance() ) +
				"   Fee If Overdrafted: $" + 
				df.format( this.overDraftFee ) +
				"\n*Last Cashed Check Transaction Overdraft Fee Charged? " +
				lastCheckCashedOverDraft + 
				", $" + df.format( this.overDraftCharged ) ); 
	}
	
}
