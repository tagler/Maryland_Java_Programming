package assignments.methods;

public class LoanTest {
	
	public static void main(String[] args) {
		
		Loan test = new Loan("name",200000,7.5,30);
		System.out.print( test.computeMonthlyPayment() );

	}
	
}
